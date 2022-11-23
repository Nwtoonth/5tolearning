package ViewModel;

import model.SqlOperacionesUsuario;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        
        SqlOperacionesUsuario sql1 = new SqlOperacionesUsuario();
        sql1.realizarConexion();
        //sql1.registrar("1", "DuvanTique", "123456");
        System.out.println(sql1.selecionarTodo());

    }
}
