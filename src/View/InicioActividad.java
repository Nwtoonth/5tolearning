/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ViewModel.ControladorActividad;
import model.ActividadStringModel;

/**
 *
 * @author Antonio
 */
public class InicioActividad extends javax.swing.JPanel {

    /**
     * Creates new form Principal
     */
    public InicioActividad() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Actividad2 = new javax.swing.JButton();
        Actividad3 = new javax.swing.JButton();
        Actividad1 = new javax.swing.JButton();

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
        Actividad2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/squirtle_72.png"))); // NOI18N
        Actividad2.setText("Actividad 2");
        Actividad2.setBorder(null);
        Actividad2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Actividad2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/squirtle_72.png"))); // NOI18N
        Actividad2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/squirtle_96.png"))); // NOI18N
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
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Actividad1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Actividad2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Actividad3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(528, Short.MAX_VALUE))
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
                    .addComponent(Actividad3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Actividad1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Actividad2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(364, 364, 364))
        );

        add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void Actividad2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actividad2MousePressed
        
    }//GEN-LAST:event_Actividad2MousePressed

    private void Actividad2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actividad2MouseClicked
        String rutaAchivoString = "src\\model\\data\\strings1";
        String rutaArchivoEnunciados = "src\\model\\data\\enunciados1";
        ActividadStringModel a1 = new ActividadStringModel(rutaAchivoString,rutaArchivoEnunciados);
        ControladorActividad c1 = new ControladorActividad(a1.getActividades(),a1.getEnunciados());
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
        // TODO add your handling code here:
    }//GEN-LAST:event_Actividad2ActionPerformed

    private void Actividad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actividad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Actividad1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actividad1;
    private javax.swing.JButton Actividad2;
    private javax.swing.JButton Actividad3;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
