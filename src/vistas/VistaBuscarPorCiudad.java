package vistas;

import entidades.Contacto;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

public class VistaBuscarPorCiudad extends javax.swing.JInternalFrame {
    
    private static VistaBuscarPorCiudad buscarPorCiudad;
    private DefaultTableModel modeloTabla = new DefaultTableModel();
    
    public VistaBuscarPorCiudad() {
        initComponents();
        armarTabla();
    }
    
    public static VistaBuscarPorCiudad getBuscarPorCiudad() {
        if (buscarPorCiudad == null) {
            buscarPorCiudad = new VistaBuscarPorCiudad();
        }
        return buscarPorCiudad;
    }
    
    private void cargarCiudades() {
        cmbCiudades.removeAllItems();
        if (!MenuPrincipal.ciudades.isEmpty()) {
            for (String aux : MenuPrincipal.ciudades) {
                cmbCiudades.addItem(aux);
            }
        }
    }
    
    private void armarTabla() {
        String[] tituloTabla = {"DNI", "Apellido", "Nombre", "Ciudad", "Direccion", "Teléfono"};
        
        modeloTabla = new DefaultTableModel(null, tituloTabla);
        
        tblResultados.setModel(modeloTabla);
    }
    
    @Override
    public void setVisible(boolean aFlag) {
        super.setVisible(aFlag);
        if (aFlag) {
            cargarCiudades();
            cmbCiudades.setSelectedIndex(-1);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        separatorTitulo = new javax.swing.JSeparator();
        pnlDatos = new javax.swing.JPanel();
        lblCiudades = new javax.swing.JLabel();
        scpResultado = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();
        cmbCiudades = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(this::btnCerrarActionPerformed);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("Buscar Clientes por Ciudad");

        lblCiudades.setText("Ciudades");

        tblResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblResultados.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        scpResultado.setViewportView(tblResultados);

        cmbCiudades.addItemListener(this::cmbCiudadesItemStateChanged);

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(lblCiudades)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(scpResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scpResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCiudades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnCerrar)
                .addGap(14, 582, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(separatorTitulo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrar)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.setVisible(false); 
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void cmbCiudadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCiudadesItemStateChanged
        modeloTabla.setRowCount(0);
        
        if (cmbCiudades.getSelectedItem() == null) {
            return;
        }
        
        String ciudad = (String) cmbCiudades.getSelectedItem();
        List<Contacto> listaContactos = new ArrayList<>();
        listaContactos.addAll(MenuPrincipal.directorio.buscarContactos(ciudad));
        
        for (Contacto aux : listaContactos) {
            Long telefono = null;
            
            for (Map.Entry<Long, Contacto> entry : MenuPrincipal.directorio.getContactos().entrySet()) {
                if (entry.getValue().equals(aux)) {
                    telefono = entry.getKey();
                    break;
                }
            }
            modeloTabla.addRow(new Object[]{aux.getDni(), aux.getApellido(), aux.getNombre(), aux.getCiudad(), aux.getDireccion(), telefono});
        }
    }//GEN-LAST:event_cmbCiudadesItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JComboBox<String> cmbCiudades;
    private javax.swing.JLabel lblCiudades;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JScrollPane scpResultado;
    private javax.swing.JSeparator separatorTitulo;
    private javax.swing.JTable tblResultados;
    // End of variables declaration//GEN-END:variables
}
