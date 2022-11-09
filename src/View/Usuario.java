/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.util.Vector;

public class Usuario {
    private String nick;
    private String contrasena;
    
    public String getNick(){
        return nick;
    }
    public void setNick(String nick){
        this.nick = nick;
    }
    public String getContrasena(){
        return contrasena;
    }
    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    }
    public static int verificarUsuarioNuevo(String usuario){
        Vector lista = mostrar();
        Usuario obj;
        for(int i = 0 ; i<lista.size(); i++){
            obj =(Usuario) lista.elementAt(i);
            if (obj.getNick().equalsIgnoreCase(usuario)){
                return i;
            }
        }
        return -1;
    }
    public static int verificarLogueo(String usuario, String contrasena){
        Vector lista = mostrar();
        Usuario obj;
        for (int i=0 ; i<lista.size();i++){
            obj =(Usuario)lista.elementAt(i);
            if (obj.getNick().equalsIgnoreCase(usuario)&&obj.getContrasena().equalsIgnoreCase(contrasena)){
                return i;
            }
        }
        return -1;
    }
    public static Vector mostrar(){
    return UsuarioLista.mostrar();
    }
}
