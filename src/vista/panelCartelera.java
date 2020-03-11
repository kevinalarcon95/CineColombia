package vista;
public class panelCartelera extends javax.swing.JPanel {

    public panelCartelera() {
        initComponents();
        TextPrompt textBuscar = new TextPrompt("  Busque una película", txtBuscar);
        //jScrollPane2.setBorder(border);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnComparBoleta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnComparBoleta1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnComparBoleta2 = new javax.swing.JButton();
        btnComparBoleta3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnComparBoleta4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnComparBoleta5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnComparBoleta6 = new javax.swing.JButton();
        btnComparBoleta7 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnComparBoleta8 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnComparBoleta9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtBuscar = new javax.swing.JTextField();

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/El llamado salvaje.jpg"))); // NOI18N

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mjercias13nov2019.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/El hombre invisible.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/parasito.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/angeldemivida-6-marzo-2020.jpg"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1957.jpg"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Los caballeros.jpg"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/la hora de la muerte.jpeg"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/El llamado salvaje.jpg"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/unidos.jpeg"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sonic.jpeg"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        btnComparBoleta.setBackground(new java.awt.Color(153, 153, 153));
        btnComparBoleta.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnComparBoleta.setText("Comprar Boletas");
        btnComparBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparBoletaActionPerformed(evt);
            }
        });
        jPanel1.add(btnComparBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, 20));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel1.setText("ANGEL DE MI VIDA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 140, 100, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel3.setText("EL HOMBRE INVISIBLE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 100, 20));

        btnComparBoleta1.setBackground(new java.awt.Color(153, 153, 153));
        btnComparBoleta1.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnComparBoleta1.setText("Comprar Boletas");
        btnComparBoleta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparBoleta1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnComparBoleta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 100, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel4.setText("MUJERCITAS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 100, 20));

        btnComparBoleta2.setBackground(new java.awt.Color(153, 153, 153));
        btnComparBoleta2.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnComparBoleta2.setText("Comprar Boletas");
        btnComparBoleta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparBoleta2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnComparBoleta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 100, 20));

        btnComparBoleta3.setBackground(new java.awt.Color(153, 153, 153));
        btnComparBoleta3.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnComparBoleta3.setText("Comprar Boletas");
        btnComparBoleta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparBoleta3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnComparBoleta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 100, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel5.setText("PARÁSITO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 100, 20));

        btnComparBoleta4.setBackground(new java.awt.Color(153, 153, 153));
        btnComparBoleta4.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnComparBoleta4.setText("Comprar Boletas");
        btnComparBoleta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparBoleta4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnComparBoleta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 100, 20));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel6.setText("EL LLAMADO SALVAJE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 100, 20));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel7.setText("1917");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 100, 20));

        btnComparBoleta5.setBackground(new java.awt.Color(153, 153, 153));
        btnComparBoleta5.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnComparBoleta5.setText("Comprar Boletas");
        btnComparBoleta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparBoleta5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnComparBoleta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 100, 20));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel8.setText("LOS CABALLEROS");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 100, 20));

        btnComparBoleta6.setBackground(new java.awt.Color(153, 153, 153));
        btnComparBoleta6.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnComparBoleta6.setText("Comprar Boletas");
        btnComparBoleta6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparBoleta6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnComparBoleta6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 100, 20));

        btnComparBoleta7.setBackground(new java.awt.Color(153, 153, 153));
        btnComparBoleta7.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnComparBoleta7.setText("Comprar Boletas");
        btnComparBoleta7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparBoleta7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnComparBoleta7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 100, 20));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel9.setText("LA HORA DE TU MUERTE");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 100, 20));

        btnComparBoleta8.setBackground(new java.awt.Color(153, 153, 153));
        btnComparBoleta8.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnComparBoleta8.setText("Comprar Boletas");
        btnComparBoleta8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparBoleta8ActionPerformed(evt);
            }
        });
        jPanel1.add(btnComparBoleta8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 100, 20));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel21.setText("SONIC LA PELÍCULA");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 100, 20));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel22.setText("UNIDOS");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 100, 20));

        btnComparBoleta9.setBackground(new java.awt.Color(153, 153, 153));
        btnComparBoleta9.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnComparBoleta9.setText("Comprar Boletas");
        btnComparBoleta9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparBoleta9ActionPerformed(evt);
            }
        });
        jPanel1.add(btnComparBoleta9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 100, 20));

        jScrollPane2.setViewportView(jPanel1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, 480, 400));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Search_32px_2.png"))); // NOI18N

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));

        txtBuscar.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscar.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(154, 154, 154))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnComparBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComparBoletaActionPerformed
        
    }//GEN-LAST:event_btnComparBoletaActionPerformed

    private void btnComparBoleta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComparBoleta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComparBoleta1ActionPerformed

    private void btnComparBoleta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComparBoleta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComparBoleta2ActionPerformed

    private void btnComparBoleta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComparBoleta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComparBoleta3ActionPerformed

    private void btnComparBoleta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComparBoleta4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComparBoleta4ActionPerformed

    private void btnComparBoleta5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComparBoleta5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComparBoleta5ActionPerformed

    private void btnComparBoleta6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComparBoleta6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComparBoleta6ActionPerformed

    private void btnComparBoleta7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComparBoleta7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComparBoleta7ActionPerformed

    private void btnComparBoleta8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComparBoleta8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComparBoleta8ActionPerformed

    private void btnComparBoleta9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComparBoleta9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComparBoleta9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComparBoleta;
    private javax.swing.JButton btnComparBoleta1;
    private javax.swing.JButton btnComparBoleta2;
    private javax.swing.JButton btnComparBoleta3;
    private javax.swing.JButton btnComparBoleta4;
    private javax.swing.JButton btnComparBoleta5;
    private javax.swing.JButton btnComparBoleta6;
    private javax.swing.JButton btnComparBoleta7;
    private javax.swing.JButton btnComparBoleta8;
    private javax.swing.JButton btnComparBoleta9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
