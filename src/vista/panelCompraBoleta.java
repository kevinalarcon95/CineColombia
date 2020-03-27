package vista;

import control.CompraBoleta;
import control.DAOGestionFuncion;
import control.DAOGestionBoleta;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

public class panelCompraBoleta extends javax.swing.JFrame {

    public panelCompraBoleta() {
        initComponents();
    }
    public panelCompraBoleta(String nomPelicula, String ruta,String horaFuncion,String efectoPel,String clasi, String dura, String sip, String fechaPel) throws SQLException{
        this.setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        lblImagen.setIcon(new ImageIcon(ruta));
        contTituloPelicula.setText(nomPelicula);
        contFechaFuncion.setText(fechaPel);
        contHoraFuncion.setText(horaFuncion);
        contEfectoPelicula.setText(efectoPel);
        contDuracion.setText(dura);
        contClasificacion.setText(clasi);
        areaSinopsis.setText(sip);
        areaSinopsis.setLineWrap(true);
        jScrollPane1.setBorder(null);
        contSalaFuncion.setText(salaFuncion(nomPelicula));
        botones();
        buscarSillasReservadas();
    }
    
    public String salaFuncion(String nomPelicula) throws SQLException{
        DAOGestionFuncion daoFun = new DAOGestionFuncion();
        
        return daoFun.salaFuncion(nomPelicula);
    }
    
    public long totalPagar(int cant){
        return 3500*cant;
    }
    
    public void valorTotal(int total){
        contValorTotal.setText("$ " + totalPagar(total));
    }
    
    int filas = 4;
    int columnas = 6;
    int ejeX = 30;
    int ejeY = 60;
    int largo = 75;
    int ancho = 23;
    
    public JToggleButton [][] jtBotones = new JToggleButton[filas][columnas];
    
