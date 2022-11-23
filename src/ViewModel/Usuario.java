package ViewModel;

import java.util.Vector;

public class Usuario {
    
    private String id;
    private String nickName;
    private String contrasena;

    public Usuario(String id, String nickName, String contrasena) {
        this.id = id;
        this.nickName = nickName;
        this.contrasena = contrasena;
    }
   
    public void setId(String id) {
        this.id = id;
    }
       
    public String getNick(){
        return nickName;
    }
    public void setNick(String nick){
        this.nickName = nick;
    }
    public String getContrasena(){
        return contrasena;
    }
    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    }
    
    public boolean verificarLogueo(String nombre , String password){
        return this.nickName.equals(nombre) && this.contrasena.equals(password);
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nickName=" + nickName + ", contrasena=" + contrasena + '}';
    }      
}
