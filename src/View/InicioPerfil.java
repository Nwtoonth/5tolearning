package View;

import ViewModel.Usuario;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.FirebaseOperaciones;

/**
 *
 * @author Duvan
 */
public class InicioPerfil extends javax.swing.JPanel {
    
    private Usuario user;
    private double progeso = 0;
    private String nombres = "NickNames: \n";
    private String score = "Puntuacion: \n";
    
    public InicioPerfil(Usuario us1) {   
        try {;
            this.user = us1;
            initComponents();
            LinkedHashMap<String,Long> tablaPosiciones = FirebaseOperaciones.buscarTodo(10);
            logros(tablaPosiciones);
            Calcularprogreso();
            this.LabelProgreso.setText(Math.round(progeso*100)+"%");
            this.LabelUserName.setText(user.getNickName());
            this.RankingNombres.setText(nombres);
            this.RankingPuntuaciones.setText(score);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(InicioPerfil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(InicioPerfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*Asigna los logros al jugador dependiendo de su posicion global*/
    private void logros(LinkedHashMap<String,Long> tablaPosiciones){
        int i = 1;
        LogroPrimerLugar.setVisible(false);
        LogroTop3.setVisible(false);
        LogroTop10.setVisible(false);
        for (Map.Entry<String, Long> entry : tablaPosiciones.entrySet()) {
            String key = entry.getKey();
            Long value = entry.getValue();
            this.nombres +=i+" "+ key + "\n";
            this.score += value + "\n";
            if (i == 1 && user.getNickName().equals(key)) {
                LogroPrimerLugar.setVisible(true);
            } else if (i <= 3 && user.getNickName().equals(key)) {
                LogroTop3.setVisible(true);
            } else if (i <= 10 && user.getNickName().equals(key)) {
                LogroTop10.setVisible(true);
            }            
            i++;
        }
    }
    
    /*Calcula el progreso total que lleva el usuario hasta el momento*/
    private void Calcularprogreso(){
        ArrayList<Long> datos = user.getPuntuaciones();
        for (Iterator<Long> iterator = datos.iterator(); iterator.hasNext();) {
            Long next = iterator.next();
            if(next >= 500l){
                progeso += 0.07;
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
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
        LabelProgreso1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RankingNombres = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        RankingPuntuaciones = new javax.swing.JTextArea();
        jLabelMensajes = new javax.swing.JLabel();
        LabelProgreso2 = new javax.swing.JLabel();
        LogroPrimerLugar = new javax.swing.JLabel();
        LogroTop10 = new javax.swing.JLabel();
        LogroTop3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

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
        PasswordField.setText("..........");
        PasswordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordFieldMouseClicked(evt);
            }
        });

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

        LabelProgreso1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        LabelProgreso1.setForeground(new java.awt.Color(17, 55, 96));
        LabelProgreso1.setText("Logros");

        RankingNombres.setEditable(false);
        RankingNombres.setColumns(20);
        RankingNombres.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        RankingNombres.setForeground(new java.awt.Color(17, 55, 96));
        RankingNombres.setLineWrap(true);
        RankingNombres.setRows(5);
        RankingNombres.setBorder(null);
        jScrollPane1.setViewportView(RankingNombres);

        RankingPuntuaciones.setEditable(false);
        RankingPuntuaciones.setColumns(20);
        RankingPuntuaciones.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        RankingPuntuaciones.setForeground(new java.awt.Color(17, 55, 96));
        RankingPuntuaciones.setLineWrap(true);
        RankingPuntuaciones.setRows(5);
        RankingPuntuaciones.setBorder(null);
        jScrollPane3.setViewportView(RankingPuntuaciones);

        jLabelMensajes.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        LabelProgreso2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        LabelProgreso2.setForeground(new java.awt.Color(252, 161, 3));
        LabelProgreso2.setText("Tabla de posiciones");

        LogroPrimerLugar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LogroPrimerLugar.setForeground(new java.awt.Color(0, 0, 0));
        LogroPrimerLugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/logro1.png"))); // NOI18N
        LogroPrimerLugar.setText("Top 1");
        LogroPrimerLugar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        LogroPrimerLugar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LogroTop10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LogroTop10.setForeground(new java.awt.Color(255, 51, 51));
        LogroTop10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogroTop10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/top10.png"))); // NOI18N
        LogroTop10.setText("Top 10");
        LogroTop10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LogroTop3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/logro2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(SubirFoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelProgreso2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(LabelUserName))
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(LabelFechaIngreso))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel1))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(425, 425, 425)
                                            .addComponent(Labeltext)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(LabelProgreso))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(19, 19, 19)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelMensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(TextFieldNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel6)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(25, 25, 25)
                                                    .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelProgreso1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(LogroPrimerLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LogroTop3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LogroTop10, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(29, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SubirFoto))
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelMensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelProgreso2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(LabelProgreso1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(LogroTop10, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LogroTop3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Labeltext))
                                    .addComponent(LogroPrimerLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)))
                        .addContainerGap())
                    .addComponent(LabelProgreso, javax.swing.GroupLayout.Alignment.TRAILING)))
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

    }//GEN-LAST:event_jButtonConfirmarMouseExited

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        boolean isRegistrado = false;
        try {
            isRegistrado = FirebaseOperaciones.insertarDatos(TextFieldNewUser.getText(),PasswordField.getText());
        } catch (InterruptedException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(isRegistrado){
            FirebaseOperaciones.eliminar(user.getNickName());
            user.setNickName(TextFieldNewUser.getText());
            LabelUserName.setText(user.getNickName());
            jLabelMensajes.setForeground(Color.green);
            TextFieldNewUser.setText("Nuevo Usuario");
            PasswordField.setText("..........");
            jLabelMensajes.setText("Se realizo el cambio de datos con exito ...");
        }
        else{
            jLabelMensajes.setForeground(Color.red);
            jLabelMensajes.setText("El nombre de usuario ya existe ...");            
        }
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

    private void PasswordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordFieldMouseClicked
        PasswordField.setText("");
    }//GEN-LAST:event_PasswordFieldMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelFechaIngreso;
    private javax.swing.JLabel LabelProgreso;
    private javax.swing.JLabel LabelProgreso1;
    private javax.swing.JLabel LabelProgreso2;
    private javax.swing.JLabel LabelUserName;
    private javax.swing.JLabel Labeltext;
    private javax.swing.JLabel LogroPrimerLugar;
    private javax.swing.JLabel LogroTop10;
    private javax.swing.JLabel LogroTop3;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextArea RankingNombres;
    private javax.swing.JTextArea RankingPuntuaciones;
    public javax.swing.JButton SubirFoto;
    private javax.swing.JTextField TextFieldNewUser;
    public javax.swing.JButton jButtonConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelMensajes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
