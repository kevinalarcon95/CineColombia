/*
    Creado por:
        Kevin Alarcón
        Nathalia Ruiz
        Luis Romero
        Juan Camilo Gonzalez
 */
package control;

import java.sql.SQLException;

public class DAOGestionUsuario {

    ConectaDb conecta = new ConectaDb();

    public boolean registrarUsuario(Usuario usuario) {
        boolean registrar = false;

        String sql = "INSERT INTO registrousuario values (" + usuario.getUs_documento()
                + ",'" + usuario.getUstipoDocumento()
                + "','" + usuario.getUs_usuario() + "','" + usuario.getUs_contraseña()
                + "','" + usuario.getUs_correo() + "','" + usuario.getUs_nombre()
                + "','" + usuario.getUs_apellido() + "','" + usuario.getUs_direccion()
                + "','" + usuario.getUs_numcelular() + "')";

        conecta.conectar();
        if (conecta.transaccion(sql)) {
            registrar = true;
            conecta.cerrarConexion();
        }

        return registrar;
    }

    public boolean Usuario(Usuario usuario) {
        boolean guardarUsuario = false;

        String sql = "INSERT INTO usuario values ('" + usuario.getUs_usuario() + "','" + usuario.getUs_contraseña() + "')";

        conecta.conectar();
        if (conecta.transaccion(sql)) {
            guardarUsuario = true;
            conecta.cerrarConexion();
        }
        return guardarUsuario;
    }

    public boolean Actualizar(Usuario usuario) {
        boolean actualizar = false;

        String sql = "UPDATE usuario set usuario_contrasena = '" + usuario.getUs_contraseña() + "'"
                + "where usuario_usuario = '" + usuario.getUs_usuario() + "'";

        conecta.conectar();
        if (conecta.transaccion(sql)) {
            actualizar = true;
            conecta.cerrarConexion();
        }
        return actualizar;
    }

    public boolean ActualizarRegistro(Usuario usuario) {
        boolean actualizar = false;

        String sql = "UPDATE registrousuario set registro_contrasena = '" + usuario.getUs_contraseña() + "'"
                + "where registro_usuario = '" + usuario.getUs_usuario() + "'";

        conecta.conectar();
        if (conecta.transaccion(sql)) {
            actualizar = true;
            conecta.cerrarConexion();
        }
        return actualizar;
    }

    public int validarAcceso(Usuario usuario) throws SQLException {
        int resultado = 0;
        String sql = "Select * from usuario where usuario_usuario = '" + usuario.getUs_usuario() + "' and usuario_contrasena = '"
                + usuario.getUs_contraseña() + "'";

        conecta.conectar();
        resultado = conecta.generaConsulta(sql);
        conecta.cerrarConexion();

        return resultado;
    }

    public int validarUsuario(Usuario usuario) throws SQLException {
        int resultado = 0;
        String sql = "Select * from registrousuario where registro_documento = '" + usuario.getUs_documento() + "' and registro_usuario = '"
                + usuario.getUs_usuario() + "'";

        conecta.conectar();
        resultado = conecta.generaConsulta(sql);
        conecta.cerrarConexion();

        return resultado;
    }

    public int existeUsuario(Usuario usuario) throws SQLException {
        int resultado = 0;
        String sql = "Select * from usuario where usuario_usuario = '"
                + usuario.getUs_usuario() + "'";

        conecta.conectar();
        resultado = conecta.generaConsulta(sql);
        conecta.cerrarConexion();

        return resultado;
    }

    public String generarNombreCompleto(String cadena) throws SQLException {
        String resultado = "";

        String sql = "Select registro_nombre || ' ' || registro_apellido from registroUsuario where registro_usuario = '" + cadena + "'";
        conecta.conectar();
        resultado = conecta.generaCadena(sql);
        conecta.cerrarConexion();

        return resultado;
    }

//     public static void main(String[] args) throws SQLException {
//        //Usuario Rusuario;
//        
//        //Rusuario = new Usuario(111,"CEDULA","kfalarcon","12345","kfalarcon@unicauca.edu.co","Kevin","Alarcon","Carrera 31","3137100671");
//        
//        DAOGestionUsuario dao = new DAOGestionUsuario();
//        //dao.registrarUsuario(Rusuario);
//        
////        Usuario us = new Usuario("jgozalez", "12324");
////        dao.Usuario(us);
//        //System.out.println(" esta ??" + dao.validarAcceso(us));
//        
//         System.out.println(dao.generarNombreCompleto("kfalarcon"));
//
//    }
}
