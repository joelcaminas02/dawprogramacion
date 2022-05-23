import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    public static ArrayList <Usuario> usuarios = new ArrayList<>();
    private static Scanner lector = new Scanner(System.in);
    private String nombre;
    private String apellidos;
    private String email;
    private int telefono;

    public Usuario(){
        usuarios.add(this);
    }

    public Usuario(String nombre, String apellidos, String email, int telefono){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email =email;
        this.telefono = telefono;
        usuarios.add(this);
    }

    public static Usuario introducirUsuario(){
        System.out.println("Introduce el nombre del usuario");
        String nombre = lector.next();
        System.out.println("Introduce los apellidos");
        String apellidos = lector.next()+" "+lector.next();
        System.out.println("Introduce el email");
        String email = lector.next();
        System.out.println("Introduce el telefono");
        int telefono = Integer.parseInt(lector.next());
        
        Usuario usuario = new Usuario(nombre, apellidos, email, telefono);
        return usuario;
    }

    @Override
    public String toString() {
        return "Nombre: "+this.nombre+"\t Apellidos: "+this.apellidos+"\t email: "+this.email+"\t telefono: "+this.telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}
