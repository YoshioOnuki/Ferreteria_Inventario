
package Vista;

import Consultas.rolConsulta;
import Consultas.trabajadorConsulta;
import Consultas.usuarioConsulta;
import Modelo.rol;
import Modelo.trabajador;
import Modelo.usuario;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JOptionPane;

public class UsuarioNuevo extends javax.swing.JPanel {
    
    Modelo.usuario usuario = new usuario();
    Modelo.trabajador trabajador = new trabajador();
    Modelo.rol rol = new rol();
    
    Consultas.usuarioConsulta usuarioConsulta = new usuarioConsulta();
    Consultas.trabajadorConsulta trabajadorConsulta = new trabajadorConsulta();
    Consultas.rolConsulta rolConsulta = new rolConsulta();
    
    int id;
    
    public UsuarioNuevo() {
        initComponents();
        modo();
    }
    
    public void modo(){
        trabajadorConsulta.cargarComboTrabajador(cboTrabajador);
        rolConsulta.cargarComboRol(cboRol);
        
        if(Usuarios.tipo_vista == 2){//Editar
            //Cargamos el modelo con los datos del cliente
            id = Usuarios.id_usuario;
            usuario = usuarioConsulta.datosUsuarioID(id);
            
            //Cargamos los datos en los txts
            txtUsuario.setText(usuario.getUsuario());
            
            trabajador = trabajadorConsulta.datosTrabajadorID(usuario.getId_trabajdor());
            cboTrabajador.setSelectedIndex(trabajador.getId_trabajador());
            
            rol = rolConsulta.datosRolID(usuario.getId_rol());
            cboRol.setSelectedIndex(rol.getId_rol());
            
            //Ocultamos la contrasenia
            txtContraseña.setVisible(false);
            lblContraseña.setVisible(false);
        }else{
             //Mostramos la contrasenia
            txtContraseña.setVisible(true);
            lblContraseña.setVisible(true);
        }
    }

    public void agregarUsuario(){
        if(txtUsuario.getText().isEmpty() || cboTrabajador.getSelectedIndex() == 0 || cboRol.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Los campos requeridos están vacios");
            if(txtUsuario.getText().equals("")){
                txtUsuario.requestFocus();
            }else if(txtContraseña.getText().equals("")){
                txtContraseña.requestFocus();
            }
        }else{
            String usuarioo = txtUsuario.getText();
            int trabajador = cboTrabajador.getSelectedIndex();
            int rol = cboRol.getSelectedIndex();
            
            int respuesta = 0;
            
            int val = usuarioConsulta.validarUsuarioTrabajador(trabajador);
            
            if(val > 0 && val != id){
                JOptionPane.showMessageDialog(null, "El trabajador ya tiene usuario");
                return;
            }
            
            if(Usuarios.tipo_vista == 1){//Nuevo
                String contra = txtContraseña.getText();
                
                Object[] ob = new Object[4];

                ob[0] = usuarioo;
                ob[1] = contra;
                ob[2] = trabajador;
                ob[3] = rol;

                respuesta = usuarioConsulta.addUsuario(ob);
                
            }else if(Usuarios.tipo_vista == 2){//Editar
                Object[] ob = new Object[3];

                ob[0] = usuarioo;
                ob[1] = trabajador;
                ob[2] = rol;

                respuesta = usuarioConsulta.updateUsuario(ob, id);
            }
            
            if(respuesta == 1){
                JOptionPane.showMessageDialog(null, "Datos del Usuario ingresados correctamente");
            }else if(respuesta ==2){
                JOptionPane.showMessageDialog(null, "Datos del Usuario actualizados correctamente");
            }

            Usuarios Usuarios = new Usuarios();

            Usuarios.setSize(new Dimension(970, 620));
            Usuarios.setLocation(0,0);
            Principal.PanelPrincipal.removeAll();
            Principal.PanelPrincipal.add(Usuarios,BorderLayout.CENTER);
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
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JPanel();
        btn = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        cboTrabajador = new javax.swing.JComboBox<>();
        cboRol = new javax.swing.JComboBox<>();
        lblContraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();

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
        lblTitulo.setText("Agregar Nuevos Usuarios");
        lblTitulo.setMaximumSize(new java.awt.Dimension(210, 28));
        lblTitulo.setMinimumSize(new java.awt.Dimension(210, 28));
        lblTitulo.setPreferredSize(new java.awt.Dimension(210, 28));

        lblUsuario.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(24, 28, 50));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsuario.setText("Usuario");
        lblUsuario.setMaximumSize(new java.awt.Dimension(210, 28));
        lblUsuario.setMinimumSize(new java.awt.Dimension(210, 28));
        lblUsuario.setPreferredSize(new java.awt.Dimension(210, 28));

        txtUsuario.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtUsuario.setMaximumSize(new java.awt.Dimension(300, 29));
        txtUsuario.setMinimumSize(new java.awt.Dimension(300, 29));
        txtUsuario.setPreferredSize(new java.awt.Dimension(300, 29));
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });

        lblDireccion.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(24, 28, 50));
        lblDireccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDireccion.setText("Rol");
        lblDireccion.setMaximumSize(new java.awt.Dimension(210, 28));
        lblDireccion.setMinimumSize(new java.awt.Dimension(210, 28));
        lblDireccion.setPreferredSize(new java.awt.Dimension(210, 28));

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
        lblNombre.setText("Trabajador");
        lblNombre.setMaximumSize(new java.awt.Dimension(210, 28));
        lblNombre.setMinimumSize(new java.awt.Dimension(210, 28));
        lblNombre.setPreferredSize(new java.awt.Dimension(210, 28));

        cboTrabajador.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        cboTrabajador.setMaximumSize(new java.awt.Dimension(220, 30));
        cboTrabajador.setMinimumSize(new java.awt.Dimension(220, 30));
        cboTrabajador.setPreferredSize(new java.awt.Dimension(220, 30));

        cboRol.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        cboRol.setMaximumSize(new java.awt.Dimension(220, 30));
        cboRol.setMinimumSize(new java.awt.Dimension(220, 30));
        cboRol.setPreferredSize(new java.awt.Dimension(220, 30));

        lblContraseña.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(24, 28, 50));
        lblContraseña.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblContraseña.setText("Contraseña");
        lblContraseña.setMaximumSize(new java.awt.Dimension(210, 28));
        lblContraseña.setMinimumSize(new java.awt.Dimension(210, 28));
        lblContraseña.setPreferredSize(new java.awt.Dimension(210, 28));

        txtContraseña.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtContraseña.setMaximumSize(new java.awt.Dimension(300, 29));
        txtContraseña.setMinimumSize(new java.awt.Dimension(300, 29));
        txtContraseña.setPreferredSize(new java.awt.Dimension(300, 29));
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyTyped(evt);
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                    .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboRol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                        .addComponent(lblContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)))
                        .addGap(38, 38, 38)
                        .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(cboRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        Usuarios Usuarios = new Usuarios();
            
        Usuarios.setSize(new Dimension(970, 620));
        Usuarios.setLocation(0,0);
        Principal.PanelPrincipal.removeAll();
        Principal.PanelPrincipal.add(Usuarios,BorderLayout.CENTER);
        Principal.PanelPrincipal.revalidate();
        Principal.PanelPrincipal.repaint();
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        agregarUsuario();
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarMouseEntered

    private void txtContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaKeyTyped

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JComboBox<String> cboRol;
    private javax.swing.JComboBox<String> cboTrabajador;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
