package control;

import java.util.Date;

public class Funcion {
    private Date fechaFuncion;
    private String sala;
    private String efecto;
    private String horaFuncion;

    public Funcion(Date fechaFuncion, String sala, String efecto, String horaFuncion) {
        this.fechaFuncion = fechaFuncion;
        this.sala = sala;
        this.efecto = efecto;
        this.horaFuncion = horaFuncion;
    }

    public Date getFechaFuncion() {
        return fechaFuncion;
    }

    public void setFechaFuncion(Date fechaFuncion) {
        this.fechaFuncion = fechaFuncion;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    public String getHoraFuncion() {
        return horaFuncion;
    }

    public void setHoraFuncion(String horaFuncion) {
        this.horaFuncion = horaFuncion;
    }
}
