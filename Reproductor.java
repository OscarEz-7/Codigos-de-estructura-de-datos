public class Reproductor {
    public String cancion = "Songs ";
    public boolean reproduciendo = false;

    public void reproducir(String nuevaCancion) {
        this.cancion = nuevaCancion;
        this.reproduciendo = true;
    }

    public void pausar() {
        this.reproduciendo = false;
    }

    public String estado() {
        if (this.reproduciendo) {
            return "Reproduciendo: " + this.cancion;
        } else {
            return "Pausado (Cancion: " + this.cancion + ")";
        }
    }

    public static void main(String[] args) {
        Reproductor miReproductor = new Reproductor();
        
        miReproductor.reproducir("Songs ");
        System.out.println(miReproductor.estado());
        
        miReproductor.pausar();
        System.out.println(miReproductor.estado());
    }
}
