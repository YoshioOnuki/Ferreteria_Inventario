
package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;


public class SidebarAdmin extends javax.swing.JPanel {

    public SidebarAdmin() {
        initComponents();
        iniciarComponentes();
    }
    
    public void iniciarComponentes(){
        selecTrabajador.setVisible(false);
        selecUsuario.setVisible(false);
        selecProductos.setVisible(false);
        selecProveedor.setVisible(false);
        selecComprasVentas.setVisible(false);
        Principal.selecBienvenido.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTrabajadores = new javax.swing.JPanel();
        lblTrabajadores = new javax.swing.JLabel();
        selecTrabajador = new javax.swing.JPanel();
        btnUsuarios = new javax.swing.JPanel();
        lblUsuarios = new javax.swing.JLabel();
        selecUsuario = new javax.swing.JPanel();
        btnProductos = new javax.swing.JPanel();
        lblProductos = new javax.swing.JLabel();
        selecProductos = new javax.swing.JPanel();
        btnProveedor = new javax.swing.JPanel();
        lblProveedor = new javax.swing.JLabel();
        selecProveedor = new javax.swing.JPanel();
        btnComprasVentas = new javax.swing.JPanel();
        lblComprasVentas = new javax.swing.JLabel();
        selecComprasVentas = new javax.swing.JPanel();

        setBackground(new java.awt.Color(229, 238, 252));
        setMaximumSize(new java.awt.Dimension(230, 340));
        setMinimumSize(new java.awt.Dimension(230, 340));
        setPreferredSize(new java.awt.Dimension(230, 340));

        btnTrabajadores.setBackground(new java.awt.Color(53, 66, 89));
        btnTrabajadores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTrabajadores.setMaximumSize(new java.awt.Dimension(230, 50));
        btnTrabajadores.setMinimumSize(new java.awt.Dimension(230, 50));
        btnTrabajadores.setPreferredSize(new java.awt.Dimension(230, 50));
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
        lblTrabajadores.setText("Trabajadores / Clientes");
        lblTrabajadores.setMaximumSize(new java.awt.Dimension(210, 28));
        lblTrabajadores.setMinimumSize(new java.awt.Dimension(210, 28));
        lblTrabajadores.setPreferredSize(new java.awt.Dimension(210, 28));

        selecTrabajador.setBackground(new java.awt.Color(204, 94, 65));
        selecTrabajador.setMaximumSize(new java.awt.Dimension(10, 50));
        selecTrabajador.setMinimumSize(new java.awt.Dimension(10, 50));
        selecTrabajador.setPreferredSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout selecTrabajadorLayout = new javax.swing.GroupLayout(selecTrabajador);
        selecTrabajador.setLayout(selecTrabajadorLayout);
        selecTrabajadorLayout.setHorizontalGroup(
            selecTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        selecTrabajadorLayout.setVerticalGroup(
            selecTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout btnTrabajadoresLayout = new javax.swing.GroupLayout(btnTrabajadores);
        btnTrabajadores.setLayout(btnTrabajadoresLayout);
        btnTrabajadoresLayout.setHorizontalGroup(
            btnTrabajadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnTrabajadoresLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(selecTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        btnTrabajadoresLayout.setVerticalGroup(
            btnTrabajadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnTrabajadoresLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(btnTrabajadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(selecTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTrabajadores, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
        );

        btnUsuarios.setBackground(new java.awt.Color(53, 66, 89));
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.setMaximumSize(new java.awt.Dimension(230, 50));
        btnUsuarios.setMinimumSize(new java.awt.Dimension(230, 50));
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseExited(evt);
            }
        });

        lblUsuarios.setFont(new java.awt.Font("SF UI Display", 1, 16)); // NOI18N
        lblUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuarios.setText("Usuarios");
        lblUsuarios.setMaximumSize(new java.awt.Dimension(210, 50));
        lblUsuarios.setMinimumSize(new java.awt.Dimension(210, 50));
        lblUsuarios.setPreferredSize(new java.awt.Dimension(210, 50));

        selecUsuario.setBackground(new java.awt.Color(204, 94, 65));
        selecUsuario.setMaximumSize(new java.awt.Dimension(10, 50));
        selecUsuario.setMinimumSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout selecUsuarioLayout = new javax.swing.GroupLayout(selecUsuario);
        selecUsuario.setLayout(selecUsuarioLayout);
        selecUsuarioLayout.setHorizontalGroup(
            selecUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        selecUsuarioLayout.setVerticalGroup(
            selecUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout btnUsuariosLayout = new javax.swing.GroupLayout(btnUsuarios);
        btnUsuarios.setLayout(btnUsuariosLayout);
        btnUsuariosLayout.setHorizontalGroup(
            btnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUsuariosLayout.createSequentialGroup()
                .addComponent(selecUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnUsuariosLayout.setVerticalGroup(
            btnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnUsuariosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(btnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(btnUsuariosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(selecUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

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

        btnProveedor.setBackground(new java.awt.Color(53, 66, 89));
        btnProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedor.setMaximumSize(new java.awt.Dimension(230, 50));
        btnProveedor.setMinimumSize(new java.awt.Dimension(230, 50));
        btnProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProveedorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProveedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProveedorMouseExited(evt);
            }
        });

        lblProveedor.setFont(new java.awt.Font("SF UI Display", 1, 16)); // NOI18N
        lblProveedor.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProveedor.setText("Proveedor");
        lblProveedor.setMaximumSize(new java.awt.Dimension(210, 50));
        lblProveedor.setMinimumSize(new java.awt.Dimension(210, 50));
        lblProveedor.setPreferredSize(new java.awt.Dimension(210, 50));

        selecProveedor.setBackground(new java.awt.Color(204, 94, 65));
        selecProveedor.setMaximumSize(new java.awt.Dimension(10, 50));
        selecProveedor.setMinimumSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout selecProveedorLayout = new javax.swing.GroupLayout(selecProveedor);
        selecProveedor.setLayout(selecProveedorLayout);
        selecProveedorLayout.setHorizontalGroup(
            selecProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        selecProveedorLayout.setVerticalGroup(
            selecProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout btnProveedorLayout = new javax.swing.GroupLayout(btnProveedor);
        btnProveedor.setLayout(btnProveedorLayout);
        btnProveedorLayout.setHorizontalGroup(
            btnProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProveedorLayout.createSequentialGroup()
                .addComponent(selecProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnProveedorLayout.setVerticalGroup(
            btnProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProveedorLayout.createSequentialGroup()
                .addGroup(btnProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnComprasVentas.setBackground(new java.awt.Color(53, 66, 89));
        btnComprasVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprasVentas.setMaximumSize(new java.awt.Dimension(230, 50));
        btnComprasVentas.setMinimumSize(new java.awt.Dimension(230, 50));
        btnComprasVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprasVentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnComprasVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnComprasVentasMouseExited(evt);
            }
        });

        lblComprasVentas.setFont(new java.awt.Font("SF UI Display", 1, 16)); // NOI18N
        lblComprasVentas.setForeground(new java.awt.Color(255, 255, 255));
        lblComprasVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComprasVentas.setText("Compras / Ventas");
        lblComprasVentas.setMaximumSize(new java.awt.Dimension(210, 50));
        lblComprasVentas.setMinimumSize(new java.awt.Dimension(210, 50));
        lblComprasVentas.setPreferredSize(new java.awt.Dimension(210, 50));

        selecComprasVentas.setBackground(new java.awt.Color(204, 94, 65));
        selecComprasVentas.setMaximumSize(new java.awt.Dimension(10, 50));
        selecComprasVentas.setMinimumSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout selecComprasVentasLayout = new javax.swing.GroupLayout(selecComprasVentas);
        selecComprasVentas.setLayout(selecComprasVentasLayout);
        selecComprasVentasLayout.setHorizontalGroup(
            selecComprasVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        selecComprasVentasLayout.setVerticalGroup(
            selecComprasVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout btnComprasVentasLayout = new javax.swing.GroupLayout(btnComprasVentas);
        btnComprasVentas.setLayout(btnComprasVentasLayout);
        btnComprasVentasLayout.setHorizontalGroup(
            btnComprasVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnComprasVentasLayout.createSequentialGroup()
                .addComponent(selecComprasVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblComprasVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnComprasVentasLayout.setVerticalGroup(
            btnComprasVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnComprasVentasLayout.createSequentialGroup()
                .addGroup(btnComprasVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblComprasVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecComprasVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTrabajadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnComprasVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnComprasVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrabajadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrabajadoresMouseClicked
        Trabajadores TrabajadoresClientes = new Trabajadores();
            
        TrabajadoresClientes.setSize(new Dimension(970, 620));
        TrabajadoresClientes.setLocation(0,0);
        Principal.PanelPrincipal.removeAll();
        Principal.PanelPrincipal.add(TrabajadoresClientes,BorderLayout.CENTER);
        Principal.PanelPrincipal.revalidate();
        Principal.PanelPrincipal.repaint();
       
        selecTrabajador.setVisible(true);
        selecUsuario.setVisible(false);
        selecProductos.setVisible(false);
        selecProveedor.setVisible(false);
        selecComprasVentas.setVisible(false);
        Principal.selecBienvenido.setVisible(false);
    }//GEN-LAST:event_btnTrabajadoresMouseClicked

    private void btnTrabajadoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrabajadoresMouseEntered
        btnTrabajadores.setBackground(new Color(48, 105, 147));
    }//GEN-LAST:event_btnTrabajadoresMouseEntered

    private void btnTrabajadoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrabajadoresMouseExited
        btnTrabajadores.setBackground(new Color(53, 66, 89));
    }//GEN-LAST:event_btnTrabajadoresMouseExited

    
    private void btnUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseClicked
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
    }//GEN-LAST:event_btnUsuariosMouseClicked
    
    private void btnUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseEntered
        btnUsuarios.setBackground(new Color(48, 105, 147));
    }//GEN-LAST:event_btnUsuariosMouseEntered

    private void btnUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseExited
        btnUsuarios.setBackground(new Color(53, 66, 89));
    }//GEN-LAST:event_btnUsuariosMouseExited

    
    private void btnProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseClicked
        selecTrabajador.setVisible(false);
        selecUsuario.setVisible(false);
        selecProductos.setVisible(true);
        selecProveedor.setVisible(false);
        selecComprasVentas.setVisible(false);
        Principal.selecBienvenido.setVisible(false);
    }//GEN-LAST:event_btnProductosMouseClicked

    private void btnProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseEntered
        btnProductos.setBackground(new Color(48, 105, 147));
    }//GEN-LAST:event_btnProductosMouseEntered

    private void btnProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseExited
        btnProductos.setBackground(new Color(53, 66, 89));
    }//GEN-LAST:event_btnProductosMouseExited

    
    private void btnProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedorMouseClicked
        
        selecTrabajador.setVisible(false);
        selecUsuario.setVisible(false);
        selecProductos.setVisible(false);
        selecProveedor.setVisible(true);
        selecComprasVentas.setVisible(false);
        Principal.selecBienvenido.setVisible(false);
    }//GEN-LAST:event_btnProveedorMouseClicked

    private void btnProveedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedorMouseEntered
        btnProveedor.setBackground(new Color(48, 105, 147));
    }//GEN-LAST:event_btnProveedorMouseEntered

    private void btnProveedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedorMouseExited
        btnProveedor.setBackground(new Color(53, 66, 89));
    }//GEN-LAST:event_btnProveedorMouseExited

    
    private void btnComprasVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasVentasMouseClicked
        
        selecTrabajador.setVisible(false);
        selecUsuario.setVisible(false);
        selecProductos.setVisible(false);
        selecProveedor.setVisible(false);
        selecComprasVentas.setVisible(true);
        Principal.selecBienvenido.setVisible(false);
    }//GEN-LAST:event_btnComprasVentasMouseClicked

    private void btnComprasVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasVentasMouseEntered
        btnComprasVentas.setBackground(new Color(48, 105, 147));
    }//GEN-LAST:event_btnComprasVentasMouseEntered

    private void btnComprasVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasVentasMouseExited
        btnComprasVentas.setBackground(new Color(53, 66, 89));
    }//GEN-LAST:event_btnComprasVentasMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel btnComprasVentas;
    public static javax.swing.JPanel btnProductos;
    public static javax.swing.JPanel btnProveedor;
    public static javax.swing.JPanel btnTrabajadores;
    public static javax.swing.JPanel btnUsuarios;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblComprasVentas;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JLabel lblTrabajadores;
    private javax.swing.JLabel lblUsuarios;
    public static javax.swing.JPanel selecComprasVentas;
    public static javax.swing.JPanel selecProductos;
    public static javax.swing.JPanel selecProveedor;
    public static javax.swing.JPanel selecTrabajador;
    public static javax.swing.JPanel selecUsuario;
    // End of variables declaration//GEN-END:variables
}
