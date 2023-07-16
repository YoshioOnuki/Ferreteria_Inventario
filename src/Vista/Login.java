
package Vista;

import Consultas.rolConsulta;
import Consultas.trabajadorConsulta;
import Consultas.usuarioConsulta;
import Modelo.trabajador;
import Modelo.usuario;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Login extends javax.swing.JFrame {

    Modelo.usuario usuarioModelo = new usuario();
    Modelo.trabajador trabajadorModelo = new trabajador();
    Consultas.usuarioConsulta usuarioConsulta= new usuarioConsulta();
    Consultas.trabajadorConsulta trabajadorConsulta = new trabajadorConsulta();
    Consultas.rolConsulta rolConsulta = new rolConsulta();
    
    public static String trabajador_nombre, rol;
    public static int id_rol, id_trabajador;
    

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Inventario de Ferreteria Mori");
        this.setIconImage(new ImageIcon(getClass().getResource("/Image/Logo.png")).getImage());
        placeholder();
        txtUsuario.setText("admin");
        txtContrasenia.setText("123");
    }
    
    
    void placeholder(){
        Textp usuario = new Textp("Usuario *", txtUsuario);
        Textp contrasenia = new Textp("Contraseña *", txtContrasenia);
    }
    
    void validar(){
        String usuario = txtUsuario.getText();
        String contrasenia = txtContrasenia.getText();
        
        if(txtUsuario.getText().equals("") || txtContrasenia.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campos de textos vacios");
            txtUsuario.requestFocus();
        }else{
            usuarioModelo = usuarioConsulta.validarUsuario(usuario, contrasenia);
            if(usuarioModelo.getUsuario()!= null && usuarioModelo.getUsuario_contrasenia()!= null){
                int idu = usuarioModelo.getId_usuario();
                id_trabajador = usuarioModelo.getId_trabajdor();
                
                trabajadorModelo = trabajadorConsulta.datosTrabajadorID(id_trabajador);
                id_rol = usuarioModelo.getId_rol();
                trabajador_nombre = trabajadorModelo.getTrabajador_nombre_completo();
                
                rol = rolConsulta.datosRolID(id_rol);
                
                //Visualizar...
                Principal principal = new Principal();
                principal.setVisible(true);
                dispose();
                
            }else{
                JOptionPane.showMessageDialog(null, "Campos de Textos Incorrectos");
                txtUsuario.requestFocus();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        usuario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtContrasenia = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 550));

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setMaximumSize(new java.awt.Dimension(1000, 550));
        Fondo.setMinimumSize(new java.awt.Dimension(1000, 550));
        Fondo.setPreferredSize(new java.awt.Dimension(1000, 550));

        jPanel1.setBackground(new java.awt.Color(242, 247, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 550));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 550));

        usuario.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(24, 28, 50));
        usuario.setText("Usuario:");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(170, 42));
        jPanel2.setMinimumSize(new java.awt.Dimension(170, 42));

        txtUsuario.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(24, 28, 50));
        txtUsuario.setBorder(null);
        txtUsuario.setMaximumSize(new java.awt.Dimension(120, 18));
        txtUsuario.setMinimumSize(new java.awt.Dimension(120, 18));
        txtUsuario.setPreferredSize(new java.awt.Dimension(120, 18));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        contraseña.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        contraseña.setForeground(new java.awt.Color(24, 28, 50));
        contraseña.setText("Contraseña:");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(170, 42));
        jPanel3.setMinimumSize(new java.awt.Dimension(170, 42));

        txtContrasenia.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        txtContrasenia.setForeground(new java.awt.Color(24, 28, 50));
        txtContrasenia.setBorder(null);
        txtContrasenia.setMaximumSize(new java.awt.Dimension(120, 18));
        txtContrasenia.setMinimumSize(new java.awt.Dimension(120, 18));
        txtContrasenia.setPreferredSize(new java.awt.Dimension(120, 18));
        txtContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseniaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnIngresar.setBackground(new java.awt.Color(53, 66, 89));
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.setMaximumSize(new java.awt.Dimension(200, 50));
        btnIngresar.setMinimumSize(new java.awt.Dimension(200, 50));
        btnIngresar.setRequestFocusEnabled(false);
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresarMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SF UI Display", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("INGRESAR");

        javax.swing.GroupLayout btnIngresarLayout = new javax.swing.GroupLayout(btnIngresar);
        btnIngresar.setLayout(btnIngresarLayout);
        btnIngresarLayout.setHorizontalGroup(
            btnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnIngresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnIngresarLayout.setVerticalGroup(
            btnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnIngresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/usuario_herra.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(116, 150));
        jLabel3.setMinimumSize(new java.awt.Dimension(116, 150));
        jLabel3.setPreferredSize(new java.awt.Dimension(116, 150));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contraseña)
                    .addComponent(usuario)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(87, 123, 193));
        jPanel4.setMaximumSize(new java.awt.Dimension(500, 550));
        jPanel4.setMinimumSize(new java.awt.Dimension(500, 550));
        jPanel4.setPreferredSize(new java.awt.Dimension(500, 550));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fondo-ferreteria.png"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(500, 550));
        jLabel5.setMinimumSize(new java.awt.Dimension(500, 550));
        jLabel5.setPreferredSize(new java.awt.Dimension(500, 550));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseniaActionPerformed

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        validar();
    }//GEN-LAST:event_btnIngresarMouseClicked

    private void btnIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseEntered
        btnIngresar.setBackground(new Color(48, 105, 147));
    }//GEN-LAST:event_btnIngresarMouseEntered

    private void btnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseExited
        btnIngresar.setBackground(new Color(53,66,89));
    }//GEN-LAST:event_btnIngresarMouseExited

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Fondo;
    private javax.swing.JPanel btnIngresar;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
