package contenido;

import java.awt.Color;

public class Login extends javax.swing.JFrame {
    
    //encabezado
    int xMouse, yMouse;
    
    public Login() {
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
        titulo = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        contraseñaLabel = new javax.swing.JLabel();
        contrasenaTxt = new javax.swing.JPasswordField();
        iniciarBtt = new java.awt.Panel();
        iniciarTxt = new javax.swing.JLabel();
        header = new java.awt.Panel();
        exitBtt = new java.awt.Panel();
        exitTxt = new javax.swing.JLabel();
        headerTitulo = new javax.swing.JLabel();
        logoLogin = new javax.swing.JLabel();

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

        titulo.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        titulo.setText("INICIAR SESION");
        titulo.setToolTipText("");
        bg.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 260, 40));

        userLabel.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        userLabel.setText("Usuario");
        bg.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 120, -1));

        userTxt.setForeground(new java.awt.Color(204, 204, 204));
        userTxt.setText("Ingresar usuario");
        userTxt.setBorder(null);
        userTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTxtMousePressed(evt);
            }
        });
        bg.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 310, 30));

        contraseñaLabel.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        contraseñaLabel.setText("Contraseña");
        bg.add(contraseñaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 120, -1));

        contrasenaTxt.setForeground(new java.awt.Color(204, 204, 204));
        contrasenaTxt.setText("********");
        contrasenaTxt.setBorder(null);
        contrasenaTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contrasenaTxtMousePressed(evt);
            }
        });
        bg.add(contrasenaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 310, 30));

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

        bg.add(iniciarBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 150, 40));

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
        bg.add(logoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 400, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
        if (userTxt.getText().equals("Ingresar usuario")){
            userTxt.setText("");
            userTxt.setForeground(Color.BLACK);
        }
        if (String.valueOf(contrasenaTxt.getPassword()).isEmpty()){
            contrasenaTxt.setText("********");
            contrasenaTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_userTxtMousePressed

    private void contrasenaTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contrasenaTxtMousePressed
        if (String.valueOf( contrasenaTxt.getPassword()).equals("********")){
            contrasenaTxt.setText("");
            contrasenaTxt.setForeground(Color.BLACK);
        }
        if (userTxt.getText().isEmpty()){
            userTxt.setText("Ingresar usuario");
            userTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_contrasenaTxtMousePressed

    private void iniciarBttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarBttMouseClicked
        //javax.swing.JOptionPane.showMessageDialog(this, "intento de inicio con : "+ userTxt.getText() + "\nContraseña: " + String.valueOf(contrasenaTxt.getPassword()), "INICIAR",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        //String usuario = userTxt.getText();
        //String paswd = contrasenaTxt.getText();
        
        Inicio pc = new Inicio();
        pc.setVisible(true);
        this.dispose();
        
        //System.exit(0);
    }//GEN-LAST:event_iniciarBttMouseClicked

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
    private javax.swing.JPasswordField contrasenaTxt;
    private javax.swing.JLabel contraseñaLabel;
    private java.awt.Panel exitBtt;
    private javax.swing.JLabel exitTxt;
    private java.awt.Panel header;
    private javax.swing.JLabel headerTitulo;
    private java.awt.Panel iniciarBtt;
    private javax.swing.JLabel iniciarTxt;
    private javax.swing.JLabel logoLogin;
    private javax.swing.JLabel morty;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
