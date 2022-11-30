package model;

import java.util.StringTokenizer;

public class Respuesta9 {

    String[] respuesta9 = {
      "imprimir en pantalla","Todas las anteriores","JOptionPane.showMessageDialog(null,'');","//Hola","Double"
    };
    
    String[] radioR = {
        "llamar la clase,imprimir en pantalla,importar una libreria,declarar una variable",
        "while,for,for each,do/while,Todas las anteriores",
        "System.out.print(''),System.out.set(''),JOptionPane.showMessageDialog(null,'');,JOptionPane.showMessageDialog();",
        "++Hola,¡¡Hola,??Hola,//Hola",
        "public static void main,import pakage,public private static void,{}",
    };
    
    public String getRespuesta9(int posicion){
        return respuesta9[posicion];
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
    
    public String[] setRespuesta9(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
