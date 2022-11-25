package View;

import ViewModel.Usuario;
import java.awt.Color;
import model.FirebaseOperaciones;

/**
 *
 * @author Admin
 */
public class Inicio extends javax.swing.JFrame {
    private Usuario userA;
    /**
     * Creates new form Inicio
     */
    public Inicio(Usuario us1) {
        this.userA = us1;
        initComponents();
        
        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(logoInicio,"src/logo/to5learning.png");
        //rsscalelabel.RSScaleLabel.setScaleLabel(fondoContent,"src/imagenes/cafe.jpeg");
        
        InicioActividad p1= new InicioActividad(userA);
        p1.setSize(920, 585);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1);
        content.revalidate();
        content.repaint();
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
        jLabel3 = new javax.swing.JLabel();
        btn_configuracion = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        content = new java.awt.Panel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(255, 255, 204));
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
                        .addGap(0, 62, Short.MAX_VALUE)
                        .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(exitIniciBtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(esloganTxt))))
                .addContainerGap())
        );

        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 110));

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

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/account-multiple.png"))); // NOI18N
        jLabel3.setText("perfil");
        btn_perfil.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 6, 137, 28));

        Menu.add(btn_perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 40));

        btn_configuracion.setBackground(new java.awt.Color(21, 101, 192));
        btn_configuracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_configuracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_configuracionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_configuracionMousePressed(evt);
            }
        });
        btn_configuracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/file-chart.png"))); // NOI18N
        jLabel2.setText("configuracion");
        btn_configuracion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 6, 137, 28));

        Menu.add(btn_configuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 190, 40));

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 190, 590));

        content.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 920, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitIniciBttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIniciBttMouseClicked

    }//GEN-LAST:event_exitIniciBttMouseClicked

    private void exitIniciBttMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIniciBttMouseEntered
        exitIniciBtt.setBackground(Color.GRAY);
    }//GEN-LAST:event_exitIniciBttMouseEntered

    private void exitIniciBttMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIniciBttMouseExited
        exitIniciBtt.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_exitIniciBttMouseExited

    private void exitIniciBttMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIniciBttMousePressed
        FirebaseOperaciones.agregarPuntuacion(userA);
        Login pc = new Login();
        pc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitIniciBttMousePressed

    private void btn_inicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseEntered
        btn_inicio.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_btn_inicioMouseEntered

    private void btn_inicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseExited
        btn_inicio.setBackground(new Color(21,101,192));
    }//GEN-LAST:event_btn_inicioMouseExited

    private void btn_inicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMousePressed
        InicioActividad p1= new InicioActividad(userA);
        p1.setSize(920, 585);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1);
        content.revalidate();
        content.repaint();
        
    }//GEN-LAST:event_btn_inicioMousePressed

    private void btn_configuracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_configuracionMouseEntered
        btn_configuracion.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_btn_configuracionMouseEntered

    private void btn_configuracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_configuracionMouseExited
        btn_configuracion.setBackground(new Color(21,101,192));
    }//GEN-LAST:event_btn_configuracionMouseExited

    private void btn_configuracionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_configuracionMousePressed
        InicioConfig p3= new InicioConfig();
        p3.setSize(920, 585);
        p3.setLocation(0,0);
        
        content.removeAll();
        content.add(p3);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btn_configuracionMousePressed

    private void btn_perfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_perfilMouseEntered
        btn_perfil.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_btn_perfilMouseEntered

    private void btn_perfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_perfilMouseExited
        btn_perfil.setBackground(new Color(21,101,192));
    }//GEN-LAST:event_btn_perfilMouseExited

    private void btn_perfilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_perfilMousePressed
        InicioPerfil p2= new InicioPerfil(userA);
        p2.setSize(920, 585);
        p2.setLocation(0,0);
        
        content.removeAll();
        content.add(p2);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btn_perfilMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel Header;
    private java.awt.Panel Menu;
    private java.awt.Panel btn_configuracion;
    private java.awt.Panel btn_inicio;
    private java.awt.Panel btn_perfil;
    private java.awt.Panel content;
    private javax.swing.JLabel esloganTxt;
    private java.awt.Panel exitIniciBtt;
    private javax.swing.JLabel exitInicioTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel logoInicio;
    private java.awt.Panel perfilInicio;
    // End of variables declaration//GEN-END:variables
}
