/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import java.util.Vector;

/**
 *
 * @author Admin
 */
public class UsuarioLista {
    private static Vector<Usuario> datos= new Vector<Usuario>();
    public static void agregar(Usuario obj){
        datos.addElement(obj);
    }
    public static void eliminar(int pos){
        datos.removeElementAt(pos);
    }
    public static Vector mostrar(){
        return datos;
    }
}
