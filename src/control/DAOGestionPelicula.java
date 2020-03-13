
/*
    Creado por:
        Kevin Alarcón
        Nathalia Ruiz
        Luis Romero
        Juan Camilo Gonzalez
 */
package control;

import java.sql.SQLException;

public class DAOGestionPelicula {

    ConectaDb conecta = new ConectaDb();

    //<editor-fold defaultstate="collapsed" desc="Metodo que permite traer los datos de la pelicula" >
    public String infoPelicula(String cadena) throws SQLException {
        String resultado = "";

        String sql = "select tituloPelicula || '/' || fechaEstreno || '/' || clasificacionPelicula || '/' || sinopsisPelicula || '/' ||"+
	"paisOrigenPelicula || '/' || duracionPelicula || '/' || repartoPelicula || '/' || directorPelicula || '/' ||"+
	"generoPelicula || '/' || idiomaPelicula from Peliculas where tituloPelicula = '" + cadena +"'";
        conecta.conectar();
        resultado = conecta.generaCadena(sql);
        conecta.cerrarConexion();
        return resultado;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodo que permite splittear los datos extraidos desde la BD" >
    public Pelicula splitInfo(String cadena){
        Pelicula pelicula;
        String[] info = cadena.split("/");
        String titulo = info[0];
        String fecha = info[1];
        String clasificacion = info[2];
        String sinopsis = info[3];
        String pais = info[4];
        String duracion = info[5];
        String reparto = info[6];
        String director = info[7];
        String genero = info[8];
        String idioma = info[9];
        
        pelicula = new Pelicula(titulo, fecha, clasificacion, sinopsis, pais, duracion, reparto, director, genero, idioma);
        return pelicula;
    }
//</editor-fold>
    
//    public static void main(String[] args) throws SQLException {
//        DAOGestionPelicula daoPel = new DAOGestionPelicula();
//        Pelicula pel = new Pelicula();
//        System.out.println(daoPel.infoPelicula("UNIDOS"));
//        //daoPel.splitInfo(daoPel.infoPelicula("UNIDOS"));
//        pel = daoPel.splitInfo(daoPel.infoPelicula("UNIDOS"));
//        System.out.println(pel.getDirector());
//    }

}
