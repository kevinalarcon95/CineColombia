package vista;

import control.DAOGestionFuncion;
import control.DAOGestionPelicula;
import control.Funcion;
import control.Pelicula;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class panelInfoPeliculas extends javax.swing.JFrame {
    
    private String nomPelicula;
    private String ruta;
    private String clasificacion;
    private String duracionPelicula;
    private String sipnosis;
    private String fechaPel;
    
    public panelInfoPeliculas() throws ParseException {
        initComponents();
    }
    
    public panelInfoPeliculas(String nombrePelicula, String ruta) throws SQLException, ParseException {
       
        this.setUndecorated(true);
        initComponents();
        ((JTextField) this.DateFecha.getDateEditor()).setEditable(false); 
        setLocationRelativeTo(null);
        this.setResizable(false);
        infoPel(nombrePelicula);
        lblImagen.setIcon(new ImageIcon(ruta));
        String fechaPel = fechaPelicula(nombrePelicula);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dateF1 = formatter.parse(fechaPel);
        this.DateFecha.setSelectableDateRange(dateF1, dateF1);
        
        horasFuncion(nombrePelicula);
        validarEfecto(nombrePelicula);
        
        this.nomPelicula = nombrePelicula;
        this.ruta = ruta;
        this.clasificacion = contClasificacion.getText();
        this.duracionPelicula = contDuracion.getText();
        this.sipnosis = areaSinopsis.getText();
        this.fechaPel = fechaPel;
        
    }

    public void validarEfecto(String nomPelicula) throws SQLException{
        Funcion fun = new Funcion();
        DAOGestionFuncion daoFun = new DAOGestionFuncion();
        String efecto = daoFun.efectoPelicula(nomPelicula);
        fun = daoFun.splitEfectos(efecto);
        String efecto3D = fun.getEfectos().get(1);
        if(efecto3D.equals("vacio")){
            btnEfecto3D.setEnabled(false);
        }
    }
    
    public void horasFuncion(String nomPelicula) throws SQLException {
        DAOGestionFuncion daoFun = new DAOGestionFuncion();
        Funcion fun = new Funcion();
        String horas = daoFun.horaFuncion(nomPelicula);
        fun = daoFun.splitHoras(horas);
        btnHoraFuncion1.setText(fun.getHoraFuncion1());   
        btnHoraFuncion2.setText(fun.getHoraFuncion2());
    }
    
    public String fechaPelicula(String nombrePelicula) throws SQLException{
        DAOGestionFuncion daoFun = new DAOGestionFuncion();
        String fechaPel = daoFun.fechaFuncion(nombrePelicula);
        return fechaPel;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        areaSinopsis = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane(contReparto,jScrollPane2.VERTICAL_SCROLLBAR_NEVER, jScrollPane2.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        contReparto = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        lblSelecDia = new javax.swing.JLabel();
        DateFecha = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        btnEfecto3D = new javax.swing.JRadioButton();
        btnHoraFuncion1 = new javax.swing.JRadioButton();
        btnHoraFuncion2 = new javax.swing.JRadioButton();
        btnEfecto2D = new javax.swing.JRadioButton();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelContenedorInfoPel.setBackground(new java.awt.Color(255, 255, 255));
        panelContenedorInfoPel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panelContenedorInfoPel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIdioma.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblIdioma.setForeground(new java.awt.Color(238, 112, 82));
        lblIdioma.setText("Idioma Original:");
        panelContenedorInfoPel.add(lblIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        lblTituloPel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblTituloPel.setForeground(new java.awt.Color(238, 112, 82));
        lblTituloPel.setText("Título Original:");
        panelContenedorInfoPel.add(lblTituloPel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        lblFechaEstreno.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblFechaEstreno.setForeground(new java.awt.Color(238, 112, 82));
        lblFechaEstreno.setText("Fecha de estreno:");
        panelContenedorInfoPel.add(lblFechaEstreno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        lblClasificacion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblClasificacion.setForeground(new java.awt.Color(238, 112, 82));
        lblClasificacion.setText("Clasificación:");
        panelContenedorInfoPel.add(lblClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        lblSinopsis.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblSinopsis.setForeground(new java.awt.Color(238, 112, 82));
        lblSinopsis.setText("Sinopsis:");
        panelContenedorInfoPel.add(lblSinopsis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        lblPaisOrigen.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblPaisOrigen.setForeground(new java.awt.Color(238, 112, 82));
        lblPaisOrigen.setText("Pais Origen:");
        panelContenedorInfoPel.add(lblPaisOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        lblDuracion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblDuracion.setForeground(new java.awt.Color(238, 112, 82));
        lblDuracion.setText("Duración:");
        panelContenedorInfoPel.add(lblDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        lblReparto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblReparto.setForeground(new java.awt.Color(238, 112, 82));
        lblReparto.setText("Reparto:");
        panelContenedorInfoPel.add(lblReparto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        lblDirector.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblDirector.setForeground(new java.awt.Color(238, 112, 82));
        lblDirector.setText("Director:");
        panelContenedorInfoPel.add(lblDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        lblGenero.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(238, 112, 82));
        lblGenero.setText("Género:");
        panelContenedorInfoPel.add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        contTitulo.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contTitulo.setText("**********************************");
        panelContenedorInfoPel.add(contTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 270, -1));

        contFechaEstreno.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contFechaEstreno.setText("**********************************");
        panelContenedorInfoPel.add(contFechaEstreno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 250, 20));

        contClasificacion.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contClasificacion.setText("**********************************");
        panelContenedorInfoPel.add(contClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 270, 20));

        contPaisOrigen.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contPaisOrigen.setText("**********************************");
        panelContenedorInfoPel.add(contPaisOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 280, 20));

        contDuracion.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contDuracion.setText("**********************************");
        panelContenedorInfoPel.add(contDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 300, 20));

        contDirector.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contDirector.setText("**********************************");
        panelContenedorInfoPel.add(contDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 290, 20));

        contGenero.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contGenero.setText("**********************************");
        panelContenedorInfoPel.add(contGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 300, 20));

        contIdioma.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contIdioma.setText("**********************************");
        panelContenedorInfoPel.add(contIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 270, 20));

        lblImagen.setLabelFor(lblImagen);
        lblImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panelContenedorInfoPel.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 100, 130));

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

        areaSinopsis.setColumns(20);
        areaSinopsis.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        areaSinopsis.setRows(5);
        areaSinopsis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane1.setViewportView(areaSinopsis);

        panelContenedorInfoPel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 400, 120));

        contReparto.setColumns(20);
        contReparto.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        contReparto.setRows(5);
        contReparto.setBorder(null);
        jScrollPane2.setViewportView(contReparto);

        panelContenedorInfoPel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 320, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSelecDia.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblSelecDia.setForeground(new java.awt.Color(153, 153, 153));
        lblSelecDia.setText("Seleccione un día:");
        jPanel2.add(lblSelecDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        DateFecha.setBackground(new java.awt.Color(238, 112, 82));
        DateFecha.setForeground(new java.awt.Color(238, 112, 82));
        jPanel2.add(DateFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 120, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 10, 50));

        btnEfecto3D.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(btnEfecto3D);
        btnEfecto3D.setText("3D");
        jPanel2.add(btnEfecto3D, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        btnHoraFuncion1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btnHoraFuncion1);
        jPanel2.add(btnHoraFuncion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        btnHoraFuncion2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btnHoraFuncion2);
        jPanel2.add(btnHoraFuncion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        btnEfecto2D.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(btnEfecto2D);
        btnEfecto2D.setText("2D");
        jPanel2.add(btnEfecto2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        panelContenedorInfoPel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 470, 100));

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        panelContenedorInfoPel.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedorInfoPel, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedorInfoPel, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(JFrame.ICONIFIED);//Función que permite minimizar la pantalla
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        super.dispose();
    }//GEN-LAST:event_lblSalirMouseClicked

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        
        if ((btnHoraFuncion1.isSelected() || btnHoraFuncion2.isSelected()) && (btnEfecto2D.isSelected() || btnEfecto3D.isSelected())) {
            if (btnHoraFuncion1.isSelected() && btnEfecto2D.isSelected()) {
                try {
                    buttonGroup1.clearSelection();
                    buttonGroup2.clearSelection();
                    new panelCompraBoleta(nomPelicula, ruta, btnHoraFuncion1.getText(), btnEfecto2D.getText(), clasificacion, duracionPelicula, sipnosis, fechaPel).setVisible(true);
                } catch (SQLException ex) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un problema con la aplicacion\n Comuniquese con el administrador", "AVISO!", javax.swing.JOptionPane.ERROR);
                }
            } else if (btnHoraFuncion1.isSelected() && btnEfecto3D.isSelected()) {
                try {
                    buttonGroup1.clearSelection();
                    buttonGroup2.clearSelection();
                    new panelCompraBoleta(nomPelicula, ruta, btnHoraFuncion1.getText(), btnEfecto3D.getText(), clasificacion, duracionPelicula, sipnosis, fechaPel).setVisible(true);
                } catch (SQLException ex) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un problema con la aplicacion\n Comuniquese con el administrador", "AVISO!", javax.swing.JOptionPane.ERROR);
                }
            } else if (btnHoraFuncion2.isSelected() && btnEfecto2D.isSelected()) {
                try {
                    buttonGroup1.clearSelection();
                    buttonGroup2.clearSelection();
                    new panelCompraBoleta(nomPelicula, ruta, btnHoraFuncion2.getText(), btnEfecto2D.getText(), clasificacion, duracionPelicula, sipnosis, fechaPel).setVisible(true);
                } catch (SQLException ex) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un problema con la aplicacion\n Comuniquese con el administrador", "AVISO!", javax.swing.JOptionPane.ERROR);
                }
            } else{
                try {
                    buttonGroup1.clearSelection();
                    buttonGroup2.clearSelection();
                    new panelCompraBoleta(nomPelicula, ruta, btnHoraFuncion2.getText(), btnEfecto3D.getText(), clasificacion, duracionPelicula, sipnosis, fechaPel).setVisible(true);
                } catch (SQLException ex) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un problema con la aplicacion\n Comuniquese con el administrador", "AVISO!", javax.swing.JOptionPane.ERROR);
                }
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Tiene que estar seleccionada una hora y un efecto \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

        
//        if (btnHoraFuncion1.isSelected() && !btnEfecto2D.isSelected()) {
//            btnHoraFuncion1.setSelected(false);
//            btnEfecto2D.setSelected(false);
//            javax.swing.JOptionPane.showMessageDialog(this, "Escoja un efecto de pelicula \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
//        }
//        else if (btnHoraFuncion1.isSelected() && btnEfecto2D.isSelected()) {
//            javax.swing.JOptionPane.showMessageDialog(this, "Entró \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
//            try {
//                btnHoraFuncion1.setSelected(false);
//                btnEfecto2D.setSelected(false);
//                new panelCompraBoleta(nomPelicula,ruta,btnHoraFuncion1.getText(),btnEfecto2D.getText(),clasificacion,duracionPelicula,sipnosis,fechaPel).setVisible(true);
//            } catch (SQLException ex) {
//                javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un problema con la aplicacion\n Comuniquese con el administrador", "AVISO!", javax.swing.JOptionPane.ERROR);
//            }//bien
//        }
//        else if (btnHoraFuncion1.isSelected() && !btnEfecto3D.isSelected()){
//            javax.swing.JOptionPane.showMessageDialog(this, "Escoja un efecto de pelicula \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
//            btnHoraFuncion1.setSelected(false);
//            btnEfecto3D.setSelected(false);
//        }
//        else {
//            javax.swing.JOptionPane.showMessageDialog(this, "Entró \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
//            try {
//                btnHoraFuncion1.setSelected(false);
//                btnEfecto3D.setSelected(false);
//                new panelCompraBoleta(nomPelicula,ruta,btnHoraFuncion1.getText(),btnEfecto3D.getText(),clasificacion,duracionPelicula,sipnosis,fechaPel).setVisible(true);
//                
//            } catch (SQLException ex) {
//                javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un problema con la aplicacion\n Comuniquese con el administrador", "AVISO!", javax.swing.JOptionPane.ERROR);
//            }
//        //hasta aqui validaciones btnHoraFuncion1 el boton 1
//        }
//        
//        if(btnHoraFuncion2.isSelected() && !btnEfecto2D.isSelected()) {
//            javax.swing.JOptionPane.showMessageDialog(this, "Escoja un efecto de pelicula \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
//        }
//        else if (btnHoraFuncion2.isSelected() && btnEfecto2D.isSelected()) {
//            javax.swing.JOptionPane.showMessageDialog(this, "Entró \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
//            try {
//                new panelCompraBoleta(nomPelicula,ruta,btnHoraFuncion2.getText(),btnEfecto2D.getText(),clasificacion,duracionPelicula,sipnosis,fechaPel).setVisible(true);
//            } catch (SQLException ex) {
//                javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un problema con la aplicacion\n Comuniquese con el administrador", "AVISO!", javax.swing.JOptionPane.ERROR);
//            }
//        }
//        if (btnHoraFuncion2.isSelected() && !btnEfecto3D.isSelected()){
//            javax.swing.JOptionPane.showMessageDialog(this, "Escoja un efecto de pelicula \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
//        }
//        else if(btnHoraFuncion2.isSelected() && btnEfecto3D.isSelected()){
//            javax.swing.JOptionPane.showMessageDialog(this, "Entró \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
//            try {
//                new panelCompraBoleta(nomPelicula,ruta,btnHoraFuncion2.getText(),btnEfecto3D.getText(),clasificacion,duracionPelicula,sipnosis,fechaPel).setVisible(true);
//            } catch (SQLException ex) {
//                javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un problema con la aplicacion\n Comuniquese con el administrador", "AVISO!", javax.swing.JOptionPane.ERROR);
//            }
//        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateFecha;
    private javax.swing.JTextArea areaSinopsis;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JRadioButton btnEfecto2D;
    private javax.swing.JRadioButton btnEfecto3D;
    private javax.swing.JRadioButton btnHoraFuncion1;
    private javax.swing.JRadioButton btnHoraFuncion2;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel contClasificacion;
    private javax.swing.JLabel contDirector;
    private javax.swing.JLabel contDuracion;
    private javax.swing.JLabel contFechaEstreno;
    private javax.swing.JLabel contGenero;
    private javax.swing.JLabel contIdioma;
    private javax.swing.JLabel contPaisOrigen;
    private javax.swing.JTextArea contReparto;
    private javax.swing.JLabel contTitulo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
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
    private javax.swing.JLabel lblSelecDia;
    private javax.swing.JLabel lblSinopsis;
    private javax.swing.JLabel lblTituloPel;
    private javax.swing.JPanel panelContenedorInfoPel;
    // End of variables declaration//GEN-END:variables
}
