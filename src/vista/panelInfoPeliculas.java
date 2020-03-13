package vista;

import control.DAOGestionPelicula;
import control.Pelicula;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class panelInfoPeliculas extends javax.swing.JFrame {
    
    public panelInfoPeliculas() {
        initComponents();
    }
    
    public panelInfoPeliculas(String nombrePelicula, String ruta) throws SQLException {
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

        jLabel1 = new javax.swing.JLabel();
        panelContenedorInfoPel = new javax.swing.JPanel();
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
        contDirector = new javax.swing.JLabel();
        contGenero = new javax.swing.JLabel();
        contIdioma = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        lblSalir = new javax.swing.JLabel();
        btnComparBoleta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaSinopsis = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane(contReparto,jScrollPane2.VERTICAL_SCROLLBAR_NEVER, jScrollPane2.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        contReparto = new javax.swing.JTextArea();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelContenedorInfoPel.setBackground(new java.awt.Color(255, 255, 255));
        panelContenedorInfoPel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panelContenedorInfoPel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIdioma.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblIdioma.setForeground(new java.awt.Color(238, 112, 82));
        lblIdioma.setText("Idioma Original:");
        panelContenedorInfoPel.add(lblIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        lblTituloPel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblTituloPel.setForeground(new java.awt.Color(238, 112, 82));
        lblTituloPel.setText("Título Original:");
        panelContenedorInfoPel.add(lblTituloPel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        lblFechaEstreno.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblFechaEstreno.setForeground(new java.awt.Color(238, 112, 82));
        lblFechaEstreno.setText("Fecha de estreno:");
        panelContenedorInfoPel.add(lblFechaEstreno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        lblClasificacion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblClasificacion.setForeground(new java.awt.Color(238, 112, 82));
        lblClasificacion.setText("Clasificación:");
        panelContenedorInfoPel.add(lblClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        lblSinopsis.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblSinopsis.setForeground(new java.awt.Color(238, 112, 82));
        lblSinopsis.setText("Sinopsis:");
        panelContenedorInfoPel.add(lblSinopsis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        lblPaisOrigen.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblPaisOrigen.setForeground(new java.awt.Color(238, 112, 82));
        lblPaisOrigen.setText("Pais Origen:");
        panelContenedorInfoPel.add(lblPaisOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        lblDuracion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblDuracion.setForeground(new java.awt.Color(238, 112, 82));
        lblDuracion.setText("Duración:");
        panelContenedorInfoPel.add(lblDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        lblReparto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblReparto.setForeground(new java.awt.Color(238, 112, 82));
        lblReparto.setText("Reparto:");
        panelContenedorInfoPel.add(lblReparto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        lblDirector.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblDirector.setForeground(new java.awt.Color(238, 112, 82));
        lblDirector.setText("Director:");
        panelContenedorInfoPel.add(lblDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        lblGenero.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(238, 112, 82));
        lblGenero.setText("Género:");
        panelContenedorInfoPel.add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        contTitulo.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contTitulo.setText("**********************************");
        panelContenedorInfoPel.add(contTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 250, -1));

        contFechaEstreno.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contFechaEstreno.setText("**********************************");
        panelContenedorInfoPel.add(contFechaEstreno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 230, 20));

        contClasificacion.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contClasificacion.setText("**********************************");
        panelContenedorInfoPel.add(contClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 250, 20));

        contPaisOrigen.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contPaisOrigen.setText("**********************************");
        panelContenedorInfoPel.add(contPaisOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 250, 20));

        contDuracion.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contDuracion.setText("**********************************");
        panelContenedorInfoPel.add(contDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 280, 20));

        contDirector.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contDirector.setText("**********************************");
        panelContenedorInfoPel.add(contDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 290, 20));

        contGenero.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contGenero.setText("**********************************");
        panelContenedorInfoPel.add(contGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 300, 20));

        contIdioma.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contIdioma.setText("**********************************");
        panelContenedorInfoPel.add(contIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 270, 20));

        lblImagen.setLabelFor(lblImagen);
        lblImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panelContenedorInfoPel.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 100, 130));

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
        panelContenedorInfoPel.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, 20));

        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Multiply_32px.png"))); // NOI18N
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });
        panelContenedorInfoPel.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 30, 20));

        btnComparBoleta.setBackground(new java.awt.Color(153, 153, 153));
        btnComparBoleta.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnComparBoleta.setText("Comprar Boletas");
        btnComparBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparBoletaActionPerformed(evt);
            }
        });
        panelContenedorInfoPel.add(btnComparBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, -1, 20));

        areaSinopsis.setColumns(20);
        areaSinopsis.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        areaSinopsis.setRows(5);
        areaSinopsis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane1.setViewportView(areaSinopsis);

        panelContenedorInfoPel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 390, 150));

        contReparto.setColumns(20);
        contReparto.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contReparto.setRows(5);
        contReparto.setBorder(null);
        jScrollPane2.setViewportView(contReparto);

        panelContenedorInfoPel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 370, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedorInfoPel, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedorInfoPel, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(JFrame.ICONIFIED);//Función que permite minimizar la pantalla
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        super.dispose();
    }//GEN-LAST:event_lblSalirMouseClicked

    private void btnComparBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComparBoletaActionPerformed

    }//GEN-LAST:event_btnComparBoletaActionPerformed

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
    private javax.swing.JTextArea areaSinopsis;
    private javax.swing.JButton btnComparBoleta;
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
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel panelContenedorInfoPel;
    // End of variables declaration//GEN-END:variables
}
