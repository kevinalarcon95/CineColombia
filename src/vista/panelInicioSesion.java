package vista;

import control.DAOGestionUsuario;
import control.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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

        jPanel1 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();
        btnInvitado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        btnOlvido = new javax.swing.JButton();
        txtContraseña = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        txtUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtUsuario.setBorder(null);
        jPanel1.add(txtUsuario);
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
        jPanel1.add(btnEnter);
        btnEnter.setBounds(140, 340, 80, 30);

        btnInvitado.setBackground(new java.awt.Color(255, 255, 255));
        btnInvitado.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btnInvitado.setForeground(new java.awt.Color(238, 112, 82));
        btnInvitado.setText("Modo Invitado");
        btnInvitado.setBorder(null);
        btnInvitado.setBorderPainted(false);
        btnInvitado.setContentAreaFilled(false);
        btnInvitado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnInvitado);
        btnInvitado.setBounds(140, 390, 113, 23);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 112, 82));
        jLabel2.setText("User:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 200, 32, 16);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 112, 82));
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 270, 61, 16);

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
        jPanel1.add(btnRegistro);
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
        jPanel1.add(btnOlvido);
        btnOlvido.setBounds(210, 420, 105, 11);

        txtContraseña.setForeground(new java.awt.Color(102, 102, 102));
        txtContraseña.setBorder(null);
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContraseña);
        txtContraseña.setBounds(100, 290, 220, 30);

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(80, 320, 240, 10);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_customer_32px_1.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 220, 30, 30);

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(80, 250, 240, 10);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Key_32px.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 290, 50, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_User_96px_2.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(150, 100, 120, 80);

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
        jPanel1.add(btnSalir);
        btnSalir.setBounds(340, 40, 20, 20);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(80, 430, 60, 10);
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(210, 430, 110, 10);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cine Colombia");
        jPanel1.add(jLabel7);
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
        jPanel1.add(btnMinimizar);
        btnMinimizar.setBounds(300, 40, 33, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fondo.jpg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, -10, 400, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

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
                javax.swing.JOptionPane.showMessageDialog(this,"Verifique los datos ingresados \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
