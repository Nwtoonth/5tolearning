package model;
//package View;

public class Pregunta3 {
    
    String[] pregunta3 = {
        "¿Lenguaje de programación de propósito general, orientado a objetos, \n "
            + " que fue diseñado específicamente para tener tan pocas dependencias \n"
            + "de implementación como fuera posible?",
        "¿Tipo de dato que permite almacenar un entero en Java?",
        "Para imprimir texto a través de la pantalla se hace uso de...",
        "¿si deseas guardar el nombre 'Pablito' el tipo de dato que se debe realizar es?",
        "¿para guardar la altura de una persona (en metros) debes utilizar el tipo de dato?"
    };
    
   public String getPregunta3(int posicion){
        return pregunta3[posicion];
    }
    
}
