package ViewModel;

import java.awt.Font;
import static java.awt.Font.PLAIN;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import javax.swing.JButton;
import View.Actividad3;

/**
 *
 * @author Duvan
 */
public class ControladorActividad implements ActionListener{
    
    /*clases que controla*/
    private ActividadStrings actividad;
    private Actividad3 vista;
    
    /*Atributos de los botones */
    private ArrayList<JButton> botones;
    private ArrayList<Integer> listaNumerosAleatoria;
    private int numBotonesPosicion2 = 0;
    private final int xPosition = 100;
    private final int yPositionOpciones = 200;
    private final int yPositionRespuesta = 100;
    private final int anchoBoton = 89;
    private final int alturaBoton = 25;

    /*Constructor*/
    public ControladorActividad(ActividadStrings actividad) {
        this.botones = new ArrayList<>();
        this.actividad = actividad;
        this.vista = new Actividad3();
        CrearlistaNumeros();
        crearBotones();
        escucharBotones();
        agregarBotones();     
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
    /*Crea los botones a partir de la actividad*/
    private void crearBotones(){
        ArrayList<String> palabras = actividad.getRespuesta();
        for (String palabra : palabras) {
            botones.add(new JButton(palabra));
        }
    }
    
    /*agrega listener a todos los botones*/
    private void escucharBotones(){
        for (Iterator<JButton> iterator = botones.iterator(); iterator.hasNext();) {
            JButton next = iterator.next();
            next.addActionListener(this);
        }
        vista.jButtonCheck.addActionListener(this);
    }
    
    /*agrega los potones al jpanel*/
    private void agregarBotones(){
        int i = 0;
        for (Iterator<JButton> iterator = botones.iterator(); iterator.hasNext();) {
            JButton next = iterator.next();
            /*Se configura la posicion y la fuente del boton*/
            next.setFont(new Font("MONOSPACED",PLAIN,10));
            next.setBounds((xPosition + anchoBoton * this.listaNumerosAleatoria.get(i))-anchoBoton,
                    yPositionOpciones,anchoBoton,alturaBoton);
            vista.jPanel1.add(next);
            i++;
        }
    }
    
    private void cambiarPosicionBotonY(JButton b){
        /*Si esta en las opciones lo cambia a las respuestas*/
        if(b.getY()== yPositionOpciones){
            b.setLocation(xPosition+anchoBoton * numBotonesPosicion2, yPositionRespuesta);
            b.setActionCommand(""+numBotonesPosicion2);
            this.numBotonesPosicion2 +=1;
            actividad.agregarPalabra(b.getText());
            ordenarBotonesRespuesta();
        }
        /*Si esta en las respuestas lo cambia a las opciones*/
        else if(b.getY() == yPositionRespuesta){
            b.setLocation(xPosition + anchoBoton *listaNumerosAleatoria.get(botones.indexOf(b)), yPositionOpciones);
            this.numBotonesPosicion2 -=1;
            actividad.eliminarPalabra(b.getText());
            ordenarBotonesRespuesta();
        }
    }
    
    /*Crea una lista aleatoria de numeros utilizada para colocar los botones aleatoriamente*/
    private void CrearlistaNumeros(){
        int cantidadPalabras = actividad.getRespuesta().size();
        Random r = new Random();
        ArrayList<Integer> numbers = new ArrayList<>(cantidadPalabras);
        //Crea una lista de numeros aleatorios inicial
        for (int i = 1; i < cantidadPalabras; i++) {
           if(r.nextInt(2)==1){
               numbers.add(i);
           }
        }
        //completa la lista para que salgan todos los numeros
        for (int i = 0; i < cantidadPalabras; i++) {
            if(!numbers.contains(i)){
                numbers.add(i);
            }
        }
        this.listaNumerosAleatoria = numbers;
        System.out.println(listaNumerosAleatoria);
    }
    
    /*Elimina los espacios de los botones en las respuesta*/
    private void ordenarBotonesRespuesta(){
        for (Iterator<JButton> iterator = botones.iterator(); iterator.hasNext();) {
            JButton next = iterator.next();
            if(next.getY() == yPositionRespuesta){
                int posicion = actividad.getRespuestaUsuario().indexOf(next.getText());
                next.setLocation(xPosition + anchoBoton * posicion, yPositionRespuesta);                
            }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        /*Verifica la respuesta al pulsar el boton*/
        if(e.getSource() == vista.jButtonCheck){
            vista.jTextFieldRespuesta.setText("Respuesta:" + actividad.verificarOrden());
        }
        /*Cambia la posicion de los botones si son pulsados*/
        else{
            for (Iterator<JButton> iterator = botones.iterator(); iterator.hasNext();) {
                JButton next = iterator.next();
                if (e.getSource() == next) {
                    cambiarPosicionBotonY(next);
                }
            }
        }
    }
    
}