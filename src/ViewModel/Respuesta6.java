
package ViewModel;

import java.util.StringTokenizer;

public class Respuesta6 {

    String[] respuesta6 = {
      "new Object();","public class Nombre{}","Todas las anteriores","El metodo principal","public static void main"
    };
    
    String[] radioR = {
        "new Object();,nuevo Object();, new Object; ,Object();",
        "public class Nombre{},public clas Nombre{},public Nombre{},private Nombre{}",
        "Carro,Bicicleta,Avion,Todas las anteriores",
        "El nombre de la clase,El metodo principal,La variable,La clase",
        "Int,Boolean,Integer,Double",
    };
    
    public String getRespuesta6(int posicion){
        return respuesta6[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuesta6(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
