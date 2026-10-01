class Fibonacci {

    public static void main(String[] args) {
        int posicion = 6; // Cambia este valor para buscar otra posición en la serie
        int resultado = fibonacci(posicion);
        System.out.println("El número de Fibonacci en la posición " + posicion + " es: " + resultado);
    }

    public static int fibonacci(int n) {
        // Caso base: las posiciones 0 y 1 devuelven su mismo valor (0 y 1)
        if (n <= 1) {
            return n;
        }
        // Llamada recursiva: suma los dos números anteriores de la serie
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}