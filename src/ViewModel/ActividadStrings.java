package ViewModel;

import java.util.ArrayList;
/**
 *
 * @author Duvan
 */
public class ActividadStrings {
    
    private String enunciado;
    private ArrayList<String> respuestaCorrecta;
    private ArrayList<String> respuestaUsuario;

    public ActividadStrings(ArrayList<String> palabras) {
        this.respuestaCorrecta = palabras;
        this.respuestaUsuario = new ArrayList<>();
    }
    
    public boolean verificarOrden(){
        return this.respuestaUsuario.equals(this.respuestaCorrecta);
    }
    
    public void agregarPalabra(String palabra){
        this.respuestaUsuario.add(palabra);
    }
    
    public void eliminarPalabra(String palabra){
        this.respuestaUsuario.remove(palabra);
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public ArrayList<String> getRespuestaUsuario() {
        return respuestaUsuario;
    }
   
    public ArrayList<String> getRespuesta() {
        return respuestaCorrecta;
    }
    
    
}