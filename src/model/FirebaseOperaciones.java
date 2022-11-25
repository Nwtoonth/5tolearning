package model;


import ViewModel.Usuario;
import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.FieldValue;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
/**
 *
 * @author Duvan
 */
public class FirebaseOperaciones {

    protected static Firestore dataBase = null;
    
    public static void conectar() throws FileNotFoundException, IOException{      
        if(dataBase == null){
        FileInputStream serviceAccount
                = new FileInputStream("claveAcceso.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://prueba-java-a76c8-default-rtdb.firebaseio.com")
                .build();

        FirebaseApp.initializeApp(options);
        dataBase = FirestoreClient.getFirestore();
        System.out.println("Conexion exitosa");
        }
        else{
            System.out.println("en Conexion ...");
        }
    }
    
    public static boolean insertarDatos(String nickName , String password) throws InterruptedException, ExecutionException {
        boolean disponible = true;
        String collection = "Usuarios";
        String documento = nickName;
        Map<String, Object> data = new HashMap<>();
        data.put("nombre", nickName);
        data.put("Contrasena", password);
        data.put("Puntaje",llenarArray());
        CollectionReference usuarios = dataBase.collection("Usuarios");
        DocumentReference usuario = usuarios.document(nickName);
        ApiFuture<DocumentSnapshot> future = usuario.get();
        DocumentSnapshot document = future.get();
        if (!document.exists()) {
            try {
                DocumentReference docRef = dataBase.collection(collection).document(documento);
                ApiFuture<WriteResult> result = docRef.set(data);
                System.out.println("Tiempo de carga: " + result.get().getUpdateTime());
                System.out.println("Enviado");
            } catch (Exception e) {
                System.out.println("Fallo:" + e);
                disponible = false;
            }
        } else {
            disponible = false;
        }
        return disponible;
    }
    
    public static void buscarTodo() throws InterruptedException, ExecutionException{
        CollectionReference usuarios= dataBase.collection("Usuarios");
        ApiFuture<QuerySnapshot> querySnapshot = usuarios.get();
        for (DocumentSnapshot document : querySnapshot.get().getDocuments()){
            System.out.println("Tiempo de carga " + querySnapshot.get().getReadTime());
            System.out.println(document.getId() + " " + document.getString("Contrasena") + " " + document.getString("Puntaje"));
        }
    }
    
    public static Usuario buscar(String nickName,String password) throws InterruptedException, ExecutionException{
        Usuario logueo = null;
        CollectionReference usuarios = dataBase.collection("Usuarios");
        DocumentReference usuario = usuarios.document(nickName);
        ApiFuture<DocumentSnapshot> future = usuario.get();
        DocumentSnapshot document = future.get();
        if (document.exists()) {
            ArrayList<Integer> score = (ArrayList<Integer>) document.get("Puntaje");
            Usuario user = new Usuario(""+document.get("nombre"),""+document.get("Contrasena"),score);
            if(user.verificarLogueo(nickName, password)){
                logueo = user;
            }
        }
        return logueo;
    }
       
    public static void eliminar(){
        String collection = "Usuarios";
        String documento = "juan";
        try {
            DocumentReference docRef = dataBase.collection(collection).document(documento);
            ApiFuture<WriteResult> result = docRef.delete();
            System.out.println("Tiempo de ejecucion: " + result.get());
            System.out.println("Eliminado");
        } catch (Exception e) {
            System.out.println("Fallo:" + e);
        }
    }
    
    public static void eliminarCampos(String campo){
        String collection = "Usuarios";
        String documento = "juan";
        Map<String,Object> updates = new HashMap<>();
        updates.put(campo,FieldValue.delete());
        try {
            DocumentReference docRef = dataBase.collection(collection).document(documento);
            ApiFuture<WriteResult> result = docRef.update(updates);
            System.out.println("Tiempo de ejecucion: " + result.get().getUpdateTime());
            System.out.println("Campos eliminados");
        } catch (Exception e) {
            System.out.println("Fallo:" + e);
        }
    }
    
    public static void agregarPuntuacion(Usuario usuario){
        String collection = "Usuarios";
        String documento = usuario.getNickName();
        Map<String, Object> updates = new HashMap<>();
        updates.put("Puntaje",usuario.getPuntuaciones());
        try {
            DocumentReference docRef = dataBase.collection(collection).document(documento);
            ApiFuture<WriteResult> result = docRef.update(updates);
            System.out.println("Tiempo de ejecucion: " + result.get().getUpdateTime());
            System.out.println("Puntaje subido");
        } catch (Exception e) {
            System.out.println("Fallo:" + e);
        }
    }

    private static ArrayList llenarArray(){
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            numeros.add(0);
        }
        return numeros;
    }
}