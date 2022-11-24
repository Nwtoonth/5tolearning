package model;


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
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author Duvan
 */
public class FirebaseOperaciones {

    protected static Firestore dataBase;
    
    public static void conectar() throws FileNotFoundException, IOException{      
        FileInputStream serviceAccount
                = new FileInputStream("claveAcceso.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://prueba-java-a76c8-default-rtdb.firebaseio.com")
                .build();

        FirebaseApp.initializeApp(options);
        dataBase = FirestoreClient.getFirestore();
        System.out.println("Conexión exitosa");
    }
    
    public static void insertarDatos() {
        String collection = "Usuarios";
        String documento = "juan";
        Map<String,String> data = new HashMap<>();
        data.put("nombre","juan");
        data.put("Contrasena","123456");
        data.put("Puntaje", "1234");
        try {
            DocumentReference docRef = dataBase.collection(collection).document(documento);
            ApiFuture<WriteResult> result = docRef.set(data);
            System.out.println("Tiempo de carga: " + result.get().getUpdateTime());
            System.out.println("Enviado");
        } catch (Exception e) {
            System.out.println("Fallo:" + e);
        }
    }
    
    public static void buscar() throws InterruptedException, ExecutionException{
        CollectionReference usuarios= dataBase.collection("Usuarios");
        ApiFuture<QuerySnapshot> querySnapshot = usuarios.get();
        for (DocumentSnapshot document : querySnapshot.get().getDocuments()){
            System.out.println("Tiempo de carga " + querySnapshot.get().getReadTime());
            System.out.println(document.getId() + " " + document.getString("Contrasena") + " " + document.getString("Puntaje"));
        }
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
    
    public static void agregarCampos(){
        String collection = "Usuarios";
        String documento = "juan";
        Map<String, Object> updates = new HashMap<>();
        updates.put("Puntaje","123456");
        try {
            DocumentReference docRef = dataBase.collection(collection).document(documento);
            ApiFuture<WriteResult> result = docRef.update(updates);
            System.out.println("Tiempo de ejecucion: " + result.get().getUpdateTime());
            System.out.println("Campos agregados");
        } catch (Exception e) {
            System.out.println("Fallo:" + e);
        }
    }

}