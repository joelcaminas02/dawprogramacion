package Control04;

import java.io.IOException;

public class PersistenciaTest {
    public static void main(String[] args) throws IOException {
        
        Cliente cl1 =  new Cliente("joel@pepo", "12345678k", "Joel", "Carrillero");
        Cliente cl2 =  new Cliente("jose@pepo", "12348978k", "Juan", "Calvo");
        Cliente cl3 =  new Cliente("juan@pepo", "12341278k", "Pepe", "Sendo");
        Cliente cl4 =  new Cliente("pepe@pepo", "12344378k", "Mesi", "Kbron");
        Cliente cl5 =  new Cliente("aaaa@pepo", "12344378k", "Jose", "Carri");

        PersistenciaCliente.write(Cliente.clientes);
    }
}
