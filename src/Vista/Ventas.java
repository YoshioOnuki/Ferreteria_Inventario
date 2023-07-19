
package Vista;

import Consultas.ventaConsulta;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class Ventas extends javax.swing.JPanel {
    
    DefaultTableModel m = new DefaultTableModel();
    ventaConsulta ventaConsulta = new ventaConsulta();

    public Ventas() {
        initComponents();
        mostrarUsuarios();
    }
    
    void mostrarUsuarios(){
        try {
            m = ventaConsulta.consultarVentas();
            tablaVentas.setModel(m);

            JTableHeader header = tablaVentas.getTableHeader();
            Font font = header.getFont();
            header.setFont(font.deriveFont(Font.BOLD, 14f));
            
            TableColumn t1 = tablaVentas.getColumn("ID");
            t1.setPreferredWidth(50);
            t1.setMaxWidth(50);
            t1.setMinWidth(50);
            DefaultTableCellRenderer centerRenderer1 = new DefaultTableCellRenderer();
            centerRenderer1.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            t1.setCellRenderer(centerRenderer1);
            
            TableColumn t2 = tablaVentas.getColumn("CLIENTE");
            t2.setPreferredWidth(280);
            t2.setMaxWidth(280);
            t2.setMinWidth(280);
            
            
            TableColumn t3 = tablaVentas.getColumn("TRABAJADOR");
            t3.setPreferredWidth(280);
            t3.setMaxWidth(280);
            t3.setMinWidth(280);
            
            TableColumn t4 = tablaVentas.getColumn("FECHA");
            t4.setPreferredWidth(116);
            t4.setMaxWidth(116);
            t4.setMinWidth(116);
            DefaultTableCellRenderer centerRenderer4 = new DefaultTableCellRenderer();
            centerRenderer4.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            t4.setCellRenderer(centerRenderer4);
            
            TableColumn t5 = tablaVentas.getColumn("TOTAL");
            t5.setPreferredWidth(90);
            t5.setMaxWidth(90);
            t5.setMinWidth(90);
            DefaultTableCellRenderer centerRenderer5 = new DefaultTableCellRenderer();
            centerRenderer5.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            t5.setCellRenderer(centerRenderer5);
            
            tablaVentas.setRowHeight(30);
        } catch (Exception e) {
            System.out.println("Error al listar ventas: " + e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        btnCompras = new javax.swing.JPanel();
        lblTrabajadores = new javax.swing.JLabel();
        btnVentas = new javax.swing.JPanel();
        lblVentas = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JPanel();
        nuevo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        setMaximumSize(new java.awt.Dimension(970, 620));
        setMinimumSize(new java.awt.Dimension(970, 620));

        jPanel6.setBackground(new java.awt.Color(53, 66, 89));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setMaximumSize(new java.awt.Dimension(970, 40));
        jPanel6.setMinimumSize(new java.awt.Dimension(970, 40));
        jPanel6.setPreferredSize(new java.awt.Dimension(970, 40));

        btnCompras.setBackground(new java.awt.Color(53, 66, 89));
        btnCompras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompras.setMaximumSize(new java.awt.Dimension(200, 40));
        btnCompras.setMinimumSize(new java.awt.Dimension(200, 40));
        btnCompras.setPreferredSize(new java.awt.Dimension(200, 40));
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

        lblTrabajadores.setFont(new java.awt.Font("SF UI Display", 1, 16)); // NOI18N
        lblTrabajadores.setForeground(new java.awt.Color(255, 255, 255));
        lblTrabajadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTrabajadores.setText("Compras");
        lblTrabajadores.setMaximumSize(new java.awt.Dimension(210, 28));
        lblTrabajadores.setMinimumSize(new java.awt.Dimension(210, 28));
        lblTrabajadores.setPreferredSize(new java.awt.Dimension(210, 28));

        javax.swing.GroupLayout btnComprasLayout = new javax.swing.GroupLayout(btnCompras);
        btnCompras.setLayout(btnComprasLayout);
        btnComprasLayout.setHorizontalGroup(
            btnComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnComprasLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnComprasLayout.setVerticalGroup(
            btnComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTrabajadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnVentas.setBackground(new java.awt.Color(221, 107, 77));
        btnVentas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
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
        lblVentas.setText("Ventas");
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
                .addComponent(lblVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 571, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTitulo.setFont(new java.awt.Font("SF UI Display", 1, 26)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(24, 28, 50));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Ventas");
        lblTitulo.setMaximumSize(new java.awt.Dimension(210, 28));
        lblTitulo.setMinimumSize(new java.awt.Dimension(210, 28));
        lblTitulo.setPreferredSize(new java.awt.Dimension(210, 28));

        btnNuevo.setMaximumSize(new java.awt.Dimension(100, 42));
        btnNuevo.setMinimumSize(new java.awt.Dimension(100, 42));

        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnNuevo.png"))); // NOI18N

        javax.swing.GroupLayout btnNuevoLayout = new javax.swing.GroupLayout(btnNuevo);
        btnNuevo.setLayout(btnNuevoLayout);
        btnNuevoLayout.setHorizontalGroup(
            btnNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnNuevoLayout.setVerticalGroup(
            btnNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setMaximumSize(new java.awt.Dimension(816, 350));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(816, 350));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(816, 350));

        tablaVentas.setFont(new java.awt.Font("SF UI Display", 0, 17)); // NOI18N
        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CLIENTE", "TRABAJADOR", "FECHA", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaVentas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaVentas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseClicked
        Compras Compras = new Compras();
            
        Compras.setSize(new Dimension(970, 620));
        Compras.setLocation(0,0);
        Principal.PanelPrincipal.removeAll();
        Principal.PanelPrincipal.add(Compras,BorderLayout.CENTER);
        Principal.PanelPrincipal.revalidate();
        Principal.PanelPrincipal.repaint();
    }//GEN-LAST:event_btnComprasMouseClicked

    private void btnComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseEntered
        btnCompras.setBackground(new Color(204, 94, 65));
    }//GEN-LAST:event_btnComprasMouseEntered

    private void btnComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseExited
        btnCompras.setBackground(new Color(53, 66, 89));
    }//GEN-LAST:event_btnComprasMouseExited

    
    private void btnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentasMouseClicked

    private void btnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseEntered
        
    }//GEN-LAST:event_btnVentasMouseEntered

    private void btnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseExited
    }//GEN-LAST:event_btnVentasMouseExited

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCompras;
    private javax.swing.JPanel btnNuevo;
    private javax.swing.JPanel btnVentas;
    private javax.swing.JPanel jPanel6;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTrabajadores;
    private javax.swing.JLabel lblVentas;
    private javax.swing.JLabel nuevo;
    public static javax.swing.JTable tablaVentas;
    // End of variables declaration//GEN-END:variables
}
