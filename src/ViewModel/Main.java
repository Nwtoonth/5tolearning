package ViewModel;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.FirebaseOperaciones;
/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        try {
            FirebaseOperaciones.conectar();
            System.out.println(FirebaseOperaciones.buscar("WindBlossom","68525910"));
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
