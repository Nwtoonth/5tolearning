
package ViewModel;

import java.util.StringTokenizer;

public class Respuestas {

    String[] respuestas = {
      "java","int","System.out.println()","String","Double"
    };
    
    String[] radioR = {
        "java,visual studio ,HTML,Android",
        "int,byte,double,string",
        "System.out.println(),System.in.println(),System.in(),System.in.println()",
        "String,Cadena,Char,Word",
        "Double,Char,Int,Byte",
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
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
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
