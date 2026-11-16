public class Termometro {
    private double temperatura = 25.0;

    public void subir(double grados) {
        this.temperatura += grados;
    }

    public void bajar(double grados) {
        this.temperatura -= grados;
    }

    public void mostrarTemperatura() {
        System.out.println("Temperatura actual: " + this.temperatura + " °C");
    }

    public static void main(String[] args) {
        Termometro miTermometro = new Termometro();
        
        miTermometro.mostrarTemperatura();
        miTermometro.subir(5.5);
        miTermometro.mostrarTemperatura();
        miTermometro.bajar(2.0);
        miTermometro.mostrarTemperatura();
    }
}
