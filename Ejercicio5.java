public class Ejercicio5 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            // El operador && (AND) verifica que ambas condiciones se cumplan al mismo tiempo
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i + " -> Es divisible entre 2 y 3");
            } else {
                System.out.println(i);
            }
        }

    }
}
