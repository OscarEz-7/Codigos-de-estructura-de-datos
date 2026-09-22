import java.util.Scanner;

public class Calculadora1 {

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Calculadora1 calc = new Calculadora1();

        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("\n¿Qué operación deseas realizar?");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Elige una opción (1-4): ");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.println("El resultado de la suma es: " + calc.sumar(num1, num2));
        } else if (opcion == 2) {
            System.out.println("El resultado de la resta es: " + calc.restar(num1, num2));
        } else if (opcion == 3) {
            System.out.println("El resultado de la multiplicación es: " + calc.multiplicar(num1, num2));
        } else if (opcion == 4) {
            System.out.println("El resultado de la división es: " + calc.dividir(num1, num2));
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
    

        
    
