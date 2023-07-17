
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

public class Dashboard extends javax.swing.JPanel {
    
    
    DefaultTableModel m = new DefaultTableModel();
    Consultas.clienteConsulta clienteConsulta = new clienteConsulta();
    Consultas.productoConsulta productoConsulta = new productoConsulta();
    Consultas.proveedorConsulta proveedorConsulta = new proveedorConsulta();
    Consultas.trabajadorConsulta trabajadorConsulta = new trabajadorConsulta();
    Consultas.usuarioConsulta usuarioConsulta = new usuarioConsulta();
    Consultas.compraConsulta compraConsulta = new compraConsulta();
    Consultas.ventaConsulta ventaConsulta = new ventaConsulta();
    
    public Dashboard() {
        initComponents();
        mostrarDashboard();
    }
    
    public void mostrarDashboard(){
        lblCantProductos.setText("" + productoConsulta.cantidadProductos());
        lblCantCompras.setText("" + compraConsulta.cantidadCompras());
        lblCantVentas.setText("" + ventaConsulta.cantidadVentas());
        lblCantProveedores.setText("" + proveedorConsulta.cantidadProveedores());
        lblCantProdComprados.setText("" + productoConsulta.cantidadProductosComprados());
        lblCantProdVendidos.setText("" + productoConsulta.cantidadProductosVendidos());
        lblCantTrabajadores.setText("" + trabajadorConsulta.cantidadTrabajadores());
        lblCantUsuarios.setText("" + usuarioConsulta.cantidadUsuarios());
        lblCantClientes.setText("" + clienteConsulta.cantidadClientes());
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
        ReporteProdcutos = new javax.swing.JPanel();
        lblReporteProductos = new javax.swing.JLabel();
        lblCantProductos = new javax.swing.JLabel();
        ReporteCompras = new javax.swing.JPanel();
        lblReporteCompras = new javax.swing.JLabel();
        lblCantCompras = new javax.swing.JLabel();
        ReporteVentas = new javax.swing.JPanel();
        lblReporteVentas = new javax.swing.JLabel();
        lblCantVentas = new javax.swing.JLabel();
        ReporteProveedores = new javax.swing.JPanel();
        lblReporteProveedores = new javax.swing.JLabel();
        lblCantProveedores = new javax.swing.JLabel();
        ReporteProdComprados = new javax.swing.JPanel();
        lblReporteProdComprados = new javax.swing.JLabel();
        lblCantProdComprados = new javax.swing.JLabel();
        ReporteProdVendidos = new javax.swing.JPanel();
        lblReporteProdVendidos = new javax.swing.JLabel();
        lblCantProdVendidos = new javax.swing.JLabel();
        ReporteTrabajadores = new javax.swing.JPanel();
        lblReporteTrabajadores = new javax.swing.JLabel();
        lblCantTrabajadores = new javax.swing.JLabel();
        ReporteUsuarios = new javax.swing.JPanel();
        lblReporteUsuarios = new javax.swing.JLabel();
        lblCantUsuarios = new javax.swing.JLabel();
        ReporteClientes = new javax.swing.JPanel();
        lblReporteClientes = new javax.swing.JLabel();
        lblCantClientes = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        setMaximumSize(new java.awt.Dimension(970, 620));
        setMinimumSize(new java.awt.Dimension(970, 620));

        jPanel6.setBackground(new java.awt.Color(53, 66, 89));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setMaximumSize(new java.awt.Dimension(970, 40));
        jPanel6.setMinimumSize(new java.awt.Dimension(970, 40));
        jPanel6.setPreferredSize(new java.awt.Dimension(970, 40));

        btnDashboard.setBackground(new java.awt.Color(221, 107, 77));
        btnDashboard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
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
                .addGap(0, 0, Short.MAX_VALUE))
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

