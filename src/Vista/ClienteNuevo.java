
package Vista;

import Consultas.clienteConsulta;
import Modelo.cliente;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ClienteNuevo extends javax.swing.JPanel {
    
    Modelo.cliente cliente = new cliente();
    clienteConsulta clienteConsulta = new clienteConsulta();
    
    int id;
    
    public static int tipo_vista;
    public static int paso, id_cliente = 0;
    
    public ClienteNuevo() {
        initComponents();
        modo();
    }
    
    public void modo(){
        if(Clientes.tipo_vista == 2){//Editar
            lblTitulo.setText("Editar Cliente");
            
            //Cargamos el modelo con los datos del cliente
            id = Clientes.id_cliente;
            cliente = clienteConsulta.datosClienteID(id);
            
            //Cargamos los datos en los txts
            txtDocumento.setText(cliente.getCliente_documento());
            txtNombre.setText(cliente.getCliente_nombre_completo());
            txtDireccion.setText(cliente.getCliente_direccion());
            txtCelular.setText(cliente.getCliente_celular());
            txtCorreo.setText(cliente.getCliente_email());
        }else{
            lblTitulo.setText("Agregar Nuevos Clientes");
        }
        
        if(tipo_vista == 3){
            lblTitulo.setText("Registrar los datos del cliente para la venta");
            btnSoyCliente.setVisible(true);
            lblSoyCliente.setVisible(true);
            
            if(paso == 0){
                txtDocumento.setText("");
                txtNombre.setText("");
                txtDireccion.setText("");
                txtCelular.setText("");
                txtCorreo.setText("");
            }
            
            ImageIcon icon = new ImageIcon("src/Image/btnSiguiente.png");
            lblGuardar.setIcon(icon);
        }else{
            btnSoyCliente.setVisible(false);
            lblSoyCliente.setVisible(false);
            ImageIcon icon = new ImageIcon("src/Image/btnGuardarNew.png");
            lblGuardar.setIcon(icon);
        }
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
            int respuesta = 0;
            
            cliente = clienteConsulta.datosClienteDNI(documento);
            
            if(tipo_vista == 3){
                id_cliente = cliente.getId_cliente();
                if(id_cliente == 0){
                    JOptionPane.showMessageDialog(null, "¡Seleccione un cliente existente!");
                }else{
                    this.paso = 1;

                    RealizarVenta RealizarVenta = new RealizarVenta();
                    RealizarVenta.setSize(new Dimension(970, 620));
                    RealizarVenta.setLocation(0,0);
                    Principal.PanelPrincipal.removeAll();
                    Principal.PanelPrincipal.add(RealizarVenta,BorderLayout.CENTER);
                    Principal.PanelPrincipal.revalidate();
                    Principal.PanelPrincipal.repaint();
                }
                
            }else{
                if(Clientes.tipo_vista == 1){//Nuevo
                    String documento_validar = cliente.getCliente_documento();
                    if(documento_validar == "" || documento_validar == null){
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

                        respuesta = clienteConsulta.addCliente(ob);
                    }else{
                        JOptionPane.showMessageDialog(null, "¡El cliente ya existe!");
                        return;
                    }
                }else if(Clientes.tipo_vista == 2){
                    Object[] ob = new Object[6];

                    ob[0] = documento;
                    ob[1] = nombre;
                    ob[2] = direccion;
                    ob[3] = celular;
                    ob[4] = correo;

                    System.out.println(txtDocumento.getText().length());
                    if(txtDocumento.getText().length() == 8){
                        ob[5] = "Personal Natural";
                        System.out.println("8");
                    }else if(txtDocumento.getText().length() == 9){
                        ob[5] = "Extranjero";
                        System.out.println("9");
                    }else if(txtDocumento.getText().length() == 11){
                        ob[5] = "Empresa";
                        System.out.println("11");
                    }else{
                        JOptionPane.showMessageDialog(null, "¡El numero de documento es incorrecto!");
                        return;
                    }

                    respuesta = clienteConsulta.updateCliente(ob, id);
                }

                if(respuesta == 1){
                    JOptionPane.showMessageDialog(null, "Datos del cliente ingresados correctamente");
                }else if(respuesta ==2){
                    JOptionPane.showMessageDialog(null, "Datos del cliente actualizados correctamente");
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
    }
    
    void buscarCliente(){
        cliente = clienteConsulta.datosClienteDNI(txtDocumento.getText());
        
        if(txtDocumento.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campos de Documento vacío");
        }else if(cliente.getCliente_documento() == "" || cliente.getCliente_documento() == null){
            JOptionPane.showMessageDialog(null, "Cliente no encontrado");
        }else{
            txtNombre.setText(cliente.getCliente_nombre_completo());
            txtDireccion.setText(cliente.getCliente_direccion());
            txtCelular.setText(cliente.getCliente_celular());
            txtCorreo.setText(cliente.getCliente_email());
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
        lblGuardar = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnSoyCliente = new javax.swing.JPanel();
        lblSoyCliente = new javax.swing.JLabel();

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

        lblGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnGuardarNew.png"))); // NOI18N

        javax.swing.GroupLayout btnGuardarLayout = new javax.swing.GroupLayout(btnGuardar);
        btnGuardar.setLayout(btnGuardarLayout);
        btnGuardarLayout.setHorizontalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnGuardarLayout.setVerticalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        btnSoyCliente.setBackground(new java.awt.Color(51, 71, 86));
        btnSoyCliente.setMaximumSize(new java.awt.Dimension(30, 29));
        btnSoyCliente.setMinimumSize(new java.awt.Dimension(30, 29));
        btnSoyCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSoyClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSoyClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSoyClienteMouseExited(evt);
            }
        });

        lblSoyCliente.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        lblSoyCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblSoyCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSoyCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Iconlupa.png"))); // NOI18N
        lblSoyCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSoyCliente.setMaximumSize(new java.awt.Dimension(30, 29));
        lblSoyCliente.setMinimumSize(new java.awt.Dimension(30, 29));
        lblSoyCliente.setPreferredSize(new java.awt.Dimension(30, 29));

        javax.swing.GroupLayout btnSoyClienteLayout = new javax.swing.GroupLayout(btnSoyCliente);
        btnSoyCliente.setLayout(btnSoyClienteLayout);
        btnSoyClienteLayout.setHorizontalGroup(
            btnSoyClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSoyClienteLayout.createSequentialGroup()
                .addComponent(lblSoyCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnSoyClienteLayout.setVerticalGroup(
            btnSoyClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSoyClienteLayout.createSequentialGroup()
                .addComponent(lblSoyCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(btnSoyCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(96, 96, 96))))
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
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSoyCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        if(tipo_vista == 3){
            Ventas Ventas = new Ventas();
            Ventas.setSize(new Dimension(970, 620));
            Ventas.setLocation(0,0);
            Principal.PanelPrincipal.removeAll();
            Principal.PanelPrincipal.add(Ventas,BorderLayout.CENTER);
            Principal.PanelPrincipal.revalidate();
            Principal.PanelPrincipal.repaint();
        }else{
            Clientes Clientes = new Clientes();
            Clientes.setSize(new Dimension(970, 620));
            Clientes.setLocation(0,0);
            Principal.PanelPrincipal.removeAll();
            Principal.PanelPrincipal.add(Clientes,BorderLayout.CENTER);
            Principal.PanelPrincipal.revalidate();
            Principal.PanelPrincipal.repaint();
        }
            
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

    private void btnSoyClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSoyClienteMouseClicked
        buscarCliente();
    }//GEN-LAST:event_btnSoyClienteMouseClicked

    private void btnSoyClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSoyClienteMouseEntered
        btnSoyCliente.setBackground(new Color(48, 105, 147));
    }//GEN-LAST:event_btnSoyClienteMouseEntered

    private void btnSoyClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSoyClienteMouseExited
        btnSoyCliente.setBackground(new Color(51,71,86));
    }//GEN-LAST:event_btnSoyClienteMouseExited

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JPanel btnSoyCliente;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSoyCliente;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
