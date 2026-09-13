package vistas;

import entidades.Contacto;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

public class VistaBuscarPorApellido extends javax.swing.JInternalFrame {
    
    private static VistaBuscarPorApellido buscarApellido;
    private DefaultTableModel modeloTabla = new DefaultTableModel();
    private DefaultListModel<String> modeloLista = new DefaultListModel<>();
    
    public VistaBuscarPorApellido() {
        initComponents();
        armarTabla();
        lstBusqueda.setModel(modeloLista);
        llenarListaApellido();
    }
    
    
    public static VistaBuscarPorApellido getBuscarApellido() {
        if (buscarApellido == null) {
            buscarApellido = new VistaBuscarPorApellido();
        }
        return buscarApellido;
    }
    
    
    private void llenarListaApellido() {
        modeloLista.clear();
        Map<Long, Contacto> mapa = MenuPrincipal.directorio.getContactos();

        for (Map.Entry<Long, Contacto> aux : mapa.entrySet()) {
            Contacto contacto = aux.getValue();
            modeloLista.addElement(contacto.getApellido());
        }
    }
    
    private void armarTabla() {
        String[] tituloTabla = {"DNI", "Apellido", "Nombre", "Ciudad", "Direccion", "Teléfono"};
        
        modeloTabla = new DefaultTableModel(null, tituloTabla);
        
        tblResultados.setModel(modeloTabla);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        separatorTitulo = new javax.swing.JSeparator();
        pnlDatos = new javax.swing.JPanel();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        scpBusqueda = new javax.swing.JScrollPane();
        lstBusqueda = new javax.swing.JList<>();
        scpResultado = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(this::btnCerrarActionPerformed);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("Buscar Cliente por Apellido");

        lblApellido.setText("Apellido");

        txtApellido.setEditable(false);
        txtApellido.setFocusable(false);

        scpBusqueda.setToolTipText("");
        scpBusqueda.setHorizontalScrollBar(null);

        lstBusqueda.addListSelectionListener(this::lstBusquedaValueChanged);
        scpBusqueda.setViewportView(lstBusqueda);

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

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblApellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scpBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scpResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scpResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(scpBusqueda))
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

    private void lstBusquedaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstBusquedaValueChanged
        if (!evt.getValueIsAdjusting()) {
            String seleccion = lstBusqueda.getSelectedValue();
            
            if (seleccion != null) {
                txtApellido.setText(seleccion);
                modeloTabla.setRowCount(0);
                
                Set<Long> listaTelefonos = new TreeSet<>();
                listaTelefonos.addAll(MenuPrincipal.directorio.buscarTelefono(seleccion));
                Map<Long, Contacto> mapa = MenuPrincipal.directorio.getContactos();
                
                for (Map.Entry<Long, Contacto> aux : mapa.entrySet()) {
                    Contacto contactoMapa = aux.getValue();
                    Long telefonoMapa = aux.getKey();

                    for (Long telefonos : listaTelefonos) { // Que rebuscadoooo

                        if (telefonos.equals(telefonoMapa)) {
                            modeloTabla.addRow(new Object[]{
                                contactoMapa.getDni(),
                                contactoMapa.getApellido(),
                                contactoMapa.getNombre(),
                                contactoMapa.getCiudad(),
                                contactoMapa.getDireccion(),
                                contactoMapa});
                        }
                    }
                }
            } else {
                txtApellido.setText("");
                modeloTabla.setRowCount(0);
            }
        }
    }//GEN-LAST:event_lstBusquedaValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstBusqueda;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JScrollPane scpBusqueda;
    private javax.swing.JScrollPane scpResultado;
    private javax.swing.JSeparator separatorTitulo;
    private javax.swing.JTable tblResultados;
    private javax.swing.JTextField txtApellido;
    // End of variables declaration//GEN-END:variables
}
