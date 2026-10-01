class Potencia {

    public static void main(String[] args) {
        int base = 2; 
        int exponente = 3; // Puedes cambiar estos valores para probar
        int resultado = potencia(base, exponente);
        System.out.println("El número " + base + " elevado a la potencia de " + exponente + " es: " + resultado);
    }

    public static int potencia(int base, int exponente) {
        // Caso base: cualquier número elevado a la 0 siempre es 1
        if (exponente == 0) {
            return 1;
        }
        // Llamada recursiva: multiplica la base por el resultado de la potencia con un exponente menor
        return base * potencia(base, exponente - 1);
    }
}
