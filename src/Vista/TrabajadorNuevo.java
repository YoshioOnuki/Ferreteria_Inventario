
package Vista;

import Consultas.trabajadorConsulta;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JOptionPane;

public class TrabajadorNuevo extends javax.swing.JPanel {
    
    trabajadorConsulta trabajadorConsulta = new trabajadorConsulta();
    
    public TrabajadorNuevo() {
        initComponents();
    }
    
    public void agregarTrabajador(){
        if(txtNombre.getText().equals("") || txtDireccion.getText().equals("") || txtCelular.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campos requeridos vacios");
            if(txtNombre.getText().equals("")){
                txtNombre.requestFocus();
            }else if(txtDireccion.getText().equals("")){
                txtDireccion.requestFocus();
            }else{
                txtCelular.requestFocus();
            }
        }else{
            String nombre = txtNombre.getText();
            String direccion = txtDireccion.getText();
            String celular = txtCelular.getText();
            
            Object[] ob = new Object[4];

            ob[0] = nombre;
            ob[1] = direccion;
            ob[2] = celular;
            ob[3] = 1;

            int respuesta = trabajadorConsulta.addTrabajador(ob);

            if(respuesta>0){
                JOptionPane.showMessageDialog(null, "Datos del trabajador ingresados correctamente");
            }

            Trabajadores Trabajadores = new Trabajadores();
            
            Trabajadores.setSize(new Dimension(970, 620));
            Trabajadores.setLocation(0,0);
            Principal.PanelPrincipal.removeAll();
            Principal.PanelPrincipal.add(Trabajadores,BorderLayout.CENTER);
            Principal.PanelPrincipal.revalidate();
            Principal.PanelPrincipal.repaint();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        lblTrabajadores = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JPanel();
        btn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        setMaximumSize(new java.awt.Dimension(970, 620));
        setMinimumSize(new java.awt.Dimension(970, 620));

        jPanel6.setBackground(new java.awt.Color(53, 66, 89));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setMaximumSize(new java.awt.Dimension(970, 40));
        jPanel6.setMinimumSize(new java.awt.Dimension(970, 40));
        jPanel6.setPreferredSize(new java.awt.Dimension(970, 40));

        lblTrabajadores.setFont(new java.awt.Font("SF UI Display", 1, 16)); // NOI18N
        lblTrabajadores.setForeground(new java.awt.Color(255, 255, 255));
        lblTrabajadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTrabajadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnRegresar.png"))); // NOI18N
        lblTrabajadores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTrabajadores.setMaximumSize(new java.awt.Dimension(100, 37));
        lblTrabajadores.setMinimumSize(new java.awt.Dimension(100, 37));
        lblTrabajadores.setPreferredSize(new java.awt.Dimension(100, 37));
        lblTrabajadores.setRequestFocusEnabled(false);
        lblTrabajadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTrabajadoresMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTrabajadores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblTitulo.setFont(new java.awt.Font("SF UI Display", 1, 26)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(24, 28, 50));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Agregar Nuevos Trabajadores");
        lblTitulo.setMaximumSize(new java.awt.Dimension(210, 28));
        lblTitulo.setMinimumSize(new java.awt.Dimension(210, 28));
        lblTitulo.setPreferredSize(new java.awt.Dimension(210, 28));

        lblNombre.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(24, 28, 50));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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

        lblDireccion.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(24, 28, 50));
        lblDireccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        lblCelular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        btn.setMaximumSize(new java.awt.Dimension(100, 42));
        btn.setMinimumSize(new java.awt.Dimension(100, 42));
        btn.setPreferredSize(new java.awt.Dimension(100, 42));

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(93, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(lblCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblTrabajadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTrabajadoresMouseClicked
        Trabajadores Trabajadores = new Trabajadores();
            
        Trabajadores.setSize(new Dimension(970, 620));
        Trabajadores.setLocation(0,0);
        Principal.PanelPrincipal.removeAll();
        Principal.PanelPrincipal.add(Trabajadores,BorderLayout.CENTER);
        Principal.PanelPrincipal.revalidate();
        Principal.PanelPrincipal.repaint();
    }//GEN-LAST:event_lblTrabajadoresMouseClicked

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') &&(c<'A' || c>'Z') && c != ' ')
        evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

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
        agregarTrabajador();
    }//GEN-LAST:event_btnGuardarMouseClicked

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTrabajadores;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
