
package Vista;

import Consultas.clienteConsulta;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JOptionPane;

public class ClienteNuevo extends javax.swing.JPanel {
    
    clienteConsulta clienteConsulta = new clienteConsulta();
    
    public ClienteNuevo() {
        initComponents();
    }
    
    public void agregarCliente(){
        if(txtDocumento.getText().isEmpty() || txtNombre.getText().isEmpty() || txtDireccion.getText().isEmpty() || txtCelular.getText().isEmpty() ||txtCorreo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campos requeridos vacios");
            if(txtDocumento.getText().equals("")){
                txtDocumento.requestFocus();
            }else if(txtNombre.getText().equals("")){
                txtNombre.requestFocus();
            }else if(txtDireccion.getText().equals("")){
                txtDireccion.requestFocus();
            }else if(txtCelular.getText().equals("")){
                txtCelular.requestFocus();
            }else{
                txtCorreo.requestFocus();
            }
        }else{
            String nombre = txtNombre.getText();
            String documento = txtDocumento.getText();
            String direccion = txtDireccion.getText();
            String celular = txtCelular.getText();
            String correo = txtCorreo.getText();
            
            Object[] ob = new Object[6];

            ob[0] = documento;
            ob[1] = nombre;
            ob[2] = direccion;
            ob[3] = celular;
            ob[4] = correo;
            if(txtDocumento.getText().length() == 8){
                ob[5] = "Personal Natural";
            }else if(txtDocumento.getText().length() == 9){
                ob[5] = "Extranjero";
            }else if(txtDocumento.getText().length() == 11){
                ob[5] = "Empresa";
            }

            int respuesta = clienteConsulta.addCliente(ob);

            if(respuesta>0){
                JOptionPane.showMessageDialog(null, "Datos del cliente ingresados correctamente");
            }

            Clientes Clientes = new Clientes();
            
            Clientes.setSize(new Dimension(970, 620));
            Clientes.setLocation(0,0);
            Principal.PanelPrincipal.removeAll();
            Principal.PanelPrincipal.add(Clientes,BorderLayout.CENTER);
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
        lblDocumento = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JPanel();
        btn = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();

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
        lblTitulo.setText("Agregar Nuevos Clientes");
        lblTitulo.setMaximumSize(new java.awt.Dimension(210, 28));
        lblTitulo.setMinimumSize(new java.awt.Dimension(210, 28));
        lblTitulo.setPreferredSize(new java.awt.Dimension(210, 28));

        lblDocumento.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        lblDocumento.setForeground(new java.awt.Color(24, 28, 50));
        lblDocumento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDocumento.setText("Documento");
        lblDocumento.setMaximumSize(new java.awt.Dimension(210, 28));
        lblDocumento.setMinimumSize(new java.awt.Dimension(210, 28));
        lblDocumento.setPreferredSize(new java.awt.Dimension(210, 28));

        txtDocumento.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtDocumento.setMaximumSize(new java.awt.Dimension(300, 29));
        txtDocumento.setMinimumSize(new java.awt.Dimension(300, 29));
        txtDocumento.setPreferredSize(new java.awt.Dimension(300, 29));
        txtDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDocumentoKeyTyped(evt);
            }
        });

        lblDireccion.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(24, 28, 50));
        lblDireccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDireccion.setText("Direccion");
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

        lblNombre.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(24, 28, 50));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombre.setText("Nombre completo");
        lblNombre.setMaximumSize(new java.awt.Dimension(210, 28));
        lblNombre.setMinimumSize(new java.awt.Dimension(210, 28));
        lblNombre.setPreferredSize(new java.awt.Dimension(210, 28));

        txtNombre.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtNombre.setMaximumSize(new java.awt.Dimension(300, 29));
        txtNombre.setMinimumSize(new java.awt.Dimension(300, 29));
        txtNombre.setPreferredSize(new java.awt.Dimension(300, 29));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
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
                                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                        .addComponent(lblDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        Clientes Clientes = new Clientes();
            
        Clientes.setSize(new Dimension(970, 620));
        Clientes.setLocation(0,0);
        Principal.PanelPrincipal.removeAll();
        Principal.PanelPrincipal.add(Clientes,BorderLayout.CENTER);
        Principal.PanelPrincipal.revalidate();
        Principal.PanelPrincipal.repaint();
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void txtDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocumentoKeyTyped
        char c = evt.getKeyChar();
        String textoActual = txtDocumento.getText();
        if (!Character.isDigit(c) || textoActual.length() >= 11) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDocumentoKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        char c = evt.getKeyChar();
        String textoActual = txtCelular.getText();
        if (!Character.isDigit(c) || textoActual.length() >= 9) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCelularKeyTyped

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        agregarCliente();
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') &&(c<'A' || c>'Z') && c != ' ')
        evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoKeyTyped

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
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
