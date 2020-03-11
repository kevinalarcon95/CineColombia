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

    private String user, pass, urlConectar, driver;// definicion de variables para la coneccion
    public Connection conection; // variable de la clase conect para conectar la base de datos
    private java.sql.Statement statement; // estatement controla las coneciones y las ejecuciones de las sql   
    //---------------------metodo constructor para la clase conectar

    public ConectaDb() {

    }
    //---------------------fin del constructor

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

//-------------------metodo para cerrar la coneccion a la db
    public void cerrarConexion() {
        try {
            conection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

//metodo para generar las consultas
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

    //------------------------------
    //----------------metodo para cerrar el resultado
    public void cierraResultado(ResultSet resutado) {
        try {

            resutado.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    // ---------------------fin del metodo

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
    //----------------------fin del metodo

    //------------
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

    public int generaConsulta(String cadenaSql) throws SQLException {
        int resultado = 0;

        Statement st = conection.createStatement();
        ResultSet rs = st.executeQuery(cadenaSql);

        while (rs.next()) {
            resultado++;
        }
        return resultado;
    }
    
    public String generaCadena(String cadenaSql) throws SQLException{
        String resultado = "";

        Statement st = conection.createStatement();
        ResultSet rs = st.executeQuery(cadenaSql);

        while (rs.next()) {
            resultado = rs.getString(1);
        }
        return resultado;
    } 
    //----------------------

  public static void main(String arsg[] ) throws SQLException{
 ConectaDb cc = new ConectaDb();
     cc.conectar();
//     String sql="Select * from usuario where usuario='kfalarcon' and contrasena='12345'";
//      System.out.println(cc.generaConsulta(sql));

    String sql = "select registro_nombre|| ' ' || registro_apellido from registroUsuario where registro_documento = 1061782493";
      System.out.println(cc.generaCadena(sql));
      
  }

}
