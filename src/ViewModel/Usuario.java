package ViewModel;

import java.util.ArrayList;

public class Usuario {
    
    private String nickName;
    private String contrasena;
    private ArrayList<Integer> puntuaciones;

    public Usuario(String nickName, String contrasena,ArrayList<Integer> scores) {
        this.puntuaciones = scores;
        this.nickName = nickName;
        this.contrasena = contrasena;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public ArrayList getPuntuaciones() {
        return puntuaciones;
    }

    public void setPuntuaciones(int posicion,int puntuacion) {
        this.puntuaciones.set(posicion,puntuacion);
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
        return "Usuario{" + "nickName=" + nickName + ", contrasena=" + contrasena + ", puntuaciones=" + puntuaciones + '}';
    }
    
}
