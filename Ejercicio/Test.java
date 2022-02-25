public class Test {
    public static void main(String[] args) {
        Usuario usuario1= new Usuario("joel@gmail.com", "122345");
        Usuario usuario2= new Usuario("lucas@gmail.com", "122345");
        Usuario usuario3= new Usuario("messi@gmail.com", "122345");
        Usuario usuario4= new Usuario("joel@gmail.com", "122345");

        usuario1.getEmail();

        Usuario.imprirmArrayList();

        Usuario.borrarUsuario(0);
        
        Usuario.imprirmArrayList();

        Usuario usuario5=new Usuario("mimadre@klk.com", "834783");

        Usuario.imprirmArrayList();

        Usuario.borrarDominios("@gmail.com");

        Usuario.imprirmArrayList();
    }
}
