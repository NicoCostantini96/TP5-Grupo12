package vistas;

import entidades.Directorio;

public class MenuPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenuPrincipal.class.getName());
    
    static private Directorio directorio;
    static private String ciudades;
    
    public MenuPrincipal() {
        initComponents();
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
        ClientesMenu.add(BorrarClienteMenuItem);

        MenuBarNavigator.add(ClientesMenu);

        DirectorioMenu.setText("Directorio");

        ClientesPorCiudadMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        ClientesPorCiudadMenuItem.setText("Buscar clientes por ciudad");
        DirectorioMenu.add(ClientesPorCiudadMenuItem);

        ClientesPorApellidoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        ClientesPorApellidoMenuItem.setText("Buscar clientes por apellido");
        DirectorioMenu.add(ClientesPorApellidoMenuItem);

        MenuBarNavigator.add(DirectorioMenu);

        CiudadesMenu.setText("Ciudades");

        AgregarCiudadMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        AgregarCiudadMenuItem.setText("Agregar ciudad");
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
        dtpEscritorio.removeAll();
        dtpEscritorio.repaint();
        VistaAgregarCliente agregarCliente  = new VistaAgregarCliente();
        agregarCliente.setVisible(true);
        dtpEscritorio.add(agregarCliente);
        dtpEscritorio.moveToFront(agregarCliente);
    }//GEN-LAST:event_AgregarClienteMenuItemActionPerformed

    private void SalirMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirMenuItemActionPerformed
        int opcion = javax.swing.JOptionPane.showConfirmDialog(this, "¿Está seguro que desea salir?", "Confirmación de salida", javax.swing.JOptionPane.YES_NO_OPTION);

        if (opcion == javax.swing.JOptionPane.YES_OPTION) {
            System.exit(0);
        }
        
    }//GEN-LAST:event_SalirMenuItemActionPerformed

    private void BuscarClienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarClienteMenuItemActionPerformed
        dtpEscritorio.removeAll();
        dtpEscritorio.repaint();
        VistaBuscarCliente buscarCliente  = new VistaBuscarCliente();
        buscarCliente.setVisible(true);
        dtpEscritorio.add(buscarCliente);
        dtpEscritorio.moveToFront(buscarCliente);
    }//GEN-LAST:event_BuscarClienteMenuItemActionPerformed

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
