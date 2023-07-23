
package Vista;

import Consultas.productoConsulta;
import Consultas.proveedorConsulta;
import Modelo.proveedor;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JOptionPane;

public class ProveedorNuevo extends javax.swing.JPanel {
    
    Modelo.proveedor proveedor = new proveedor();
    Consultas.proveedorConsulta proveedorConsulta = new proveedorConsulta();
    
    int id;
    
    public ProveedorNuevo() {
        initComponents();
        modo();
    }
    
    public void modo(){
        if(Proveedor.tipo_vista == 2){//Editar
            lblTitulo.setText("Editar Proveedor");
            
            //Cargamos el modelo con los datos del proveedor
            id = Proveedor.id_proveedor;
            proveedor = proveedorConsulta.datosProveedorID(id);
            
            //Cargamos los datos en los txts
            txtProveedor.setText(proveedor.getProveedor());
            txtDireccion.setText(proveedor.getProveedor_direccion());
            txtCelular.setText(proveedor.getProveedor_celular());
            txtCorreo.setText(proveedor.getProveedor_correo());
        }else{
            lblTitulo.setText("Agregar Nuevos Proveedores");
        }
    }
    
    public void agregarProducto(){
        if(txtProveedor.getText().isEmpty() || txtDireccion.getText().isEmpty() || txtCelular.getText().isEmpty() || txtCorreo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campos requeridos vacios");
            if(txtProveedor.getText().equals("")){
                txtProveedor.requestFocus();
            }else if(txtDireccion.getText().equals("")){
                txtDireccion.requestFocus();
            }else if(txtCelular.getText().equals("")){
                txtCelular.requestFocus();
            }else if(txtCorreo.getText().equals("")){
                txtCorreo.requestFocus();
            }
        }else{
            String proveedor = txtProveedor.getText();
            String direccion = txtDireccion.getText();
            String celular = txtCelular.getText();
            String correo = txtCorreo.getText();
            int respuesta = 0;
            
            if(Proveedor.tipo_vista == 1){//Nuevo
                Object[] ob = new Object[4];

                ob[0] = proveedor;
                ob[1] = direccion;
                ob[2] = celular;
                ob[3] = correo;

                respuesta = proveedorConsulta.addProveedor(ob);
            }else if(Proveedor.tipo_vista == 2){
                Object[] ob = new Object[4];

                ob[0] = proveedor;
                ob[1] = direccion;
                ob[2] = celular;
                ob[3] = correo;

                respuesta = proveedorConsulta.updateProveedor(ob, id);
            }
            
            if(respuesta == 1){
                JOptionPane.showMessageDialog(null, "Datos del Proveedor ingresados correctamente");
            }else if(respuesta ==2){
                JOptionPane.showMessageDialog(null, "Datos del Proveedor actualizados correctamente");
            }

            Proveedor Proveedor = new Proveedor();
            
            Proveedor.setSize(new Dimension(970, 620));
            Proveedor.setLocation(0,0);
            Principal.PanelPrincipal.removeAll();
            Principal.PanelPrincipal.add(Proveedor,BorderLayout.CENTER);
            Principal.PanelPrincipal.revalidate();
            Principal.PanelPrincipal.repaint();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblProveedor = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JPanel();
        btn = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        setMaximumSize(new java.awt.Dimension(970, 620));
        setMinimumSize(new java.awt.Dimension(970, 620));

        jPanel6.setBackground(new java.awt.Color(53, 66, 89));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setMaximumSize(new java.awt.Dimension(970, 40));
        jPanel6.setMinimumSize(new java.awt.Dimension(970, 40));
        jPanel6.setPreferredSize(new java.awt.Dimension(970, 40));

        btnRegresar.setFont(new java.awt.Font("SF UI Display", 1, 16)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnRegresar.png"))); // NOI18N
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.setMaximumSize(new java.awt.Dimension(100, 37));
        btnRegresar.setMinimumSize(new java.awt.Dimension(100, 37));
        btnRegresar.setPreferredSize(new java.awt.Dimension(100, 37));
        btnRegresar.setRequestFocusEnabled(false);
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegresarMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblTitulo.setFont(new java.awt.Font("SF UI Display", 1, 26)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(24, 28, 50));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitulo.setText("Agregar Nuevos Proveedores");
        lblTitulo.setMaximumSize(new java.awt.Dimension(210, 28));
        lblTitulo.setMinimumSize(new java.awt.Dimension(210, 28));
        lblTitulo.setPreferredSize(new java.awt.Dimension(210, 28));

        lblProveedor.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        lblProveedor.setForeground(new java.awt.Color(24, 28, 50));
        lblProveedor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblProveedor.setText("Proveedor");
        lblProveedor.setMaximumSize(new java.awt.Dimension(210, 28));
        lblProveedor.setMinimumSize(new java.awt.Dimension(210, 28));
        lblProveedor.setPreferredSize(new java.awt.Dimension(210, 28));

        txtProveedor.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtProveedor.setMaximumSize(new java.awt.Dimension(300, 29));
        txtProveedor.setMinimumSize(new java.awt.Dimension(300, 29));
        txtProveedor.setPreferredSize(new java.awt.Dimension(300, 29));
        txtProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProveedorKeyTyped(evt);
            }
        });

