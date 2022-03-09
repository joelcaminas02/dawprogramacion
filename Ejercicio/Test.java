public class Test {
    public static void main(String[] args) {
        Usuario usuario1= new Usuario("joel@pepe.com", "122345");
        
        usuario1.crearXML();
        Usuario.createUsuario("Ejercicio/usuarios/1.xml");

        Usuario.imprirmArrayList();
    }
}
