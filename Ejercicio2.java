import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // La palabra 'final' sirve para declarar una constante (un valor que no cambia)
        final double IVA = 0.21;

        // Pedimos el precio original
        System.out.print("Ingresa el precio del producto: ");
        double precioOriginal = scanner.nextDouble();

        // Calculamos el IVA y el precio final
        double montoIVA = precioOriginal * IVA;
        double precioFinal = precioOriginal + montoIVA;

        // Mostramos los resultados pedidos
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("El precio original del producto: $" + precioOriginal);
        System.out.println("El porcentaje de IVA aplicado: 21%");
        System.out.println("El precio final con IVA incluido: $" + precioFinal);

        scanner.close();
    }
}