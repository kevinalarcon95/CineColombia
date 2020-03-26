/*
    Creado por:
        Kevin Alarcón
        Nathalia Ruiz
        Luis Romero
        Juan Camilo Gonzalez
 */
package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConectaDb {

    //<editor-fold defaultstate="collapsed" desc="Declaracion de variables" >
    private String user, pass, urlConectar, driver;// definicion de variables para la coneccion
    public Connection conection; // variable de la clase conect para conectar la base de datos
    private java.sql.Statement statement; // estatement controla las coneciones y las ejecuciones de las sql 
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodo constructor para la clase conectar" >
    public ConectaDb() {

    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodo que permite la conexion con la BD" >
    public void conectar() {
        user = "postgres";
        pass = "123456789";
        driver = "org.postgresql.Driver";
        urlConectar = "jdbc:postgresql://localhost/CineColombia";

        try {
            Class.forName(driver);
            conection = DriverManager.getConnection(urlConectar, user, pass);
            System.out.println("SI SE CONECTA A LA BD");

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();

        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("No conecto a la db");
        }

    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodo para cerrar la coneccion a la db" >
    public void cerrarConexion() {
        try {
            conection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodo para generar las consultas" >
    public ResultSet retornarconsultas(String cadConsulta) {
        ResultSet resultado = null;

        try {
            statement = conection.createStatement();
            resultado = statement.executeQuery(cadConsulta);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return resultado;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodo para cerrar el resultado" >
    public void cierraResultado(ResultSet resutado) {
        try {

            resutado.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodo para la transaccion de una consulta (Boolean)" >
    public boolean transaccion(String cadenaSql) {
        //boolean ejecuta= false;
        try {
            statement = conection.createStatement();
            statement.execute(cadenaSql);
            statement.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodo que retorna cantidad de filas" >
    public int rowCount(ResultSet resultado) {
        int i = 0;
        try {

            resultado.last();
            i = resultado.getRow();
            resultado.beforeFirst();
        } catch (SQLException ex) {
            Logger.getLogger(ConectaDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodo que retorna un valor si existe el registro en la BD" >
    public int generaConsulta(String cadenaSql) throws SQLException {
        int resultado = 0;

        Statement st = conection.createStatement();
        ResultSet rs = st.executeQuery(cadenaSql);

        while (rs.next()) {
            resultado++;
        }
        return resultado;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodo que retorna una cadena desde la BD" >
    public String generaCadena(String cadenaSql) throws SQLException {
        String resultado = "";

        Statement st = conection.createStatement();
        ResultSet rs = st.executeQuery(cadenaSql);

        while (rs.next()) {
            resultado = rs.getString(1);
        }
        return resultado;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodo que retorna 0 o 1" >
    public int existeDato(String cadenaSql) throws SQLException{
        String resultado = "";
        int valor = 0;
        Statement st = conection.createStatement();
        ResultSet rs = st.executeQuery(cadenaSql);

        while (rs.next()) {
            resultado = rs.getString(1);
        }
        valor = Integer.parseInt(resultado);
        return valor;
    }
//</editor-fold>

//  public static void main(String arsg[] ) throws SQLException{
// ConectaDb cc = new ConectaDb();
//     cc.conectar();
////     String sql="Select * from usuario where usuario='kfalarcon' and contrasena='12345'";
////      System.out.println(cc.generaConsulta(sql));
//
//    //String sql = "select registro_nombre|| ' ' || registro_apellido from registroUsuario where registro_documento = 1061782493";
//    String sql = "select tituloPelicula || ',' || fechaEstreno || ',' || clasificacionPelicula || ',' || sipnosispelicula || ',' || paisOrigenPelicula || ',' || duracionPelicula || ',' || repartoPelicula || ',' || directorPelicula || ',' || generoPelicula || ',' || idiomaPelicula from Peliculas where tituloPelicula = 'EL HOMBRE INVISIBLE'";  
//    System.out.println(cc.generaCadena(sql));
//      
//  }
}
