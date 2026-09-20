package modelo;

public class LibroDigital extends Libro {

    private String formatoArchivo;
    private double tamanoMB;

    public LibroDigital(String titulo, String formatoArchivo, double tamanoMB) {
        super(titulo);
        this.formatoArchivo = formatoArchivo;
        this.tamanoMB = tamanoMB;
    }

    public String getFormatoArchivo() {
        return formatoArchivo;
    }

    public void setFormatoArchivo(String formatoArchivo) {
        this.formatoArchivo = formatoArchivo;
    }

    public double getTamanoMB() {
        return tamanoMB;
    }

    public void setTamanoMB(double tamanoMB) {
        this.tamanoMB = tamanoMB;
    }

    @Override
    public void prestar() {
        super.prestar();
        System.out.println("Acceso de descarga generado para el libro digital \"" + getTitulo()
                + "\" (" + formatoArchivo + ", " + tamanoMB + " MB).");
    }

    @Override
    public String toString() {
        return getTitulo() + " [Digital - " + formatoArchivo + "]";
    }
}