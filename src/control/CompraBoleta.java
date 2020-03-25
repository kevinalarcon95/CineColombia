/*
    Creado por:
        Kevin Alarcón
        Nathalia Ruiz
        Luis Romero
        Juan Camilo Gonzalez
 */package control;

public class CompraBoleta {
    private String tituloPel;
    private String fecha;
    private String funcion;
    private String clasificacion;
    private String genero;
    private String caracteristicas;

    public CompraBoleta() {
    }

    public CompraBoleta(String tituloPel, String fecha, String funcion, String clasificacion, String genero, String caracteristicas) {
        this.tituloPel = tituloPel;
        this.fecha = fecha;
        this.funcion = funcion;
        this.clasificacion = clasificacion;
        this.genero = genero;
        this.caracteristicas = caracteristicas;
    }

    public String getTituloPel() {
        return tituloPel;
    }

    public void setTituloPel(String tituloPel) {
        this.tituloPel = tituloPel;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }   
}
