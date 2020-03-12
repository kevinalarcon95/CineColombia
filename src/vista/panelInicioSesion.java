/*
    Creado por:
        Kevin Alarcón
        Nathalia Ruiz
        Luis Romero
        Juan Camilo Gonzalez
 */
package vista;

import control.DAOGestionUsuario;
import control.Usuario;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class panelInicioSesion extends javax.swing.JFrame {

    public panelInicioSesion() {
        this.setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);

        TextPrompt textUsuario = new TextPrompt(" Ingrese su usuario", txtUsuario);
        TextPrompt textContraseña = new TextPrompt(" Ingrese su contraseña", txtContraseña);
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(JTextField txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorInicioSesion = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();
        btnInvitado = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        btnOlvido = new javax.swing.JButton();
        txtContraseña = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        lblIconoUser2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblIconoPass = new javax.swing.JLabel();
        lblIconoUser = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedorInicioSesion.setBackground(new java.awt.Color(255, 255, 255));
        contenedorInicioSesion.setLayout(null);

        txtUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtUsuario.setBorder(null);
        contenedorInicioSesion.add(txtUsuario);
        txtUsuario.setBounds(100, 220, 220, 30);

        btnEnter.setBackground(new java.awt.Color(204, 204, 204));
        btnEnter.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btnEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Enter_OFF.png"))); // NOI18N
        btnEnter.setBorder(null);
        btnEnter.setBorderPainted(false);
        btnEnter.setContentAreaFilled(false);
        btnEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnter.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Enter_ON.png"))); // NOI18N
        btnEnter.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Enter_ON.png"))); // NOI18N
        btnEnter.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Enter_ON.png"))); // NOI18N
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        contenedorInicioSesion.add(btnEnter);
        btnEnter.setBounds(140, 340, 80, 30);

        btnInvitado.setBackground(new java.awt.Color(255, 255, 255));
        btnInvitado.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btnInvitado.setForeground(new java.awt.Color(238, 112, 82));
        btnInvitado.setText("Modo Invitado");
        btnInvitado.setBorder(null);
        btnInvitado.setBorderPainted(false);
        btnInvitado.setContentAreaFilled(false);
        btnInvitado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contenedorInicioSesion.add(btnInvitado);
        btnInvitado.setBounds(140, 390, 113, 23);

        lblUser.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblUser.setForeground(new java.awt.Color(238, 112, 82));
        lblUser.setText("User:");
        contenedorInicioSesion.add(lblUser);
        lblUser.setBounds(70, 200, 32, 16);

        lblPass.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblPass.setForeground(new java.awt.Color(238, 112, 82));
        lblPass.setText("Password:");
        contenedorInicioSesion.add(lblPass);
        lblPass.setBounds(70, 270, 61, 16);

        btnRegistro.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistro.setFont(new java.awt.Font("Verdana", 1, 9)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(238, 112, 82));
        btnRegistro.setText("Registrarse");
        btnRegistro.setBorder(null);
        btnRegistro.setBorderPainted(false);
        btnRegistro.setContentAreaFilled(false);
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        contenedorInicioSesion.add(btnRegistro);
        btnRegistro.setBounds(80, 420, 57, 11);

        btnOlvido.setBackground(new java.awt.Color(255, 255, 255));
        btnOlvido.setFont(new java.awt.Font("Verdana", 1, 9)); // NOI18N
        btnOlvido.setForeground(new java.awt.Color(238, 112, 82));
        btnOlvido.setText("Olvide mi contraseña");
        btnOlvido.setBorder(null);
        btnOlvido.setBorderPainted(false);
        btnOlvido.setContentAreaFilled(false);
        btnOlvido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOlvido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOlvidoActionPerformed(evt);
            }
        });
        contenedorInicioSesion.add(btnOlvido);
        btnOlvido.setBounds(210, 420, 105, 11);

        txtContraseña.setForeground(new java.awt.Color(102, 102, 102));
        txtContraseña.setBorder(null);
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        contenedorInicioSesion.add(txtContraseña);
        txtContraseña.setBounds(100, 290, 220, 30);

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        contenedorInicioSesion.add(jSeparator1);
        jSeparator1.setBounds(80, 320, 240, 10);

        lblIconoUser2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_customer_32px_1.png"))); // NOI18N
        contenedorInicioSesion.add(lblIconoUser2);
        lblIconoUser2.setBounds(70, 220, 30, 30);

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        contenedorInicioSesion.add(jSeparator2);
        jSeparator2.setBounds(80, 250, 240, 10);

        lblIconoPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Key_32px.png"))); // NOI18N
        lblIconoPass.setText("jLabel5");
        contenedorInicioSesion.add(lblIconoPass);
        lblIconoPass.setBounds(70, 290, 50, 30);

        lblIconoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_User_96px_2.png"))); // NOI18N
        contenedorInicioSesion.add(lblIconoUser);
        lblIconoUser.setBounds(150, 100, 120, 80);

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Multiply_32px.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Multiply_32px.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        contenedorInicioSesion.add(btnSalir);
        btnSalir.setBounds(340, 40, 20, 20);
        contenedorInicioSesion.add(jSeparator3);
        jSeparator3.setBounds(80, 430, 60, 10);
        contenedorInicioSesion.add(jSeparator4);
        jSeparator4.setBounds(210, 430, 110, 10);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cine Colombia");
        contenedorInicioSesion.add(jLabel7);
        jLabel7.setBounds(310, 480, 110, 14);

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
        contenedorInicioSesion.add(btnMinimizar);
        btnMinimizar.setBounds(300, 40, 33, 20);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fondo.jpg"))); // NOI18N
        lblFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contenedorInicioSesion.add(lblFondo);
        lblFondo.setBounds(0, -10, 400, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorInicioSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );

        contenedorInicioSesion.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        btnSalir.setToolTipText("Salir");
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(JFrame.ICONIFIED);//Función que permite minimizar la pantalla
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        new panelRegistro().setVisible(true);
        super.dispose();
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed

        DAOGestionUsuario dao = new DAOGestionUsuario();
        Usuario us = new Usuario(txtUsuario.getText(), String.valueOf(txtContraseña.getPassword()));
        Usuario us2 = new Usuario(txtUsuario.getText());

        int bandera = 0;
        try {
            bandera = dao.validarAcceso(us);

            if (bandera == 1) {

                txtUsuario.setText("");
                txtContraseña.setText("");
                new panelPrincipal(us2.getUs_usuario()).setVisible(true);
                super.dispose();
                //javax.swing.JOptionPane.showMessageDialog(this,"Ingresó\n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else if (bandera == 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Verifique los datos ingresados \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error en la base de datos \n", "AVISO!" + ex, javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnOlvidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOlvidoActionPerformed
        new panelOlvidoContraseña().setVisible(true);
        super.dispose();
    }//GEN-LAST:event_btnOlvidoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panelInicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnInvitado;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnOlvido;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel contenedorInicioSesion;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIconoPass;
    private javax.swing.JLabel lblIconoUser;
    private javax.swing.JLabel lblIconoUser2;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
