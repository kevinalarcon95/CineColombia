/*
    Creado por:
        Kevin Alarcón
        Nathalia Ruiz
        Luis Romero
        Juan Camilo Gonzalez
 */
package control;

public class Pelicula {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos" >
    private String tituloPelicula;
    private String fechaEstreno;
    private String Clasificación;
    private String Sinopsis;
    private String paisOrigen;
    private String duracion;
    private String reparto;
    private String director;
    private String genero;
    private String idioma;
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructor por defecto y parametrizado" >
    public Pelicula() {
    }

    
    public Pelicula(String tituloPelicula, String fechaEstreno, String Clasificación, String Sinopsis, String paisOrigen, String duracion, String reparto, String director, String genero, String idioma) {
        this.tituloPelicula = tituloPelicula;
        this.fechaEstreno = fechaEstreno;
        this.Clasificación = Clasificación;
        this.Sinopsis = Sinopsis;
        this.paisOrigen = paisOrigen;
        this.duracion = duracion;
        this.reparto = reparto;
        this.director = director;
        this.genero = genero;
        this.idioma = idioma;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getter y Setter" >
    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public String getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(String fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public String getClasificación() {
        return Clasificación;
    }

    public void setClasificación(String Clasificación) {
        this.Clasificación = Clasificación;
    }

    public String getSinopsis() {
        return Sinopsis;
    }

    public void setSinopsis(String Sinopsis) {
        this.Sinopsis = Sinopsis;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getReparto() {
        return reparto;
    }

    public void setReparto(String reparto) {
        this.reparto = reparto;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
//</editor-fold>

}
