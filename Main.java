package herencia2;

public class Main {

    public static void main(String[] args) {

        // Crear un objeto
        LibroDigital libro1 = new LibroDigital( "Programacion ","Gabriel Garcia",2026,"PDF",
        15.5);

        // Mostrar información
        System.out.println("Libro Digital para el profe Roldan");

        libro1.mostrarInfo();
    }
}
