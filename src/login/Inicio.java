/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import java.awt.Color;

/**
 *
 * @author Admin
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(logoInicio,"src/logo/to5learning.png");
        
        rsscalelabel.RSScaleLabel.setScaleLabel(fondoContent,"src/imagenes/cafe.jpeg");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new java.awt.Panel();
        esloganTxt = new javax.swing.JLabel();
        exitIniciBtt = new java.awt.Panel();
        exitInicioTxt = new javax.swing.JLabel();
        perfilInicio = new java.awt.Panel();
        logoInicio = new javax.swing.JLabel();
        Menu = new java.awt.Panel();
        btn_inicio = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        btn_perfil = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        btn_config = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        content = new java.awt.Panel();
        fondoContent = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        esloganTxt.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        esloganTxt.setForeground(new java.awt.Color(153, 153, 153));
        esloganTxt.setText("\"Leer, responder, analizar, corregir y aprender\"");

        exitIniciBtt.setBackground(new java.awt.Color(204, 204, 204));
        exitIniciBtt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitIniciBtt.setForeground(new java.awt.Color(204, 204, 204));
        exitIniciBtt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitIniciBttMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitIniciBttMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitIniciBttMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitIniciBttMousePressed(evt);
            }
        });

        exitInicioTxt.setText("Cerrar sesion");

        javax.swing.GroupLayout exitIniciBttLayout = new javax.swing.GroupLayout(exitIniciBtt);
        exitIniciBtt.setLayout(exitIniciBttLayout);
        exitIniciBttLayout.setHorizontalGroup(
            exitIniciBttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitIniciBttLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(exitInicioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        exitIniciBttLayout.setVerticalGroup(
            exitIniciBttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitInicioTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout perfilInicioLayout = new javax.swing.GroupLayout(perfilInicio);
        perfilInicio.setLayout(perfilInicioLayout);
        perfilInicioLayout.setHorizontalGroup(
            perfilInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
        );
        perfilInicioLayout.setVerticalGroup(
            perfilInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(esloganTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 360, Short.MAX_VALUE)
                .addComponent(exitIniciBtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perfilInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(perfilInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(0, 56, Short.MAX_VALUE)
                        .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(exitIniciBtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(esloganTxt))))
                .addContainerGap())
        );

        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Menu.setBackground(new java.awt.Color(21, 101, 192));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_inicio.setBackground(new java.awt.Color(21, 101, 192));
        btn_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_inicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_inicioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_inicioMousePressed(evt);
            }
        });
        btn_inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/home-outline.png"))); // NOI18N
        jLabel1.setText("inicio");
        btn_inicio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 6, 137, 28));

        Menu.add(btn_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        btn_perfil.setBackground(new java.awt.Color(21, 101, 192));
        btn_perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_perfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_perfilMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_perfilMousePressed(evt);
            }
        });
        btn_perfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/file-chart.png"))); // NOI18N
        jLabel2.setText("configuracion");
        btn_perfil.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 6, 137, 28));

        Menu.add(btn_perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 190, 40));

        btn_config.setBackground(new java.awt.Color(21, 101, 192));
        btn_config.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_configMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_configMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_configMousePressed(evt);
            }
        });
        btn_config.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/account-multiple.png"))); // NOI18N
        jLabel3.setText("perfil");
        btn_config.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 6, 137, 28));

        Menu.add(btn_config, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 40));

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 190, 590));

        content.setBackground(new java.awt.Color(204, 204, 204));

        fondoContent.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoContent, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addComponent(fondoContent, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 920, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitIniciBttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIniciBttMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_exitIniciBttMouseClicked

    private void exitIniciBttMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIniciBttMouseEntered
        exitIniciBtt.setBackground(Color.GRAY);
    }//GEN-LAST:event_exitIniciBttMouseEntered

    private void exitIniciBttMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIniciBttMouseExited
        exitIniciBtt.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_exitIniciBttMouseExited

    private void exitIniciBttMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIniciBttMousePressed
        System.exit(0);
    }//GEN-LAST:event_exitIniciBttMousePressed

    private void btn_inicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseEntered
        btn_inicio.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_btn_inicioMouseEntered

    private void btn_inicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseExited
        btn_inicio.setBackground(new Color(21,101,192));
    }//GEN-LAST:event_btn_inicioMouseExited

    private void btn_inicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_inicioMousePressed

    private void btn_perfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_perfilMouseEntered
        btn_perfil.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_btn_perfilMouseEntered

    private void btn_perfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_perfilMouseExited
        btn_perfil.setBackground(new Color(21,101,192));
    }//GEN-LAST:event_btn_perfilMouseExited

    private void btn_perfilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_perfilMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_perfilMousePressed

    private void btn_configMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_configMouseEntered
        btn_config.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_btn_configMouseEntered

    private void btn_configMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_configMouseExited
        btn_config.setBackground(new Color(21,101,192));
    }//GEN-LAST:event_btn_configMouseExited

    private void btn_configMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_configMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_configMousePressed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel Header;
    private java.awt.Panel Menu;
    private java.awt.Panel btn_config;
    private java.awt.Panel btn_inicio;
    private java.awt.Panel btn_perfil;
    private java.awt.Panel content;
    private javax.swing.JLabel esloganTxt;
    private java.awt.Panel exitIniciBtt;
    private javax.swing.JLabel exitInicioTxt;
    private javax.swing.JLabel fondoContent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel logoInicio;
    private java.awt.Panel perfilInicio;
    // End of variables declaration//GEN-END:variables
}
