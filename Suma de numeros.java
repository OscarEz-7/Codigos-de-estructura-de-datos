class SumaDeNumeros {

    public static void main(String[] args) {
        int n = 5; 
        int resultado = sumaN(n);
        System.out.println("La suma de los números del 1 al " + n + " es: " + resultado);
    }

    public static int sumaN(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sumaN(n - 1);
    }
}

