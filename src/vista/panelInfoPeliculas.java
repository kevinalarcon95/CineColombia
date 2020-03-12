package vista;

public class panelInfoPeliculas extends javax.swing.JFrame {

    public panelInfoPeliculas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenedorInfoPel = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        lblIdioma = new javax.swing.JLabel();
        lblTituloPel = new javax.swing.JLabel();
        lblFechaEstreno = new javax.swing.JLabel();
        lblClasificacion = new javax.swing.JLabel();
        lblSinopsis = new javax.swing.JLabel();
        lblPaisOrigen = new javax.swing.JLabel();
        lblDuracion = new javax.swing.JLabel();
        lblReparto = new javax.swing.JLabel();
        lblDirector = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        contTitulo = new javax.swing.JLabel();
        contFechaEstreno = new javax.swing.JLabel();
        contClasificacion = new javax.swing.JLabel();
        contPaisOrigen = new javax.swing.JLabel();
        contDuracion = new javax.swing.JLabel();
        contReparto = new javax.swing.JLabel();
        contDirector = new javax.swing.JLabel();
        contenidoGenero = new javax.swing.JLabel();
        contSinopsis = new javax.swing.JLabel();
        contIdioma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelContenedorInfoPel.setBackground(new java.awt.Color(255, 255, 255));
        panelContenedorInfoPel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/angeldemivida-6-marzo-2020.jpg"))); // NOI18N
        lblImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblImagen.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblImagenMouseMoved(evt);
            }
        });
        lblImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblImagenMouseExited(evt);
            }
        });
        panelContenedorInfoPel.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        lblIdioma.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblIdioma.setForeground(new java.awt.Color(238, 112, 82));
        lblIdioma.setText("Idioma Original:");
        panelContenedorInfoPel.add(lblIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        lblTituloPel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblTituloPel.setForeground(new java.awt.Color(238, 112, 82));
        lblTituloPel.setText("Título Original:");
        panelContenedorInfoPel.add(lblTituloPel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        lblFechaEstreno.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblFechaEstreno.setForeground(new java.awt.Color(238, 112, 82));
        lblFechaEstreno.setText("Fecha de estreno:");
        panelContenedorInfoPel.add(lblFechaEstreno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        lblClasificacion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblClasificacion.setForeground(new java.awt.Color(238, 112, 82));
        lblClasificacion.setText("Clasificación:");
        panelContenedorInfoPel.add(lblClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        lblSinopsis.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblSinopsis.setForeground(new java.awt.Color(238, 112, 82));
        lblSinopsis.setText("Sinopsis:");
        panelContenedorInfoPel.add(lblSinopsis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        lblPaisOrigen.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblPaisOrigen.setForeground(new java.awt.Color(238, 112, 82));
        lblPaisOrigen.setText("Pais Origen:");
        panelContenedorInfoPel.add(lblPaisOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        lblDuracion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblDuracion.setForeground(new java.awt.Color(238, 112, 82));
        lblDuracion.setText("Duración:");
        panelContenedorInfoPel.add(lblDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        lblReparto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblReparto.setForeground(new java.awt.Color(238, 112, 82));
        lblReparto.setText("Reparto:");
        panelContenedorInfoPel.add(lblReparto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        lblDirector.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblDirector.setForeground(new java.awt.Color(238, 112, 82));
        lblDirector.setText("Director:");
        panelContenedorInfoPel.add(lblDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        lblGenero.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(238, 112, 82));
        lblGenero.setText("Género:");
        panelContenedorInfoPel.add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        contTitulo.setText("**********************************");
        panelContenedorInfoPel.add(contTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 210, -1));

        contFechaEstreno.setText("**********************************");
        panelContenedorInfoPel.add(contFechaEstreno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 54, 210, 20));

        contClasificacion.setText("**********************************");
        panelContenedorInfoPel.add(contClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 210, 20));

        contPaisOrigen.setText("**********************************");
        panelContenedorInfoPel.add(contPaisOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 210, 20));

        contDuracion.setText("**********************************");
        panelContenedorInfoPel.add(contDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 210, 20));

        contReparto.setText("**********************************");
        panelContenedorInfoPel.add(contReparto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 210, 20));

        contDirector.setText("**********************************");
        panelContenedorInfoPel.add(contDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 210, 20));

        contenidoGenero.setText("**********************************");
        panelContenedorInfoPel.add(contenidoGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 210, 20));

        contSinopsis.setText("**********************************");
        panelContenedorInfoPel.add(contSinopsis, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 340, 120));

        contIdioma.setText("**********************************");
        panelContenedorInfoPel.add(contIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 210, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedorInfoPel, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedorInfoPel, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblImagenMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagenMouseMoved
        lblImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_lblImagenMouseMoved

    private void lblImagenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagenMouseExited
        lblImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lblImagenMouseExited

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(panelInfoPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panelInfoPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panelInfoPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panelInfoPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panelInfoPeliculas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contClasificacion;
    private javax.swing.JLabel contDirector;
    private javax.swing.JLabel contDuracion;
    private javax.swing.JLabel contFechaEstreno;
    private javax.swing.JLabel contIdioma;
    private javax.swing.JLabel contPaisOrigen;
    private javax.swing.JLabel contReparto;
    private javax.swing.JLabel contSinopsis;
    private javax.swing.JLabel contTitulo;
    private javax.swing.JLabel contenidoGenero;
    private javax.swing.JLabel lblClasificacion;
    private javax.swing.JLabel lblDirector;
    private javax.swing.JLabel lblDuracion;
    private javax.swing.JLabel lblFechaEstreno;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblIdioma;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblPaisOrigen;
    private javax.swing.JLabel lblReparto;
    private javax.swing.JLabel lblSinopsis;
    private javax.swing.JLabel lblTituloPel;
    private javax.swing.JPanel panelContenedorInfoPel;
    // End of variables declaration//GEN-END:variables
}
