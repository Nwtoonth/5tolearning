package model;

import ViewModel.Usuario;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author Duvan
 */
public class SqlOperacionesUsuario {
    
    private static Connection conexion;
    public static String driver = "com.mysql.jdbc.Driver";
    public static String user ="root";
    public static String pass = "";
    public static String url = "jdbc:mysql://localhost:3306/5toLearning";
    private final String tabla = "usuarios";

    public SqlOperacionesUsuario() {
    }
        
    public void realizarConexion(){
        Connection con = null;
        
        try {
            con = (Connection) DriverManager.getConnection(url,user,pass);
            if (con != null){
                System.out.println("Conexion establecida");
            }
        } catch (SQLException e) {
            System.out.println("Error de conexion " + e);
        }
        this.conexion = con;
    }
    
    public void registrar(String ID,String nickName,String Password){
        try {
            
            PreparedStatement consulta;
            consulta = (PreparedStatement) conexion.prepareStatement("INSERT INTO " + this.tabla + 
                    "(ID,NICKNAME,PASSWORD)VALUES (?,?,?)");
            consulta.setString(1,ID);
            consulta.setString(2,nickName);
            consulta.setString(3,Password);
            consulta.executeUpdate();
            System.out.println("Datos insertados");
            
        } catch (SQLException e) {
            System.out.println("Error de conexion " + e);
        }
    }
    
    public void actualizar(String ID,String nickName,String Password){
        try {
            
            PreparedStatement consulta;
            consulta = (PreparedStatement) conexion.prepareStatement("UPDATE " +this.tabla +" SET NICKNAME = ? SET PASSWORD = ? WHERE ID = ? ");
            consulta.setString(1,nickName);
            consulta.setString(2,Password);
            consulta.setString(3,ID);
            consulta.executeUpdate();
            System.out.println("Datos actualizados");
            
        } catch (SQLException e) {
            System.out.println("Error de conexion " + e);
        }
    }    
    
    public void eliminar(String ID){
        try {
            
            PreparedStatement consulta;
            consulta = (PreparedStatement) conexion.prepareStatement("DELETE FROM " +this.tabla +" WHERE ID = ?");
            consulta.setString(1,ID);
            consulta.executeUpdate();
            System.out.println("Datos eliminados");
            
        } catch (SQLException e) {
            System.out.println("Error de conexion " + e);
        }
    }
    
    public Usuario selecionar(String nickName){
        Usuario us1 = null;
        try {
            PreparedStatement consulta = (PreparedStatement) conexion.prepareStatement("SELECT * FROM " +this.tabla +" WHERE NICKNAME = ?");
            consulta.setString(1,nickName);
            ResultSet rs = consulta.executeQuery();
            try {
                while(rs.next()){
                    String ID = rs.getString(1);
                    String userName = rs.getString(2);
                    String passWord = rs.getString(3);
                    us1 = new Usuario(ID,userName,passWord);
                }
            } catch (Exception e) {
                System.out.println("Contrasena o usuario invalido");
            }
        } catch (SQLException e) {
            System.out.println("Error de conexion " + e);
        }
        return us1;
    }
    
    public int selecionarTodo(){
        int contador = 0;
        try {
            PreparedStatement consulta = (PreparedStatement) conexion.prepareStatement("SELECT * FROM " + this.tabla);
            ResultSet rs = consulta.executeQuery();
            try {
                while(rs.next()){
                    contador +=1;
                }
            } catch (Exception e) {
            }
        } catch (SQLException e) {
            System.out.println("Error de conexion " + e);
        }
        return contador;
    }  
    
}

