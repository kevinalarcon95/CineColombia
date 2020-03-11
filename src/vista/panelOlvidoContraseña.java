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
        p.setBorder(BorderFactory.createLineBorder(Color.black,10));
        TextPrompt textUsuario = new TextPrompt(" Ingrese su usuario", txtUsuario);
        TextPrompt textNuevaContraseña = new TextPrompt(" Ingrese su nueva contraseña", txtnuevacontraseña);
        TextPrompt textConfirmarContraseña = new TextPrompt(" Confirme su nueva contraseña", txtconfirmacontraseña);
    }
    
    
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Jpanel = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnSalir = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtnuevacontraseña = new javax.swing.JPasswordField();
        txtconfirmacontraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        Jpanel.setBackground(new java.awt.Color(255, 255, 255));
        Jpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Jpanel.setLayout(new java.awt.GridBagLayout());

        txtUsuario.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 239;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 120, 0, 0);
        Jpanel.add(txtUsuario, gridBagConstraints);

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 239;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 120, 0, 0);
        Jpanel.add(jSeparator1, gridBagConstraints);

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 239;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 120, 0, 0);
        Jpanel.add(jSeparator3, gridBagConstraints);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("¿Olvidaste tu contraseña?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 130, 0, 0);
        Jpanel.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Usuario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(45, 120, 0, 0);
        Jpanel.add(jLabel3, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Nueva Contraseña:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 120, 0, 0);
        Jpanel.add(jLabel5, gridBagConstraints);

        btnConfirmar.setBackground(new java.awt.Color(153, 153, 153));
        btnConfirmar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(38, 20, 37, 0);
        Jpanel.add(btnConfirmar, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Crea una nueva contraseña");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        Jpanel.add(jLabel1, gridBagConstraints);

        btnMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        btnMinimizar.setToolTipText("");
        btnMinimizar.setBorder(null);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -3;
        gridBagConstraints.ipady = -13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 60, 0, 0);
        Jpanel.add(btnMinimizar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 10, 0, 0);
        Jpanel.add(jSeparator2, gridBagConstraints);

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Multiply_32px.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -3;
        gridBagConstraints.ipady = -13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        Jpanel.add(btnSalir, gridBagConstraints);

        jSeparator5.setForeground(new java.awt.Color(102, 102, 102));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 249;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 120, 0, 0);
        Jpanel.add(jSeparator5, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Confirmar Contraseña:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 120, 0, 0);
        Jpanel.add(jLabel4, gridBagConstraints);

        txtnuevacontraseña.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 239;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 120, 0, 0);
        Jpanel.add(txtnuevacontraseña, gridBagConstraints);

        txtconfirmacontraseña.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 239;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 120, 0, 0);
        Jpanel.add(txtconfirmacontraseña, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        Usuario us = new Usuario(txtUsuario.getText(),nuevaContraseña);
        int bandera = 0;
        
        
        try {
            bandera = dao.existeUsuario(us);
            if (bandera == 1) {
                if(nuevaContraseña.equals(confirmar)){
                    dao.Actualizar(us);
                    dao.ActualizarRegistro(us);
                    txtUsuario.setText("");
                    txtnuevacontraseña.setText("");
                    txtconfirmacontraseña.setText("");
                    javax.swing.JOptionPane.showMessageDialog(this,"Contraseña Actualizada \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }else{
                    txtnuevacontraseña.setText("");
                    txtconfirmacontraseña.setText("");
                    javax.swing.JOptionPane.showMessageDialog(this,"Las contraseñas no coinciden\n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(this,"No exite un usuario registrado con ese nombre de usuario\n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JPasswordField txtconfirmacontraseña;
    private javax.swing.JPasswordField txtnuevacontraseña;
    // End of variables declaration//GEN-END:variables

}
