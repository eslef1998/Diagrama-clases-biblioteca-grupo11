package modelo;

import java.util.ArrayList;
import java.util.List;

public class Autor {

    private String nombre;
    private String nacionalidad;
    private final List<Libro> libros;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
}