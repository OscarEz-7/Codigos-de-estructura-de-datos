class StringAlReves {

    public static void main(String[] args) {
        String texto = "Sistemas"; // Puedes cambiar esta palabra para probar con otra
        System.out.println("Texto original: " + texto);
        System.out.print("Texto al revés: ");
        recorrerStringAlReves(texto);
        System.out.println(); // Para dar un salto de línea al terminar
    }

    public static void recorrerStringAlReves(String str) {
        // Caso base: si la palabra está vacía (ya no quedan letras), la recursión termina
        if (str == null || str.isEmpty()) {
            return;
        }
        // Imprime la última letra de la palabra actual
        System.out.print(str.charAt(str.length() - 1));
        
        // Llamada recursiva: vuelve a mandar la palabra, pero quitándole esa última letra
        recorrerStringAlReves(str.substring(0, str.length() - 1));
    }
}