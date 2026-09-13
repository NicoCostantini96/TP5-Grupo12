package vistas;

import entidades.Contacto;
import java.util.Map;
import javax.swing.DefaultListModel;

public class VistaBuscarCliente extends javax.swing.JInternalFrame {
    
    private static VistaBuscarCliente buscarCliente;
    DefaultListModel<Long> modeloLista = new DefaultListModel<>();
    
    public VistaBuscarCliente() {
        initComponents();
        lstResultados.setModel(modeloLista);
    }
    
    public static VistaBuscarCliente getBuscarCliente() {
        if (buscarCliente == null) {
             buscarCliente = new VistaBuscarCliente();
        }
        return buscarCliente;
    }
    
    private void llenarListaTelefonos() {
        modeloLista.clear();
        
        if (MenuPrincipal.directorio != null) {
            for (Map.Entry<Long, Contacto> aux : MenuPrincipal.directorio.getContactos().entrySet()) {
                modeloLista.addElement(aux.getKey());
            }
        }
    }
    
    @Override
    public void setVisible(boolean aFlag) {
        super.setVisible(aFlag);
        if (aFlag) {
            llenarListaTelefonos();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        pnlBusqueda = new javax.swing.JPanel();
        lblTelefono = new javax.swing.JLabel();
        separatorMedio = new javax.swing.JSeparator();
        scpResultados = new javax.swing.JScrollPane();
        lstResultados = new javax.swing.JList<>();
        txtTelefono = new javax.swing.JTextField();
        lblDni = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        lblDomicilio = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("Búsqueda de clientes");

        lblTelefono.setText("Teléfono:");

        separatorMedio.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separatorMedio.setToolTipText("");

        lstResultados.addListSelectionListener(this::lstResultadosValueChanged);
        scpResultados.setViewportView(lstResultados);

        txtTelefono.setEditable(false);

        lblDni.setText("DNI:");

        lblApellido.setText("Apellido:");

        lblNombre.setText("Nombre:");

        lblCiudad.setText("Ciudad:");

        lblDomicilio.setText("Domicilio:");

        txtDni.setEditable(false);
        txtDni.setFocusable(false);

        txtApellido.setEditable(false);
        txtApellido.setFocusable(false);

        txtNombre.setEditable(false);
        txtNombre.setFocusable(false);

        txtCiudad.setEditable(false);
        txtCiudad.setFocusable(false);

        txtDomicilio.setEditable(false);
        txtDomicilio.setFocusable(false);

        javax.swing.GroupLayout pnlBusquedaLayout = new javax.swing.GroupLayout(pnlBusqueda);
        pnlBusqueda.setLayout(pnlBusquedaLayout);
        pnlBusquedaLayout.setHorizontalGroup(
            pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scpResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separatorMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDomicilio)
                    .addComponent(lblDni, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCiudad, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDni)
                    .addComponent(txtApellido)
                    .addComponent(txtNombre)
                    .addComponent(txtCiudad)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pnlBusquedaLayout.setVerticalGroup(
            pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(separatorMedio)
                    .addGroup(pnlBusquedaLayout.createSequentialGroup()
                        .addGroup(pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scpResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBusquedaLayout.createSequentialGroup()
                        .addGroup(pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDni)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellido)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCiudad)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDomicilio)
                            .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(this::btnCerrarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCerrar)
                    .addComponent(pnlBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.setVisible(false); 
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void lstResultadosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstResultadosValueChanged
        if (lstResultados.getModel().getSize() == 0 || evt.getValueIsAdjusting() || lstResultados.getSelectedValue() == null) {
            return;
        }
        
        txtDni.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtCiudad.setText("");
        txtDomicilio.setText("");
        txtTelefono.setText("");
        
        Long telefono = lstResultados.getSelectedValue();
        Contacto contacto = MenuPrincipal.directorio.buscarContacto(telefono);

        txtDni.setText(String.valueOf(contacto.getDni()));
        txtNombre.setText(contacto.getNombre());
        txtApellido.setText(contacto.getApellido());
        txtCiudad.setText(contacto.getCiudad());
        txtDomicilio.setText(contacto.getDireccion());
        txtTelefono.setText(String.valueOf(telefono));
    }//GEN-LAST:event_lstResultadosValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<Long> lstResultados;
    private javax.swing.JPanel pnlBusqueda;
    private javax.swing.JScrollPane scpResultados;
    private javax.swing.JSeparator separatorMedio;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
