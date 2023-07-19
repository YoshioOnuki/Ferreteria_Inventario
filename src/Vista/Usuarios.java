
package Vista;

import Consultas.usuarioConsulta;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class Usuarios extends javax.swing.JPanel {

    DefaultTableModel m = new DefaultTableModel();
    usuarioConsulta usuarioConsulta = new usuarioConsulta();
    
    public Usuarios() {
        initComponents();
        mostrarUsuarios();
    }
    
    void mostrarUsuarios(){
        try {
            m = usuarioConsulta.consultarUsuarios();
            tablaUsuarios.setModel(m);

            JTableHeader header = tablaUsuarios.getTableHeader();
            Font font = header.getFont();
            header.setFont(font.deriveFont(Font.BOLD, 14f));
            
            TableColumn t1 = tablaUsuarios.getColumn("ID");
            t1.setPreferredWidth(50);
            t1.setMaxWidth(50);
            t1.setMinWidth(50);
            DefaultTableCellRenderer centerRenderer1 = new DefaultTableCellRenderer();
            centerRenderer1.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            t1.setCellRenderer(centerRenderer1);
            
            TableColumn t2 = tablaUsuarios.getColumn("USUARIO");
            t2.setPreferredWidth(180);
            t2.setMaxWidth(180);
            t2.setMinWidth(180);
            
            
            TableColumn t3 = tablaUsuarios.getColumn("TRABAJADOR");
            t3.setPreferredWidth(320);
            t3.setMaxWidth(320);
            t3.setMinWidth(320);
            
            TableColumn t4 = tablaUsuarios.getColumn("ROL");
            t4.setPreferredWidth(160);
            t4.setMaxWidth(160);
            t4.setMinWidth(160);
            DefaultTableCellRenderer centerRenderer4 = new DefaultTableCellRenderer();
            centerRenderer4.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            t4.setCellRenderer(centerRenderer4);
            
            TableColumn t5 = tablaUsuarios.getColumn("ESTADO");
            t5.setPreferredWidth(106);
            t5.setMaxWidth(106);
            t5.setMinWidth(106);
            DefaultTableCellRenderer centerRenderer5 = new DefaultTableCellRenderer();
            centerRenderer5.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            t5.setCellRenderer(centerRenderer5);
            
            tablaUsuarios.setRowHeight(30);
        } catch (Exception e) {
            System.out.println("Error al listar Usuarios: " + e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JPanel();
        nuevo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        setMaximumSize(new java.awt.Dimension(970, 620));
        setMinimumSize(new java.awt.Dimension(970, 620));

        jPanel6.setBackground(new java.awt.Color(53, 66, 89));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setMaximumSize(new java.awt.Dimension(970, 40));
        jPanel6.setMinimumSize(new java.awt.Dimension(970, 40));
        jPanel6.setPreferredSize(new java.awt.Dimension(970, 40));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 972, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        lblTitulo.setFont(new java.awt.Font("SF UI Display", 1, 26)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(24, 28, 50));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Usuarios");
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

        tablaUsuarios.setFont(new java.awt.Font("SF UI Display", 0, 17)); // NOI18N
        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "USUARIO", "TRABAJADOR", "ROL", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaUsuarios);

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
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnNuevo;
    private javax.swing.JPanel jPanel6;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel nuevo;
    public static javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables
}
