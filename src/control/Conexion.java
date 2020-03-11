package control;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    //<editor-fold defaultstate="collapsed" desc="Atributos" >
    private static Connection con = null;
    private static String user = "CineCo";
    private static String pass = "oracle";
    private static String endpoint = "localhost";
    private static String url = "jdbc:oracle:thin:@" + endpoint + ":1521:xe";
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodos" >
    public static Connection conectar() {
        try {
            con = DriverManager.getConnection(url, user, pass);//metodo que nos permite extablecer una conexion con la base de datos
            con.setAutoCommit(false);
            if (con != null) {
                System.out.println("Base de datos conectada");
            } else {
                System.out.println("No se conectó");
            }
        } catch (Exception e) {
            System.out.println("No se conectó" + e.getMessage());
            e.printStackTrace();
        }
        return con;
    }

    public void desconectar() {
        try {
            con.close();
        } catch (Exception e) {
        }
    }
    //</editor-fold>
}
