package ViewModel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import javax.swing.JButton;
import view.VistaActividades;

/**
 *
 * @author Duvan
 */
public class ControladorActividad implements ActionListener{
    
    /*clases que controla*/
    private ActividadStrings actividad;
    private ArrayList<ActividadStrings> actividades;
    private VistaActividades vista;
    private ArrayList<String> enunciados;
    private ArrayList<Integer> ordenActividades;
    
    /*Atributos de los botones */
    private ArrayList<JButton> botones;
    private ArrayList<Integer> listaNumerosAleatoria;
    private int numBotonesPosicion2 = 0;
    private final int xPosition = 30;
    private final int xPosition2 =128;
    private final int yPositionOpciones = 260;
    private final int yPositionRespuesta = 140;
    private final int anchoBoton = 98;
    private final int alturaBoton = 26;
    
    /*Puntuacion*/
    private int puntuacion = 0;

    /*Constructor*/
    public ControladorActividad(ArrayList<ActividadStrings> acts,ArrayList<String> pregutas) {
        this.enunciados = pregutas;
        this.botones = new ArrayList<>();
        this.listaNumerosAleatoria=new ArrayList<>();
        this.ordenActividades = new ArrayList<>();
        this.actividades = acts;
        this.vista = new VistaActividades();
        listaAleatoriaActividades();
        escucharBotonesMenu();
        crearActividad(ordenActividades.get(0));
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        System.out.println("Se creo");
    }
    
    /*Crea los botones a partir de la actividad*/
    private void crearBotones(){
        ArrayList<String> palabras = actividad.getPalabrasBotones();
        for (String palabra : palabras) {
            botones.add(new JButton(palabra));
        }
    }
    private void escucharBotonesMenu(){
        vista.jRadioButton1.addActionListener(this);
        vista.jRadioButton2.addActionListener(this);
        vista.jRadioButton3.addActionListener(this);
        vista.jRadioButton4.addActionListener(this);
        vista.jRadioButton5.addActionListener(this);
        vista.jRadioButton6.addActionListener(this);
        vista.jRadioButton7.addActionListener(this);
        vista.jButtonCheck.addActionListener(this);
    }
    /*agrega listener a todos los botones*/
    private void escucharBotones(){
        for (Iterator<JButton> iterator = botones.iterator(); iterator.hasNext();) {
            JButton next = iterator.next();
            next.addActionListener(this);
        }
    }
    
    /*agrega los potones al jpanel*/
    private void agregarBotones(){
        int i = 0;
        for (Iterator<JButton> iterator = botones.iterator(); iterator.hasNext();) {
            JButton next = iterator.next();
            /*Se configura la posicion y la fuente del boton*/
            next.setFont(new Font("SANSSERIF",Font.BOLD,11));
            next.setForeground(Color.decode("#113760"));
            next.setBounds((xPosition2 + anchoBoton * this.listaNumerosAleatoria.get(i))-anchoBoton,
                    yPositionOpciones,anchoBoton,alturaBoton);
            vista.jPanel1.add(next);
            i++;
        }
    }
    
    /*Remueve los bones del jpanel*/
    private void removerBotones(){
        for (Iterator<JButton> iterator = botones.iterator(); iterator.hasNext();) {
            JButton next = iterator.next();
            vista.jPanel1.remove(next);
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
        int cantidadPalabras = actividad.getPalabrasBotones().size();
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
    
    /*El metodo que se encarga de crear cada una de las actividades*/
    private void crearActividad(int num){
        if(!listaNumerosAleatoria.isEmpty()){
            listaNumerosAleatoria.removeAll(listaNumerosAleatoria);
        }
        if(!botones.isEmpty()){
            removerBotones();
            botones.removeAll(botones);
        }
        this.actividad = actividades.get(num);
        actividad.setEnunciado(enunciados.get(num));
        vista.jLabelActividadPregunta.setText(actividad.getEnunciado());
        CrearlistaNumeros();
        crearBotones();
        escucharBotones();
        agregarBotones();
        vista.repaint();       
    }
    
    /*Pinta de color naranga si la palabra es correcta pero no esta en la posicion
    indicada, de verde si la posicion es correcta, de rojo si la palabra es incorrecta
    */
    private void pintarBotonesRespuesta(){
        for (Iterator<JButton> iterator = botones.iterator(); iterator.hasNext();) {
            JButton next = iterator.next();
            if(next.getY() == yPositionRespuesta){
                if(actividad.getRespuesta().contains(next.getText())){
                    next.setBackground(Color.decode("#FCA103"));
                    int index = actividad.getRespuestaUsuario().indexOf(next.getText());
                    if(index == actividad.getRespuesta().indexOf(next.getText())){
                        next.setBackground(Color.GREEN);
                    }
                }
                else{
                    next.setBackground(Color.red);
                }
            }
        }
    }
    
    /*Devuelbe una lista aleatoria de numeros del 0 al 6 sin repetir para asignar el orden de las actividades */
    private void listaAleatoriaActividades(){
        Random r = new Random();
        ArrayList<Integer> numbers = new ArrayList<>(7);
        //Crea una lista de numeros aleatorios inicial
        for (int i = 1; i < 7; i++) {
           if(r.nextInt(2)==1){
               numbers.add(i);
           }
        }
        //completa la lista para que salgan todos los numeros
        for (int i = 0; i < 7; i++) {
            if(!numbers.contains(i)){
                numbers.add(i);
            }
        }
        this.ordenActividades = numbers;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        /*Verifica la respuesta al pulsar el boton*/
        if(e.getSource() == vista.jButtonCheck){
            vista.jButtonCheck.setEnabled(false);
            pintarBotonesRespuesta();
            if(actividad.verificarOrden()){
                puntuacion +=100;
            }
            vista.jTextFieldPuntuacion.setText(""+puntuacion);
        }
        /*Verifica cuando un radioButton se pulsa y crea una actividad para el mismo*/
        else if (e.getSource() == vista.jRadioButton1) {
            crearActividad(ordenActividades.get(0));
        }
        else if(e.getSource() == vista.jRadioButton2){
            crearActividad(ordenActividades.get(1));            
        }
        else if(e.getSource() == vista.jRadioButton3){
            crearActividad(ordenActividades.get(2));
        }
        else if(e.getSource() == vista.jRadioButton4){
            crearActividad(ordenActividades.get(3));
        }
        else if(e.getSource() == vista.jRadioButton5){
            crearActividad(ordenActividades.get(4));
        }
        else if(e.getSource() == vista.jRadioButton6){
            crearActividad(ordenActividades.get(5));
        }
        else if(e.getSource() == vista.jRadioButton7){
            crearActividad(ordenActividades.get(6));
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