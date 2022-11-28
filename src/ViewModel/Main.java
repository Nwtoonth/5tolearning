package ViewModel;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import model.FirebaseOperaciones;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) throws IOException, ExecutionException {
        FirebaseOperaciones.conectar();
    }
}
