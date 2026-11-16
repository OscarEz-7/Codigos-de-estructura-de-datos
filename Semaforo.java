public class Semaforo {
    private String color = "rojo";

    public void cambiarRojo() {
        this.color = "rojo";
    }

    public void cambiarAmarillo() {
        this.color = "amarillo";
    }

    public void cambiarVerde() {
        this.color = "verde";
    }

    public String mostrarColor() {
        return "El semáforo está en color: " + this.color;
    }

    public static void main(String[] args) {
        Semaforo miSemaforo = new Semaforo();
        
        System.out.println(miSemaforo.mostrarColor());
        miSemaforo.cambiarVerde();
        System.out.println(miSemaforo.mostrarColor());
        miSemaforo.cambiarAmarillo();
        System.out.println(miSemaforo.mostrarColor());
    }
}
