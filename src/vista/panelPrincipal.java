/*
    Creado por:
        Kevin Alarcón
        Nathalia Ruiz
        Luis Romero
        Juan Camilo Gonzalez
 */
package vista;

import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import AppPackage.AnimationClass;
import control.DAOGestionUsuario;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.net.URI;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class panelPrincipal extends javax.swing.JFrame {

    public panelPrincipal(String cadena) throws SQLException {
        DAOGestionUsuario dao = new DAOGestionUsuario();
        String nombreC = dao.generarNombreCompleto(cadena);//Consulta
        initComponents();
        setLocationRelativeTo(null);
        lblFecha.setText(fecha());
        lblNombrePerfil.setText(nombreC);
        panelCartelera panelCartelera = new panelCartelera();
        panelCartelera.setSize(480, 440);
        panelCartelera.setLocation(5, 5);

        contenedor.removeAll();
        contenedor.add(panelCartelera, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }

// <editor-fold defaultstate="collapsed" desc="Metodo que permite extraer la fecha del sistema">
    public static String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="Metodo que permite ingresar a internet">
    public void OpenPagina() {
        try {
            Desktop.getDesktop().browse(URI.create("www.google.com"));
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay conexión a internet \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }
// </editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelOpciones = new javax.swing.JPanel();
        btnComprarBoletas = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        btnProximos = new javax.swing.JLabel();
        btnTarjetaCliente = new javax.swing.JLabel();
        btnCartelera = new javax.swing.JLabel();
        btnPreventa = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblNombrePerfil = new javax.swing.JLabel();
        lblIconousuario = new javax.swing.JLabel();
        btnTwitter = new javax.swing.JButton();
        btnFacebook = new javax.swing.JButton();
        btnContacto = new javax.swing.JButton();
        panelContenedor = new javax.swing.JPanel();
        contenedor = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JButton();
        lblSalir = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelOpciones.setBackground(new java.awt.Color(255, 255, 255));
        panelOpciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        panelOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnComprarBoletas.setBackground(new java.awt.Color(238, 112, 82));
        btnComprarBoletas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnComprarBoletas.setForeground(new java.awt.Color(238, 112, 82));
        btnComprarBoletas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/iconoComida.JPG"))); // NOI18N
        btnComprarBoletas.setText("Comidas");
        btnComprarBoletas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprarBoletas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprarBoletasMouseClicked(evt);
            }
        });
        panelOpciones.add(btnComprarBoletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 140, 40));

        lblFecha.setBackground(new java.awt.Color(238, 112, 82));
        lblFecha.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(238, 112, 82));
        lblFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Calendario.JPG"))); // NOI18N
        lblFecha.setText("DD/MM/YYYY");
        panelOpciones.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 120, 30));

        btnProximos.setBackground(new java.awt.Color(238, 112, 82));
        btnProximos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnProximos.setForeground(new java.awt.Color(238, 112, 82));
        btnProximos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Proximos.JPG"))); // NOI18N
        btnProximos.setText("Proximos Estrenos");
        btnProximos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProximos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProximosMouseClicked(evt);
            }
        });
        panelOpciones.add(btnProximos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 170, 30));

        btnTarjetaCliente.setBackground(new java.awt.Color(238, 112, 82));
        btnTarjetaCliente.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnTarjetaCliente.setForeground(new java.awt.Color(238, 112, 82));
        btnTarjetaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tarjeta.JPG"))); // NOI18N
        btnTarjetaCliente.setText("Tarjeta Cliente");
        btnTarjetaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTarjetaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTarjetaClienteMouseClicked(evt);
            }
        });
        panelOpciones.add(btnTarjetaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 130, 30));

        btnCartelera.setBackground(new java.awt.Color(238, 112, 82));
        btnCartelera.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnCartelera.setForeground(new java.awt.Color(238, 112, 82));
        btnCartelera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Cartelera.JPG"))); // NOI18N
        btnCartelera.setText("En Cartelera");
        btnCartelera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCartelera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCarteleraMouseClicked(evt);
            }
        });
        panelOpciones.add(btnCartelera, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 120, 40));

        btnPreventa.setBackground(new java.awt.Color(238, 112, 82));
        btnPreventa.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnPreventa.setForeground(new java.awt.Color(238, 112, 82));
        btnPreventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Preventa.JPG"))); // NOI18N
        btnPreventa.setText("Preventa");
        btnPreventa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPreventa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPreventaMouseClicked(evt);
            }
        });
        panelOpciones.add(btnPreventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 100, 30));

        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Menu_32px.png"))); // NOI18N
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });
        panelOpciones.add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblNombrePerfil.setBackground(new java.awt.Color(238, 112, 82));
        lblNombrePerfil.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombrePerfil.setForeground(new java.awt.Color(238, 112, 82));
        lblNombrePerfil.setText("Nombre Usuario");
        panelOpciones.add(lblNombrePerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        lblIconousuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_User_96px_2.png"))); // NOI18N
        panelOpciones.add(lblIconousuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        btnTwitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Twitter.JPG"))); // NOI18N
        btnTwitter.setBorder(null);
        btnTwitter.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TwitterOff.JPG"))); // NOI18N
        btnTwitter.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TwitterOff.JPG"))); // NOI18N
        btnTwitter.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TwitterOff.JPG"))); // NOI18N
        btnTwitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTwitterMouseClicked(evt);
            }
        });
        panelOpciones.add(btnTwitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 140, -1, -1));

        btnFacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/facebook.JPG"))); // NOI18N
        btnFacebook.setBorder(null);
        btnFacebook.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Facebook OFF.JPG"))); // NOI18N
        btnFacebook.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Facebook OFF.JPG"))); // NOI18N
        btnFacebook.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Facebook OFF.JPG"))); // NOI18N
        btnFacebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFacebookMouseClicked(evt);
            }
        });
        panelOpciones.add(btnFacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 100, -1, -1));

        btnContacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Contacto.JPG"))); // NOI18N
        btnContacto.setBorder(null);
        btnContacto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Contacto OFF.JPG"))); // NOI18N
        btnContacto.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Contacto OFF.JPG"))); // NOI18N
        btnContacto.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Contacto OFF.JPG"))); // NOI18N
        btnContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnContactoMouseClicked(evt);
            }
        });
        panelOpciones.add(btnContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 60, -1, -1));

        getContentPane().add(panelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 550));

        panelContenedor.setBackground(new java.awt.Color(255, 255, 255));
        panelContenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panelContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedor.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelContenedor.add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 480, 450));

        btnMinimizar.setBackground(new java.awt.Color(238, 112, 82));
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        btnMinimizar.setBorder(null);
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.setDefaultCapable(false);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        panelContenedor.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, 20));

        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Multiply_32px.png"))); // NOI18N
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });
        panelContenedor.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 30, 20));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logoCineCo.JPG"))); // NOI18N
        panelContenedor.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        getContentPane().add(panelContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 500, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(JFrame.ICONIFIED);//Función que permite minimizar la pantalla
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        AnimationClass contacto = new AnimationClass();
        contacto.jButtonXRight(-40, 10, 10, 5, btnContacto);

        AnimationClass facebook = new AnimationClass();
        facebook.jButtonXRight(-40, 10, 10, 5, btnFacebook);

        AnimationClass twitter = new AnimationClass();
        twitter.jButtonXRight(-40, 10, 10, 5, btnTwitter);

        //<---
        AnimationClass contactoo = new AnimationClass();
        contactoo.jButtonXLeft(10, -40, 10, 5, btnContacto);

        AnimationClass facebookk = new AnimationClass();
        facebookk.jButtonXLeft(10, -40, 10, 5, btnFacebook);

        AnimationClass twitterr = new AnimationClass();
        twitterr.jButtonXLeft(10, -40, 10, 5, btnTwitter);
    }//GEN-LAST:event_lblMenuMouseClicked

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, " Desea salir?", "Salir", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_lblSalirMouseClicked

    private void btnCarteleraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarteleraMouseClicked
        panelCartelera panelCartelera = new panelCartelera();
        panelCartelera.setSize(480, 440);
        panelCartelera.setLocation(5, 5);

        contenedor.removeAll();
        contenedor.add(panelCartelera, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_btnCarteleraMouseClicked

    private void btnPreventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPreventaMouseClicked
        panelPreventa panelPreventa = new panelPreventa();
        panelPreventa.setSize(480, 440);
        panelPreventa.setLocation(5, 5);

        contenedor.removeAll();
        contenedor.add(panelPreventa, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_btnPreventaMouseClicked

    private void btnProximosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProximosMouseClicked
        panelProximosEstrenos panelProximosEstrenos = new panelProximosEstrenos();
        panelProximosEstrenos.setSize(480, 440);
        panelProximosEstrenos.setLocation(5, 5);

        contenedor.removeAll();
        contenedor.add(panelProximosEstrenos, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_btnProximosMouseClicked

    private void btnComprarBoletasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarBoletasMouseClicked
        panelInfoComidas panelComprarBoleta = new panelInfoComidas();
        panelComprarBoleta.setSize(480, 440);
        panelComprarBoleta.setLocation(5, 5);

        contenedor.removeAll();
        contenedor.add(panelComprarBoleta, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_btnComprarBoletasMouseClicked

    private void btnTarjetaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTarjetaClienteMouseClicked
        panelTarjeta panelTarjeta = new panelTarjeta();
        panelTarjeta.setSize(480, 440);
        panelTarjeta.setLocation(5, 5);

        contenedor.removeAll();
        contenedor.add(panelTarjeta, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_btnTarjetaClienteMouseClicked

    private void btnTwitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTwitterMouseClicked
        OpenPagina();
    }//GEN-LAST:event_btnTwitterMouseClicked

    private void btnFacebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacebookMouseClicked
        OpenPagina();
    }//GEN-LAST:event_btnFacebookMouseClicked

    private void btnContactoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContactoMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, " Para más información dirijase a www.CineColombia.com\n", "INFORMACIÓN!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnContactoMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(panelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(panelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(panelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(panelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
////        java.awt.EventQueue.invokeLater(new Runnable() {
////            public void run() {
////                try {
////                    new panelPrincipal().setVisible(true);
////                } catch (SQLException ex) {
////                    Logger.getLogger(panelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
////                }
////            }
////        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCartelera;
    private javax.swing.JLabel btnComprarBoletas;
    private javax.swing.JButton btnContacto;
    private javax.swing.JButton btnFacebook;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JLabel btnPreventa;
    private javax.swing.JLabel btnProximos;
    private javax.swing.JLabel btnTarjetaCliente;
    private javax.swing.JButton btnTwitter;
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblIconousuario;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblNombrePerfil;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel panelOpciones;
    // End of variables declaration//GEN-END:variables
}
