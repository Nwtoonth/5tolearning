package View;

import ViewModel.Main;
import ViewModel.Usuario;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.FirebaseOperaciones;

public class Login extends javax.swing.JFrame {
    
    //encabezado
    int xMouse, yMouse;  
    public Login() {
        try {
            FirebaseOperaciones.conectar();
        } catch (FileNotFoundException e){
            System.out.println("No se encontro la el archivo de acceso " + e);          
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        
        //logo
        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(logoLogin,"src/logo/to5learning.png");
        
    }

    @SuppressWarnings("unchecked")   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        morty = new javax.swing.JLabel();
        header = new java.awt.Panel();
        exitBtt = new java.awt.Panel();
        exitTxt = new javax.swing.JLabel();
        headerTitulo = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        iniciarBtt = new java.awt.Panel();
        iniciarTxt = new javax.swing.JLabel();
        logoLogin = new javax.swing.JLabel();
        registrarBtt = new java.awt.Panel();
        registrarTxt = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        contraseñaLabel = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jLabelRespuesta = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabelMensajes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setForeground(new java.awt.Color(102, 102, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        morty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        morty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rick.jpg"))); // NOI18N
        morty.setText("jLabel1");
        bg.add(morty, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 30, 230, 470));

        header.setBackground(new java.awt.Color(255, 255, 204));
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });

