package control;

import java.sql.Date;

public class Usuario {

    private long us_documento;
    private String ustipoDocumento;
    private String us_usuario;
    private String us_contraseña;
    private String us_correo;
    private String us_nombre;
    private String us_apellido;
    private String us_direccion;
    private String us_numcelular;

    public Usuario() {
    }
    
    public Usuario(String us_usuario){
        this.us_usuario = us_usuario;
    }
    public Usuario(String us_usuario, String us_contraseña) {
        this.us_usuario = us_usuario;
        this.us_contraseña = us_contraseña;
    }

    public Usuario(long us_documento, String us_usuario) {
        this.us_documento = us_documento;
        this.us_usuario = us_usuario;
    }
   
    public Usuario(long us_documento, String ustipoDocumento, String us_usuario, String us_contraseña, String us_correo, String us_nombre, String us_apellido, String us_direccion, String us_numcelular) {
        this.us_documento = us_documento;
        this.ustipoDocumento = ustipoDocumento;
        this.us_usuario = us_usuario;
        this.us_contraseña = us_contraseña;
        this.us_correo = us_correo;
        this.us_nombre = us_nombre;
        this.us_apellido = us_apellido;
        this.us_direccion = us_direccion;
        this.us_numcelular = us_numcelular;
    }

    public long getUs_documento() {
        return us_documento;
    }

    public void setUs_documento(long us_documento) {
        this.us_documento = us_documento;
    }

    public String getUstipoDocumento() {
        return ustipoDocumento;
    }

    public void setUstipoDocumento(String ustipoDocumento) {
        this.ustipoDocumento = ustipoDocumento;
    }

    public String getUs_usuario() {
        return us_usuario;
    }

    public void setUs_usuario(String us_usuario) {
        this.us_usuario = us_usuario;
    }

    public String getUs_contraseña() {
        return us_contraseña;
    }

    public void setUs_contraseña(String us_contraseña) {
        this.us_contraseña = us_contraseña;
    }

    public String getUs_correo() {
        return us_correo;
    }

    public void setUs_correo(String us_correo) {
        this.us_correo = us_correo;
    }

    public String getUs_nombre() {
        return us_nombre;
    }

    public void setUs_nombre(String us_nombre) {
        this.us_nombre = us_nombre;
    }

    public String getUs_apellido() {
        return us_apellido;
    }

    public void setUs_apellido(String us_apellido) {
        this.us_apellido = us_apellido;
    }

    public String getUs_direccion() {
        return us_direccion;
    }

    public void setUs_direccion(String us_direccion) {
        this.us_direccion = us_direccion;
    }

    public String getUs_numcelular() {
        return us_numcelular;
    }

    public void setUs_numcelular(String us_numcelular) {
        this.us_numcelular = us_numcelular;
    }

    @Override
    public String toString() {
        return "Usuario{" + "us_documento=" + us_documento + ", ustipoDocumento=" + ustipoDocumento + ", us_usuario=" + us_usuario + ", us_contrase\u00f1a=" + us_contraseña + ", us_correo=" + us_correo + ", us_nombre=" + us_nombre + ", us_apellido=" + us_apellido + ", us_direccion=" + us_direccion + ", us_numcelular=" + us_numcelular + '}';
    }
}
