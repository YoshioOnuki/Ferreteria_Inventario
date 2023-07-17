
package Vista;

import Consultas.compraConsulta;
import static Vista.SidebarAdmin.selecComprasVentas;
import static Vista.SidebarAdmin.selecProductos;
import static Vista.SidebarAdmin.selecProveedor;
import static Vista.SidebarAdmin.selecTrabajador;
import static Vista.SidebarAdmin.selecUsuario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class ReporteCompras extends javax.swing.JPanel {
    
    
    DefaultTableModel m = new DefaultTableModel();
    Consultas.compraConsulta compraConsulta = new compraConsulta();
    
    public ReporteCompras() {
        initComponents();
        mostrarReporteCompras();
    }
    
    void mostrarReporteCompras(){
        try {
            m = compraConsulta.consultarReporteCompras();
            tablaCompras.setModel(m);

            JTableHeader header = tablaCompras.getTableHeader();
            Font font = header.getFont();
            header.setFont(font.deriveFont(Font.BOLD, 14f));
            
            TableColumn t1 = tablaCompras.getColumn("ID");
            t1.setPreferredWidth(50);
            t1.setMaxWidth(50);
            t1.setMinWidth(50);
            DefaultTableCellRenderer centerRenderer1 = new DefaultTableCellRenderer();
            centerRenderer1.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            t1.setCellRenderer(centerRenderer1);
            
            TableColumn t2 = tablaCompras.getColumn("PROVEEDOR");
            t2.setPreferredWidth(250);
            t2.setMaxWidth(250);
            t2.setMinWidth(250);
            
            
            TableColumn t3 = tablaCompras.getColumn("PRODUCTO");
            t3.setPreferredWidth(226);
            t3.setMaxWidth(226);
            t3.setMinWidth(226);
            
            TableColumn t4 = tablaCompras.getColumn("CANTIDAD");
            t4.setPreferredWidth(80);
            t4.setMaxWidth(80);
            t4.setMinWidth(80);
            DefaultTableCellRenderer centerRenderer4 = new DefaultTableCellRenderer();
            centerRenderer4.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            t4.setCellRenderer(centerRenderer4);
            
            TableColumn t5 = tablaCompras.getColumn("FECHA");
            t5.setPreferredWidth(120);
            t5.setMaxWidth(120);
            t5.setMinWidth(120);
            DefaultTableCellRenderer centerRenderer5 = new DefaultTableCellRenderer();
            centerRenderer5.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            t5.setCellRenderer(centerRenderer5);
            
            TableColumn t6 = tablaCompras.getColumn("TOTAL");
            t6.setPreferredWidth(90);
            t6.setMaxWidth(90);
            t6.setMinWidth(90);
            DefaultTableCellRenderer centerRenderer6 = new DefaultTableCellRenderer();
            centerRenderer6.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            t6.setCellRenderer(centerRenderer6);
            
            tablaCompras.setRowHeight(25);
        } catch (Exception e) {
            System.out.println("Error al listar reporte de compras: " + e);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCompras = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        setMaximumSize(new java.awt.Dimension(980, 620));
        setMinimumSize(new java.awt.Dimension(980, 620));

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

        btnReportesCompras.setBackground(new java.awt.Color(221, 107, 77));
        btnReportesCompras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
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

        btnReportesVentas.setBackground(new java.awt.Color(53, 66, 89));
        btnReportesVentas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        lblTitulo.setText("Reporte de Compras");
        lblTitulo.setMaximumSize(new java.awt.Dimension(210, 28));
        lblTitulo.setMinimumSize(new java.awt.Dimension(210, 28));
        lblTitulo.setPreferredSize(new java.awt.Dimension(210, 28));

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setMaximumSize(new java.awt.Dimension(816, 400));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(816, 400));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(816, 400));

        tablaCompras.setFont(new java.awt.Font("SF UI Display", 0, 17)); // NOI18N
        tablaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PROVEEDOR", "PRODUCTO", "CANTIDAD", "FECHA", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCompras.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaCompras);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
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
        
    }//GEN-LAST:event_btnReportesComprasMouseClicked

    private void btnReportesComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesComprasMouseEntered
        
    }//GEN-LAST:event_btnReportesComprasMouseEntered

    private void btnReportesComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesComprasMouseExited
        
    }//GEN-LAST:event_btnReportesComprasMouseExited

    
    private void btnReportesVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesVentasMouseClicked
        ReporteVentas ReporteVentas = new ReporteVentas();

        ReporteVentas.setSize(new Dimension(970, 620));
        ReporteVentas.setLocation(0,0);
        Principal.PanelPrincipal.removeAll();
        Principal.PanelPrincipal.add(ReporteVentas,BorderLayout.CENTER);
        Principal.PanelPrincipal.revalidate();
        Principal.PanelPrincipal.repaint();
        
        selecTrabajador.setVisible(false);
        selecUsuario.setVisible(false);
        selecProductos.setVisible(false);
        selecProveedor.setVisible(false);
        selecComprasVentas.setVisible(false);
        Principal.selecBienvenido.setVisible(true);
    }//GEN-LAST:event_btnReportesVentasMouseClicked

    private void btnReportesVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesVentasMouseEntered
        btnReportesVentas.setBackground(new Color(204, 94, 65));
    }//GEN-LAST:event_btnReportesVentasMouseEntered

    private void btnReportesVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesVentasMouseExited
        btnReportesVentas.setBackground(new Color(53, 66, 89));
    }//GEN-LAST:event_btnReportesVentasMouseExited

    
    
    
    
    
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnDashboard;
    private javax.swing.JPanel btnReportesCompras;
    private javax.swing.JPanel btnReportesVentas;
    private javax.swing.JPanel jPanel6;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCompras;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTrabajadores;
    private javax.swing.JLabel lblVentas;
    public static javax.swing.JTable tablaCompras;
    // End of variables declaration//GEN-END:variables
}
