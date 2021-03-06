/*
    Creado por:
        Kevin Alarcón
        Nathalia Ruiz
        Luis Romero
        Juan Camilo Gonzalez
 */
package control;

import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOGestionFuncion {

    ConectaDb conecta = new ConectaDb();

    //<editor-fold defaultstate="collapsed" desc="Metodo para obtener las horas de una funcion" >
    public String horaFuncion(String cadena) throws SQLException {
        String resultado;

        String sql = "select horafuncion from funcion where tituloPelicula = '" + cadena + "';";
        conecta.conectar();
        resultado = conecta.generaCadena(sql);
        conecta.cerrarConexion();
        return resultado;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodo que obtiene la fecha de una funcion" >
    public String fechaFuncion(String cadena) throws SQLException {
        String resultado;

        String sql = "select fechafuncion from funcion where tituloPelicula = '" + cadena + "';";
        conecta.conectar();
        resultado = conecta.generaCadena(sql);
        conecta.cerrarConexion();
        return resultado;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodo que obtiene los efectos disponibles de una pelicula" >
    public String efectoPelicula(String cadena) throws SQLException {
        String resultado;

        String sql = "select efectoPelicula from funcion where tituloPelicula = '" + cadena + "';";
        conecta.conectar();
        resultado = conecta.generaCadena(sql);
        conecta.cerrarConexion();
        return resultado;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodo para obtener la sala de una funcion" >
    public String salaFuncion(String cadena) throws SQLException{
        String resultado;
        
        String sql = "select salaFuncion from funcion where tituloPelicula = '" + cadena + "';";
        conecta.conectar();
        resultado = conecta.generaCadena(sql);
        conecta.cerrarConexion();
        return resultado;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Funcion que splitea una cadena (horas pelicula)" >
    public Funcion splitHoras(String cadena) {
        Funcion funcion;
        String[] horas = cadena.split("/");
        String horaFuncion1 = horas[0];
        String horaFuncion2 = horas[1];

        funcion = new Funcion(horaFuncion1, horaFuncion2);
        return funcion;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Funcion que splitea una cadena (efectos pelicula)" >
    public Funcion splitEfectos(String cadena) {
        ArrayList<String> arrayEfectos = new ArrayList<>();
        Funcion funcion;
        String[] efectos = cadena.split("/");
        String efecto2D = efectos[0];
        String efecto3D = efectos[1];

        arrayEfectos.add(efecto2D);
        arrayEfectos.add(efecto3D);
        funcion = new Funcion(arrayEfectos);

        return funcion;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Funcion que permite validar la existencia de una pelicula en una tabla" >
    public boolean existePelicula(String cadena) throws SQLException{
        boolean bandera = false;
        int  resultado;
        String sql = "select count(*) from funcion where tituloPelicula = '"+ cadena +"'";
        conecta.conectar();
        resultado = conecta.existeDato(sql);
        conecta.cerrarConexion();
        
        if (resultado == 1){
            bandera = true;
        }
        return bandera;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodo que permite reservar una silla" >
    public boolean reservarSilla(int numSilla){
        boolean resultado = false;
        
        String sql = "UPDATE sillas set estadoSilla = 1 where numSilla = " + numSilla + ";";
        conecta.conectar();
        resultado = conecta.transaccion(sql);
        conecta.cerrarConexion();
        return resultado;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodo para quitar la reservacion de una silla" >
    public boolean quitarReservarSilla(int numSilla){
        boolean resultado = false;
        
        String sql = "UPDATE sillas set estadoSilla = 0 where numSilla = " + numSilla + ";";
        conecta.conectar();
        resultado = conecta.transaccion(sql);
        conecta.cerrarConexion();
        return resultado;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodo para buscar el estado de una silla dependiendo la sala" >
    public ArrayList<String> sillasSala(String nomSala) throws SQLException{
        ArrayList<String> sillasSala = new ArrayList<String>();
        String sql = "select numSilla || ',' || estadosilla from sillas inner join compraBoleta on sillas.idSilla = compraboleta.idSilla where sala = "+ nomSala + "';";
         conecta.conectar();
        sillasSala = conecta.generaColumnas(sql);
        conecta.cerrarConexion();
        
        return sillasSala;
    }
//</editor-fold>
        
//     public static void main(String[] args) throws SQLException {
//        //Usuario Rusuario;
//        
//        //Rusuario = new Usuario(111,"CEDULA","kfalarcon","12345","kfalarcon@unicauca.edu.co","Kevin","Alarcon","Carrera 31","3137100671");
//        
//        DAOGestionFuncion dao = new DAOGestionFuncion();
//        //dao.registrarUsuario(Rusuario);
//        
////        Usuario us = new Usuario("jgozalez", "12324");
////        dao.Usuario(us);
//        //System.out.println(" esta ??" + dao.validarAcceso(us));
//        
//         System.out.println(dao.existePelicula("EL HOMBRE INVISIBLE"));
//
//    }
}
