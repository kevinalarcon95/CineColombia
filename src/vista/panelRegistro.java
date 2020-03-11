package vista;

import control.DAOGestionUsuario;
import control.Usuario;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class panelRegistro extends javax.swing.JFrame {

    public panelRegistro() {
        this.setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);

        TextPrompt textUsuario = new TextPrompt(" Ingrese un usuario", txtUsuario);
        TextPrompt textCorreo = new TextPrompt(" Ingrese su correo electronico", txtCorreo);
        TextPrompt textContraseña = new TextPrompt(" Ingrese su contraseña", txtContraseña);
        TextPrompt textNombre = new TextPrompt(" Ingrese su nombre", txtNombre);
        TextPrompt textApellido = new TextPrompt(" Ingrese su apellido", txtApellido);
        TextPrompt textDocumento = new TextPrompt(" Ingrese su documento", txtDocumento);
        TextPrompt textDireccion = new TextPrompt(" Ingrese su direccion", txtDireccion);
        TextPrompt textCelular = new TextPrompt(" Ingrese su número de celular", txtCelular);
    }

    public boolean existenCamposVacios() {
        return (txtNombre.getText().length() > 0) || (txtDocumento.getText().length() > 0) || (txtCorreo.getText().length() > 0) || (txtApellido.getText().length() > 0)
                || (txtDireccion.getText().length() > 0) || (txtCelular.getText().length() > 0) || (txtContraseña.getText().length() > 0) || (txtUsuario.getText().length() > 0);
    }

    public void validarCheck() {
        if (cbTerminos.isSelected()) {
            btnRegistrarse.setEnabled(true);
        } else if (cbTerminos.isSelected() == false) {
            btnRegistrarse.setEnabled(false);
        }
    }

    private void limpiarCampos() {
        txtDocumento.setText("");
        txtCorreo.setText("");
        txtUsuario.setText("");
        txtContraseña.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtCelular.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDocumento = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        cbxTipoDoc = new javax.swing.JComboBox<>();
        txtCelular = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        btnSalir = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        cbTerminos = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Tipo de Documento:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(110, 270, 130, 14);

        txtCorreo.setForeground(new java.awt.Color(102, 102, 102));
        txtCorreo.setBorder(null);
        jPanel1.add(txtCorreo);
        txtCorreo.setBounds(50, 150, 260, 20);

        txtContraseña.setForeground(new java.awt.Color(102, 102, 102));
        txtContraseña.setBorder(null);
        jPanel1.add(txtContraseña);
        txtContraseña.setBounds(50, 180, 260, 20);

        txtNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtNombre.setBorder(null);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre);
        txtNombre.setBounds(50, 210, 260, 20);

        txtApellido.setForeground(new java.awt.Color(102, 102, 102));
        txtApellido.setBorder(null);
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellido);
        txtApellido.setBounds(50, 240, 260, 20);

        txtDocumento.setForeground(new java.awt.Color(102, 102, 102));
        txtDocumento.setBorder(null);
        txtDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDocumentoKeyTyped(evt);
            }
        });
        jPanel1.add(txtDocumento);
        txtDocumento.setBounds(50, 320, 260, 20);

        txtDireccion.setForeground(new java.awt.Color(102, 102, 102));
        txtDireccion.setBorder(null);
        jPanel1.add(txtDireccion);
        txtDireccion.setBounds(50, 350, 260, 20);

        cbxTipoDoc.setBackground(new java.awt.Color(238, 112, 82));
        cbxTipoDoc.setForeground(new java.awt.Color(255, 255, 255));
        cbxTipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Cedula de Ciudadania", "Targeta de identidad", "Cedula de Extrangeria", "Pasaporte", " " }));
        cbxTipoDoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cbxTipoDoc);
        cbxTipoDoc.setBounds(80, 290, 160, 20);

        txtCelular.setForeground(new java.awt.Color(102, 102, 102));
        txtCelular.setBorder(null);
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });
        jPanel1.add(txtCelular);
        txtCelular.setBounds(50, 380, 260, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Registrarse");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 50, 190, 30);

        btnRegistrarse.setBackground(new java.awt.Color(238, 112, 82));
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarse);
        btnRegistrarse.setBounds(240, 450, 130, 23);
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(150, 290, 190, 0);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Por favor ingrese su información personal");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(180, 70, 240, 14);

        txtUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario);
        txtUsuario.setBounds(50, 110, 260, 20);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(50, 130, 260, 2);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(50, 170, 260, 2);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(50, 200, 260, 2);
        jPanel1.add(jSeparator9);
        jSeparator9.setBounds(50, 400, 260, 30);
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(50, 230, 260, 2);
        jPanel1.add(jSeparator6);
        jSeparator6.setBounds(50, 260, 260, 2);
        jPanel1.add(jSeparator7);
        jSeparator7.setBounds(50, 340, 260, 2);
        jPanel1.add(jSeparator8);
        jSeparator8.setBounds(50, 370, 260, 2);

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Multiply_32px.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir);
        btnSalir.setBounds(350, 10, 20, 20);

        btnMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        btnMinimizar.setBorder(null);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMinimizar);
        btnMinimizar.setBounds(310, 10, 33, 20);

        cbTerminos.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        cbTerminos.setForeground(new java.awt.Color(102, 102, 102));
        cbTerminos.setText("Acepto los terminos");
        cbTerminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTerminosActionPerformed(evt);
            }
        });
        jPanel1.add(cbTerminos);
        cbTerminos.setBounds(20, 450, 140, 23);

        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Información Personal");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 90, 120, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed

        String cadena2, cadena3, cadena4, cadena5, cadena6, cadena7, cadena8;

        DAOGestionUsuario dao = new DAOGestionUsuario();
        int bandera = 0;

        cadena2 = txtNombre.getText();
        cadena3 = txtDocumento.getText();
        cadena4 = cbxTipoDoc.getSelectedItem().toString();
        cadena5 = txtCorreo.getText();
        cadena6 = txtApellido.getText();
        cadena7 = txtContraseña.getText();
        cadena8 = txtUsuario.getText();

        try {
            Usuario us3 = new Usuario(Long.parseLong(txtDocumento.getText()), txtUsuario.getText());
            bandera = dao.validarUsuario(us3);
            if (bandera == 1) {
                JOptionPane.showConfirmDialog(null, "Ya existe un usuario registrado con ese nombre usuario!");
            } else if (bandera == 0) {
                if (existenCamposVacios()) {
                    Usuario us = new Usuario(Long.parseLong(txtDocumento.getText()), cbxTipoDoc.getSelectedItem().toString(), txtUsuario.getText(), txtContraseña.getText(),
                            txtCorreo.getText(), txtNombre.getText(), txtApellido.getText(), txtDireccion.getText(), txtCelular.getText());
                    Usuario us2 = new Usuario(txtUsuario.getText(), txtContraseña.getText());
                    dao.registrarUsuario(us);
                    dao.Usuario(us2);
                    JOptionPane.showConfirmDialog(null, "El usuario ha sido creado!");
                    limpiarCampos();
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    //txtNombre.requestFocus();
                }
            }
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error en la base de datos \n", "AVISO!" + ex, javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "No pueden haber campos vacios \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        new panelInicioSesion().setVisible(true);
        super.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char validarTexto = evt.getKeyChar();
        if (Character.isDigit(validarTexto)) {
            getToolkit().beep();
            evt.consume();
            txtNombre.setBackground(Color.ORANGE);//Pinta de rojo
            JOptionPane.showMessageDialog(rootPane, "Solo puedes ingresar letras");
        } else {
            txtNombre.setBackground(Color.WHITE);//Pinta de rojo
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char validarTexto = evt.getKeyChar();
        if (Character.isDigit(validarTexto)) {
            getToolkit().beep();
            evt.consume();
            txtApellido.setBackground(Color.ORANGE);//Pinta de rojo
            JOptionPane.showMessageDialog(rootPane, "Solo puedes ingresar letras");
        } else {
            txtApellido.setBackground(Color.WHITE);//Pinta de rojo
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocumentoKeyTyped
        char validarNumero = evt.getKeyChar();
        if (Character.isLetter(validarNumero)) {
            getToolkit().beep();
            evt.consume();
            txtDocumento.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo números");
        } else {
            txtDocumento.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_txtDocumentoKeyTyped

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        char validarNumero = evt.getKeyChar();
        if (Character.isLetter(validarNumero)) {
            getToolkit().beep();
            evt.consume();
            txtCelular.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo números");
        } else {
            txtCelular.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_txtCelularKeyTyped

    private void cbTerminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTerminosActionPerformed
        validarCheck();
    }//GEN-LAST:event_cbTerminosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox cbTerminos;
    private javax.swing.JComboBox<String> cbxTipoDoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