        ReporteProdcutos.setBackground(new java.awt.Color(255, 249, 222));
        ReporteProdcutos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ReporteProdcutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReporteProdcutos.setMaximumSize(new java.awt.Dimension(240, 100));
        ReporteProdcutos.setMinimumSize(new java.awt.Dimension(240, 100));
        ReporteProdcutos.setName(""); // NOI18N
        ReporteProdcutos.setPreferredSize(new java.awt.Dimension(240, 100));
        ReporteProdcutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReporteProdcutosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReporteProdcutosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReporteProdcutosMouseExited(evt);
            }
        });

        lblReporteProductos.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        lblReporteProductos.setForeground(new java.awt.Color(24, 28, 50));
        lblReporteProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReporteProductos.setText("Productos");
        lblReporteProductos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblReporteProductos.setMaximumSize(new java.awt.Dimension(240, 50));
        lblReporteProductos.setMinimumSize(new java.awt.Dimension(240, 50));
        lblReporteProductos.setPreferredSize(new java.awt.Dimension(240, 50));

        lblCantProductos.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        lblCantProductos.setForeground(new java.awt.Color(24, 28, 50));
        lblCantProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantProductos.setText("10");
        lblCantProductos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblCantProductos.setMaximumSize(new java.awt.Dimension(240, 50));
        lblCantProductos.setMinimumSize(new java.awt.Dimension(240, 50));
        lblCantProductos.setPreferredSize(new java.awt.Dimension(240, 50));

        javax.swing.GroupLayout ReporteProdcutosLayout = new javax.swing.GroupLayout(ReporteProdcutos);
        ReporteProdcutos.setLayout(ReporteProdcutosLayout);
        ReporteProdcutosLayout.setHorizontalGroup(
            ReporteProdcutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblReporteProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCantProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ReporteProdcutosLayout.setVerticalGroup(
            ReporteProdcutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReporteProdcutosLayout.createSequentialGroup()
                .addComponent(lblReporteProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCantProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ReporteCompras.setBackground(new java.awt.Color(255, 249, 222));
        ReporteCompras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ReporteCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReporteCompras.setMaximumSize(new java.awt.Dimension(240, 100));
        ReporteCompras.setMinimumSize(new java.awt.Dimension(240, 100));
        ReporteCompras.setName(""); // NOI18N
        ReporteCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReporteComprasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReporteComprasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReporteComprasMouseExited(evt);
            }
        });

        lblReporteCompras.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        lblReporteCompras.setForeground(new java.awt.Color(24, 28, 50));
        lblReporteCompras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReporteCompras.setText("Compras");
        lblReporteCompras.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblReporteCompras.setMaximumSize(new java.awt.Dimension(240, 50));
        lblReporteCompras.setMinimumSize(new java.awt.Dimension(240, 50));
        lblReporteCompras.setPreferredSize(new java.awt.Dimension(240, 50));

        lblCantCompras.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        lblCantCompras.setForeground(new java.awt.Color(24, 28, 50));
        lblCantCompras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantCompras.setText("10");
        lblCantCompras.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblCantCompras.setMaximumSize(new java.awt.Dimension(240, 50));
        lblCantCompras.setMinimumSize(new java.awt.Dimension(240, 50));
        lblCantCompras.setPreferredSize(new java.awt.Dimension(240, 50));

        javax.swing.GroupLayout ReporteComprasLayout = new javax.swing.GroupLayout(ReporteCompras);
        ReporteCompras.setLayout(ReporteComprasLayout);
        ReporteComprasLayout.setHorizontalGroup(
            ReporteComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblReporteCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCantCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ReporteComprasLayout.setVerticalGroup(
            ReporteComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReporteComprasLayout.createSequentialGroup()
                .addComponent(lblReporteCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCantCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        ReporteVentas.setBackground(new java.awt.Color(255, 249, 222));
        ReporteVentas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ReporteVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReporteVentas.setMaximumSize(new java.awt.Dimension(240, 100));
        ReporteVentas.setMinimumSize(new java.awt.Dimension(240, 100));
        ReporteVentas.setName(""); // NOI18N
        ReporteVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReporteVentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReporteVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReporteVentasMouseExited(evt);
            }
        });

        lblReporteVentas.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        lblReporteVentas.setForeground(new java.awt.Color(24, 28, 50));
        lblReporteVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReporteVentas.setText("Ventas");
        lblReporteVentas.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblReporteVentas.setMaximumSize(new java.awt.Dimension(240, 50));
        lblReporteVentas.setMinimumSize(new java.awt.Dimension(240, 50));
        lblReporteVentas.setPreferredSize(new java.awt.Dimension(240, 50));

        lblCantVentas.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        lblCantVentas.setForeground(new java.awt.Color(24, 28, 50));
        lblCantVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantVentas.setText("10");
        lblCantVentas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblCantVentas.setMaximumSize(new java.awt.Dimension(240, 50));
        lblCantVentas.setMinimumSize(new java.awt.Dimension(240, 50));
        lblCantVentas.setPreferredSize(new java.awt.Dimension(240, 50));

        javax.swing.GroupLayout ReporteVentasLayout = new javax.swing.GroupLayout(ReporteVentas);
        ReporteVentas.setLayout(ReporteVentasLayout);
        ReporteVentasLayout.setHorizontalGroup(
            ReporteVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblReporteVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCantVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ReporteVentasLayout.setVerticalGroup(
            ReporteVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReporteVentasLayout.createSequentialGroup()
                .addComponent(lblReporteVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCantVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        ReporteProveedores.setBackground(new java.awt.Color(255, 249, 222));
        ReporteProveedores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ReporteProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReporteProveedores.setMaximumSize(new java.awt.Dimension(240, 100));
        ReporteProveedores.setMinimumSize(new java.awt.Dimension(240, 100));
        ReporteProveedores.setName(""); // NOI18N
        ReporteProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReporteProveedoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReporteProveedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReporteProveedoresMouseExited(evt);
            }
        });

        lblReporteProveedores.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        lblReporteProveedores.setForeground(new java.awt.Color(24, 28, 50));
        lblReporteProveedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReporteProveedores.setText("Proveedores");
        lblReporteProveedores.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblReporteProveedores.setMaximumSize(new java.awt.Dimension(240, 50));
        lblReporteProveedores.setMinimumSize(new java.awt.Dimension(240, 50));
        lblReporteProveedores.setPreferredSize(new java.awt.Dimension(240, 50));

        lblCantProveedores.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        lblCantProveedores.setForeground(new java.awt.Color(24, 28, 50));
        lblCantProveedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantProveedores.setText("10");
        lblCantProveedores.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblCantProveedores.setMaximumSize(new java.awt.Dimension(240, 50));
        lblCantProveedores.setMinimumSize(new java.awt.Dimension(240, 50));
        lblCantProveedores.setPreferredSize(new java.awt.Dimension(240, 50));

        javax.swing.GroupLayout ReporteProveedoresLayout = new javax.swing.GroupLayout(ReporteProveedores);
        ReporteProveedores.setLayout(ReporteProveedoresLayout);
        ReporteProveedoresLayout.setHorizontalGroup(
            ReporteProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblReporteProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCantProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ReporteProveedoresLayout.setVerticalGroup(
            ReporteProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReporteProveedoresLayout.createSequentialGroup()
                .addComponent(lblReporteProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCantProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        ReporteProdComprados.setBackground(new java.awt.Color(255, 249, 222));
        ReporteProdComprados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ReporteProdComprados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReporteProdComprados.setMaximumSize(new java.awt.Dimension(240, 100));
        ReporteProdComprados.setMinimumSize(new java.awt.Dimension(240, 100));
        ReporteProdComprados.setName(""); // NOI18N
        ReporteProdComprados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReporteProdCompradosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReporteProdCompradosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReporteProdCompradosMouseExited(evt);
            }
        });

        lblReporteProdComprados.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        lblReporteProdComprados.setForeground(new java.awt.Color(24, 28, 50));
        lblReporteProdComprados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReporteProdComprados.setText("Prod. Comprados");
        lblReporteProdComprados.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblReporteProdComprados.setMaximumSize(new java.awt.Dimension(240, 50));
        lblReporteProdComprados.setMinimumSize(new java.awt.Dimension(240, 50));
        lblReporteProdComprados.setPreferredSize(new java.awt.Dimension(240, 50));

        lblCantProdComprados.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        lblCantProdComprados.setForeground(new java.awt.Color(24, 28, 50));
        lblCantProdComprados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantProdComprados.setText("10");
        lblCantProdComprados.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblCantProdComprados.setMaximumSize(new java.awt.Dimension(240, 50));
        lblCantProdComprados.setMinimumSize(new java.awt.Dimension(240, 50));
        lblCantProdComprados.setPreferredSize(new java.awt.Dimension(240, 50));

        javax.swing.GroupLayout ReporteProdCompradosLayout = new javax.swing.GroupLayout(ReporteProdComprados);
        ReporteProdComprados.setLayout(ReporteProdCompradosLayout);
        ReporteProdCompradosLayout.setHorizontalGroup(
            ReporteProdCompradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblReporteProdComprados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCantProdComprados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ReporteProdCompradosLayout.setVerticalGroup(
            ReporteProdCompradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReporteProdCompradosLayout.createSequentialGroup()
                .addComponent(lblReporteProdComprados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCantProdComprados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        ReporteProdVendidos.setBackground(new java.awt.Color(255, 249, 222));
        ReporteProdVendidos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ReporteProdVendidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReporteProdVendidos.setMaximumSize(new java.awt.Dimension(240, 100));
        ReporteProdVendidos.setMinimumSize(new java.awt.Dimension(240, 100));
        ReporteProdVendidos.setName(""); // NOI18N
        ReporteProdVendidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReporteProdVendidosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReporteProdVendidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReporteProdVendidosMouseExited(evt);
            }
        });

        lblReporteProdVendidos.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        lblReporteProdVendidos.setForeground(new java.awt.Color(24, 28, 50));
        lblReporteProdVendidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReporteProdVendidos.setText("Prod. Vendidos");
        lblReporteProdVendidos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblReporteProdVendidos.setMaximumSize(new java.awt.Dimension(240, 50));
        lblReporteProdVendidos.setMinimumSize(new java.awt.Dimension(240, 50));
        lblReporteProdVendidos.setPreferredSize(new java.awt.Dimension(240, 50));

        lblCantProdVendidos.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        lblCantProdVendidos.setForeground(new java.awt.Color(24, 28, 50));
        lblCantProdVendidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantProdVendidos.setText("10");
        lblCantProdVendidos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblCantProdVendidos.setMaximumSize(new java.awt.Dimension(240, 50));
        lblCantProdVendidos.setMinimumSize(new java.awt.Dimension(240, 50));
        lblCantProdVendidos.setPreferredSize(new java.awt.Dimension(240, 50));

        javax.swing.GroupLayout ReporteProdVendidosLayout = new javax.swing.GroupLayout(ReporteProdVendidos);
        ReporteProdVendidos.setLayout(ReporteProdVendidosLayout);
        ReporteProdVendidosLayout.setHorizontalGroup(
            ReporteProdVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblReporteProdVendidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCantProdVendidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ReporteProdVendidosLayout.setVerticalGroup(
            ReporteProdVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReporteProdVendidosLayout.createSequentialGroup()
                .addComponent(lblReporteProdVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCantProdVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        ReporteTrabajadores.setBackground(new java.awt.Color(255, 249, 222));
        ReporteTrabajadores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ReporteTrabajadores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReporteTrabajadores.setMaximumSize(new java.awt.Dimension(240, 100));
        ReporteTrabajadores.setMinimumSize(new java.awt.Dimension(240, 100));
        ReporteTrabajadores.setName(""); // NOI18N
        ReporteTrabajadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReporteTrabajadoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReporteTrabajadoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReporteTrabajadoresMouseExited(evt);
            }
        });

        lblReporteTrabajadores.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        lblReporteTrabajadores.setForeground(new java.awt.Color(24, 28, 50));
        lblReporteTrabajadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReporteTrabajadores.setText("Trabajadores");
        lblReporteTrabajadores.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblReporteTrabajadores.setMaximumSize(new java.awt.Dimension(240, 50));
        lblReporteTrabajadores.setMinimumSize(new java.awt.Dimension(240, 50));
        lblReporteTrabajadores.setPreferredSize(new java.awt.Dimension(240, 50));

        lblCantTrabajadores.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        lblCantTrabajadores.setForeground(new java.awt.Color(24, 28, 50));
        lblCantTrabajadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantTrabajadores.setText("10");
        lblCantTrabajadores.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblCantTrabajadores.setMaximumSize(new java.awt.Dimension(240, 50));
        lblCantTrabajadores.setMinimumSize(new java.awt.Dimension(240, 50));
        lblCantTrabajadores.setPreferredSize(new java.awt.Dimension(240, 50));

        javax.swing.GroupLayout ReporteTrabajadoresLayout = new javax.swing.GroupLayout(ReporteTrabajadores);
        ReporteTrabajadores.setLayout(ReporteTrabajadoresLayout);
        ReporteTrabajadoresLayout.setHorizontalGroup(
            ReporteTrabajadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblReporteTrabajadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCantTrabajadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ReporteTrabajadoresLayout.setVerticalGroup(
            ReporteTrabajadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReporteTrabajadoresLayout.createSequentialGroup()
                .addComponent(lblReporteTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCantTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        ReporteUsuarios.setBackground(new java.awt.Color(255, 249, 222));
        ReporteUsuarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ReporteUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReporteUsuarios.setMaximumSize(new java.awt.Dimension(240, 100));
        ReporteUsuarios.setMinimumSize(new java.awt.Dimension(240, 100));
        ReporteUsuarios.setName(""); // NOI18N
        ReporteUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReporteUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReporteUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReporteUsuariosMouseExited(evt);
            }
        });

        lblReporteUsuarios.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        lblReporteUsuarios.setForeground(new java.awt.Color(24, 28, 50));
        lblReporteUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReporteUsuarios.setText("Usuarios");
        lblReporteUsuarios.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblReporteUsuarios.setMaximumSize(new java.awt.Dimension(240, 50));
        lblReporteUsuarios.setMinimumSize(new java.awt.Dimension(240, 50));
        lblReporteUsuarios.setPreferredSize(new java.awt.Dimension(240, 50));

        lblCantUsuarios.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        lblCantUsuarios.setForeground(new java.awt.Color(24, 28, 50));
        lblCantUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantUsuarios.setText("10");
        lblCantUsuarios.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblCantUsuarios.setMaximumSize(new java.awt.Dimension(240, 50));
        lblCantUsuarios.setMinimumSize(new java.awt.Dimension(240, 50));
        lblCantUsuarios.setPreferredSize(new java.awt.Dimension(240, 50));

        javax.swing.GroupLayout ReporteUsuariosLayout = new javax.swing.GroupLayout(ReporteUsuarios);
        ReporteUsuarios.setLayout(ReporteUsuariosLayout);
        ReporteUsuariosLayout.setHorizontalGroup(
            ReporteUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblReporteUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCantUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ReporteUsuariosLayout.setVerticalGroup(
            ReporteUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReporteUsuariosLayout.createSequentialGroup()
                .addComponent(lblReporteUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCantUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        ReporteClientes.setBackground(new java.awt.Color(255, 249, 222));
        ReporteClientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ReporteClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReporteClientes.setMaximumSize(new java.awt.Dimension(240, 100));
        ReporteClientes.setMinimumSize(new java.awt.Dimension(240, 100));
        ReporteClientes.setName(""); // NOI18N
        ReporteClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReporteClientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReporteClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReporteClientesMouseExited(evt);
            }
        });

        lblReporteClientes.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        lblReporteClientes.setForeground(new java.awt.Color(24, 28, 50));
        lblReporteClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReporteClientes.setText("Clientes");
        lblReporteClientes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblReporteClientes.setMaximumSize(new java.awt.Dimension(240, 50));
        lblReporteClientes.setMinimumSize(new java.awt.Dimension(240, 50));
        lblReporteClientes.setPreferredSize(new java.awt.Dimension(240, 50));

        lblCantClientes.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        lblCantClientes.setForeground(new java.awt.Color(24, 28, 50));
        lblCantClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantClientes.setText("10");
        lblCantClientes.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblCantClientes.setMaximumSize(new java.awt.Dimension(240, 50));
        lblCantClientes.setMinimumSize(new java.awt.Dimension(240, 50));
        lblCantClientes.setPreferredSize(new java.awt.Dimension(240, 50));

        javax.swing.GroupLayout ReporteClientesLayout = new javax.swing.GroupLayout(ReporteClientes);
        ReporteClientes.setLayout(ReporteClientesLayout);
        ReporteClientesLayout.setHorizontalGroup(
            ReporteClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblReporteClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCantClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ReporteClientesLayout.setVerticalGroup(
            ReporteClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReporteClientesLayout.createSequentialGroup()
                .addComponent(lblReporteClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCantClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ReporteProdcutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReporteTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReporteProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ReporteCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReporteUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ReporteClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReporteVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ReporteProdComprados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(ReporteProdVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ReporteProdcutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReporteCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReporteVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ReporteProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(ReporteTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ReporteProdComprados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReporteProdVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ReporteUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReporteClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseClicked
        
    }//GEN-LAST:event_btnDashboardMouseClicked

    private void btnDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseEntered
        
    }//GEN-LAST:event_btnDashboardMouseEntered

    private void btnDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseExited
        
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

    
    
    
    private void ReporteProdcutosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteProdcutosMouseEntered
        lblReporteProductos.setForeground(new Color(246,107,14));
        lblCantProductos.setForeground(new Color(246,107,14));
    }//GEN-LAST:event_ReporteProdcutosMouseEntered

    private void ReporteProdcutosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteProdcutosMouseExited
        lblReporteProductos.setForeground(new Color(53, 66, 89));
        lblCantProductos.setForeground(new Color(53, 66, 89));
    }//GEN-LAST:event_ReporteProdcutosMouseExited

    
    private void ReporteComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteComprasMouseEntered
        lblReporteCompras.setForeground(new Color(246,107,14));
        lblCantCompras.setForeground(new Color(246,107,14));
    }//GEN-LAST:event_ReporteComprasMouseEntered

    private void ReporteComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteComprasMouseExited
        lblReporteCompras.setForeground(new Color(53, 66, 89));
        lblCantCompras.setForeground(new Color(53, 66, 89));
    }//GEN-LAST:event_ReporteComprasMouseExited

    
    private void ReporteVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteVentasMouseEntered
        lblReporteVentas.setForeground(new Color(246,107,14));
        lblCantVentas.setForeground(new Color(246,107,14));
    }//GEN-LAST:event_ReporteVentasMouseEntered

    private void ReporteVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteVentasMouseExited
        lblReporteVentas.setForeground(new Color(53, 66, 89));
        lblCantVentas.setForeground(new Color(53, 66, 89));
    }//GEN-LAST:event_ReporteVentasMouseExited

    
    private void ReporteTrabajadoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteTrabajadoresMouseEntered
        lblReporteTrabajadores.setForeground(new Color(246,107,14));
        lblCantTrabajadores.setForeground(new Color(246,107,14));
    }//GEN-LAST:event_ReporteTrabajadoresMouseEntered

    private void ReporteTrabajadoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteTrabajadoresMouseExited
        lblReporteTrabajadores.setForeground(new Color(53, 66, 89));
        lblCantTrabajadores.setForeground(new Color(53, 66, 89));
    }//GEN-LAST:event_ReporteTrabajadoresMouseExited

    
    private void ReporteUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteUsuariosMouseEntered
        lblReporteUsuarios.setForeground(new Color(246,107,14));
        lblCantUsuarios.setForeground(new Color(246,107,14));
    }//GEN-LAST:event_ReporteUsuariosMouseEntered

    private void ReporteUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteUsuariosMouseExited
        lblReporteUsuarios.setForeground(new Color(53, 66, 89));
        lblCantUsuarios.setForeground(new Color(53, 66, 89));
    }//GEN-LAST:event_ReporteUsuariosMouseExited

    
    private void ReporteClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteClientesMouseEntered
        lblReporteClientes.setForeground(new Color(246,107,14));
        lblCantClientes.setForeground(new Color(246,107,14));
    }//GEN-LAST:event_ReporteClientesMouseEntered

    private void ReporteClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteClientesMouseExited
        lblReporteClientes.setForeground(new Color(53, 66, 89));
        lblCantClientes.setForeground(new Color(53, 66, 89));
    }//GEN-LAST:event_ReporteClientesMouseExited

    
    private void ReporteProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteProveedoresMouseEntered
        lblReporteProveedores.setForeground(new Color(246,107,14));
        lblCantProveedores.setForeground(new Color(246,107,14));
    }//GEN-LAST:event_ReporteProveedoresMouseEntered

    private void ReporteProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteProveedoresMouseExited
        lblReporteProveedores.setForeground(new Color(53, 66, 89));
        lblCantProveedores.setForeground(new Color(53, 66, 89));
    }//GEN-LAST:event_ReporteProveedoresMouseExited

    
    private void ReporteProdCompradosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteProdCompradosMouseEntered
        lblReporteProdComprados.setForeground(new Color(246,107,14));
        lblCantProdComprados.setForeground(new Color(246,107,14));
    }//GEN-LAST:event_ReporteProdCompradosMouseEntered

    private void ReporteProdCompradosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteProdCompradosMouseExited
        lblReporteProdComprados.setForeground(new Color(53, 66, 89));
        lblCantProdComprados.setForeground(new Color(53, 66, 89));
    }//GEN-LAST:event_ReporteProdCompradosMouseExited

    
    private void ReporteProdVendidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteProdVendidosMouseEntered
        lblReporteProdVendidos.setForeground(new Color(246,107,14));
        lblCantProdVendidos.setForeground(new Color(246,107,14));
    }//GEN-LAST:event_ReporteProdVendidosMouseEntered

    private void ReporteProdVendidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteProdVendidosMouseExited
        lblReporteProdVendidos.setForeground(new Color(53, 66, 89));
        lblCantProdVendidos.setForeground(new Color(53, 66, 89));
    }//GEN-LAST:event_ReporteProdVendidosMouseExited

    
    
    private void ReporteProdcutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteProdcutosMouseClicked
        Productos Productos = new Productos();
            
        Productos.setSize(new Dimension(970, 620));
        Productos.setLocation(0,0);
        Principal.PanelPrincipal.removeAll();
        Principal.PanelPrincipal.add(Productos,BorderLayout.CENTER);
        Principal.PanelPrincipal.revalidate();
        Principal.PanelPrincipal.repaint();
        
        selecTrabajador.setVisible(false);
        selecUsuario.setVisible(false);
        selecProductos.setVisible(true);
        selecProveedor.setVisible(false);
        selecComprasVentas.setVisible(false);
        Principal.selecBienvenido.setVisible(false);
    }//GEN-LAST:event_ReporteProdcutosMouseClicked

    private void ReporteProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteProveedoresMouseClicked
        Proveedor Proveedor = new Proveedor();
            
        Proveedor.setSize(new Dimension(970, 620));
        Proveedor.setLocation(0,0);
        Principal.PanelPrincipal.removeAll();
        Principal.PanelPrincipal.add(Proveedor,BorderLayout.CENTER);
        Principal.PanelPrincipal.revalidate();
        Principal.PanelPrincipal.repaint();
        
        selecTrabajador.setVisible(false);
        selecUsuario.setVisible(false);
        selecProductos.setVisible(false);
        selecProveedor.setVisible(true);
        selecComprasVentas.setVisible(false);
        Principal.selecBienvenido.setVisible(false);
    }//GEN-LAST:event_ReporteProveedoresMouseClicked

    private void ReporteProdCompradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteProdCompradosMouseClicked
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
    }//GEN-LAST:event_ReporteProdCompradosMouseClicked

    private void ReporteProdVendidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteProdVendidosMouseClicked
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
    }//GEN-LAST:event_ReporteProdVendidosMouseClicked

    private void ReporteTrabajadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteTrabajadoresMouseClicked
        Trabajadores Trabajadores = new Trabajadores();
            
        Trabajadores.setSize(new Dimension(970, 620));
        Trabajadores.setLocation(0,0);
        Principal.PanelPrincipal.removeAll();
        Principal.PanelPrincipal.add(Trabajadores,BorderLayout.CENTER);
        Principal.PanelPrincipal.revalidate();
        Principal.PanelPrincipal.repaint();
        
        selecTrabajador.setVisible(true);
        selecUsuario.setVisible(false);
        selecProductos.setVisible(false);
        selecProveedor.setVisible(false);
        selecComprasVentas.setVisible(false);
        Principal.selecBienvenido.setVisible(false);
    }//GEN-LAST:event_ReporteTrabajadoresMouseClicked

    private void ReporteUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteUsuariosMouseClicked
        Usuarios Usuarios = new Usuarios();
            
        Usuarios.setSize(new Dimension(970, 620));
        Usuarios.setLocation(0,0);
        Principal.PanelPrincipal.removeAll();
        Principal.PanelPrincipal.add(Usuarios,BorderLayout.CENTER);
        Principal.PanelPrincipal.revalidate();
        Principal.PanelPrincipal.repaint();
        
        selecTrabajador.setVisible(false);
        selecUsuario.setVisible(true);
        selecProductos.setVisible(false);
        selecProveedor.setVisible(false);
        selecComprasVentas.setVisible(false);
        Principal.selecBienvenido.setVisible(false);
    }//GEN-LAST:event_ReporteUsuariosMouseClicked

    private void ReporteClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteClientesMouseClicked
        Clientes Clientes = new Clientes();
            
        Clientes.setSize(new Dimension(970, 620));
        Clientes.setLocation(0,0);
        Principal.PanelPrincipal.removeAll();
        Principal.PanelPrincipal.add(Clientes,BorderLayout.CENTER);
        Principal.PanelPrincipal.revalidate();
        Principal.PanelPrincipal.repaint();
        
        selecTrabajador.setVisible(true);
        selecUsuario.setVisible(false);
        selecProductos.setVisible(false);
        selecProveedor.setVisible(false);
        selecComprasVentas.setVisible(false);
        Principal.selecBienvenido.setVisible(false);
    }//GEN-LAST:event_ReporteClientesMouseClicked

    private void ReporteComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteComprasMouseClicked
        Compras Compras = new Compras();
            
        Compras.setSize(new Dimension(970, 620));
        Compras.setLocation(0,0);
        Principal.PanelPrincipal.removeAll();
        Principal.PanelPrincipal.add(Compras,BorderLayout.CENTER);
        Principal.PanelPrincipal.revalidate();
        Principal.PanelPrincipal.repaint();
        
        selecTrabajador.setVisible(false);
        selecUsuario.setVisible(false);
        selecProductos.setVisible(false);
        selecProveedor.setVisible(false);
        selecComprasVentas.setVisible(true);
        Principal.selecBienvenido.setVisible(false);
    }//GEN-LAST:event_ReporteComprasMouseClicked

    private void ReporteVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteVentasMouseClicked
        Ventas Ventas = new Ventas();
        
        Ventas.setSize(new Dimension(970, 620));
        Ventas.setLocation(0,0);
        Principal.PanelPrincipal.removeAll();
        Principal.PanelPrincipal.add(Ventas,BorderLayout.CENTER);
        Principal.PanelPrincipal.revalidate();
        Principal.PanelPrincipal.repaint();
        
        selecTrabajador.setVisible(false);
        selecUsuario.setVisible(false);
        selecProductos.setVisible(false);
        selecProveedor.setVisible(false);
        selecComprasVentas.setVisible(true);
        Principal.selecBienvenido.setVisible(false);
    }//GEN-LAST:event_ReporteVentasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ReporteClientes;
    private javax.swing.JPanel ReporteCompras;
    private javax.swing.JPanel ReporteProdComprados;
    private javax.swing.JPanel ReporteProdVendidos;
    private javax.swing.JPanel ReporteProdcutos;
    private javax.swing.JPanel ReporteProveedores;
    private javax.swing.JPanel ReporteTrabajadores;
    private javax.swing.JPanel ReporteUsuarios;
    private javax.swing.JPanel ReporteVentas;
    private javax.swing.JPanel btnDashboard;
    private javax.swing.JPanel btnReportesCompras;
    private javax.swing.JPanel btnReportesVentas;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblCantClientes;
    private javax.swing.JLabel lblCantCompras;
    private javax.swing.JLabel lblCantProdComprados;
    private javax.swing.JLabel lblCantProdVendidos;
    private javax.swing.JLabel lblCantProductos;
    private javax.swing.JLabel lblCantProveedores;
    private javax.swing.JLabel lblCantTrabajadores;
    private javax.swing.JLabel lblCantUsuarios;
    private javax.swing.JLabel lblCantVentas;
    private javax.swing.JLabel lblCompras;
    private javax.swing.JLabel lblReporteClientes;
    private javax.swing.JLabel lblReporteCompras;
    private javax.swing.JLabel lblReporteProdComprados;
    private javax.swing.JLabel lblReporteProdVendidos;
    private javax.swing.JLabel lblReporteProductos;
    private javax.swing.JLabel lblReporteProveedores;
    private javax.swing.JLabel lblReporteTrabajadores;
    private javax.swing.JLabel lblReporteUsuarios;
    private javax.swing.JLabel lblReporteVentas;
    private javax.swing.JLabel lblTrabajadores;
    private javax.swing.JLabel lblVentas;
    // End of variables declaration//GEN-END:variables
}
