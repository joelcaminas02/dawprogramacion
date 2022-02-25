public class Test {
    public static void main(String[] args) {
        Usuario usuario1= new Usuario("joel@pepe.com", "122345");
        Usuario usuario2= new Usuario("lucas@gmail.com", "122345");
        Usuario usuario3= new Usuario("messi@gmail.com", "122345");
        Usuario usuario4= new Usuario("joel@gmail.com", "122345");
        Media media1=new Media("Pepe", "Juan", MediaType.AUDIO, usuario1);
        usuario1.getEmail();

        Usuario.imprirmArrayList();
        
        Usuario.imprirmArrayList();

        Usuario usuario5=new Usuario("mimadre@klk.com", "834783");

        Usuario.imprirmArrayList();

        Media.borrarMediaDominios("@pepe.com");

        Usuario.imprirmArrayList();

        Media.imprirmArrayList();
    }
}
