public class Puerta {
    private boolean abierta = false;

    public void abrir() {
        this.abierta = true;
    }

    public void cerrar() {
        this.abierta = false;
    }

    public String estado() {
        return this.abierta ? "La puerta está abierta." : "La puerta está cerrada.";
    }

    public static void main(String[] args) {
        Puerta miPuerta = new Puerta();
        
        System.out.println(miPuerta.estado());
        miPuerta.abrir();
        System.out.println(miPuerta.estado());
        miPuerta.cerrar();
        System.out.println(miPuerta.estado());
    }
}
