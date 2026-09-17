package modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro {

    private String titulo;
    private boolean disponible;
    private Prestamo prestamo;
    private List<Autor> autores;

    public Libro(String titulo) {
        this.titulo = titulo;
        this.disponible = true;
        this.autores = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean d) {
        this.disponible = d;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void agregarAutor(Autor autor) {
        this.autores.add(autor);
        autor.agregarLibro(this);
    }

    public void prestar() {
        if (!disponible) {
            System.out.println("El libro \"" + titulo + "\" no está disponible.");
            return;
        }
        this.prestamo = new Prestamo();
        this.disponible = false;
    }

    // Sobrecarga (overload): mismo nombre "prestar", distintos parámetros.
    public void prestar(Usuario usuario) {
        prestar();
        if (this.prestamo != null && usuario != null) {
            this.prestamo.registrarPrestamo(usuario);
        }
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    @Override
    public String toString() {
        return titulo + " (disponible: " + disponible + ")";
    }
}