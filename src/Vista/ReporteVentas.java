
package Vista;

import Consultas.clienteConsulta;
import Consultas.compraConsulta;
import Consultas.productoConsulta;
import Consultas.proveedorConsulta;
import Consultas.trabajadorConsulta;
import Consultas.usuarioConsulta;
import Consultas.ventaConsulta;
import static Vista.SidebarAdmin.selecComprasVentas;
import static Vista.SidebarAdmin.selecProductos;
import static Vista.SidebarAdmin.selecProveedor;
import static Vista.SidebarAdmin.selecTrabajador;
import static Vista.SidebarAdmin.selecUsuario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.table.DefaultTableModel;

public class ReporteVentas extends javax.swing.JPanel {
    
    
    DefaultTableModel m = new DefaultTableModel();
    Consultas.clienteConsulta clienteConsulta = new clienteConsulta();
    Consultas.productoConsulta productoConsulta = new productoConsulta();
    Consultas.proveedorConsulta proveedorConsulta = new proveedorConsulta();
    Consultas.trabajadorConsulta trabajadorConsulta = new trabajadorConsulta();
    Consultas.usuarioConsulta usuarioConsulta = new usuarioConsulta();
    Consultas.compraConsulta compraConsulta = new compraConsulta();
    Consultas.ventaConsulta ventaConsulta = new ventaConsulta();
    
    public ReporteVentas() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        btnDashboard = new javax.swing.JPanel();
        lblTrabajadores = new javax.swing.JLabel();
        btnReportesCompras = new javax.swing.JPanel();
        lblCompras = new javax.swing.JLabel();
        btnReportesVentas = new javax.swing.JPanel();
        lblVentas = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        setMaximumSize(new java.awt.Dimension(970, 620));
        setMinimumSize(new java.awt.Dimension(970, 620));

        jPanel6.setBackground(new java.awt.Color(53, 66, 89));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setMaximumSize(new java.awt.Dimension(970, 40));
        jPanel6.setMinimumSize(new java.awt.Dimension(970, 40));
        jPanel6.setPreferredSize(new java.awt.Dimension(970, 40));

