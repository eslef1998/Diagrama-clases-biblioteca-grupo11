import java.util.ArrayList;
import java.util.List;
import modelo.Autor;
import modelo.Libro;
import modelo.LibroDigital;
import modelo.Usuario;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("  SISTEMA DE GESTION DE BIBLIOTECA - POO  ");
        System.out.println("==========================================");

        // 1. Instanciacion de objetos (Autor y Usuario)
        Autor autor1 = new Autor("Gabriel Garcia Marquez", "Colombiana");
        Usuario usuario1 = new Usuario("Juan", "Perez", "1012345678");

        // 2. Creacion de Libros (Polimorfismo: Referencias de tipo 'Libro')
        Libro libroFisico = new Libro("Cien anos de soledad");
        LibroDigital libroDigital = new LibroDigital("El amor en los tiempos del colera", "PDF", 4.5);

        // 3. Aplicacion de Agregacion (Asociar autor a los libros)
        libroFisico.agregarAutor(autor1);
        libroDigital.agregarAutor(autor1);

        // Lista de tipo superclase 'Libro' que contiene subclases (Polimorfismo)
        List<Libro> catalogo = new ArrayList<>();
        catalogo.add(libroFisico);
        catalogo.add(libroDigital);

        // 4. Demostracion de funcionamiento y relaciones
        System.out.println("\n--- DATOS DE USUARIO Y AUTOR ---");
        System.out.println("Usuario: " + usuario1.consultarNombre() + " " + usuario1.consultarApellido());
        System.out.println("Autor registrado: " + autor1.getNombre() + " (" + autor1.getNacionalidad() + ")");

        System.out.println("\n--- PROCESO DE PRESTAMO ---");
        for (Libro libro : catalogo) {
            System.out.println("\nProcesando libro: " + libro.getTitulo());

            // Sobrecarga de metodo: prestar(Usuario) invoca a prestar()
            // Sobrescritura (@Override): LibroDigital ejecuta su propio prestar()
            libro.prestar(usuario1);

            if (libro.getPrestamo() != null) {
                System.out.println("Prestamo registrado exitosamente a: "
                        + libro.getPrestamo().getUsuario().getNombre());
            }
        }

        System.out.println("\n--- ESTADO FINAL DEL CATALOGO ---");
        for (Libro libro : catalogo) {
            System.out.println("- " + libro);
        }
    }
}