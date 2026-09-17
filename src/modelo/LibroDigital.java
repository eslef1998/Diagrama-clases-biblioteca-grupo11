package modelo;

public class LibroDigital extends Libro {

    private String formatoArchivo;
    private double tamañoMB;

    public LibroDigital(String titulo, String formatoArchivo, double tamañoMB) {
        super(titulo);
        this.formatoArchivo = formatoArchivo;
        this.tamañoMB = tamañoMB;
    }

    public String getFormatoArchivo() {
        return formatoArchivo;
    }

    public void setFormatoArchivo(String formatoArchivo) {
        this.formatoArchivo = formatoArchivo;
    }

    public double getTamañoMB() {
        return tamañoMB;
    }

    public void setTamañoMB(double tamañoMB) {
        this.tamañoMB = tamañoMB;
    }

    @Override
    public void prestar() {
        super.prestar();
        System.out.println("Acceso de descarga generado para el libro digital \"" + getTitulo()
                + "\" (" + formatoArchivo + ", " + tamañoMB + " MB).");
    }

    @Override
    public String toString() {
        return getTitulo() + " [Digital - " + formatoArchivo + "]";
    }
}