/**
 * Clase que representa una Cola (Queue) construida dinámicamente con nodos.
 * Opera bajo la regla FIFO (First In, First Out), de forma que el primer
 * elemento en ingresar será el primero en ser procesado y extraído.
 */
public class Cola {

    /**
     * Clase interna que define cada celda/nodo contenedor de la Cola.
     */
    private static class Nodo {
        int dato;
        Nodo siguiente;

        /**
         * Inicializa un nuevo nodo con el valor indicado y sin enlace subsiguiente.
         */
        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    // Puntero al primer nodo ingresado (por donde se descolará).
    private Nodo frente;
    // Puntero al último nodo ingresado (por donde se encolará).
    private Nodo fin;

    /**
     * Constructor de la Cola. Define los límites frente y fin como nulos.
     */
    public Cola() {
        this.frente = null;
        this.fin = null;
    }

    /**
     * Determina si la cola se encuentra sin registros.
     * @return true si el frente no apunta a ningún nodo, false de lo contrario.
     */
    public boolean estaVacia() {
        return frente == null;
    }

    /**
     * Inserta un nuevo elemento en la parte final de la cola.
     * Maneja el caso especial si la estructura está completamente vacía.
     * @param dato El valor entero a encolar.
     */
    public void encolar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
            return;
        }
        fin.siguiente = nuevo;
        fin = nuevo;
    }

    /**
     * Retira y entrega el primer elemento que ingresó a la cola.
     * Ajusta los punteros frente y fin si la cola se queda vacía tras la extracción.
     * @return El entero que estaba al frente.
     * @throws IllegalStateException Si la cola no tiene nodos.
     */
    public int desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        int valor = frente.dato;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null;
        }
        return valor;
    }

    /**
     * Permite inspeccionar el valor que está listo para salir (en el frente)
     * sin removerlo de la estructura.
     * @return El valor almacenado en el frente.
     * @throws IllegalStateException Si la cola está vacía.
     */
    public int verFrente() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return frente.dato;
    }

    /**
     * Realiza un conteo iterativo de todos los elementos presentes en la cola.
     * @return El número total de nodos activos.
     */
    public int tamaño() {
        int contador = 0;
        Nodo actual = frente;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    /**
     * Imprime en pantalla la secuencia de datos contenidos desde el frente
     * hasta el final con flechas indicativas.
     */
    public void imprimir() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
            return;
        }
        Nodo actual = frente;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) System.out.print(" → ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
