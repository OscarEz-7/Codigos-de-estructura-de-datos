/**
 * Clase principal encargada de la ejecución de pruebas y validación del 
 * comportamiento de las estructuras Pila y Cola.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   DEMOSTRACIÓN DE ESTRUCTURAS DE DATOS   ");
        System.out.println("==========================================\n");

        // --- PRUEBA DE PILA (LIFO) ---
        System.out.println("1. PRUEBA DE PILA (LIFO)");
        System.out.println("------------------------------------------");
        Pila pila = new Pila();

        System.out.println("¿La pila está vacía?: " + pila.estaVacia());
        
        System.out.println("Apilando valores: 10, 20, 30");
        pila.push(10);
        pila.push(20);
        pila.push(30);

        System.out.print("Contenido actual de la pila: ");
        pila.imprimir();

        System.out.println("Elemento en la cima (peek): " + pila.peek());
        System.out.println("Desapilando elemento (pop): " + pila.pop());

        System.out.print("Pila tras el pop: ");
        pila.imprimir();
        System.out.println("Número de elementos restantes: " + pila.tamaño());

        System.out.println("\n------------------------------------------\n");

        // --- PRUEBA DE COLA (FIFO) ---
        System.out.println("2. PRUEBA DE COLA (FIFO)");
        System.out.println("------------------------------------------");
        Cola cola = new Cola();

        System.out.println("¿La cola está vacía?: " + cola.estaVacia());

        System.out.println("Encolando valores: 10, 20, 30");
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);

        System.out.print("Contenido actual de la cola: ");
        cola.imprimir();

        System.out.println("Primer elemento en cola (verFrente): " + cola.verFrente());
        System.out.println("Desencolando elemento (desencolar): " + cola.desencolar());

        System.out.print("Cola tras el desencolar: ");
        cola.imprimir();
        System.out.println("Número de elementos restantes: " + cola.tamaño());
        System.out.println("==========================================");
    }
}
