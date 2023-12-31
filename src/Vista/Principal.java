/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Jose Mori
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.UIManager;


public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Inventario de Ferreteria José Mori");
        this.setIconImage(new ImageIcon(getClass().getResource("/Image/Logo.png")).getImage());
        mostrarComponentes();
    }
    
    
    void mostrarComponentes(){
        
        lblNombrePrincipal.setText(" " + Login.trabajador_nombre);
        lblRol.setText(" " + Login.rol);
        
        lblBienvenido.setVisible(true);
        
        if(Login.id_rol == 1){
            this.selecBienvenido.setVisible(true);
            
            SidebarAdmin SidebarAdmin = new SidebarAdmin();
            SidebarAdmin.setSize(new Dimension(230, 340));
            SidebarAdmin.setLocation(0,0);
            this.PanelMod2.removeAll();
            this.PanelMod2.add(SidebarAdmin,BorderLayout.CENTER);
            this.PanelMod2.revalidate();
            this.PanelMod2.repaint();
            
            Dashboard Dashboard = new Dashboard();
            Dashboard.setSize(new Dimension(970, 620));
            Dashboard.setLocation(0,0);
            this.PanelPrincipal.removeAll();
            this.PanelPrincipal.add(Dashboard,BorderLayout.CENTER);
            this.PanelPrincipal.revalidate();
            this.PanelPrincipal.repaint();
            
        } else if(Login.id_rol == 2) {
            lblBienvenido.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            this.selecBienvenido.setVisible(false);
            
            SidebarTrabajador SidebarTrabajador = new SidebarTrabajador();
            SidebarTrabajador.setSize(new Dimension(230, 340));
            SidebarTrabajador.setLocation(0,0);
            this.PanelMod2.removeAll();
            this.PanelMod2.add(SidebarTrabajador,BorderLayout.CENTER);
            this.PanelMod2.revalidate();
            this.PanelMod2.repaint();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        PanelMod2 = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JPanel();
        lblCerrarSe = new javax.swing.JLabel();
        lblNombrePrincipal = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        btnBienvenido = new javax.swing.JPanel();
        lblBienvenidoHover = new javax.swing.JLabel();
        lblBienvenido = new javax.swing.JLabel();
        selecBienvenido = new javax.swing.JPanel();
        PanelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 620));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 620));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 620));

        jPanel2.setBackground(new java.awt.Color(229, 238, 252));
        jPanel2.setMaximumSize(new java.awt.Dimension(1200, 620));
        jPanel2.setMinimumSize(new java.awt.Dimension(1200, 620));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 620));

        jPanel6.setBackground(new java.awt.Color(229, 238, 252));
        jPanel6.setMaximumSize(new java.awt.Dimension(230, 620));
        jPanel6.setMinimumSize(new java.awt.Dimension(230, 620));
        jPanel6.setPreferredSize(new java.awt.Dimension(230, 620));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/usuario_login.png"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(130, 70));
        jLabel5.setMinimumSize(new java.awt.Dimension(130, 70));
        jLabel5.setPreferredSize(new java.awt.Dimension(130, 70));

        PanelMod2.setBackground(new java.awt.Color(229, 238, 252));
        PanelMod2.setMaximumSize(new java.awt.Dimension(230, 340));
        PanelMod2.setMinimumSize(new java.awt.Dimension(230, 340));
        PanelMod2.setPreferredSize(new java.awt.Dimension(230, 340));

        javax.swing.GroupLayout PanelMod2Layout = new javax.swing.GroupLayout(PanelMod2);
        PanelMod2.setLayout(PanelMod2Layout);
        PanelMod2Layout.setHorizontalGroup(
            PanelMod2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelMod2Layout.setVerticalGroup(
            PanelMod2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnCerrarSesion.setBackground(new java.awt.Color(53, 66, 89));
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.setMaximumSize(new java.awt.Dimension(230, 50));
        btnCerrarSesion.setMinimumSize(new java.awt.Dimension(230, 50));
        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(230, 50));
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseExited(evt);
            }
        });

        lblCerrarSe.setFont(new java.awt.Font("SF UI Display", 1, 16)); // NOI18N
        lblCerrarSe.setForeground(new java.awt.Color(255, 255, 255));
        lblCerrarSe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrarSe.setText("Cerrar Sesión");
        lblCerrarSe.setMaximumSize(new java.awt.Dimension(210, 28));
        lblCerrarSe.setMinimumSize(new java.awt.Dimension(210, 28));
        lblCerrarSe.setPreferredSize(new java.awt.Dimension(210, 28));

        javax.swing.GroupLayout btnCerrarSesionLayout = new javax.swing.GroupLayout(btnCerrarSesion);
        btnCerrarSesion.setLayout(btnCerrarSesionLayout);
        btnCerrarSesionLayout.setHorizontalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCerrarSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCerrarSe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnCerrarSesionLayout.setVerticalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCerrarSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCerrarSe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblNombrePrincipal.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        lblNombrePrincipal.setForeground(new java.awt.Color(24, 28, 50));
        lblNombrePrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombrePrincipal.setText("user");
        lblNombrePrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblNombrePrincipal.setMaximumSize(new java.awt.Dimension(210, 25));
        lblNombrePrincipal.setMinimumSize(new java.awt.Dimension(210, 25));
        lblNombrePrincipal.setPreferredSize(new java.awt.Dimension(210, 25));

        lblRol.setFont(new java.awt.Font("SF UI Display", 1, 17)); // NOI18N
        lblRol.setForeground(new java.awt.Color(150, 154, 172));
        lblRol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRol.setText("user");
        lblRol.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblRol.setMaximumSize(new java.awt.Dimension(210, 25));
        lblRol.setMinimumSize(new java.awt.Dimension(210, 25));
        lblRol.setPreferredSize(new java.awt.Dimension(210, 25));

        btnBienvenido.setBackground(new java.awt.Color(229, 238, 252));
        btnBienvenido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBienvenido.setMaximumSize(new java.awt.Dimension(121, 25));
        btnBienvenido.setMinimumSize(new java.awt.Dimension(121, 25));
        btnBienvenido.setPreferredSize(new java.awt.Dimension(121, 25));
        btnBienvenido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBienvenidoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBienvenidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBienvenidoMouseExited(evt);
            }
        });

        lblBienvenidoHover.setFont(new java.awt.Font("SF UI Display", 1, 20)); // NOI18N
        lblBienvenidoHover.setForeground(new java.awt.Color(246, 107, 14));
        lblBienvenidoHover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBienvenidoHover.setText("BIENVENIDO");
        lblBienvenidoHover.setMaximumSize(new java.awt.Dimension(121, 25));
        lblBienvenidoHover.setMinimumSize(new java.awt.Dimension(121, 25));
        lblBienvenidoHover.setPreferredSize(new java.awt.Dimension(121, 25));

        lblBienvenido.setFont(new java.awt.Font("SF UI Display", 1, 20)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(24, 28, 50));
        lblBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBienvenido.setText("BIENVENIDO");
        lblBienvenido.setMaximumSize(new java.awt.Dimension(121, 25));
        lblBienvenido.setMinimumSize(new java.awt.Dimension(121, 25));
        lblBienvenido.setPreferredSize(new java.awt.Dimension(121, 25));

        javax.swing.GroupLayout btnBienvenidoLayout = new javax.swing.GroupLayout(btnBienvenido);
        btnBienvenido.setLayout(btnBienvenidoLayout);
        btnBienvenidoLayout.setHorizontalGroup(
            btnBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 121, Short.MAX_VALUE)
            .addGroup(btnBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnBienvenidoLayout.createSequentialGroup()
                    .addComponent(lblBienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(btnBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnBienvenidoLayout.createSequentialGroup()
                    .addComponent(lblBienvenidoHover, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        btnBienvenidoLayout.setVerticalGroup(
            btnBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
            .addGroup(btnBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnBienvenidoLayout.createSequentialGroup()
                    .addComponent(lblBienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(btnBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnBienvenidoLayout.createSequentialGroup()
                    .addComponent(lblBienvenidoHover, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        selecBienvenido.setBackground(new java.awt.Color(204, 94, 65));
        selecBienvenido.setMaximumSize(new java.awt.Dimension(121, 3));
        selecBienvenido.setMinimumSize(new java.awt.Dimension(121, 3));
        selecBienvenido.setPreferredSize(new java.awt.Dimension(121, 3));

        javax.swing.GroupLayout selecBienvenidoLayout = new javax.swing.GroupLayout(selecBienvenido);
        selecBienvenido.setLayout(selecBienvenidoLayout);
        selecBienvenidoLayout.setHorizontalGroup(
            selecBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 121, Short.MAX_VALUE)
        );
        selecBienvenidoLayout.setVerticalGroup(
            selecBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelMod2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombrePrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selecBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(selecBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lblNombrePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelMod2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setMaximumSize(new java.awt.Dimension(970, 620));
        PanelPrincipal.setMinimumSize(new java.awt.Dimension(970, 620));
        PanelPrincipal.setName(""); // NOI18N
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(970, 620));

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseExited
        btnCerrarSesion.setBackground(new Color(53, 66, 89));
    }//GEN-LAST:event_btnCerrarSesionMouseExited

    private void btnCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseEntered
        btnCerrarSesion.setBackground(new Color(237, 19, 19));
    }//GEN-LAST:event_btnCerrarSesionMouseEntered

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        Login login = new Login();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    
    private void btnBienvenidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBienvenidoMouseClicked
        if(Login.id_rol == 1) {
            Dashboard Dashboard = new Dashboard();

            Dashboard.setSize(new Dimension(970, 620));
            Dashboard.setLocation(0,0);
            this.PanelPrincipal.removeAll();
            this.PanelPrincipal.add(Dashboard,BorderLayout.CENTER);
            this.PanelPrincipal.revalidate();
            this.PanelPrincipal.repaint();

            this.selecBienvenido.setVisible(true);
            SidebarAdmin.selecTrabajador.setVisible(false);
            SidebarAdmin.selecUsuario.setVisible(false);
            SidebarAdmin.selecProductos.setVisible(false);
            SidebarAdmin.selecProveedor.setVisible(false);
            SidebarAdmin.selecComprasVentas.setVisible(false);
        }
    }//GEN-LAST:event_btnBienvenidoMouseClicked

    private void btnBienvenidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBienvenidoMouseEntered
        if(Login.id_rol == 1) {
            lblBienvenido.setVisible(false);
            lblBienvenidoHover.setVisible(true);
        }
    }//GEN-LAST:event_btnBienvenidoMouseEntered

    private void btnBienvenidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBienvenidoMouseExited
        if(Login.id_rol == 1) {
            lblBienvenido.setVisible(true);
            lblBienvenidoHover.setVisible(false);
        }
    }//GEN-LAST:event_btnBienvenidoMouseExited

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel PanelMod2;
    public static javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel btnBienvenido;
    public static javax.swing.JPanel btnCerrarSesion;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblBienvenidoHover;
    private javax.swing.JLabel lblCerrarSe;
    private javax.swing.JLabel lblNombrePrincipal;
    private javax.swing.JLabel lblRol;
    public static javax.swing.JPanel selecBienvenido;
    // End of variables declaration//GEN-END:variables
}
