package contenido;

import java.awt.Color;
import java.util.List;


public class Login extends javax.swing.JFrame {
    
    //encabezado
    int xMouse, yMouse;
    
    public Login() {
        initComponents();
        
        //logo
        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(logoLogin,"src/logo/to5learning.png");
        
        LoginInicio p1= new LoginInicio();
        p1.setSize(530, 420);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(logoLogin);
        content.add(iniciarBtt);
        content.add(registrarBtt);
        content.add(p1);
        content.revalidate();
        content.repaint();
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

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(iniciarBtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(registrarBtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iniciarBtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrarBtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bg.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 530, 420));

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

    private void iniciarBttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarBttMouseClicked
        //javax.swing.JOptionPane.showMessageDialog(this, "intento de inicio con : "+ userTxt.getText() + "\nContraseña: " + String.valueOf(contrasenaTxt.getPassword()), "INICIAR",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        //String usuario = userTxt.getText();
        //String paswd = contrasenaTxt.getText();
        
        Inicio p1 = new Inicio();
        p1.setVisible(true);
        this.dispose();
        
        //System.exit(0);
    }//GEN-LAST:event_iniciarBttMouseClicked

    private void registrarBttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarBttMouseClicked
        
    }//GEN-LAST:event_registrarBttMouseClicked

    private void registrarBttMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarBttMouseEntered
        registrarBtt.setBackground(Color.BLUE);
    }//GEN-LAST:event_registrarBttMouseEntered

    private void registrarBttMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarBttMouseExited
        registrarBtt.setBackground(Color.YELLOW);
    }//GEN-LAST:event_registrarBttMouseExited

    private void registrarBttMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarBttMousePressed
        LoginRegistro p2= new LoginRegistro();
        p2.setSize(530, 420);
        p2.setLocation(0,0);
        
        content.removeAll();
        content.add(iniciarBtt);
        content.add(p2);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_registrarBttMousePressed

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
    private java.awt.Panel exitBtt;
    private javax.swing.JLabel exitTxt;
    private java.awt.Panel header;
    private javax.swing.JLabel headerTitulo;
    private java.awt.Panel iniciarBtt;
    private javax.swing.JLabel iniciarTxt;
    private javax.swing.JLabel logoLogin;
    private javax.swing.JLabel morty;
    private java.awt.Panel registrarBtt;
    private javax.swing.JLabel registrarTxt;
    // End of variables declaration//GEN-END:variables
}
