package View;

import ViewModel.Usuario;
import java.awt.Color;
/**
 *
 * @author Admin
 */
public class LoginRegistro extends javax.swing.JPanel {

    public LoginRegistro() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        contraseñaLabel = new javax.swing.JLabel();
        contrasenaTxt = new javax.swing.JPasswordField();
        iniciarBtt = new java.awt.Panel();
        iniciarTxt = new javax.swing.JLabel();
        registrarBtt = new java.awt.Panel();
        registrarTxt = new javax.swing.JLabel();

        titulo.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        titulo.setText("Registro");
        titulo.setToolTipText("");

        userLabel.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        userLabel.setText("Usuario");

        userTxt.setForeground(new java.awt.Color(204, 204, 204));
        userTxt.setText("Ingresar usuario");
        userTxt.setBorder(null);
        userTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTxtMousePressed(evt);
            }
        });

        contraseñaLabel.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        contraseñaLabel.setText("Contraseña");

        contrasenaTxt.setForeground(new java.awt.Color(204, 204, 204));
        contrasenaTxt.setText("********");
        contrasenaTxt.setBorder(null);
        contrasenaTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contrasenaTxtMousePressed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contrasenaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contraseñaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(iniciarBtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(registrarBtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(userLabel)
                .addGap(4, 4, 4)
                .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(contraseñaLabel)
                .addGap(4, 4, 4)
                .addComponent(contrasenaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iniciarBtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrarBtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    }//GEN-LAST:event_iniciarBttMouseClicked

    private void iniciarBttMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarBttMouseEntered
        iniciarBtt.setBackground(Color.BLUE);
    }//GEN-LAST:event_iniciarBttMouseEntered

    private void iniciarBttMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarBttMouseExited
        iniciarBtt.setBackground(Color.YELLOW);
    }//GEN-LAST:event_iniciarBttMouseExited

    private void registrarBttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarBttMouseClicked

    }//GEN-LAST:event_registrarBttMouseClicked

    private void registrarBttMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarBttMouseEntered
        registrarBtt.setBackground(Color.BLUE);
    }//GEN-LAST:event_registrarBttMouseEntered

    private void registrarBttMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarBttMouseExited
        registrarBtt.setBackground(Color.YELLOW);
    }//GEN-LAST:event_registrarBttMouseExited

    private void registrarBttMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarBttMousePressed

    }//GEN-LAST:event_registrarBttMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contrasenaTxt;
    private javax.swing.JLabel contraseñaLabel;
    private java.awt.Panel iniciarBtt;
    private javax.swing.JLabel iniciarTxt;
    private java.awt.Panel registrarBtt;
    private javax.swing.JLabel registrarTxt;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
