package vista;

import control.DAOGestionUsuario;
import control.Usuario;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class panelOlvidoContraseña extends javax.swing.JFrame {

    public panelOlvidoContraseña() {
        this.setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        JPanel p = new JPanel();
        p.setBorder(BorderFactory.createLineBorder(Color.black, 10));
        TextPrompt textUsuario = new TextPrompt(" Ingrese su usuario", txtUsuario);
        TextPrompt textNuevaContraseña = new TextPrompt(" Ingrese su nueva contraseña", txtnuevacontraseña);
        TextPrompt textConfirmarContraseña = new TextPrompt(" Confirme su nueva contraseña", txtconfirmacontraseña);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jpanel = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        txtnuevacontraseña = new javax.swing.JPasswordField();
        txtconfirmacontraseña = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        Jpanel.setBackground(new java.awt.Color(255, 255, 255));
        Jpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Jpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setBorder(null);
        Jpanel.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 200, 30));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        Jpanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 240, 10));

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        Jpanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 240, 10));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("¿Olvidaste tu contraseña?");
        Jpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 240, -1));

        btnConfirmar.setBackground(new java.awt.Color(153, 153, 153));
        btnConfirmar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        Jpanel.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 100, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Crea una nueva contraseña");
        Jpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 150, -1));

        btnMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        btnMinimizar.setToolTipText("");
        btnMinimizar.setBorder(null);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        Jpanel.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 30, 20));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Multiply_32px.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        Jpanel.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 30, 20));

        jSeparator5.setForeground(new java.awt.Color(102, 102, 102));
        Jpanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 250, -1));

        txtnuevacontraseña.setBorder(null);
        Jpanel.add(txtnuevacontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 200, 30));

        txtconfirmacontraseña.setBorder(null);
        Jpanel.add(txtconfirmacontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 200, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Perfil.JPG"))); // NOI18N
        Jpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 30, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Password.JPG"))); // NOI18N
        Jpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Check.JPG"))); // NOI18N
        Jpanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        new panelInicioSesion().setVisible(true);
        super.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        DAOGestionUsuario dao = new DAOGestionUsuario();
        String nuevaContraseña = String.valueOf(txtnuevacontraseña.getPassword());
        String confirmar = String.valueOf(txtconfirmacontraseña.getPassword());
        Usuario us = new Usuario(txtUsuario.getText(), nuevaContraseña);
        int bandera = 0;

        try {
            bandera = dao.existeUsuario(us);
            if (bandera == 1) {
                if (nuevaContraseña.equals(confirmar)) {
                    dao.Actualizar(us);
                    dao.ActualizarRegistro(us);
                    txtUsuario.setText("");
                    txtnuevacontraseña.setText("");
                    txtconfirmacontraseña.setText("");
                    javax.swing.JOptionPane.showMessageDialog(this, "Contraseña Actualizada \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                } else {
                    txtnuevacontraseña.setText("");
                    txtconfirmacontraseña.setText("");
                    javax.swing.JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden\n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "No exite un usuario registrado con ese nombre de usuario\n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            //javax.swing.JOptionPane.showMessageDialog(this, "Error en la base de datos \n", "AVISO!" + ex, javax.swing.JOptionPane.INFORMATION_MESSAGE);
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpanel;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JPasswordField txtconfirmacontraseña;
    private javax.swing.JPasswordField txtnuevacontraseña;
    // End of variables declaration//GEN-END:variables

}
