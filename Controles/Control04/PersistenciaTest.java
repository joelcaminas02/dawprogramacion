package Control04;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

public class PersistenciaTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException,ParserConfigurationException,TransformerException {
        File fichero = new File("clientes.dat");
        File ficheroObjects = new File("clientesObjetos.dat");
        File ficheroJSON = new File ("fichero.json");
        Cliente cl1 =  new Cliente("joel@pepo", "12345678k", "Joel", "Carrillero");
        Cliente cl2 =  new Cliente("jose@pepo", "12348978k", "Juan", "Calvo");
        Cliente cl3 =  new Cliente("juan@pepo", "12341278k", "Pepe", "Sendo");
        Cliente cl4 =  new Cliente("pepe@pepo", "12344378k", "Mesi", "Kbron");
        Cliente cl5 =  new Cliente("aaaa@pepo", "12344378k", "Jose", "Carri");

        //PersistenciaCliente.write(Cliente.clientes);

        //PersistenciaCliente.writeObjects(Cliente.clientes);
        //PersistenciaCliente.crearXML(ficheroObjects);
        //PersistenciaCliente.crearJSON(ficheroJSON);
        //PersistenciaCliente.read(fichero);
        PersistenciaCliente.leerJSON(ficheroJSON);
    }
}
