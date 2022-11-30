package model;
//package View;

public class Pregunta9 {
    
    String[] pregunta9 = {
        "System.out.print('')sirve para",
        "Para hacer el recorrido de un arreglo se requiere de un ciclo para \n "
            + "pasar por cada una de sus posiciones, ¿Cual es la estructura correcta?",
        "Si deseas desplegar informacion en la pantalla con un cuadro de dialogo, \n"
            + "¿que instruccion te permite hacerlo?",
        "la forma correcta de hacer un comentario en java es",
        "¿cual es la parte donde se ejecuta un programa en java?"
    };
    
   public String getPregunta9(int posicion){
        return pregunta9[posicion];
    }
    
}
