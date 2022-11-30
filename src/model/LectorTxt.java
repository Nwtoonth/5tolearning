package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Duvan
 */
public class LectorTxt {
    public static String LeerTxt(String ruta){
        String salida = "";
        File miArchivo= new File(ruta);
        try (BufferedReader br = new BufferedReader(new FileReader(miArchivo))){
              String strng;
              while ((strng = br.readLine()) != null)
                  salida += strng;
        } catch (IOException e) {
            System.out.println("Error de escritura / lectura" + e.getMessage());
            throw new RuntimeException("Error inesperado en el catch");
        }
        return salida;
    }   
}
