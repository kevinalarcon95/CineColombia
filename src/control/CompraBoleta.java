/*
    Creado por:
        Kevin Alarcón
        Nathalia Ruiz
        Luis Romero
        Juan Camilo Gonzalez
 */package control;

public class CompraBoleta {
    private String duracion;
    private String clasificacion;
    private String sala;
    private String tituloPel;
    private String fecha;
    private String funcion;
    private String idioma;
    private String efecto;
    private int cantBoletas;
    private long total;
    private String medioPago;

    public CompraBoleta() {
    }
    
    public CompraBoleta(String duracion, String clasificacion, String sala, String tituloPel, String fecha, String funcion, String idioma, String efecto, int cantBoletas, long total, String medioPago) {
        this.duracion = duracion;
        this.clasificacion = clasificacion;
        this.sala = sala;
        this.tituloPel = tituloPel;
        this.fecha = fecha;
        this.funcion = funcion;
        this.idioma = idioma;
        this.efecto = efecto;
        this.cantBoletas = cantBoletas;
        this.total = total;
        this.medioPago = medioPago;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
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

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    public int getCantBoletas() {
        return cantBoletas;
    }

    public void setCantBoletas(int cantBoletas) {
        this.cantBoletas = cantBoletas;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }
}
