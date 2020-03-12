/*
    Creado por:
        Kevin Alarcón
        Nathalia Ruiz
        Luis Romero
        Juan Camilo Gonzalez
 */
package vista;

public class panelPreventa extends javax.swing.JPanel {

    public panelPreventa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jspContenedorPreventa = new javax.swing.JScrollPane();
        contenedorPreventa = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnComparBoleta5 = new javax.swing.JButton();
        lbl2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnComparBoleta6 = new javax.swing.JButton();
        lbl3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnComparBoleta7 = new javax.swing.JButton();
        lbl4 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnComparBoleta8 = new javax.swing.JButton();
        lbl5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnComparBoleta9 = new javax.swing.JButton();

        jspContenedorPreventa.setBorder(null);

        contenedorPreventa.setBackground(new java.awt.Color(255, 255, 255));
        contenedorPreventa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/gloodbooster.jpeg"))); // NOI18N
        lbl1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl1MouseMoved(evt);
            }
        });
        lbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl1MouseExited(evt);
            }
        });
        contenedorPreventa.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel7.setText("GHOSTBUSTERS: EL LEGADO");
        contenedorPreventa.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, 20));

        btnComparBoleta5.setBackground(new java.awt.Color(153, 153, 153));
        btnComparBoleta5.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnComparBoleta5.setText("Comprar Boletas");
        btnComparBoleta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparBoleta5ActionPerformed(evt);
            }
        });
        contenedorPreventa.add(btnComparBoleta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, 20));

        lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/la princesa y el dragon.jpeg"))); // NOI18N
        lbl2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl2MouseMoved(evt);
            }
        });
        lbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl2MouseExited(evt);
            }
        });
        contenedorPreventa.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel8.setText("LA PRINCESA Y EL DRAGÓN");
        contenedorPreventa.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 100, 20));

        btnComparBoleta6.setBackground(new java.awt.Color(153, 153, 153));
        btnComparBoleta6.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnComparBoleta6.setText("Comprar Boletas");
        btnComparBoleta6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparBoleta6ActionPerformed(evt);
            }
        });
        contenedorPreventa.add(btnComparBoleta6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 100, 20));

        lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/conmigo.jpeg"))); // NOI18N
        lbl3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl3MouseMoved(evt);
            }
        });
        lbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl3MouseExited(evt);
            }
        });
        contenedorPreventa.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel9.setText("MIENTRAS ESTÉS CONMIGO");
        contenedorPreventa.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 100, 20));

        btnComparBoleta7.setBackground(new java.awt.Color(153, 153, 153));
        btnComparBoleta7.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnComparBoleta7.setText("Comprar Boletas");
        btnComparBoleta7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparBoleta7ActionPerformed(evt);
            }
        });
        contenedorPreventa.add(btnComparBoleta7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 100, 20));

        lbl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tenet.jpeg"))); // NOI18N
        lbl4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl4MouseMoved(evt);
            }
        });
        lbl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl4MouseExited(evt);
            }
        });
        contenedorPreventa.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel21.setText("TENET");
        contenedorPreventa.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 100, 20));

        btnComparBoleta8.setBackground(new java.awt.Color(153, 153, 153));
        btnComparBoleta8.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnComparBoleta8.setText("Comprar Boletas");
        btnComparBoleta8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparBoleta8ActionPerformed(evt);
            }
        });
        contenedorPreventa.add(btnComparBoleta8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 100, 20));

        lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/totgon.jpeg"))); // NOI18N
        lbl5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl5MouseMoved(evt);
            }
        });
        lbl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl5MouseExited(evt);
            }
        });
        contenedorPreventa.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel22.setText("TOP GUN");
        contenedorPreventa.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 100, 20));

        btnComparBoleta9.setBackground(new java.awt.Color(153, 153, 153));
        btnComparBoleta9.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnComparBoleta9.setText("Comprar Boletas");
        btnComparBoleta9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparBoleta9ActionPerformed(evt);
            }
        });
        contenedorPreventa.add(btnComparBoleta9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 100, 20));

        jspContenedorPreventa.setViewportView(contenedorPreventa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspContenedorPreventa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspContenedorPreventa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void lbl1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MouseMoved
        lbl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_lbl1MouseMoved

    private void lbl1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MouseExited
        lbl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lbl1MouseExited

    private void lbl2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl2MouseMoved
        lbl2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_lbl2MouseMoved

    private void lbl2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl2MouseExited
        lbl2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lbl2MouseExited

    private void lbl3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3MouseMoved
        lbl3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_lbl3MouseMoved

    private void lbl3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3MouseExited
        lbl3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lbl3MouseExited

    private void lbl4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl4MouseMoved
        lbl4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_lbl4MouseMoved

    private void lbl4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl4MouseExited
        lbl4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lbl4MouseExited

    private void lbl5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl5MouseMoved
        lbl5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_lbl5MouseMoved

    private void lbl5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl5MouseExited
        lbl5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lbl5MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComparBoleta5;
    private javax.swing.JButton btnComparBoleta6;
    private javax.swing.JButton btnComparBoleta7;
    private javax.swing.JButton btnComparBoleta8;
    private javax.swing.JButton btnComparBoleta9;
    private javax.swing.JPanel contenedorPreventa;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jspContenedorPreventa;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    // End of variables declaration//GEN-END:variables
}