        exitBtt.setBackground(new java.awt.Color(255, 255, 102));
        exitBtt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitBttMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitBttMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitBttMousePressed(evt);
            }
        });

        exitTxt.setBackground(new java.awt.Color(255, 255, 102));
        exitTxt.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        exitTxt.setText("X");

        javax.swing.GroupLayout exitBttLayout = new javax.swing.GroupLayout(exitBtt);
        exitBtt.setLayout(exitBttLayout);
        exitBttLayout.setHorizontalGroup(
            exitBttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBttLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE))
        );
        exitBttLayout.setVerticalGroup(
            exitBttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBttLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitTxt)
                .addGap(13, 13, 13))
        );

        headerTitulo.setText("5tolearning");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(350, 350, 350)
                .addComponent(headerTitulo)
                .addGap(0, 367, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitBtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(headerTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        iniciarBtt.setBackground(new java.awt.Color(255, 255, 0));
        iniciarBtt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciarBtt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarBttMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iniciarBttMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iniciarBttMouseExited(evt);
            }
        });

        iniciarTxt.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        iniciarTxt.setText("INICIAR");
        iniciarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarTxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout iniciarBttLayout = new javax.swing.GroupLayout(iniciarBtt);
        iniciarBtt.setLayout(iniciarBttLayout);
        iniciarBttLayout.setHorizontalGroup(
            iniciarBttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iniciarBttLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(iniciarTxt)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        iniciarBttLayout.setVerticalGroup(
            iniciarBttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iniciarBttLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iniciarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        registrarBtt.setBackground(new java.awt.Color(255, 255, 0));
        registrarBtt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarBtt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarBttMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registrarBttMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrarBttMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registrarBttMousePressed(evt);
            }
        });

        registrarTxt.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        registrarTxt.setText("REGISTRAR");

        javax.swing.GroupLayout registrarBttLayout = new javax.swing.GroupLayout(registrarBtt);
        registrarBtt.setLayout(registrarBttLayout);
        registrarBttLayout.setHorizontalGroup(
            registrarBttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrarBttLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(registrarTxt)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        registrarBttLayout.setVerticalGroup(
            registrarBttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrarBttLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registrarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        titulo.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        titulo.setText("INICIAR SESION");
        titulo.setToolTipText("");

        userLabel.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        userLabel.setText("Usuario");

        contraseñaLabel.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        contraseñaLabel.setText("Contraseña");

        jTextFieldUser.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jTextFieldUser.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldUser.setText("Nombre de usuario");
        jTextFieldUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldUserMouseClicked(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField1.setText("*********");
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
        });

        jLabelMensajes.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contentLayout.createSequentialGroup()
                                .addComponent(iniciarBtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registrarBtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelMensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contentLayout.createSequentialGroup()
                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldUser, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                    .addComponent(jLabelRespuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPasswordField1)
                                    .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contraseñaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(104, 104, 104)))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userLabel)
                .addGap(4, 4, 4)
                .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(contraseñaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabelRespuesta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelMensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iniciarBtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(registrarBtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        bg.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 530, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x =evt.getXOnScreen ();
        int y =evt.getYOnScreen ();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitBttMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBttMousePressed
        System.exit(0);
    }//GEN-LAST:event_exitBttMousePressed

    private void exitBttMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBttMouseEntered
        exitBtt.setBackground(Color.red);
    }//GEN-LAST:event_exitBttMouseEntered

    private void exitBttMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBttMouseExited
        exitBtt.setBackground(Color.YELLOW);
    }//GEN-LAST:event_exitBttMouseExited

    private void iniciarBttMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarBttMouseEntered
        iniciarBtt.setBackground(Color.BLUE);
    }//GEN-LAST:event_iniciarBttMouseEntered

    private void iniciarBttMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarBttMouseExited
        iniciarBtt.setBackground(Color.YELLOW);
    }//GEN-LAST:event_iniciarBttMouseExited

    private void iniciarBttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarBttMouseClicked
        Usuario userData = null;
        try {
            userData = FirebaseOperaciones.buscar(jTextFieldUser.getText(),jPasswordField1.getText());
        } catch (InterruptedException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(userData != null){
            new Inicio(userData).setVisible(true);
            this.dispose();
        }
        else{
            jLabelMensajes.setForeground(Color.red);
            jLabelMensajes.setText("Daatos de entrada incorrectos...");
        }
    }//GEN-LAST:event_iniciarBttMouseClicked

    private void registrarBttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarBttMouseClicked
        boolean isRegistrado = false;
        try {
            isRegistrado = FirebaseOperaciones.insertarDatos(jTextFieldUser.getText(),jPasswordField1.getText());
        } catch (InterruptedException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(isRegistrado){
            jLabelMensajes.setForeground(Color.green);
            jLabelMensajes.setText("Se realizo el registro con exito ...");
        }
        else{
            jLabelMensajes.setForeground(Color.red);
            jLabelMensajes.setText("El nombre de usuario ya existe ...");            
        }
    }//GEN-LAST:event_registrarBttMouseClicked

    private void registrarBttMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarBttMouseEntered
        registrarBtt.setBackground(Color.BLUE);
    }//GEN-LAST:event_registrarBttMouseEntered

    private void registrarBttMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarBttMouseExited
        registrarBtt.setBackground(Color.YELLOW);
    }//GEN-LAST:event_registrarBttMouseExited

    private void registrarBttMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarBttMousePressed

    }//GEN-LAST:event_registrarBttMousePressed

    private void iniciarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_iniciarTxtMouseClicked

    private void jTextFieldUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUserMouseClicked
        if(jTextFieldUser.getText().equals("Nombre de usuario")){
            jTextFieldUser.setText("");
            jTextFieldUser.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextFieldUserMouseClicked

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
            jPasswordField1.setText("");
            jTextFieldUser.setForeground(Color.BLACK);

    }//GEN-LAST:event_jPasswordField1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel content;
    private javax.swing.JLabel contraseñaLabel;
    private java.awt.Panel exitBtt;
    private javax.swing.JLabel exitTxt;
    private java.awt.Panel header;
    private javax.swing.JLabel headerTitulo;
    private java.awt.Panel iniciarBtt;
    private javax.swing.JLabel iniciarTxt;
    private javax.swing.JLabel jLabelMensajes;
    private javax.swing.JLabel jLabelRespuesta;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldUser;
    private javax.swing.JLabel logoLogin;
    private javax.swing.JLabel morty;
    private java.awt.Panel registrarBtt;
    private javax.swing.JLabel registrarTxt;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
