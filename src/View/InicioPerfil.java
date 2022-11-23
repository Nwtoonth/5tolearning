package View;

import ViewModel.Usuario;
import model.SqlOperacionesUsuario;

/**
 *
 * @author Duvan
 */
public class InicioPerfil extends javax.swing.JPanel {
    private SqlOperacionesUsuario sqlUser;
    
    private Usuario userA;
    public InicioPerfil(Usuario us1) {
        sqlUser = new SqlOperacionesUsuario();
        sqlUser.realizarConexion();
        this.userA=us1;      
        initComponents();
        LabelUserName.setText(userA.getNick());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LabelProgreso = new javax.swing.JLabel();
        LabelFechaIngreso = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TextFieldNewUser = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        jButtonConfirmar = new javax.swing.JButton();
        SubirFoto = new javax.swing.JButton();
        Labeltext = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LabelUserName = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 55, 96));
        jLabel1.setText("NickName:");

        LabelProgreso.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        LabelProgreso.setForeground(new java.awt.Color(252, 161, 3));
        LabelProgreso.setText("%");

        LabelFechaIngreso.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        LabelFechaIngreso.setForeground(new java.awt.Color(17, 55, 96));
        LabelFechaIngreso.setText("Fecha de inicio");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/gallery (1).png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(17, 55, 96));
        jLabel3.setText("Cambiar usuario - Contraseña");

        TextFieldNewUser.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldNewUser.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        TextFieldNewUser.setText("Nuevo Usuario");
        TextFieldNewUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextFieldNewUserMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TextFieldNewUserMouseExited(evt);
            }
        });
        TextFieldNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNewUserActionPerformed(evt);
            }
        });

        PasswordField.setBackground(new java.awt.Color(255, 255, 255));
        PasswordField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        PasswordField.setText("jPasswordField1");

        jButtonConfirmar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonConfirmar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonConfirmar.setForeground(new java.awt.Color(17, 55, 96));
        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonConfirmarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonConfirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonConfirmarMouseExited(evt);
            }
        });
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        SubirFoto.setBackground(new java.awt.Color(255, 255, 255));
        SubirFoto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        SubirFoto.setForeground(new java.awt.Color(17, 55, 96));
        SubirFoto.setText("Subir Foto");
        SubirFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubirFotoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SubirFotoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SubirFotoMouseExited(evt);
            }
        });
        SubirFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubirFotoActionPerformed(evt);
            }
        });

        Labeltext.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        Labeltext.setForeground(new java.awt.Color(17, 55, 96));
        Labeltext.setText("Progreso:");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/user (1).png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/user 2.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lock.png"))); // NOI18N

        LabelUserName.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        LabelUserName.setForeground(new java.awt.Color(17, 55, 96));
        LabelUserName.setText("userName");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SubirFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(LabelFechaIngreso))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel1))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TextFieldNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(75, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(LabelUserName)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Labeltext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelProgreso)
                .addGap(82, 82, 82))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelUserName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelFechaIngreso)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextFieldNewUser))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SubirFoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelProgreso)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Labeltext)
                        .addGap(15, 15, 15)))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNewUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNewUserActionPerformed

    private void jButtonConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConfirmarMouseClicked

    }//GEN-LAST:event_jButtonConfirmarMouseClicked

    private void jButtonConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConfirmarMouseEntered

    }//GEN-LAST:event_jButtonConfirmarMouseEntered

    private void jButtonConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConfirmarMouseExited
        Usuario userB = sqlUser.selecionar(""+TextFieldNewUser.getText());
        if(userB == null && !userA.getContrasena().equals(PasswordField.getText())){
            sqlUser.actualizar(userA.getId(),TextFieldNewUser.getText(),PasswordField.getText());
            System.out.println("Informacion actualizada");
        }
        else{
            System.out.println("Datos de entrada no validos");
        }
    }//GEN-LAST:event_jButtonConfirmarMouseExited

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed

    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void SubirFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubirFotoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SubirFotoMouseClicked

    private void SubirFotoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubirFotoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_SubirFotoMouseEntered

    private void SubirFotoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubirFotoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_SubirFotoMouseExited

    private void SubirFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubirFotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubirFotoActionPerformed

    private void TextFieldNewUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldNewUserMouseClicked
        if(TextFieldNewUser.getText().equals("Nuevo Usuario")){
            TextFieldNewUser.setText("");
        }
    }//GEN-LAST:event_TextFieldNewUserMouseClicked

    private void TextFieldNewUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldNewUserMouseExited

    }//GEN-LAST:event_TextFieldNewUserMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelFechaIngreso;
    private javax.swing.JLabel LabelProgreso;
    private javax.swing.JLabel LabelUserName;
    private javax.swing.JLabel Labeltext;
    private javax.swing.JPasswordField PasswordField;
    public javax.swing.JButton SubirFoto;
    private javax.swing.JTextField TextFieldNewUser;
    public javax.swing.JButton jButtonConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