        lblCelular.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        lblCelular.setForeground(new java.awt.Color(24, 28, 50));
        lblCelular.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCelular.setText("Celular");
        lblCelular.setMaximumSize(new java.awt.Dimension(210, 28));
        lblCelular.setMinimumSize(new java.awt.Dimension(210, 28));
        lblCelular.setPreferredSize(new java.awt.Dimension(210, 28));

        txtCelular.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtCelular.setMaximumSize(new java.awt.Dimension(300, 29));
        txtCelular.setMinimumSize(new java.awt.Dimension(300, 29));
        txtCelular.setPreferredSize(new java.awt.Dimension(300, 29));
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });

        lblCorreo.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(24, 28, 50));
        lblCorreo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCorreo.setText("Correo");
        lblCorreo.setMaximumSize(new java.awt.Dimension(210, 28));
        lblCorreo.setMinimumSize(new java.awt.Dimension(210, 28));
        lblCorreo.setPreferredSize(new java.awt.Dimension(210, 28));

        txtCorreo.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtCorreo.setMaximumSize(new java.awt.Dimension(300, 29));
        txtCorreo.setMinimumSize(new java.awt.Dimension(300, 29));
        txtCorreo.setPreferredSize(new java.awt.Dimension(300, 29));
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setMaximumSize(new java.awt.Dimension(100, 42));
        btnGuardar.setMinimumSize(new java.awt.Dimension(100, 42));
        btnGuardar.setPreferredSize(new java.awt.Dimension(100, 42));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnGuardarNew.png"))); // NOI18N

        javax.swing.GroupLayout btnGuardarLayout = new javax.swing.GroupLayout(btnGuardar);
        btnGuardar.setLayout(btnGuardarLayout);
        btnGuardarLayout.setHorizontalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnGuardarLayout.setVerticalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblDireccion.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(24, 28, 50));
        lblDireccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDireccion.setText("Dirección");
        lblDireccion.setMaximumSize(new java.awt.Dimension(210, 28));
        lblDireccion.setMinimumSize(new java.awt.Dimension(210, 28));
        lblDireccion.setPreferredSize(new java.awt.Dimension(210, 28));

        txtDireccion.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtDireccion.setMaximumSize(new java.awt.Dimension(300, 29));
        txtDireccion.setMinimumSize(new java.awt.Dimension(300, 29));
        txtDireccion.setPreferredSize(new java.awt.Dimension(300, 29));
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(93, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        Proveedor Proveedor = new Proveedor();
            
        Proveedor.setSize(new Dimension(970, 620));
        Proveedor.setLocation(0,0);
        Principal.PanelPrincipal.removeAll();
        Principal.PanelPrincipal.add(Proveedor,BorderLayout.CENTER);
        Principal.PanelPrincipal.revalidate();
        Principal.PanelPrincipal.repaint();
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void txtProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProveedorKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') &&(c<'A' || c>'Z') && c != ' ')
        evt.consume();
    }//GEN-LAST:event_txtProveedorKeyTyped

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        char c = evt.getKeyChar();
        String textoActual = txtCorreo.getText();
        if (!Character.isDigit(c) || textoActual.length() >= 9) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCelularKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        agregarProducto();
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void btnRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarMouseEntered

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtProveedor;
    // End of variables declaration//GEN-END:variables
}
