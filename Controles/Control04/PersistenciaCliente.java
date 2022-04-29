package Control04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;

public class PersistenciaCliente {
    
    public static File write(ArrayList<Cliente> clientes) throws IOException {
        File fichero = new File("clientes.dat");
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(fichero)));
        for (Cliente cliente:Cliente.clientes){
            writer.println(cliente.fichero());
        }
        writer.close();
        return fichero;
    }

    public static ArrayList <Cliente> read(File fichero) throws IOException{
        ArrayList <Cliente> clientes = new ArrayList<>();
        BufferedReader reader =  new BufferedReader(new FileReader(fichero));
        String cliente = reader.readLine();
        while (cliente != null){
            cliente = cliente.trim();
            cliente = cliente.replaceAll(" ","");
            String [] array = cliente.split(",");
            Cliente cliente1 = new Cliente(array[4], array[1], array[2], array[4]);
            clientes.add(cliente1);
            cliente = reader.readLine();
        }
        reader.close();
        return clientes;
    }
}
