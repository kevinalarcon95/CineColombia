
/*
    Creado por:
        Kevin Alarcón
        Nathalia Ruiz
        Luis Romero
        Juan Camilo Gonzalez
 */
package control;

import java.util.ArrayList;
import java.util.Date;

public class Funcion {

    private Date fechaFuncion;
    private String sala;
    private ArrayList<String> efectos;
    private String horaFuncion1;
    private String horaFuncion2;

    public Funcion() {

    }

    public Funcion(ArrayList<String> efectos) {
        this.efectos = efectos;
    }
   
    public Funcion(String horaFuncion1, String horaFuncion2) {
        this.horaFuncion1 = horaFuncion1;
        this.horaFuncion2 = horaFuncion2;
    }

    public Funcion(Date fechaFuncion, String sala, ArrayList<String> efectos ,String horaFuncion1, String horaFuncion2) {
        this.fechaFuncion = fechaFuncion;
        this.sala = sala;
        this.efectos = efectos;
        this.horaFuncion1 = horaFuncion1;
        this.horaFuncion2 = horaFuncion2;
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

    public ArrayList<String> getEfectos() {
        return efectos;
    }

    public void setEfectos(ArrayList<String> efectos) {
        this.efectos = efectos;
    }

    public String getHoraFuncion1() {
        return horaFuncion1;
    }

    public void setHoraFuncion1(String horaFuncion1) {
        this.horaFuncion1 = horaFuncion1;
    }

    public String getHoraFuncion2() {
        return horaFuncion2;
    }

    public void setHoraFuncion2(String horaFuncion2) {
        this.horaFuncion2 = horaFuncion2;
    }
}