        btnDashboard.setBackground(new java.awt.Color(53, 66, 89));
        btnDashboard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDashboard.setMaximumSize(new java.awt.Dimension(200, 40));
        btnDashboard.setMinimumSize(new java.awt.Dimension(200, 40));
        btnDashboard.setPreferredSize(new java.awt.Dimension(200, 40));
        btnDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDashboardMouseExited(evt);
            }
        });

        lblTrabajadores.setFont(new java.awt.Font("SF UI Display", 1, 16)); // NOI18N
        lblTrabajadores.setForeground(new java.awt.Color(255, 255, 255));
        lblTrabajadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTrabajadores.setText("Dashboard");
        lblTrabajadores.setMaximumSize(new java.awt.Dimension(210, 28));
        lblTrabajadores.setMinimumSize(new java.awt.Dimension(210, 28));
        lblTrabajadores.setPreferredSize(new java.awt.Dimension(210, 28));

        javax.swing.GroupLayout btnDashboardLayout = new javax.swing.GroupLayout(btnDashboard);
        btnDashboard.setLayout(btnDashboardLayout);
        btnDashboardLayout.setHorizontalGroup(
            btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDashboardLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnDashboardLayout.setVerticalGroup(
            btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTrabajadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnReportesCompras.setBackground(new java.awt.Color(53, 66, 89));
        btnReportesCompras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReportesCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportesCompras.setMaximumSize(new java.awt.Dimension(200, 40));
        btnReportesCompras.setMinimumSize(new java.awt.Dimension(200, 40));
        btnReportesCompras.setPreferredSize(new java.awt.Dimension(200, 40));
        btnReportesCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportesComprasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReportesComprasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReportesComprasMouseExited(evt);
            }
        });

        lblCompras.setFont(new java.awt.Font("SF UI Display", 1, 16)); // NOI18N
        lblCompras.setForeground(new java.awt.Color(255, 255, 255));
        lblCompras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompras.setText("Reporte de Compras");
        lblCompras.setMaximumSize(new java.awt.Dimension(210, 28));
        lblCompras.setMinimumSize(new java.awt.Dimension(210, 28));
        lblCompras.setPreferredSize(new java.awt.Dimension(210, 28));

        javax.swing.GroupLayout btnReportesComprasLayout = new javax.swing.GroupLayout(btnReportesCompras);
        btnReportesCompras.setLayout(btnReportesComprasLayout);
        btnReportesComprasLayout.setHorizontalGroup(
            btnReportesComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReportesComprasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnReportesComprasLayout.setVerticalGroup(
            btnReportesComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReportesComprasLayout.createSequentialGroup()
                .addComponent(lblCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        btnReportesVentas.setBackground(new java.awt.Color(221, 107, 77));
        btnReportesVentas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnReportesVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportesVentas.setMaximumSize(new java.awt.Dimension(200, 40));
        btnReportesVentas.setMinimumSize(new java.awt.Dimension(200, 40));
        btnReportesVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportesVentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReportesVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReportesVentasMouseExited(evt);
            }
        });

        lblVentas.setFont(new java.awt.Font("SF UI Display", 1, 16)); // NOI18N
        lblVentas.setForeground(new java.awt.Color(255, 255, 255));
        lblVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVentas.setText("Reporte de Ventas");
        lblVentas.setMaximumSize(new java.awt.Dimension(210, 28));
        lblVentas.setMinimumSize(new java.awt.Dimension(210, 28));
        lblVentas.setPreferredSize(new java.awt.Dimension(210, 28));

        javax.swing.GroupLayout btnReportesVentasLayout = new javax.swing.GroupLayout(btnReportesVentas);
        btnReportesVentas.setLayout(btnReportesVentasLayout);
        btnReportesVentasLayout.setHorizontalGroup(
            btnReportesVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReportesVentasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        btnReportesVentasLayout.setVerticalGroup(
            btnReportesVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReportesVentasLayout.createSequentialGroup()
                .addComponent(lblVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnReportesCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnReportesVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 366, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReportesCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReportesVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTitulo.setFont(new java.awt.Font("SF UI Display", 1, 26)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(24, 28, 50));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Reporte de Ventas");
        lblTitulo.setMaximumSize(new java.awt.Dimension(210, 28));
        lblTitulo.setMinimumSize(new java.awt.Dimension(210, 28));
        lblTitulo.setPreferredSize(new java.awt.Dimension(210, 28));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 508, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseClicked
        Dashboard Dashboard = new Dashboard();

        Dashboard.setSize(new Dimension(970, 620));
        Dashboard.setLocation(0,0);
        Principal.PanelPrincipal.removeAll();
        Principal.PanelPrincipal.add(Dashboard,BorderLayout.CENTER);
        Principal.PanelPrincipal.revalidate();
        Principal.PanelPrincipal.repaint();
        
        selecTrabajador.setVisible(false);
        selecUsuario.setVisible(false);
        selecProductos.setVisible(false);
        selecProveedor.setVisible(false);
        selecComprasVentas.setVisible(false);
        Principal.selecBienvenido.setVisible(true);
    }//GEN-LAST:event_btnDashboardMouseClicked

    private void btnDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseEntered
        btnDashboard.setBackground(new Color(204, 94, 65));
    }//GEN-LAST:event_btnDashboardMouseEntered

    private void btnDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseExited
        btnDashboard.setBackground(new Color(53, 66, 89));
    }//GEN-LAST:event_btnDashboardMouseExited

    
    
    
    private void btnReportesComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesComprasMouseClicked
        ReporteCompras ReporteCompras = new ReporteCompras();

        ReporteCompras.setSize(new Dimension(970, 620));
        ReporteCompras.setLocation(0,0);
        Principal.PanelPrincipal.removeAll();
        Principal.PanelPrincipal.add(ReporteCompras,BorderLayout.CENTER);
        Principal.PanelPrincipal.revalidate();
        Principal.PanelPrincipal.repaint();
        
        selecTrabajador.setVisible(false);
        selecUsuario.setVisible(false);
        selecProductos.setVisible(false);
        selecProveedor.setVisible(false);
        selecComprasVentas.setVisible(false);
        Principal.selecBienvenido.setVisible(true);
    }//GEN-LAST:event_btnReportesComprasMouseClicked

    private void btnReportesComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesComprasMouseEntered
        btnReportesCompras.setBackground(new Color(204, 94, 65));
    }//GEN-LAST:event_btnReportesComprasMouseEntered

    private void btnReportesComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesComprasMouseExited
        btnReportesCompras.setBackground(new Color(53, 66, 89));
    }//GEN-LAST:event_btnReportesComprasMouseExited

    
    private void btnReportesVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesVentasMouseClicked
        
    }//GEN-LAST:event_btnReportesVentasMouseClicked

    private void btnReportesVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesVentasMouseEntered
        
    }//GEN-LAST:event_btnReportesVentasMouseEntered

    private void btnReportesVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesVentasMouseExited
        
    }//GEN-LAST:event_btnReportesVentasMouseExited

    
    
    
    
    
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnDashboard;
    private javax.swing.JPanel btnReportesCompras;
    private javax.swing.JPanel btnReportesVentas;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblCompras;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTrabajadores;
    private javax.swing.JLabel lblVentas;
    // End of variables declaration//GEN-END:variables
}
