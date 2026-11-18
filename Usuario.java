package herencia;
public class Usuario extends Persona {
    String correo;
    String contrasena;

    public Usuario(String nombre, int edad, String sexo,
                   String correo, String contrasena) {

        super(nombre, edad, sexo);

        this.correo = correo;
        this.contrasena = contrasena;
    }

    public void informacionUsuario() {
        System.out.println("informacion del ususario");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println("Correo: " + correo);
        System.out.println("Contraseña: " + contrasena);
    }
}
