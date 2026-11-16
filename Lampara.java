public class Lampara {
    private boolean encendida = false;

    public void encender() {
        this.encendida = true;
    }

    public void apagar() {
        this.encendida = false;
    }

    public String estado() {
        return this.encendida ? "La lámpara está encendida." : "La lámpara está apagada.";
    }

    public static void main(String[] args) {
        Lampara miLampara = new Lampara();
        
        System.out.println(miLampara.estado());
        miLampara.encender();
        System.out.println(miLampara.estado());
        miLampara.apagar();
        System.out.println(miLampara.estado());
    }
}
