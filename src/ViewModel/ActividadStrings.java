package ViewModel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
/**
 *
 * @author Duvan
 */
public class ActividadStrings {
    
    private String enunciado;
    private ArrayList<String> respuestaCorrecta;
    private ArrayList<String> respuestaUsuario;
    private ArrayList<String> palabrasBotones;

    public ActividadStrings(ArrayList<String> palabras) {
        this.respuestaCorrecta = palabras;
        this.palabrasBotones = new ArrayList<>();
        ponerPalabrasAzar();
        this.respuestaUsuario = new ArrayList<>();
    }
    
    /*verifica si la respuesta del usuario es igual que la de la aplicacion*/
    public boolean verificarOrden(){
        return this.respuestaUsuario.equals(this.respuestaCorrecta);
    }
    
    public void agregarPalabra(String palabra){
        this.respuestaUsuario.add(palabra);
    }

    public ArrayList<String> getPalabrasBotones() {
        return palabrasBotones;
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
   
    /*Pone palabras al azar hasta completar 10*/
    private void ponerPalabrasAzar(){
        String palabra = "";
        for (Iterator<String> i = respuestaCorrecta.iterator(); i.hasNext();) {
            String next = i.next();
            this.palabrasBotones.add(next);
        }
        while (palabrasBotones.size() < 10) {
            palabra = palabraAlAzar();
            if(!palabrasBotones.contains(palabra))
                palabrasBotones.add(palabra);
        }
    }
    
    /*Seleciona una palabra al azar*/
    private String palabraAlAzar() {
        Random r = new Random();
        String[] opciones = {"Private","(Boolean)",">=","Public"
                ,"Boolean","next","Iterator","for","if",
             "else","while","switch","(32,num)","(Float)"
                ,".split",".add",".remove",".delete","Try","Return",
            "(-1,sum)","-=","+=",".contains","(casa)","(-5)"
                ,".sort","Break","Continue","(int)"};
        return opciones[r.nextInt(30)];
    }
    
}