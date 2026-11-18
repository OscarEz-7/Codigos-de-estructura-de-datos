package herencia2;

public class Main {

    public static void main(String[] args) {

        // Crear un objeto
        LibroDigital libro1 = new LibroDigital( "Estructura de datos ","Linares Garcia",2026,"PDF",
        15.5);

        // Mostrar información
        System.out.println("Libro Digital para el profe ");

        libro1.mostrarInfo();
    }
}
