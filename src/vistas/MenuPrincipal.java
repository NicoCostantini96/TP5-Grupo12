package vistas;

import entidades.Contacto;
import entidades.Directorio;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenuPrincipal.class.getName());
    
    static Directorio directorio = new Directorio();;
    static Set<String> ciudades = new HashSet<>() ;
    
    public MenuPrincipal() {
        initComponents();
        cargarDatosPrueba();
    }
    
    private void cargarDatosPrueba() { // Méramente para probar rápido
        Contacto c1 = new Contacto(35123456, "Pérez", "Juan", "Córdoba", "Av. San Martín 123");
        Contacto c2 = new Contacto(37890123, "Gómez", "María", "Rosario", "Belgrano 456");
        Contacto c3 = new Contacto(32109876, "Rodríguez", "Ana", "La Plata", "Sarmiento 321");
        Contacto c4 = new Contacto(36954287, "López", "Carlos", "Mendoza", "Mitre 789");
        Contacto c5 = new Contacto(42964273, "Fernández", "Luis", "Mar del Plata", "Rivadavia 654");
        Contacto c6 = new Contacto(31122334, "Martínez", "Sofía", "Salta", "San Lorenzo 987");
        Contacto c7 = new Contacto(35544332, "García", "Pedro", "Córdoba", "España 159");
        Contacto c8 = new Contacto(36677889, "Álvarez", "Lucía", "Corrientes", "Ituzaingó 753");
        Contacto c9 = new Contacto(33344556, "Romero", "Jorge", "San Juan", "Colon 852");
        Contacto c10 = new Contacto(38899001, "Sosa", "Valeria", "Paraná", "Urquiza 951");

        directorio.agregarContacto(1112345678L, c1);
        directorio.agregarContacto(1123456789L, c2);
        directorio.agregarContacto(1134567890L, c3);
        directorio.agregarContacto(1145678901L, c4);
        directorio.agregarContacto(1156789012L, c5);
        directorio.agregarContacto(1167890123L, c6);
        directorio.agregarContacto(1178901234L, c7);
        directorio.agregarContacto(1189012345L, c8);
        directorio.agregarContacto(1190123456L, c9);
        directorio.agregarContacto(1101234567L, c10);
        
        for (Contacto aux : directorio.getContactos().values()) {
            ciudades.add(aux.getCiudad());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dtpEscritorio = new javax.swing.JDesktopPane();
        MenuBarNavigator = new javax.swing.JMenuBar();
        ClientesMenu = new javax.swing.JMenu();
        AgregarClienteMenuItem = new javax.swing.JMenuItem();
        BuscarClienteMenuItem = new javax.swing.JMenuItem();
        BorrarClienteMenuItem = new javax.swing.JMenuItem();
        DirectorioMenu = new javax.swing.JMenu();
        ClientesPorCiudadMenuItem = new javax.swing.JMenuItem();
        ClientesPorApellidoMenuItem = new javax.swing.JMenuItem();
        CiudadesMenu = new javax.swing.JMenu();
        AgregarCiudadMenuItem = new javax.swing.JMenuItem();
        SalirMenu = new javax.swing.JMenu();
        SalirMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Directorio telefónico");
        setResizable(false);

        javax.swing.GroupLayout dtpEscritorioLayout = new javax.swing.GroupLayout(dtpEscritorio);
        dtpEscritorio.setLayout(dtpEscritorioLayout);
        dtpEscritorioLayout.setHorizontalGroup(
            dtpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        dtpEscritorioLayout.setVerticalGroup(
            dtpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        ClientesMenu.setText("Clientes");

        AgregarClienteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        AgregarClienteMenuItem.setText("Agregar cliente");
        AgregarClienteMenuItem.addActionListener(this::AgregarClienteMenuItemActionPerformed);
        ClientesMenu.add(AgregarClienteMenuItem);

        BuscarClienteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        BuscarClienteMenuItem.setText("Buscar cliente");
        BuscarClienteMenuItem.addActionListener(this::BuscarClienteMenuItemActionPerformed);
        ClientesMenu.add(BuscarClienteMenuItem);

        BorrarClienteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        BorrarClienteMenuItem.setText("Borrar cliente");
        BorrarClienteMenuItem.addActionListener(this::BorrarClienteMenuItemActionPerformed);
        ClientesMenu.add(BorrarClienteMenuItem);

        MenuBarNavigator.add(ClientesMenu);

        DirectorioMenu.setText("Directorio");

        ClientesPorCiudadMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        ClientesPorCiudadMenuItem.setText("Buscar clientes por ciudad");
        ClientesPorCiudadMenuItem.addActionListener(this::ClientesPorCiudadMenuItemActionPerformed);
        DirectorioMenu.add(ClientesPorCiudadMenuItem);

        ClientesPorApellidoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        ClientesPorApellidoMenuItem.setText("Buscar clientes por apellido");
        ClientesPorApellidoMenuItem.addActionListener(this::ClientesPorApellidoMenuItemActionPerformed);
        DirectorioMenu.add(ClientesPorApellidoMenuItem);

        MenuBarNavigator.add(DirectorioMenu);

        CiudadesMenu.setText("Ciudades");

        AgregarCiudadMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        AgregarCiudadMenuItem.setText("Agregar ciudad");
        AgregarCiudadMenuItem.addActionListener(this::AgregarCiudadMenuItemActionPerformed);
        CiudadesMenu.add(AgregarCiudadMenuItem);

        MenuBarNavigator.add(CiudadesMenu);

        SalirMenu.setText("Salir");

        SalirMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        SalirMenuItem.setText("Salir");
        SalirMenuItem.addActionListener(this::SalirMenuItemActionPerformed);
        SalirMenu.add(SalirMenuItem);

        MenuBarNavigator.add(SalirMenu);

        setJMenuBar(MenuBarNavigator);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dtpEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dtpEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarClienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarClienteMenuItemActionPerformed
        VistaAgregarCliente agregarCliente = VistaAgregarCliente.getAgregarCliente();
    
        if (agregarCliente.getParent() == null) {
            dtpEscritorio.add(agregarCliente);
        }

        agregarCliente.setVisible(true);
        dtpEscritorio.moveToFront(agregarCliente);

        try {
            agregarCliente.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {}
    }//GEN-LAST:event_AgregarClienteMenuItemActionPerformed

    private void SalirMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirMenuItemActionPerformed
        int opcion = javax.swing.JOptionPane.showConfirmDialog(this, "¿Está seguro que desea salir?", "Confirmación de salida", javax.swing.JOptionPane.YES_NO_OPTION);

        if (opcion == javax.swing.JOptionPane.YES_OPTION) {
            System.exit(0);
        }
        
    }//GEN-LAST:event_SalirMenuItemActionPerformed

    private void BuscarClienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarClienteMenuItemActionPerformed
        VistaBuscarCliente buscarCliente = VistaBuscarCliente.getBuscarCliente();
    
        if (buscarCliente.getParent() == null) {
            dtpEscritorio.add(buscarCliente);
        }

        buscarCliente.setVisible(true);
        dtpEscritorio.moveToFront(buscarCliente);

        try {
            buscarCliente.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {}
    }//GEN-LAST:event_BuscarClienteMenuItemActionPerformed

    private void BorrarClienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarClienteMenuItemActionPerformed
        VistaBorrarCliente borrarCliente = VistaBorrarCliente.getBorrarCliente();
    
        if (borrarCliente.getParent() == null) {
            dtpEscritorio.add(borrarCliente);
        }

        borrarCliente.setVisible(true);
        dtpEscritorio.moveToFront(borrarCliente);

        try {
            borrarCliente.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {}
    }//GEN-LAST:event_BorrarClienteMenuItemActionPerformed

    private void AgregarCiudadMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarCiudadMenuItemActionPerformed
        VistaAgregarCiudad agregarCiudad = VistaAgregarCiudad.getAgregarCiudad();
    
        if (agregarCiudad.getParent() == null) {
            dtpEscritorio.add(agregarCiudad);
        }

        agregarCiudad.setVisible(true);
        dtpEscritorio.moveToFront(agregarCiudad);

        try {
            agregarCiudad.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {}
    }//GEN-LAST:event_AgregarCiudadMenuItemActionPerformed

    private void ClientesPorCiudadMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesPorCiudadMenuItemActionPerformed
        VistaBuscarPorCiudad buscarPorCiudad = VistaBuscarPorCiudad.getBuscarPorCiudad();
    
        if (buscarPorCiudad.getParent() == null) {
            dtpEscritorio.add(buscarPorCiudad);
        }

        buscarPorCiudad.setVisible(true);
        dtpEscritorio.moveToFront(buscarPorCiudad);

        try {
            buscarPorCiudad.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {}
    }//GEN-LAST:event_ClientesPorCiudadMenuItemActionPerformed

    private void ClientesPorApellidoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesPorApellidoMenuItemActionPerformed
        VistaBuscarPorApellido buscarApellido = VistaBuscarPorApellido.getBuscarApellido();
    
        if (buscarApellido.getParent() == null) {
            dtpEscritorio.add(buscarApellido);
        }

        buscarApellido.setVisible(true);
        dtpEscritorio.moveToFront(buscarApellido);

        try {
            buscarApellido.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {}
    }//GEN-LAST:event_ClientesPorApellidoMenuItemActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(() -> new MenuPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgregarCiudadMenuItem;
    private javax.swing.JMenuItem AgregarClienteMenuItem;
    private javax.swing.JMenuItem BorrarClienteMenuItem;
    private javax.swing.JMenuItem BuscarClienteMenuItem;
    private javax.swing.JMenu CiudadesMenu;
    private javax.swing.JMenu ClientesMenu;
    private javax.swing.JMenuItem ClientesPorApellidoMenuItem;
    private javax.swing.JMenuItem ClientesPorCiudadMenuItem;
    private javax.swing.JMenu DirectorioMenu;
    private javax.swing.JMenuBar MenuBarNavigator;
    private javax.swing.JMenu SalirMenu;
    private javax.swing.JMenuItem SalirMenuItem;
    private javax.swing.JDesktopPane dtpEscritorio;
    // End of variables declaration//GEN-END:variables
}