    public void botones(){
        Font fuenteLetra = new Font("Dialog",Font.BOLD,11);
        
        int cont = 1;
        jtBotones = new JToggleButton[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                jtBotones[i][j] = new JToggleButton();
                jtBotones[i][j].setBounds(ejeX, ejeY, largo, ancho);
                jtBotones[i][j].setText("Silla " + cont);
                jtBotones[i][j].setFont(fuenteLetra);
                jtBotones[i][j].setBackground(new Color(31, 222, 101));
                AccionBotones accion = new AccionBotones();
                jtBotones[i][j].addActionListener(accion);
                contSillas.add(jtBotones[i][j]);
                
                cont++;
                ejeX += 95;
            }
            ejeX = 30;
            ejeY += 33;
        }
    }
    
    public void reservarSilla(int numSilla){
        try {
            DAOGestionFuncion daoFun = new DAOGestionFuncion();
            boolean estadoReserva = daoFun.reservarSilla(numSilla);
            if(estadoReserva == true){
                javax.swing.JOptionPane.showMessageDialog(this, "Silla reservada", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un problema con la aplicacion\n Comuniquese con el administrador", "AVISO!", javax.swing.JOptionPane.ERROR);
        }
    }
    
    public void quitarReservarSilla(int numSilla){
        try {
            DAOGestionFuncion daoFun = new DAOGestionFuncion();
            boolean estadoReserva = daoFun.quitarReservarSilla(numSilla);
            if(estadoReserva == true){
                javax.swing.JOptionPane.showMessageDialog(this, "Se ha quitado la reservacion para esta silla!", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un problema con la aplicacion\n Comuniquese con el administrador", "AVISO!", javax.swing.JOptionPane.ERROR);
        }
    }
    
    public void buscarSillasReservadas(){
        try {
            DAOGestionFuncion daoFun = new DAOGestionFuncion();
            ArrayList<String> sillasSala = new ArrayList<String>();
            ArrayList<Integer> numSillas = new ArrayList<Integer>();
            ArrayList<Integer> estadosSilla = new ArrayList<Integer>();
            int cont = 0;
            sillasSala = daoFun.sillasSala(contSalaFuncion.getText());
            
            for (String silla : sillasSala) {
              String[] numSilla = silla.split(",");
              numSillas.add(Integer.parseInt(numSilla[0]));
              estadosSilla.add(Integer.parseInt(numSilla[1]));
            }
            
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if(jtBotones[i][j].getText().length() == 7){
                        String numeroLetra = jtBotones[i][j].getText().charAt(6) + "";
                        int numero = Integer.parseInt(numeroLetra);
                        if(numSillas.get(cont) == numero){
                            jtBotones[i][j].setBackground(Color.RED);
                            jtBotones[i][j].setSelected(true);
                        }
                    }
                }
                cont++;
            }
            
            
        } catch (Exception e) {
        }
    }
    
    public class AccionBotones implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if(e.getSource().equals(jtBotones[i][j])){
                        if(jtBotones[i][j].isSelected()){
                            
                            jtBotones[i][j].setBackground(Color.red);
                            
                            if(jtBotones[i][j].getText().length() == 7 ){
                               String numeroLetra = jtBotones[i][j].getText().charAt(6) + "";
                               int numero = Integer.parseInt(numeroLetra);
                                reservarSilla(numero);
                            }else if(jtBotones[i][j].getText().length() == 8){
                                String numeroLetra = jtBotones[i][j].getText().charAt(6) + "" + jtBotones[i][j].getText().charAt(7);
                               int numero = Integer.parseInt(numeroLetra);
                               reservarSilla(numero);
                            }
                        }else{
                            
                            jtBotones[i][j].setBackground(new Color(31, 222, 101));
                            
                            if(jtBotones[i][j].getText().length() == 7 ){
                               String numeroLetra = jtBotones[i][j].getText().charAt(6) + "";
                               int numero = Integer.parseInt(numeroLetra);
                                quitarReservarSilla(numero);
                            }else if(jtBotones[i][j].getText().length() == 8){
                                String numeroLetra = jtBotones[i][j].getText().charAt(6) + "" + jtBotones[i][j].getText().charAt(7);
                               int numero = Integer.parseInt(numeroLetra);
                               quitarReservarSilla(numero);
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelCompraBoleta = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        lblSalir = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        contDuracion = new javax.swing.JLabel();
        contClasificacion = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        contSalaFuncion = new javax.swing.JLabel();
        contHoraFuncion = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        contEfectoPelicula = new javax.swing.JLabel();
        contTituloPelicula = new javax.swing.JLabel();
        contFechaFuncion = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        contValorTotal = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        contIdioma = new javax.swing.JLabel();
        cbxCantBoletas = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnPlatino = new javax.swing.JRadioButton();
        btnEfectivo = new javax.swing.JRadioButton();
        btnDebito = new javax.swing.JRadioButton();
        btnCineco = new javax.swing.JRadioButton();
        btnCredito = new javax.swing.JRadioButton();
        btnComprar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaSinopsis = new javax.swing.JTextArea();
        contSillas = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelCompraBoleta.setBackground(new java.awt.Color(255, 255, 255));
        panelCompraBoleta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        panelCompraBoleta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panelCompraBoleta.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 130));

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
        panelCompraBoleta.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, 20));

        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Multiply_32px.png"))); // NOI18N
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });
        panelCompraBoleta.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 30, 20));
        panelCompraBoleta.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 620, 10));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setText("Cine:");
        panelCompraBoleta.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        contDuracion.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        contDuracion.setText("110 Min");
        panelCompraBoleta.add(contDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        contClasificacion.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        contClasificacion.setText("RECOMENDADA PARA MAYORES DE 12 AÑOS");
        panelCompraBoleta.add(contClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, 10));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setText("Idioma:");
        panelCompraBoleta.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setText("Tu Seleccion:");
        panelCompraBoleta.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        contSalaFuncion.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        contSalaFuncion.setText("S2");
        panelCompraBoleta.add(contSalaFuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        contHoraFuncion.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        contHoraFuncion.setText("6:40 pm");
        panelCompraBoleta.add(contHoraFuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel8.setText("Función:");
        panelCompraBoleta.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel9.setText("Cine Colombia Popayán - Terra Plaza");
        panelCompraBoleta.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        contEfectoPelicula.setText("***");
        panelCompraBoleta.add(contEfectoPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        contTituloPelicula.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        contTituloPelicula.setText("ARTEMIS FOWL: EL MUNDO SUBTERRÁNEO");
        panelCompraBoleta.add(contTituloPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        contFechaFuncion.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        contFechaFuncion.setText("12/03/2020");
        panelCompraBoleta.add(contFechaFuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel13.setText("Total: ");
        panelCompraBoleta.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel14.setText("Boletos:");
        panelCompraBoleta.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel15.setText("Efecto:");
        panelCompraBoleta.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        contValorTotal.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        contValorTotal.setText("$ 3500");
        panelCompraBoleta.add(contValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel17.setText("Sala:");
        panelCompraBoleta.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel18.setText("Pelicula:");
        panelCompraBoleta.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel19.setText("Fecha:");
        panelCompraBoleta.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        contIdioma.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        contIdioma.setText("Español Latino");
        panelCompraBoleta.add(contIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        cbxCantBoletas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        cbxCantBoletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCantBoletasActionPerformed(evt);
            }
        });
        panelCompraBoleta.add(cbxCantBoletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 40, 20));

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel21.setText("IVA incluido");
        panelCompraBoleta.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel22.setText("Seleccione Metodo de Pago:");
        panelCompraBoleta.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        btnPlatino.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btnPlatino);
        btnPlatino.setText("Tarjeta Platino");
        panelCompraBoleta.add(btnPlatino, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, -1));

        btnEfectivo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btnEfectivo);
        btnEfectivo.setText("Efectivo");
        panelCompraBoleta.add(btnEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        btnDebito.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btnDebito);
        btnDebito.setText("Tarjeta Debito");
        panelCompraBoleta.add(btnDebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, -1, -1));

        btnCineco.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btnCineco);
        btnCineco.setText("Tarjeta CineCo");
        panelCompraBoleta.add(btnCineco, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        btnCredito.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btnCredito);
        btnCredito.setText("Tarjeta Credito");
        panelCompraBoleta.add(btnCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

        btnComprar.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        panelCompraBoleta.add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 640, -1, -1));

        areaSinopsis.setColumns(20);
        areaSinopsis.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        areaSinopsis.setRows(5);
        areaSinopsis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane1.setViewportView(areaSinopsis);

        panelCompraBoleta.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 470, 80));

        contSillas.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel24.setText("A");

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel25.setText("B");

        jLabel26.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel26.setText("C");

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel23.setText("D");

        jPanel3.setBackground(new java.awt.Color(31, 222, 101));
        jPanel3.setForeground(new java.awt.Color(0, 204, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jLabel3.setText("Silla Disponible");

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jLabel6.setText("Silla Ocupada");

        javax.swing.GroupLayout contSillasLayout = new javax.swing.GroupLayout(contSillas);
        contSillas.setLayout(contSillasLayout);
        contSillasLayout.setHorizontalGroup(
            contSillasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contSillasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contSillasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contSillasLayout.createSequentialGroup()
                        .addGroup(contSillasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(560, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contSillasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addGap(15, 15, 15)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addContainerGap())))
        );
        contSillasLayout.setVerticalGroup(
            contSillasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contSillasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contSillasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        panelCompraBoleta.add(contSillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 580, 200));

        jButton2.setText("Pantalla");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 153)));
        panelCompraBoleta.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 630, 160, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCompraBoleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCompraBoleta, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(JFrame.ICONIFIED);//Función que permite minimizar la pantalla
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        super.dispose();
    }//GEN-LAST:event_lblSalirMouseClicked

    private void cbxCantBoletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCantBoletasActionPerformed
        int cant = Integer.parseInt(cbxCantBoletas.getSelectedItem().toString());
        valorTotal(cant);
    }//GEN-LAST:event_cbxCantBoletasActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
