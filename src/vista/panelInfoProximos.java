
package vista;

import control.DAOGestionPelicula;
import control.Pelicula;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class panelInfoProximos extends javax.swing.JFrame {
    
    public panelInfoProximos(){
        initComponents();
    }
    public panelInfoProximos(String nombrePelicula, String ruta) throws SQLException {
        this.setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        infoPel(nombrePelicula);
        lblImagen.setIcon(new ImageIcon(ruta));
    }
    
    public void infoPel(String nomPelicula) throws SQLException{
        DAOGestionPelicula daoPel = new DAOGestionPelicula();
        Pelicula pel = new Pelicula();
        String infoPel = daoPel.infoPelicula(nomPelicula);
        pel = daoPel.splitInfo(infoPel);
        
       contTitulo.setText(pel.getTituloPelicula());
       contFechaEstreno.setText(pel.getFechaEstreno());
       contClasificacion.setText(pel.getClasificación());
       contPaisOrigen.setText(pel.getPaisOrigen());
       contDuracion.setText(pel.getDuracion());
       contReparto.setText(pel.getReparto());
       contReparto.setLineWrap(true);
       jScrollPane2.setBorder(null);
       contDirector.setText(pel.getDirector());
       contGenero.setText(pel.getGenero());
       contIdioma.setText(pel.getIdioma());
       areaSinopsis.setText(pel.getSinopsis());
       areaSinopsis.setLineWrap(true);
       jScrollPane1.setBorder(null);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTituloPel = new javax.swing.JLabel();
        contTitulo = new javax.swing.JLabel();
        lblFechaEstreno = new javax.swing.JLabel();
        contFechaEstreno = new javax.swing.JLabel();
        lblClasificacion = new javax.swing.JLabel();
        contClasificacion = new javax.swing.JLabel();
        lblPaisOrigen = new javax.swing.JLabel();
        contPaisOrigen = new javax.swing.JLabel();
        lblDuracion = new javax.swing.JLabel();
        contDuracion = new javax.swing.JLabel();
        lblReparto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane(contReparto,jScrollPane2.VERTICAL_SCROLLBAR_NEVER, jScrollPane2.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        contReparto = new javax.swing.JTextArea();
        lblDirector = new javax.swing.JLabel();
        contDirector = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        contGenero = new javax.swing.JLabel();
        lblIdioma = new javax.swing.JLabel();
        contIdioma = new javax.swing.JLabel();
        lblSinopsis = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaSinopsis = new javax.swing.JTextArea();
        lblImagen = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        lblSalir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloPel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblTituloPel.setForeground(new java.awt.Color(238, 112, 82));
        lblTituloPel.setText("Título Original:");
        jPanel1.add(lblTituloPel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        contTitulo.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contTitulo.setText("**********************************");
        jPanel1.add(contTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 270, -1));

        lblFechaEstreno.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblFechaEstreno.setForeground(new java.awt.Color(238, 112, 82));
        lblFechaEstreno.setText("Fecha de estreno:");
        jPanel1.add(lblFechaEstreno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        contFechaEstreno.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contFechaEstreno.setText("**********************************");
        jPanel1.add(contFechaEstreno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 250, 20));

        lblClasificacion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblClasificacion.setForeground(new java.awt.Color(238, 112, 82));
        lblClasificacion.setText("Clasificación:");
        jPanel1.add(lblClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        contClasificacion.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contClasificacion.setText("**********************************");
        jPanel1.add(contClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 270, 20));

        lblPaisOrigen.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblPaisOrigen.setForeground(new java.awt.Color(238, 112, 82));
        lblPaisOrigen.setText("Pais Origen:");
        jPanel1.add(lblPaisOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        contPaisOrigen.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contPaisOrigen.setText("**********************************");
        jPanel1.add(contPaisOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 280, 20));

        lblDuracion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblDuracion.setForeground(new java.awt.Color(238, 112, 82));
        lblDuracion.setText("Duración:");
        jPanel1.add(lblDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        contDuracion.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contDuracion.setText("**********************************");
        jPanel1.add(contDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 300, 20));

        lblReparto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblReparto.setForeground(new java.awt.Color(238, 112, 82));
        lblReparto.setText("Reparto:");
        jPanel1.add(lblReparto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        contReparto.setColumns(20);
        contReparto.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contReparto.setRows(5);
        contReparto.setBorder(null);
        jScrollPane2.setViewportView(contReparto);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 320, 30));

        lblDirector.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblDirector.setForeground(new java.awt.Color(238, 112, 82));
        lblDirector.setText("Director:");
        jPanel1.add(lblDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        contDirector.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contDirector.setText("**********************************");
        jPanel1.add(contDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 290, 20));

        lblGenero.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(238, 112, 82));
        lblGenero.setText("Género:");
        jPanel1.add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        contGenero.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contGenero.setText("**********************************");
        jPanel1.add(contGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 300, 20));

        lblIdioma.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblIdioma.setForeground(new java.awt.Color(238, 112, 82));
        lblIdioma.setText("Idioma Original:");
        jPanel1.add(lblIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        contIdioma.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contIdioma.setText("**********************************");
        jPanel1.add(contIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 270, 20));

        lblSinopsis.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblSinopsis.setForeground(new java.awt.Color(238, 112, 82));
        lblSinopsis.setText("Sinopsis:");
        jPanel1.add(lblSinopsis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        areaSinopsis.setColumns(20);
        areaSinopsis.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        areaSinopsis.setRows(5);
        areaSinopsis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane1.setViewportView(areaSinopsis);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 400, 120));

        lblImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 100, 130));

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
        jPanel1.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, 20));

        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Multiply_32px.png"))); // NOI18N
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });
        jPanel1.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 30, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(JFrame.ICONIFIED);//Función que permite minimizar la pantalla
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        super.dispose();
    }//GEN-LAST:event_lblSalirMouseClicked

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
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(panelInfoProximos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(panelInfoProximos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(panelInfoProximos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(panelInfoProximos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new panelInfoProximos().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaSinopsis;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JLabel contClasificacion;
    private javax.swing.JLabel contDirector;
    private javax.swing.JLabel contDuracion;
    private javax.swing.JLabel contFechaEstreno;
    private javax.swing.JLabel contGenero;
    private javax.swing.JLabel contIdioma;
    private javax.swing.JLabel contPaisOrigen;
    private javax.swing.JTextArea contReparto;
    private javax.swing.JLabel contTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblClasificacion;
    private javax.swing.JLabel lblDirector;
    private javax.swing.JLabel lblDuracion;
    private javax.swing.JLabel lblFechaEstreno;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblIdioma;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblPaisOrigen;
    private javax.swing.JLabel lblReparto;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblSinopsis;
    private javax.swing.JLabel lblTituloPel;
    // End of variables declaration//GEN-END:variables
}
