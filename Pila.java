public /**
 * Clase que representa una Pila (Stack) basada en memoria dinámica (nodos).
 * Funciona bajo el principio LIFO (Last In, First Out), donde el último
 * elemento ingresado es el primero en salir.
 */
public class Pila {

    /**
     * Clase interna que define la estructura del Nodo para la Pila.
     */
    private static class Nodo {
        int dato;
        Nodo siguiente;

        /**
         * Constructor del nodo. Recibe el valor a almacenar e inicializa 
         * la referencia al siguiente nodo como nula.
         */
        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    // Puntero que señala siempre al elemento en la parte superior de la pila.
    private Nodo tope;

    /**
     * Constructor de la Pila. Crea la pila vacía (sin elementos en el tope).
     */
    public Pila() {
        this.tope = null;
    }

    /**
     * Verifica si la pila no tiene elementos almacenados.
     * @return true si la pila está vacía, false en caso contrario.
     */
    public boolean estaVacia() {
        return tope == null;
    }

    /**
     * Agrega un nuevo elemento a la cima de la pila.
     * Conecta el nuevo nodo con el tope anterior y actualiza el tope.
     * @param dato El valor numérico que se va a apilar.
     */
    public void push(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    /**
     * Remueve y devuelve el elemento que se encuentra en la cima de la pila.
     * @return El valor del tope desapilado.
     * @throws IllegalStateException Si se intenta extraer un valor de una pila vacía.
     */
    public int pop() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        int valor = tope.dato;
        tope = tope.siguiente;
        return valor;
    }

    /**
     * Permite consultar el valor ubicado en la cima de la pila sin eliminarlo.
     * @return El dato en el tope.
     * @throws IllegalStateException Si la pila no contiene elementos.
     */
    public int peek() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return tope.dato;
    }

    /**
     * Cuenta la cantidad total de elementos que contiene la pila en el momento.
     * Recorre la estructura desde el tope hasta la base.
     * @return La cantidad de nodos presentes en la pila.
     */
    public int tamaño() {
        int contador = 0;
        Nodo actual = tope;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    /**
     * Muestra en consola todos los elementos guardados en la pila de forma secuencial,
     * desde el tope hacia la base con un separador visual.
     */
    public void imprimir() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return;
        }
        Nodo actual = tope;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) System.out.print(" ↓ ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
} {
    
}