//        CompraBoleta compraBoleta;
//        DAOGestionBoleta daoBoleta = new DAOGestionBoleta();
//        
//        compraBoleta = new CompraBoleta(contDuracion.getText(),contClasificacion.getText(),contSalaFuncion.getText(), contTituloPelicula.getText(),contFechaFuncion.getText(),contHoraFuncion.getText(),contIdioma.getText(),contEfectoPelicula.getText(),Integer.parseInt(cbxCantBoletas.getSelectedItem().toString()),contValorTotal.getText(), "medio", "1");
          javax.swing.JOptionPane.showMessageDialog(this, "Se ha realizado la compra satisfactoriamente!", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnComprarActionPerformed

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
//            java.util.logging.Logger.getLogger(panelCompraBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(panelCompraBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(panelCompraBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(panelCompraBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new panelCompraBoleta().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaSinopsis;
    private javax.swing.JRadioButton btnCineco;
    private javax.swing.JButton btnComprar;
    private javax.swing.JRadioButton btnCredito;
    private javax.swing.JRadioButton btnDebito;
    private javax.swing.JRadioButton btnEfectivo;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JRadioButton btnPlatino;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxCantBoletas;
    private javax.swing.JLabel contClasificacion;
    private javax.swing.JLabel contDuracion;
    private javax.swing.JLabel contEfectoPelicula;
    private javax.swing.JLabel contFechaFuncion;
    private javax.swing.JLabel contHoraFuncion;
    private javax.swing.JLabel contIdioma;
    private javax.swing.JLabel contSalaFuncion;
    private javax.swing.JPanel contSillas;
    private javax.swing.JLabel contTituloPelicula;
    private javax.swing.JLabel contValorTotal;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPanel panelCompraBoleta;
    // End of variables declaration//GEN-END:variables
}
