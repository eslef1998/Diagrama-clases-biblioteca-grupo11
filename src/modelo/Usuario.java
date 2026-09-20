package modelo;

public class Usuario {

    private String nombre;
    private String apellido;
    private String identificacion;

    public Usuario(String nombre, String apellido, String identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
    }

    // Métodos definidos explícitamente en el diagrama UML
    public String consultarNombre() {
        return nombre;
    }

    public String consultarApellido() {
        return apellido;
    }

    public String consultarIdentificacion() {
        return identificacion;
    }

    // Getters y Setters estándar para mantener el encapsulamiento
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " (ID: " + identificacion + ")";
    }
}