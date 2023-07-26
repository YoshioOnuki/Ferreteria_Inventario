
package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;


public class SidebarTrabajador extends javax.swing.JPanel {

    public SidebarTrabajador() {
        initComponents();
        iniciarComponentes();
    }
    
    public void iniciarComponentes(){
        selecProductos.setVisible(false);
        selecVentas.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProductos = new javax.swing.JPanel();
        lblProductos = new javax.swing.JLabel();
        selecProductos = new javax.swing.JPanel();
        btnVentas = new javax.swing.JPanel();
        lblVentas = new javax.swing.JLabel();
        selecVentas = new javax.swing.JPanel();

        setBackground(new java.awt.Color(229, 238, 252));
        setMaximumSize(new java.awt.Dimension(230, 340));
        setMinimumSize(new java.awt.Dimension(230, 340));
        setPreferredSize(new java.awt.Dimension(230, 340));

        btnProductos.setBackground(new java.awt.Color(53, 66, 89));
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.setMaximumSize(new java.awt.Dimension(230, 50));
        btnProductos.setMinimumSize(new java.awt.Dimension(230, 50));
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProductosMouseExited(evt);
            }
        });

        lblProductos.setFont(new java.awt.Font("SF UI Display", 1, 16)); // NOI18N
        lblProductos.setForeground(new java.awt.Color(255, 255, 255));
        lblProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProductos.setText("Productos");
        lblProductos.setMaximumSize(new java.awt.Dimension(210, 50));
        lblProductos.setMinimumSize(new java.awt.Dimension(210, 50));
        lblProductos.setPreferredSize(new java.awt.Dimension(210, 50));

        selecProductos.setBackground(new java.awt.Color(204, 94, 65));
        selecProductos.setMaximumSize(new java.awt.Dimension(10, 50));
        selecProductos.setMinimumSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout selecProductosLayout = new javax.swing.GroupLayout(selecProductos);
        selecProductos.setLayout(selecProductosLayout);
        selecProductosLayout.setHorizontalGroup(
            selecProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        selecProductosLayout.setVerticalGroup(
            selecProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout btnProductosLayout = new javax.swing.GroupLayout(btnProductos);
        btnProductos.setLayout(btnProductosLayout);
        btnProductosLayout.setHorizontalGroup(
            btnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProductosLayout.createSequentialGroup()
                .addComponent(selecProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnProductosLayout.setVerticalGroup(
            btnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProductosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(btnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(btnProductosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(selecProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        btnVentas.setBackground(new java.awt.Color(53, 66, 89));
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.setMaximumSize(new java.awt.Dimension(230, 50));
        btnVentas.setMinimumSize(new java.awt.Dimension(230, 50));
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
        lblVentas.setText("Ventas");
        lblVentas.setMaximumSize(new java.awt.Dimension(210, 50));
        lblVentas.setMinimumSize(new java.awt.Dimension(210, 50));
        lblVentas.setPreferredSize(new java.awt.Dimension(210, 50));

        selecVentas.setBackground(new java.awt.Color(204, 94, 65));
        selecVentas.setMaximumSize(new java.awt.Dimension(10, 50));
        selecVentas.setMinimumSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout selecVentasLayout = new javax.swing.GroupLayout(selecVentas);
        selecVentas.setLayout(selecVentasLayout);
        selecVentasLayout.setHorizontalGroup(
            selecVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        selecVentasLayout.setVerticalGroup(
            selecVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout btnVentasLayout = new javax.swing.GroupLayout(btnVentas);
        btnVentas.setLayout(btnVentasLayout);
        btnVentasLayout.setHorizontalGroup(
            btnVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVentasLayout.createSequentialGroup()
                .addComponent(selecVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnVentasLayout.setVerticalGroup(
            btnVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVentasLayout.createSequentialGroup()
                .addGroup(btnVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

        
    
    private void btnProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseClicked
        Productos Productos = new Productos();
            
        Productos.setSize(new Dimension(970, 620));
        Productos.setLocation(0,0);
        Principal.PanelPrincipal.removeAll();
        Principal.PanelPrincipal.add(Productos,BorderLayout.CENTER);
        Principal.PanelPrincipal.revalidate();
        Principal.PanelPrincipal.repaint();
        
        selecProductos.setVisible(true);
        selecVentas.setVisible(false);
        Principal.selecBienvenido.setVisible(false);
    }//GEN-LAST:event_btnProductosMouseClicked

    private void btnProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseEntered
        btnProductos.setBackground(new Color(48, 105, 147));
    }//GEN-LAST:event_btnProductosMouseEntered

    private void btnProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseExited
        btnProductos.setBackground(new Color(53, 66, 89));
    }//GEN-LAST:event_btnProductosMouseExited

    
    
    private void btnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked
        Ventas Ventas = new Ventas();
            
        Ventas.setSize(new Dimension(970, 620));
        Ventas.setLocation(0,0);
        Principal.PanelPrincipal.removeAll();
        Principal.PanelPrincipal.add(Ventas,BorderLayout.CENTER);
        Principal.PanelPrincipal.revalidate();
        Principal.PanelPrincipal.repaint();
        
        selecProductos.setVisible(false);
        selecVentas.setVisible(true);
        Principal.selecBienvenido.setVisible(false);
    }//GEN-LAST:event_btnVentasMouseClicked

    private void btnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseEntered
        btnVentas.setBackground(new Color(48, 105, 147));
    }//GEN-LAST:event_btnVentasMouseEntered

    private void btnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseExited
        btnVentas.setBackground(new Color(53, 66, 89));
    }//GEN-LAST:event_btnVentasMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel btnProductos;
    public static javax.swing.JPanel btnVentas;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblVentas;
    public static javax.swing.JPanel selecProductos;
    public static javax.swing.JPanel selecVentas;
    // End of variables declaration//GEN-END:variables
}
