
package Vista;

import Consultas.trabajadorConsulta;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class Trabajadores extends javax.swing.JPanel {

    DefaultTableModel m = new DefaultTableModel();
    trabajadorConsulta trabajadorConsulta = new trabajadorConsulta();
    
    public static int id_trabajador, tipo_vista;
     
    public Trabajadores() {
        initComponents();
        mostrarTrabajador();
    }
    
    void editar(){
        int fila = tablaTrabajadores.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }else{
            id_trabajador = Integer.parseInt(tablaTrabajadores.getValueAt(fila, 0).toString());
            tipo_vista = 2;//Vista de editar
        
            Vista.TrabajadorNuevo TrabajadorNuevo = new TrabajadorNuevo();
            TrabajadorNuevo.setSize(970, 620);
            TrabajadorNuevo.setLocation(0, 0);
            Principal.PanelPrincipal.removeAll();
            Principal.PanelPrincipal.add(TrabajadorNuevo, BorderLayout.CENTER);
            Principal.PanelPrincipal.revalidate();
            Principal.PanelPrincipal.repaint();
            
        }
    }
    
    void mostrarTrabajador(){
        try {
            m = trabajadorConsulta.consultarTrabajadores();
            tablaTrabajadores.setModel(m);

            JTableHeader header = tablaTrabajadores.getTableHeader();
            Font font = header.getFont();
            header.setFont(font.deriveFont(Font.BOLD, 14f));
            
            TableColumn t1 = tablaTrabajadores.getColumn("ID");
            t1.setPreferredWidth(50);
            t1.setMaxWidth(50);
            t1.setMinWidth(50);
            DefaultTableCellRenderer centerRenderer1 = new DefaultTableCellRenderer();
            centerRenderer1.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            t1.setCellRenderer(centerRenderer1);
            
            TableColumn t2 = tablaTrabajadores.getColumn("NOMBRE COMPLETO");
            t2.setPreferredWidth(280);
            t2.setMaxWidth(280);
            t2.setMinWidth(280);
            
            TableColumn t3 = tablaTrabajadores.getColumn("DIRECCION");
            t3.setPreferredWidth(280);
            t3.setMaxWidth(280);
            t3.setMinWidth(280);
            
            TableColumn t4 = tablaTrabajadores.getColumn("CELULAR");
            t4.setPreferredWidth(106);
            t4.setMaxWidth(106);
            t4.setMinWidth(106);
            DefaultTableCellRenderer centerRenderer4 = new DefaultTableCellRenderer();
            centerRenderer4.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            t4.setCellRenderer(centerRenderer4);
            
            TableColumn t5 = tablaTrabajadores.getColumn("ESTADO");
            t5.setPreferredWidth(100);
            t5.setMaxWidth(100);
            t5.setMinWidth(100);
            DefaultTableCellRenderer centerRenderer5 = new DefaultTableCellRenderer();
            centerRenderer5.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            t5.setCellRenderer(centerRenderer5);
            
            tablaTrabajadores.setRowHeight(30);
        } catch (Exception e) {
            System.out.println("Error al listar Trabajadores: " + e);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        btnTrabajadores = new javax.swing.JPanel();
        lblTrabajadores = new javax.swing.JLabel();
        btnClientes = new javax.swing.JPanel();
        lblClientes = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JPanel();
        nuevo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTrabajadores = new javax.swing.JTable();
        btnEditar = new javax.swing.JPanel();
        editar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        setMaximumSize(new java.awt.Dimension(970, 620));
        setMinimumSize(new java.awt.Dimension(970, 620));

        jPanel6.setBackground(new java.awt.Color(53, 66, 89));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setMaximumSize(new java.awt.Dimension(970, 40));
        jPanel6.setMinimumSize(new java.awt.Dimension(970, 40));
        jPanel6.setPreferredSize(new java.awt.Dimension(970, 40));

        btnTrabajadores.setBackground(new java.awt.Color(221, 107, 77));
        btnTrabajadores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
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

        btnClientes.setBackground(new java.awt.Color(53, 66, 89));
        btnClientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        lblClientes.setFont(new java.awt.Font("SF UI Display", 1, 16)); // NOI18N
        lblClientes.setForeground(new java.awt.Color(255, 255, 255));
        lblClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClientes.setText("Clientes");
        lblClientes.setMaximumSize(new java.awt.Dimension(210, 28));
        lblClientes.setMinimumSize(new java.awt.Dimension(210, 28));
        lblClientes.setPreferredSize(new java.awt.Dimension(210, 28));

        javax.swing.GroupLayout btnClientesLayout = new javax.swing.GroupLayout(btnClientes);
        btnClientes.setLayout(btnClientesLayout);
        btnClientesLayout.setHorizontalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnClientesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnClientesLayout.setVerticalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClientesLayout.createSequentialGroup()
                .addComponent(lblClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
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
        lblTitulo.setText("Trabajadores");
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

        tablaTrabajadores.setFont(new java.awt.Font("SF UI Display", 0, 17));
        tablaTrabajadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaTrabajadores.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaTrabajadores);

        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setMaximumSize(new java.awt.Dimension(100, 42));
        btnEditar.setMinimumSize(new java.awt.Dimension(100, 42));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnEditar.png"))); // NOI18N

        javax.swing.GroupLayout btnEditarLayout = new javax.swing.GroupLayout(btnEditar);
        btnEditar.setLayout(btnEditarLayout);
        btnEditarLayout.setHorizontalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnEditarLayout.setVerticalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrabajadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrabajadoresMouseClicked
        
    }//GEN-LAST:event_btnTrabajadoresMouseClicked

    private void btnTrabajadoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrabajadoresMouseEntered
        
    }//GEN-LAST:event_btnTrabajadoresMouseEntered

    private void btnTrabajadoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrabajadoresMouseExited
        
    }//GEN-LAST:event_btnTrabajadoresMouseExited

    
    private void btnClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseClicked
        Clientes Clientes = new Clientes();
            
        Clientes.setSize(new Dimension(970, 620));
        Clientes.setLocation(0,0);
        Principal.PanelPrincipal.removeAll();
        Principal.PanelPrincipal.add(Clientes,BorderLayout.CENTER);
        Principal.PanelPrincipal.revalidate();
        Principal.PanelPrincipal.repaint();
    }//GEN-LAST:event_btnClientesMouseClicked

    private void btnClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseEntered
        btnClientes.setBackground(new Color(204, 94, 65));
    }//GEN-LAST:event_btnClientesMouseEntered

    private void btnClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseExited
        btnClientes.setBackground(new Color(53, 66, 89));
    }//GEN-LAST:event_btnClientesMouseExited

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        tipo_vista = 1;//Nuevo
        
        TrabajadorNuevo TrabajadoresNuevo = new TrabajadorNuevo();
            
        TrabajadoresNuevo.setSize(new Dimension(970, 620));
        TrabajadoresNuevo.setLocation(0,0);
        Principal.PanelPrincipal.removeAll();
        Principal.PanelPrincipal.add(TrabajadoresNuevo,BorderLayout.CENTER);
        Principal.PanelPrincipal.revalidate();
        Principal.PanelPrincipal.repaint();
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        editar();
    }//GEN-LAST:event_btnEditarMouseClicked

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnClientes;
    private javax.swing.JPanel btnEditar;
    private javax.swing.JPanel btnNuevo;
    private javax.swing.JPanel btnTrabajadores;
    private javax.swing.JLabel editar;
    private javax.swing.JPanel jPanel6;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTrabajadores;
    private javax.swing.JLabel nuevo;
    public static javax.swing.JTable tablaTrabajadores;
    // End of variables declaration//GEN-END:variables
}
