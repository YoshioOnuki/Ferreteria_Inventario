
package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Clientes extends javax.swing.JPanel {

    public Clientes() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        btnTrabajadores = new javax.swing.JPanel();
        lblTrabajadores = new javax.swing.JLabel();
        btnClientes = new javax.swing.JPanel();
        lblVentas = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        setMaximumSize(new java.awt.Dimension(970, 620));
        setMinimumSize(new java.awt.Dimension(970, 620));

        jPanel6.setBackground(new java.awt.Color(53, 66, 89));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setMaximumSize(new java.awt.Dimension(970, 40));
        jPanel6.setMinimumSize(new java.awt.Dimension(970, 40));
        jPanel6.setPreferredSize(new java.awt.Dimension(970, 40));

        btnTrabajadores.setBackground(new java.awt.Color(53, 66, 89));
        btnTrabajadores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTrabajadores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTrabajadores.setMaximumSize(new java.awt.Dimension(200, 40));
        btnTrabajadores.setMinimumSize(new java.awt.Dimension(200, 40));
        btnTrabajadores.setPreferredSize(new java.awt.Dimension(200, 40));
        btnTrabajadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTrabajadoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTrabajadoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTrabajadoresMouseExited(evt);
            }
        });

        lblTrabajadores.setFont(new java.awt.Font("SF UI Display", 1, 16)); // NOI18N
        lblTrabajadores.setForeground(new java.awt.Color(255, 255, 255));
        lblTrabajadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTrabajadores.setText("Trabajadores");
        lblTrabajadores.setMaximumSize(new java.awt.Dimension(210, 28));
        lblTrabajadores.setMinimumSize(new java.awt.Dimension(210, 28));
        lblTrabajadores.setPreferredSize(new java.awt.Dimension(210, 28));

        javax.swing.GroupLayout btnTrabajadoresLayout = new javax.swing.GroupLayout(btnTrabajadores);
        btnTrabajadores.setLayout(btnTrabajadoresLayout);
        btnTrabajadoresLayout.setHorizontalGroup(
            btnTrabajadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTrabajadoresLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnTrabajadoresLayout.setVerticalGroup(
            btnTrabajadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTrabajadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnClientes.setBackground(new java.awt.Color(221, 107, 77));
        btnClientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.setMaximumSize(new java.awt.Dimension(200, 40));
        btnClientes.setMinimumSize(new java.awt.Dimension(200, 40));
        btnClientes.setPreferredSize(new java.awt.Dimension(200, 40));
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClientesMouseExited(evt);
            }
        });

        lblVentas.setFont(new java.awt.Font("SF UI Display", 1, 16)); // NOI18N
        lblVentas.setForeground(new java.awt.Color(255, 255, 255));
        lblVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVentas.setText("Clientes");
        lblVentas.setMaximumSize(new java.awt.Dimension(210, 28));
        lblVentas.setMinimumSize(new java.awt.Dimension(210, 28));
        lblVentas.setPreferredSize(new java.awt.Dimension(210, 28));

        javax.swing.GroupLayout btnClientesLayout = new javax.swing.GroupLayout(btnClientes);
        btnClientes.setLayout(btnClientesLayout);
        btnClientesLayout.setHorizontalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnClientesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnClientesLayout.setVerticalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClientesLayout.createSequentialGroup()
                .addComponent(lblVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btnTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 571, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTrabajadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 576, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrabajadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrabajadoresMouseClicked
        Trabajadores Trabajadores = new Trabajadores();
            
        Trabajadores.setSize(new Dimension(970, 620));
        Trabajadores.setLocation(0,0);
        Principal.PanelPrincipal.removeAll();
        Principal.PanelPrincipal.add(Trabajadores,BorderLayout.CENTER);
        Principal.PanelPrincipal.revalidate();
        Principal.PanelPrincipal.repaint();
    }//GEN-LAST:event_btnTrabajadoresMouseClicked

    private void btnTrabajadoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrabajadoresMouseEntered
        btnTrabajadores.setBackground(new Color(204, 94, 65));
    }//GEN-LAST:event_btnTrabajadoresMouseEntered

    private void btnTrabajadoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrabajadoresMouseExited
        btnTrabajadores.setBackground(new Color(53, 66, 89));
    }//GEN-LAST:event_btnTrabajadoresMouseExited

    
    private void btnClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientesMouseClicked

    private void btnClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseEntered
        
    }//GEN-LAST:event_btnClientesMouseEntered

    private void btnClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseExited
    }//GEN-LAST:event_btnClientesMouseExited

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnClientes;
    private javax.swing.JPanel btnTrabajadores;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblTrabajadores;
    private javax.swing.JLabel lblVentas;
    // End of variables declaration//GEN-END:variables
}
