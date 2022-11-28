/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ViewModel.ControladorActividad;
import ViewModel.Usuario;
import model.ActividadStringModel;

/**
 *
 * @author Antonio
 */
public class InicioActividad extends javax.swing.JPanel {
    /**
     * Creates new form Principal
     */
    private Usuario usuario;
    
    public InicioActividad(Usuario user) {
        this.usuario = user;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Actividad2 = new javax.swing.JButton();
        Actividad3 = new javax.swing.JButton();
        Actividad1 = new javax.swing.JButton();
        Actividad4 = new javax.swing.JButton();
        Actividad5 = new javax.swing.JButton();
        Actividad6 = new javax.swing.JButton();
        Actividad7 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(920, 585));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Bienvenido");

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Seccion 1");

        Actividad2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Actividad2.setForeground(new java.awt.Color(102, 102, 102));
        Actividad2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono java.jpg"))); // NOI18N
        Actividad2.setText("Actividad 2");
        Actividad2.setBorder(null);
        Actividad2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Actividad2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono java.jpg"))); // NOI18N
        Actividad2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono java 95.jpg"))); // NOI18N
        Actividad2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Actividad2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Actividad2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Actividad2MousePressed(evt);
            }
        });
        Actividad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actividad2ActionPerformed(evt);
            }
        });

        Actividad3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Actividad3.setForeground(new java.awt.Color(102, 102, 102));
        Actividad3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/charmander_72.png"))); // NOI18N
        Actividad3.setText("Actividad 3");
        Actividad3.setBorder(null);
        Actividad3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Actividad3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/charmander_72.png"))); // NOI18N
        Actividad3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/charmander_96.png"))); // NOI18N
        Actividad3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Actividad3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Actividad3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Actividad3MousePressed(evt);
            }
        });
        Actividad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actividad3ActionPerformed(evt);
            }
        });

        Actividad1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Actividad1.setForeground(new java.awt.Color(102, 102, 102));
        Actividad1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pikachu_72.png"))); // NOI18N
        Actividad1.setText("Actividad 1");
        Actividad1.setBorder(null);
        Actividad1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Actividad1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pikachu_72.png"))); // NOI18N
        Actividad1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pikachu_96.png"))); // NOI18N
        Actividad1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Actividad1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Actividad1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Actividad1MousePressed(evt);
            }
        });
        Actividad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actividad1ActionPerformed(evt);
            }
        });

        Actividad4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Actividad4.setForeground(new java.awt.Color(102, 102, 102));
        Actividad4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Arreglos.jpg"))); // NOI18N
        Actividad4.setText("Actividad 4");
        Actividad4.setBorder(null);
        Actividad4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Actividad4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Arreglos.jpg"))); // NOI18N
        Actividad4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Arreglos95.jpg"))); // NOI18N
        Actividad4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Actividad4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Actividad4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Actividad4MousePressed(evt);
            }
        });
        Actividad4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actividad4ActionPerformed(evt);
            }
        });

        Actividad5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Actividad5.setForeground(new java.awt.Color(102, 102, 102));
        Actividad5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ArrayList.png"))); // NOI18N
        Actividad5.setText("Actividad 5");
        Actividad5.setBorder(null);
        Actividad5.setEnabled(false);
        Actividad5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Actividad5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ArrayList.png"))); // NOI18N
        Actividad5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ArrayList95.png"))); // NOI18N
        Actividad5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Actividad5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Actividad5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Actividad5MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Actividad5MousePressed(evt);
            }
        });
        Actividad5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actividad5ActionPerformed(evt);
            }
        });

        Actividad6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Actividad6.setForeground(new java.awt.Color(102, 102, 102));
        Actividad6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Objetos.jpg"))); // NOI18N
        Actividad6.setText("Actividad 6");
        Actividad6.setBorder(null);
        Actividad6.setEnabled(false);
        Actividad6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Actividad6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Objetos.jpg"))); // NOI18N
        Actividad6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Objetos95.jpg"))); // NOI18N
        Actividad6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Actividad6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Actividad6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Actividad6MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Actividad6MousePressed(evt);
            }
        });
        Actividad6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actividad6ActionPerformed(evt);
            }
        });

        Actividad7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Actividad7.setForeground(new java.awt.Color(102, 102, 102));
        Actividad7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/75.jpg"))); // NOI18N
        Actividad7.setText("Actividad7");
        Actividad7.setBorder(null);
        Actividad7.setEnabled(false);
        Actividad7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Actividad7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/75.jpg"))); // NOI18N
        Actividad7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/hasmap 95.jpg"))); // NOI18N
        Actividad7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Actividad7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Actividad7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Actividad7MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Actividad7MousePressed(evt);
            }
        });
        Actividad7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actividad7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Title)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Actividad1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentLayout.createSequentialGroup()
                                .addComponent(Actividad2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Actividad3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Actividad7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Actividad4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Actividad5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Actividad6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Title)
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Actividad1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Actividad2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Actividad3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Actividad4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Actividad5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Actividad6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Actividad7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void Actividad2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actividad2MousePressed
        
    }//GEN-LAST:event_Actividad2MousePressed

    private void Actividad2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actividad2MouseClicked
       
    }//GEN-LAST:event_Actividad2MouseClicked

    private void Actividad3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actividad3MouseClicked
        Actividad2 p2= new Actividad2();
        //p2.setSize(920, 585);
        //p2.setLocation(0,0);
        p2.setVisible(true);
        //content.removeAll();
        //content.add(p2);
        //content.revalidate();
        //content.repaint();
    }//GEN-LAST:event_Actividad3MouseClicked

    private void Actividad3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actividad3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Actividad3MousePressed

    private void Actividad3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actividad3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Actividad3ActionPerformed

    private void Actividad1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actividad1MouseClicked
        Actividad1 p1= new Actividad1();
        p1.setSize(920, 585);
        p1.setLocation(0,0);
        content.removeAll();
        content.add(p1);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_Actividad1MouseClicked

    private void Actividad1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actividad1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Actividad1MousePressed

    private void Actividad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actividad2ActionPerformed
        String rutaAchivoString = "src/model/data/strings1";
        String rutaArchivoEnunciados = "src/model/data/enunciados1";
        ActividadStringModel act1 = new ActividadStringModel(rutaAchivoString,rutaArchivoEnunciados);
        ControladorActividad ctr1 = new ControladorActividad(2,act1.getActividades(),act1.getEnunciados(),usuario);
    }//GEN-LAST:event_Actividad2ActionPerformed

    private void Actividad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actividad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Actividad1ActionPerformed

    private void Actividad4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actividad4MouseClicked

    }//GEN-LAST:event_Actividad4MouseClicked

    private void Actividad4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actividad4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Actividad4MousePressed

    private void Actividad4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actividad4ActionPerformed
        String rutaAchivoString2 = "src/model/data/strings2";
        String rutaArchivoEnunciados2 = "src/model/data/enunciados2";
        ActividadStringModel act2 = new ActividadStringModel(rutaAchivoString2, rutaArchivoEnunciados2);
        ControladorActividad ctr2 = new ControladorActividad(4,act2.getActividades(),act2.getEnunciados(),usuario);
    }//GEN-LAST:event_Actividad4ActionPerformed

    private void Actividad5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actividad5MouseClicked

    }//GEN-LAST:event_Actividad5MouseClicked

    private void Actividad5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actividad5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Actividad5MousePressed

    private void Actividad5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actividad5ActionPerformed
        String rutaAchivoString3 = "src/model/data/strings3";
        String rutaArchivoEnunciados3 = "src/model/data/enunciados3";
        ActividadStringModel act3 = new ActividadStringModel(rutaAchivoString3, rutaArchivoEnunciados3);
        ControladorActividad ctr3 = new ControladorActividad(5,act3.getActividades(), act3.getEnunciados(),usuario);
    }//GEN-LAST:event_Actividad5ActionPerformed

    private void Actividad6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actividad6MouseClicked

    }//GEN-LAST:event_Actividad6MouseClicked

    private void Actividad6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actividad6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Actividad6MousePressed

    private void Actividad6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actividad6ActionPerformed
        String rutaAchivoString4 = "src/model/data/strings4";
        String rutaArchivoEnunciados4 = "src/model/data/enunciados4";
        ActividadStringModel act4 = new ActividadStringModel(rutaAchivoString4, rutaArchivoEnunciados4);
        ControladorActividad ctr4 = new ControladorActividad(6,act4.getActividades(),act4.getEnunciados(),usuario);
    }//GEN-LAST:event_Actividad6ActionPerformed

    private void Actividad5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actividad5MouseEntered
        if((long)usuario.getPuntuaciones().get(2) >= 500){
           this.Actividad5.setEnabled(true);
        }
    }//GEN-LAST:event_Actividad5MouseEntered

    private void Actividad6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actividad6MouseEntered
        if((long)usuario.getPuntuaciones().get(5) >= 500){
           this.Actividad6.setEnabled(true);
        }
    }//GEN-LAST:event_Actividad6MouseEntered

    private void Actividad7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actividad7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Actividad7MouseClicked

    private void Actividad7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actividad7MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Actividad7MousePressed

    private void Actividad7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actividad7ActionPerformed
        String rutaAchivoString5 = "src/model/data/strings5";
        String rutaArchivoEnunciados5 = "src/model/data/enunciados5";
        ActividadStringModel act5 = new ActividadStringModel(rutaAchivoString5, rutaArchivoEnunciados5);
        ControladorActividad ctr5 = new ControladorActividad(7,act5.getActividades(),act5.getEnunciados(),usuario);
    }//GEN-LAST:event_Actividad7ActionPerformed

    private void Actividad7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actividad7MouseEntered
        if((long)usuario.getPuntuaciones().get(6) >= 500){
           this.Actividad7.setEnabled(true);
        }
    }//GEN-LAST:event_Actividad7MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actividad1;
    private javax.swing.JButton Actividad2;
    private javax.swing.JButton Actividad3;
    private javax.swing.JButton Actividad4;
    private javax.swing.JButton Actividad5;
    private javax.swing.JButton Actividad6;
    private javax.swing.JButton Actividad7;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
