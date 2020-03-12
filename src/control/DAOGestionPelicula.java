
/*
    Creado por:
        Kevin Alarcón
        Nathalia Ruiz
        Luis Romero
        Juan Camilo Gonzalez
 */package control;

import java.sql.SQLException;

public class DAOGestionPelicula {
    ConectaDb conecta = new ConectaDb();
    
    public String infoPelicula(Pelicula pelicula) throws SQLException{
        String resultado = "";
        
        String sql = "select '" + pelicula.getTituloPelicula() + "'|| ',' ||'" + pelicula.getFechaEstreno()+ "'|| ',' || '" + pelicula.getClasificación() 
                + "'|| ',' ||'"+ pelicula.getSinopsis()+"'|| ',' || '" + pelicula.getPaisOrigen() + "'|| ',' ||'" + pelicula.getDuracion() + "'|| ',' ||'"
                + pelicula.getReparto() + "'|| ',' ||'" + pelicula.getDirector() + "'|| ',' ||'" + pelicula.getGenero() + "'|| ',' ||'"
                + pelicula.getIdioma() + "' from Peliculas where tituloPelicula = '" + pelicula.getTituloPelicula() +"';";
        
        conecta.conectar();
        resultado = conecta.generaCadena(sql);
        conecta.cerrarConexion();

        return resultado;
    }
}
