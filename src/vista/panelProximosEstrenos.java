/*
    Creado por:
        Kevin Alarcón
        Nathalia Ruiz
        Luis Romero
        Juan Camilo Gonzalez
 */
package vista;

import java.sql.SQLException;

public class panelProximosEstrenos extends javax.swing.JPanel {

    public panelProximosEstrenos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jspContenedorEstrenos = new javax.swing.JScrollPane();
        contenedorEstrenos = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnComparBoleta = new javax.swing.JButton();
        lbl2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnComparBoleta1 = new javax.swing.JButton();
        lbl3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnComparBoleta2 = new javax.swing.JButton();
        lbl4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnComparBoleta3 = new javax.swing.JButton();
        lbl5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnComparBoleta4 = new javax.swing.JButton();
        lbl6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnComparBoleta5 = new javax.swing.JButton();
        lbl7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnComparBoleta6 = new javax.swing.JButton();
        lbl8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnComparBoleta7 = new javax.swing.JButton();
        lbl9 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnComparBoleta8 = new javax.swing.JButton();
        lbl10 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnComparBoleta9 = new javax.swing.JButton();

        jspContenedorEstrenos.setBorder(null);

        contenedorEstrenos.setBackground(new java.awt.Color(255, 255, 255));
        contenedorEstrenos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/artemis.jpeg"))); // NOI18N
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
        contenedorEstrenos.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel1.setText("ARTEMIS FOWL: EL MUNDO SUBTERRÁNEO");
        contenedorEstrenos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 100, 20));

        btnComparBoleta.setBackground(new java.awt.Color(153, 153, 153));
        btnComparBoleta.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnComparBoleta.setText("Comprar Boletas");
        btnComparBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparBoletaActionPerformed(evt);
            }
        });
        contenedorEstrenos.add(btnComparBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 100, 20));

        lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bobEsponja.jpeg"))); // NOI18N
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
        contenedorEstrenos.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel3.setText("BOB ESPONJA AL RESCATE");
        contenedorEstrenos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 100, 20));

        btnComparBoleta1.setBackground(new java.awt.Color(153, 153, 153));
        btnComparBoleta1.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnComparBoleta1.setText("Comprar Boletas");
        btnComparBoleta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparBoleta1ActionPerformed(evt);
            }
        });
        contenedorEstrenos.add(btnComparBoleta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 100, 20));

        lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bloods.jpeg"))); // NOI18N
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
        contenedorEstrenos.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel4.setText("BLOODSHOT");
        contenedorEstrenos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 100, 20));

        btnComparBoleta2.setBackground(new java.awt.Color(153, 153, 153));
        btnComparBoleta2.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnComparBoleta2.setText("Comprar Boletas");
        btnComparBoleta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparBoleta2ActionPerformed(evt);
            }
        });
        contenedorEstrenos.add(btnComparBoleta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 100, 20));

        lbl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/En el barrio.jpeg"))); // NOI18N
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
        contenedorEstrenos.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel5.setText("EN EL BARRIO");
        contenedorEstrenos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 100, 20));

        btnComparBoleta3.setBackground(new java.awt.Color(153, 153, 153));
        btnComparBoleta3.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnComparBoleta3.setText("Comprar Boletas");
        btnComparBoleta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparBoleta3ActionPerformed(evt);
            }
        });
        contenedorEstrenos.add(btnComparBoleta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 100, 20));

        lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/saul.jpeg"))); // NOI18N
        lbl5.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
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
        contenedorEstrenos.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel6.setText("SOUL");
        contenedorEstrenos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 100, 20));

        btnComparBoleta4.setBackground(new java.awt.Color(153, 153, 153));
        btnComparBoleta4.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnComparBoleta4.setText("Comprar Boletas");
        btnComparBoleta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparBoleta4ActionPerformed(evt);
            }
        });
        contenedorEstrenos.add(btnComparBoleta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 100, 20));

        lbl6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/minios.jpeg"))); // NOI18N
        lbl6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl6MouseMoved(evt);
            }
        });
        lbl6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl6MouseExited(evt);
            }
        });
        contenedorEstrenos.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel7.setText("MINIONS 2: NACE UN VILLANO");
        contenedorEstrenos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 100, 20));

        btnComparBoleta5.setBackground(new java.awt.Color(153, 153, 153));
        btnComparBoleta5.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnComparBoleta5.setText("Comprar Boletas");
        btnComparBoleta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparBoleta5ActionPerformed(evt);
            }
        });
        contenedorEstrenos.add(btnComparBoleta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 100, 20));

        lbl7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/free guy.jpeg"))); // NOI18N
        lbl7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl7MouseMoved(evt);
            }
        });
        lbl7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl7MouseExited(evt);
            }
        });
        contenedorEstrenos.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel8.setText("FREE GUY: TOMANDO EL CONTROL");
        contenedorEstrenos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 100, 20));

        btnComparBoleta6.setBackground(new java.awt.Color(153, 153, 153));
        btnComparBoleta6.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnComparBoleta6.setText("Comprar Boletas");
        btnComparBoleta6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparBoleta6ActionPerformed(evt);
            }
        });
        contenedorEstrenos.add(btnComparBoleta6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 100, 20));

        lbl8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rapidos y furiosos 8.jpeg"))); // NOI18N
        lbl8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl8MouseMoved(evt);
            }
        });
        lbl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl8MouseExited(evt);
            }
        });
        contenedorEstrenos.add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel9.setText("RÁPIDOS Y FURIOSOS 9");
        contenedorEstrenos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 100, 20));

        btnComparBoleta7.setBackground(new java.awt.Color(153, 153, 153));
        btnComparBoleta7.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnComparBoleta7.setText("Comprar Boletas");
        btnComparBoleta7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparBoleta7ActionPerformed(evt);
            }
        });
        contenedorEstrenos.add(btnComparBoleta7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 100, 20));

        lbl9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mujer maravilla.jpeg"))); // NOI18N
        lbl9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl9MouseMoved(evt);
            }
        });
        lbl9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl9MouseExited(evt);
            }
        });
        contenedorEstrenos.add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel21.setText("MUJER MARAVILLA 1984");
        contenedorEstrenos.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 100, 20));

        btnComparBoleta8.setBackground(new java.awt.Color(153, 153, 153));
        btnComparBoleta8.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnComparBoleta8.setText("Comprar Boletas");
        btnComparBoleta8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparBoleta8ActionPerformed(evt);
            }
        });
        contenedorEstrenos.add(btnComparBoleta8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 100, 20));

        lbl10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mulan.jpeg"))); // NOI18N
        lbl10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl10MouseMoved(evt);
            }
        });
        lbl10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl10MouseExited(evt);
            }
        });
        contenedorEstrenos.add(lbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, -1, -1));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel22.setText("MULÁN");
        contenedorEstrenos.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 100, 20));

        btnComparBoleta9.setBackground(new java.awt.Color(153, 153, 153));
        btnComparBoleta9.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnComparBoleta9.setText("Comprar Boletas");
        btnComparBoleta9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparBoleta9ActionPerformed(evt);
            }
        });
        contenedorEstrenos.add(btnComparBoleta9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 100, 20));

        jspContenedorEstrenos.setViewportView(contenedorEstrenos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspContenedorEstrenos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspContenedorEstrenos, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnComparBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComparBoletaActionPerformed
         try {
            String ruta = "src/image/artemis.jpeg";
            new panelInfoPeliculas("EL HOMBRE INVISIBLE",ruta).setVisible(true);
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error en la conexión con la BD \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnComparBoletaActionPerformed

    private void btnComparBoleta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComparBoleta1ActionPerformed
         try {
            String ruta = "src/image/gloodbooster.jpeg";
            new panelInfoPeliculas("EL HOMBRE INVISIBLE",ruta).setVisible(true);
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error en la conexión con la BD \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
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

    private void lbl6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl6MouseMoved
        lbl6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_lbl6MouseMoved

    private void lbl6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl6MouseExited
        lbl6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lbl6MouseExited

    private void lbl7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl7MouseMoved
        lbl7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_lbl7MouseMoved

    private void lbl7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl7MouseExited
        lbl7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lbl7MouseExited

    private void lbl8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl8MouseMoved
        lbl8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_lbl8MouseMoved

    private void lbl8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl8MouseExited
        lbl8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lbl8MouseExited

    private void lbl9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl9MouseMoved
        lbl9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_lbl9MouseMoved

    private void lbl9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl9MouseExited
        lbl9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lbl9MouseExited

    private void lbl10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl10MouseMoved
        lbl10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_lbl10MouseMoved

    private void lbl10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl10MouseExited
        lbl10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lbl10MouseExited


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
    private javax.swing.JPanel contenedorEstrenos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jspContenedorEstrenos;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    // End of variables declaration//GEN-END:variables
}
