package model;

import ViewModel.ActividadStrings;
import java.util.ArrayList;
/**
 *
 * @author Duvan
 */
public class ActividadStringModel {
    public ArrayList<ActividadStrings> actividades;
    public ArrayList<String> enunciados;
    private String archivo;
    private String archivoEnunciados;
    
    public ActividadStringModel(String rutaArchivo,String rutaEnunciado){
        this.archivo = rutaArchivo;
        this.archivoEnunciados = rutaEnunciado;
        this.actividades = new ArrayList<>();
        this.enunciados = new ArrayList<>();
        crearActividades(separaStrings("#"));
        cargarEnunciados();
    }
    
    private void agregarActividad(ActividadStrings act){
        this.actividades.add(act);
    }
    
    private void crearActividades(String[] partes){
        for (int i = 0; i < partes.length; i++) {
            String cadena = partes[i];
            String[] palabras = cadena.split(" ");
            ArrayList<String> pa = new ArrayList<>();
            for (int j = 0; j < palabras.length; j++) {
                pa.add(palabras[j]);
            }
            ActividadStrings act = new ActividadStrings(pa);
            agregarActividad(act);
        }
    }
    
    private String[] separaStrings(String parametro){
        String salida = LectorTxt.LeerTxt(archivo);
        String[] partes = salida.split(parametro);
        return  partes;
    }
      
    private void cargarEnunciados(){
        String salida = LectorTxt.LeerTxt(archivoEnunciados);
        String[] partes = salida.split("#");
        for (int i = 0; i < partes.length; i++) {
            this.enunciados.add(partes[i]);
        }
    }

    public ArrayList<ActividadStrings> getActividades() {
        return actividades;
    }

    public ArrayList<String> getEnunciados() {
        return enunciados;
    }
       
}
