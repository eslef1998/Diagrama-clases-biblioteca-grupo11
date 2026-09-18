package modelo;

import java.util.Date;

public class Prestamo {

    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private Usuario usuario;

    public Prestamo() {
    }

    public void registrarPrestamo(Usuario usuario) {
        this.usuario = usuario;
        this.fechaPrestamo = new Date();
    }

    public void registrarDevolucion() {
        this.fechaDevolucion = new Date();
    }

    public boolean consultarEstado() {
        return fechaDevolucion == null;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}