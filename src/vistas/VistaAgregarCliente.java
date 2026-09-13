package vistas;

import entidades.Contacto;
import javax.swing.JOptionPane;

public class VistaAgregarCliente extends javax.swing.JInternalFrame {
    
    private static VistaAgregarCliente agregarCliente;
    
    public VistaAgregarCliente() {
        initComponents();
    }
    
    public static VistaAgregarCliente getAgregarCliente() {
        if (agregarCliente == null) {
             agregarCliente = new VistaAgregarCliente();
        }
        return agregarCliente;
    }
    
    private void cargarCiudades() {
        cmbCiudad.removeAllItems();
        if (!MenuPrincipal.ciudades.isEmpty()) {
            for (String aux : MenuPrincipal.ciudades) {
                cmbCiudad.addItem(aux);
            }
        }
    }
    
    @Override
    public void setVisible(boolean aFlag) {
        super.setVisible(aFlag);
        if (aFlag) {
            cargarCiudades();
            cmbCiudad.setSelectedIndex(-1);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTelefonoCliente = new javax.swing.JPanel();
        lblTelefonoAgregarCliente = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jblTitulo = new javax.swing.JLabel();
        pnlDatosCliente = new javax.swing.JPanel();
        lblDni = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        lblDomicilio = new javax.swing.JLabel();
        cmbCiudad = new javax.swing.JComboBox<>();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        setPreferredSize(new java.awt.Dimension(431, 477));

        pnlTelefonoCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.gray));

        lblTelefonoAgregarCliente.setText("Teléfono:");

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlTelefonoClienteLayout = new javax.swing.GroupLayout(pnlTelefonoCliente);
        pnlTelefonoCliente.setLayout(pnlTelefonoClienteLayout);
        pnlTelefonoClienteLayout.setHorizontalGroup(
            pnlTelefonoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelefonoClienteLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTelefonoAgregarCliente)
                .addGap(62, 62, 62)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTelefonoClienteLayout.setVerticalGroup(
            pnlTelefonoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelefonoClienteLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(pnlTelefonoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefonoAgregarCliente)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jblTitulo.setText("Agregar cliente");

        pnlDatosCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.gray));

        lblDni.setText("DNI:");

        lblNombre.setText("Nombre:");

        lblApellido.setText("Apellido:");

        lblCiudad.setText("Ciudad:");

        lblDomicilio.setText("Domicilio:");

        cmbCiudad.setToolTipText("Si no aparece tu ciudad, puedes agregar una desde el Menú Principal -> Agregar Ciudad");

        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosClienteLayout = new javax.swing.GroupLayout(pnlDatosCliente);
        pnlDatosCliente.setLayout(pnlDatosClienteLayout);
        pnlDatosClienteLayout.setHorizontalGroup(
            pnlDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosClienteLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCiudad)
                    .addComponent(lblDni)
                    .addComponent(lblNombre)
                    .addComponent(lblApellido)
                    .addComponent(lblDomicilio))
                .addGap(57, 57, 57)
                .addGroup(pnlDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addComponent(txtApellido)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlDatosClienteLayout.setVerticalGroup(
            pnlDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosClienteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDni)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad)
                    .addComponent(cmbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDomicilio)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(this::btnCerrarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jblTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnlDatosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTelefonoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnCerrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addGap(5, 5, 5)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCerrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtDni.getText().isEmpty() || txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtDomicilio.getText().isEmpty() || cmbCiudad.getSelectedIndex() == -1 || txtTelefono.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Carga todos los datos primero.");
            return;
        }
        
        int dni = 0;
        long telefono = 0;
        
        try {
            
            dni = Integer.parseInt(txtDni.getText());
            telefono = Long.parseLong(txtTelefono.getText());
            
        } catch (NumberFormatException numberFormat) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error. Dni y teléfono solo acepta números.", "Error de datos", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Contacto contacto = new Contacto(dni, txtApellido.getText(), txtNombre.getText(),(String)cmbCiudad.getSelectedItem(), txtDomicilio.getText());
        
        if (MenuPrincipal.directorio.agregarContacto(telefono, contacto)) {
            javax.swing.JOptionPane.showMessageDialog(this, "El contacto se agregó correctamente al directorio.");
            txtDni.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtDomicilio.setText("");
            txtTelefono.setText("");
            cmbCiudad.setSelectedIndex(-1);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Error. El contacto ya existía en el directorio.");
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.setVisible(false); 
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        char c = evt.getKeyChar();
        
        if (!Character.isDigit(c) && c != java.awt.event.KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();
        
        if (!Character.isDigit(c) && c != java.awt.event.KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        
        if (Character.isDigit(c) && c != java.awt.event.KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char c = evt.getKeyChar();
        
        if (Character.isDigit(c) && c != java.awt.event.KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbCiudad;
    private javax.swing.JLabel jblTitulo;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefonoAgregarCliente;
    private javax.swing.JPanel pnlDatosCliente;
    private javax.swing.JPanel pnlTelefonoCliente;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
