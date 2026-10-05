import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        // --- PARTE 1: Declaración de distintos tipos de listas ---

        // 1. Lista de enteras (En listas de Java se usa la clase 'Integer' en lugar de 'int')
        ArrayList<Integer> listaEnteros = new ArrayList<>();

        // 2. Lista de cadenas (Textos)
        ArrayList<String> listaCadenas = new ArrayList<>();

        // 3. Lista de booleanas (Verdadero o falso)
        ArrayList<Boolean> listaBooleanas = new ArrayList<>();


        // --- PARTE 2: Ejemplos de usos en programación 

        // Uso 1: Almacenar colecciones de datos relacionados (ej. inventario o nombres)
        listaCadenas.add("Monitor");
        listaCadenas.add("Teclado");
        System.out.println("Inventario actual: " + listaCadenas);

        // Uso 2: Guardar valores numéricos para procesarlos (ej. calificaciones de un semestre)
        listaEnteros.add(95);
        listaEnteros.add(88);
        listaEnteros.add(100);
        System.out.println("Calificaciones guardadas: " + listaEnteros);

        // Uso 3: Registrar estados o historiales (ej. respuestas de un examen de Verdadero/Falso)
        listaBooleanas.add(true);
        listaBooleanas.add(false);
        listaBooleanas.add(true);
        System.out.println("Registro de respuestas: " + listaBooleanas);
    }
}