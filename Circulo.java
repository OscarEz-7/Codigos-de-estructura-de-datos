import java.util.Scanner;

public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo:");
        double r = sc.nextDouble();

        Circulo miCirculo = new Circulo(r);
        System.out.println("Radio del circulo: " + miCirculo.getRadio());
        System.out.println("Area calculada: " + miCirculo.calcularArea());
        sc.close();
    }
}