package ViewModel;

import java.util.ArrayList;

public class Usuario {
    
    private String nickName;
    private String contrasena;
    private ArrayList<Long> puntuaciones;
    private long puntuacionGlobal;

    public Usuario(String nickName, String contrasena,ArrayList<Long> scores) {
        this.puntuaciones = scores;
        this.puntuacionGlobal = 0L;
        this.nickName = nickName;
        this.contrasena = contrasena;
        calcularPuntuacionGlobal();
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

    public void setPuntuaciones(int posicion,long puntuacion) {
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

    public Long getPuntuacionGlobal() {
        return puntuacionGlobal;
    }

    public void setPuntuacionGlobal(Integer puntuacionGlobar) {
        this.puntuacionGlobal = puntuacionGlobar;
    }
    
    public void calcularPuntuacionGlobal(){
        for (long score : puntuaciones) {
            puntuacionGlobal += score;
        }
    }

    @Override
    public String toString() {
        return "Usuario{" + "nickName=" + nickName + ", contrasena=" + contrasena + ", puntuaciones=" + puntuaciones + ", puntuacionGlobal=" + puntuacionGlobal + '}';
    }

    
}
