import java.util.Scanner;

public class ValidadorEntero {
    private int numero;

    public ValidadorEntero() {
        this.numero = 0;
    }

    public void leerEntero() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("ingresa el numero");
            if (sc.hasNextInt()) {
                this.numero = sc.nextInt();
                break;
            } else {
                System.out.println("numero no valido");
                sc.nextLine();
            }
        }
    }

    public int getNumero() {
        return this.numero;
    }

    public static void main(String[] args) {
        ValidadorEntero validador = new ValidadorEntero();
        validador.leerEntero();
        System.out.println("numero entero valido: " + validador.getNumero());
    }
}