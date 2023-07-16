
package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Dashboard extends javax.swing.JPanel {
    
    
    DefaultTableModel m = new DefaultTableModel();
    public static int tipoMovimiento, idInven, idTrabajador = Login.id_trabajador;

    public Dashboard() {
        initComponents();
//        buscarEntradaSalida();
    }
    
//    void entradaSalida(int opc){
//        if(opc == 1){
//            tipoMovimiento = 1;
//            SubmoduloEntradaSalidaAgregar mAgre = new SubmoduloEntradaSalidaAgregar();
//
//            mAgre.setSize(970, 550);
//            mAgre.setLocation(0, 0);
//            Principal.PanelPrincipal.removeAll();
//            Principal.PanelPrincipal.add(mAgre, BorderLayout.CENTER);
//            Principal.PanelPrincipal.revalidate();
//            Principal.PanelPrincipal.repaint();
//        }
//    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        btnDashboard = new javax.swing.JPanel();
        lblTrabajadores = new javax.swing.JLabel();
        btnVentas = new javax.swing.JPanel();
        lblVentas = new javax.swing.JLabel();
        btnCompras = new javax.swing.JPanel();
        lblCompras = new javax.swing.JLabel();
        Reporte1 = new javax.swing.JPanel();
        lblReporte1 = new javax.swing.JLabel();
        lblCantProductos = new javax.swing.JLabel();
        Reporte2 = new javax.swing.JPanel();
        lblReporte3 = new javax.swing.JLabel();
        lblCantCompras = new javax.swing.JLabel();
        Reporte3 = new javax.swing.JPanel();
        lblReporte5 = new javax.swing.JLabel();
        lblCantVentas = new javax.swing.JLabel();

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

        btnVentas.setBackground(new java.awt.Color(53, 66, 89));
        btnVentas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.setMaximumSize(new java.awt.Dimension(200, 40));
        btnVentas.setMinimumSize(new java.awt.Dimension(200, 40));
        btnVentas.setPreferredSize(new java.awt.Dimension(200, 40));
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVentasMouseExited(evt);
            }
        });

        lblVentas.setFont(new java.awt.Font("SF UI Display", 1, 16)); // NOI18N
        lblVentas.setForeground(new java.awt.Color(255, 255, 255));
        lblVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVentas.setText("Reporte de Ventas");
        lblVentas.setMaximumSize(new java.awt.Dimension(210, 28));
        lblVentas.setMinimumSize(new java.awt.Dimension(210, 28));
        lblVentas.setPreferredSize(new java.awt.Dimension(210, 28));

        javax.swing.GroupLayout btnVentasLayout = new javax.swing.GroupLayout(btnVentas);
        btnVentas.setLayout(btnVentasLayout);
        btnVentasLayout.setHorizontalGroup(
            btnVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnVentasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnVentasLayout.setVerticalGroup(
            btnVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVentasLayout.createSequentialGroup()
                .addComponent(lblVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        btnCompras.setBackground(new java.awt.Color(53, 66, 89));
        btnCompras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompras.setMaximumSize(new java.awt.Dimension(200, 40));
        btnCompras.setMinimumSize(new java.awt.Dimension(200, 40));
        btnCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnComprasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnComprasMouseExited(evt);
            }
        });

        lblCompras.setFont(new java.awt.Font("SF UI Display", 1, 16)); // NOI18N
        lblCompras.setForeground(new java.awt.Color(255, 255, 255));
        lblCompras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompras.setText("Reporte de Compras");
        lblCompras.setMaximumSize(new java.awt.Dimension(210, 28));
        lblCompras.setMinimumSize(new java.awt.Dimension(210, 28));
        lblCompras.setPreferredSize(new java.awt.Dimension(210, 28));

        javax.swing.GroupLayout btnComprasLayout = new javax.swing.GroupLayout(btnCompras);
        btnCompras.setLayout(btnComprasLayout);
        btnComprasLayout.setHorizontalGroup(
            btnComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnComprasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        btnComprasLayout.setVerticalGroup(
            btnComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnComprasLayout.createSequentialGroup()
                .addComponent(lblCompras, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Reporte1.setBackground(new java.awt.Color(255, 249, 222));
        Reporte1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Reporte1.setMaximumSize(new java.awt.Dimension(240, 100));
        Reporte1.setMinimumSize(new java.awt.Dimension(240, 100));
        Reporte1.setName(""); // NOI18N
        Reporte1.setPreferredSize(new java.awt.Dimension(240, 100));
        Reporte1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Reporte1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Reporte1MouseExited(evt);
            }
        });

        lblReporte1.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        lblReporte1.setForeground(new java.awt.Color(24, 28, 50));
        lblReporte1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReporte1.setText("Productos");
        lblReporte1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblReporte1.setMaximumSize(new java.awt.Dimension(240, 50));
        lblReporte1.setMinimumSize(new java.awt.Dimension(240, 50));
        lblReporte1.setPreferredSize(new java.awt.Dimension(240, 50));

        lblCantProductos.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        lblCantProductos.setForeground(new java.awt.Color(24, 28, 50));
        lblCantProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantProductos.setText("10");
        lblCantProductos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblCantProductos.setMaximumSize(new java.awt.Dimension(240, 50));
        lblCantProductos.setMinimumSize(new java.awt.Dimension(240, 50));
        lblCantProductos.setPreferredSize(new java.awt.Dimension(240, 50));

        javax.swing.GroupLayout Reporte1Layout = new javax.swing.GroupLayout(Reporte1);
        Reporte1.setLayout(Reporte1Layout);
        Reporte1Layout.setHorizontalGroup(
            Reporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblReporte1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCantProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Reporte1Layout.setVerticalGroup(
            Reporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Reporte1Layout.createSequentialGroup()
                .addComponent(lblReporte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCantProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Reporte2.setBackground(new java.awt.Color(255, 249, 222));
        Reporte2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Reporte2.setMaximumSize(new java.awt.Dimension(240, 100));
        Reporte2.setMinimumSize(new java.awt.Dimension(240, 100));
        Reporte2.setName(""); // NOI18N
        Reporte2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Reporte2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Reporte2MouseExited(evt);
            }
        });

        lblReporte3.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        lblReporte3.setForeground(new java.awt.Color(24, 28, 50));
        lblReporte3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReporte3.setText("Compras");
        lblReporte3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblReporte3.setMaximumSize(new java.awt.Dimension(240, 50));
        lblReporte3.setMinimumSize(new java.awt.Dimension(240, 50));
        lblReporte3.setPreferredSize(new java.awt.Dimension(240, 50));

        lblCantCompras.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        lblCantCompras.setForeground(new java.awt.Color(24, 28, 50));
        lblCantCompras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantCompras.setText("10");
        lblCantCompras.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblCantCompras.setMaximumSize(new java.awt.Dimension(240, 50));
        lblCantCompras.setMinimumSize(new java.awt.Dimension(240, 50));
        lblCantCompras.setPreferredSize(new java.awt.Dimension(240, 50));

        javax.swing.GroupLayout Reporte2Layout = new javax.swing.GroupLayout(Reporte2);
        Reporte2.setLayout(Reporte2Layout);
        Reporte2Layout.setHorizontalGroup(
            Reporte2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblReporte3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCantCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Reporte2Layout.setVerticalGroup(
            Reporte2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Reporte2Layout.createSequentialGroup()
                .addComponent(lblReporte3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCantCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        Reporte3.setBackground(new java.awt.Color(255, 249, 222));
        Reporte3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Reporte3.setMaximumSize(new java.awt.Dimension(240, 100));
        Reporte3.setMinimumSize(new java.awt.Dimension(240, 100));
        Reporte3.setName(""); // NOI18N
        Reporte3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Reporte3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Reporte3MouseExited(evt);
            }
        });

        lblReporte5.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        lblReporte5.setForeground(new java.awt.Color(24, 28, 50));
        lblReporte5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReporte5.setText("Ventas");
        lblReporte5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblReporte5.setMaximumSize(new java.awt.Dimension(240, 50));
        lblReporte5.setMinimumSize(new java.awt.Dimension(240, 50));
        lblReporte5.setPreferredSize(new java.awt.Dimension(240, 50));

        lblCantVentas.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        lblCantVentas.setForeground(new java.awt.Color(24, 28, 50));
        lblCantVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantVentas.setText("10");
        lblCantVentas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblCantVentas.setMaximumSize(new java.awt.Dimension(240, 50));
        lblCantVentas.setMinimumSize(new java.awt.Dimension(240, 50));
        lblCantVentas.setPreferredSize(new java.awt.Dimension(240, 50));

        javax.swing.GroupLayout Reporte3Layout = new javax.swing.GroupLayout(Reporte3);
        Reporte3.setLayout(Reporte3Layout);
        Reporte3Layout.setHorizontalGroup(
            Reporte3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblReporte5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCantVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Reporte3Layout.setVerticalGroup(
            Reporte3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Reporte3Layout.createSequentialGroup()
                .addComponent(lblReporte5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCantVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(Reporte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Reporte2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Reporte3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Reporte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reporte2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reporte3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 412, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseClicked
        
    }//GEN-LAST:event_btnDashboardMouseClicked

    private void btnDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseEntered
        
    }//GEN-LAST:event_btnDashboardMouseEntered

    private void btnDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseExited
        
    }//GEN-LAST:event_btnDashboardMouseExited

    
    private void btnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentasMouseClicked

    private void btnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseEntered
        btnVentas.setBackground(new Color(204, 94, 65));
    }//GEN-LAST:event_btnVentasMouseEntered

    private void btnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseExited
        btnVentas.setBackground(new Color(53, 66, 89));
    }//GEN-LAST:event_btnVentasMouseExited

    
    private void btnComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprasMouseClicked

    private void btnComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseEntered
        btnCompras.setBackground(new Color(204, 94, 65));
    }//GEN-LAST:event_btnComprasMouseEntered

    private void btnComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseExited
        btnCompras.setBackground(new Color(53, 66, 89));
    }//GEN-LAST:event_btnComprasMouseExited

    
    private void Reporte1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reporte1MouseEntered
        lblReporte1.setForeground(new Color(246,107,14));
        lblCantProductos.setForeground(new Color(246,107,14));
    }//GEN-LAST:event_Reporte1MouseEntered

    private void Reporte1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reporte1MouseExited
        lblReporte1.setForeground(new Color(53, 66, 89));
        lblCantProductos.setForeground(new Color(53, 66, 89));
    }//GEN-LAST:event_Reporte1MouseExited

    private void Reporte2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reporte2MouseEntered
        lblReporte3.setForeground(new Color(246,107,14));
        lblCantCompras.setForeground(new Color(246,107,14));
    }//GEN-LAST:event_Reporte2MouseEntered

    private void Reporte2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reporte2MouseExited
        lblReporte3.setForeground(new Color(53, 66, 89));
        lblCantCompras.setForeground(new Color(53, 66, 89));
    }//GEN-LAST:event_Reporte2MouseExited

    private void Reporte3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reporte3MouseEntered
        lblReporte5.setForeground(new Color(246,107,14));
        lblCantVentas.setForeground(new Color(246,107,14));
    }//GEN-LAST:event_Reporte3MouseEntered

    private void Reporte3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reporte3MouseExited
        lblReporte5.setForeground(new Color(53, 66, 89));
        lblCantVentas.setForeground(new Color(53, 66, 89));
    }//GEN-LAST:event_Reporte3MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Reporte1;
    private javax.swing.JPanel Reporte2;
    private javax.swing.JPanel Reporte3;
    private javax.swing.JPanel btnCompras;
    private javax.swing.JPanel btnDashboard;
    private javax.swing.JPanel btnDashboard1;
    private javax.swing.JPanel btnDashboard2;
    private javax.swing.JPanel btnVentas;
    private javax.swing.JPanel btnVentas1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblCantCompras;
    private javax.swing.JLabel lblCantProductos;
    private javax.swing.JLabel lblCantVentas;
    private javax.swing.JLabel lblCompras;
    private javax.swing.JLabel lblReporte1;
    private javax.swing.JLabel lblReporte3;
    private javax.swing.JLabel lblReporte5;
    private javax.swing.JLabel lblTrabajadores;
    private javax.swing.JLabel lblTrabajadores2;
    private javax.swing.JLabel lblVentas;
    // End of variables declaration//GEN-END:variables
}
