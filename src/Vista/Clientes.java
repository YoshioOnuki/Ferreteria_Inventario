
package Vista;

import Consultas.clienteConsulta;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class Clientes extends javax.swing.JPanel {

    DefaultTableModel m = new DefaultTableModel();
    clienteConsulta clienteConsulta = new clienteConsulta();
    
    public Clientes() {
        initComponents();
        mostrarCliente();
    }
    
    void mostrarCliente(){
        try {
            m = clienteConsulta.consultarClientes();
            tablaClientes.setModel(m);

            JTableHeader header = tablaClientes.getTableHeader();
            Font font = header.getFont();
            header.setFont(font.deriveFont(Font.BOLD, 14f));
            
            TableColumn t1 = tablaClientes.getColumn("ID");
            t1.setPreferredWidth(50);
            t1.setMaxWidth(50);
            t1.setMinWidth(50);
            DefaultTableCellRenderer centerRenderer1 = new DefaultTableCellRenderer();
            centerRenderer1.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            t1.setCellRenderer(centerRenderer1);
            
            TableColumn t2 = tablaClientes.getColumn("DOCUMENTO");
            t2.setPreferredWidth(100);
            t2.setMaxWidth(100);
            t2.setMinWidth(100);
            DefaultTableCellRenderer centerRenderer2 = new DefaultTableCellRenderer();
            centerRenderer2.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            t2.setCellRenderer(centerRenderer2);
            
            TableColumn t3 = tablaClientes.getColumn("NOMBRE COMPLETO");
            t3.setPreferredWidth(240);
            t3.setMaxWidth(240);
            t3.setMinWidth(240);
            
            TableColumn t4 = tablaClientes.getColumn("DIRECCION");
            t4.setPreferredWidth(200);
            t4.setMaxWidth(200);
            t4.setMinWidth(200);
            
            TableColumn t5 = tablaClientes.getColumn("CELULAR");
            t5.setPreferredWidth(100);
            t5.setMaxWidth(100);
            t5.setMinWidth(100);
            DefaultTableCellRenderer centerRenderer5 = new DefaultTableCellRenderer();
            centerRenderer5.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            t5.setCellRenderer(centerRenderer5);
            
            TableColumn t6 = tablaClientes.getColumn("CORREO");
            t6.setPreferredWidth(126);
            t6.setMaxWidth(126);
            t6.setMinWidth(126);
            
            tablaClientes.setRowHeight(30);
        } catch (Exception e) {
            System.out.println("Error al listar Clientes: " + e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        btnTrabajadores = new javax.swing.JPanel();
        lblTrabajadores = new javax.swing.JLabel();
        btnClientes = new javax.swing.JPanel();
        lblVentas = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JPanel();
        nuevo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();

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

        lblTitulo.setFont(new java.awt.Font("SF UI Display", 1, 26)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(24, 28, 50));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Clientes");
        lblTitulo.setMaximumSize(new java.awt.Dimension(210, 28));
        lblTitulo.setMinimumSize(new java.awt.Dimension(210, 28));
        lblTitulo.setPreferredSize(new java.awt.Dimension(210, 28));

        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setMaximumSize(new java.awt.Dimension(100, 42));
        btnNuevo.setMinimumSize(new java.awt.Dimension(100, 42));
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });

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

        tablaClientes.setFont(new java.awt.Font("SF UI Display", 0, 17)); // NOI18N
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DOCUMENTO", "NOMBRE COMPLETO", "DIRECCION", "CELULAR", "CORREO", "TIPO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaClientes);

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
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        ClienteNuevo ClienteNuevo = new ClienteNuevo();
            
        ClienteNuevo.setSize(new Dimension(970, 620));
        ClienteNuevo.setLocation(0,0);
        Principal.PanelPrincipal.removeAll();
        Principal.PanelPrincipal.add(ClienteNuevo,BorderLayout.CENTER);
        Principal.PanelPrincipal.revalidate();
        Principal.PanelPrincipal.repaint();
    }//GEN-LAST:event_btnNuevoMouseClicked

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnClientes;
    private javax.swing.JPanel btnNuevo;
    private javax.swing.JPanel btnTrabajadores;
    private javax.swing.JPanel jPanel6;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTrabajadores;
    private javax.swing.JLabel lblVentas;
    private javax.swing.JLabel nuevo;
    public static javax.swing.JTable tablaClientes;
    // End of variables declaration//GEN-END:variables
}
