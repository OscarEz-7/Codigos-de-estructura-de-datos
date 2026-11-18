package herencia2;
public class LibroDigital extends Libro {

    // Atributos propios
    String formato;
    double tamanioMB;
    // Constructor
    public LibroDigital(String titulo, String autor, int anio, String formato, double tamanioMB) {

        super(titulo, autor, anio);

        this.formato = formato;
        this.tamanioMB = tamanioMB;
    }
    // Método

    public void mostrarInfo() {
        super.mostrarInfo();

        System.out.println("Formato: " + formato);
        System.out.println("Tamaño: " + tamanioMB + " MB");
    }
}
