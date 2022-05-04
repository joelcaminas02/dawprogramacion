package Control04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;

public class PersistenciaCliente {

    public static File write(ArrayList<Cliente> clientes) throws IOException {
        File fichero = new File("clientes.dat");
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(fichero)));
        for (Cliente cliente : Cliente.clientes) {
            writer.println(cliente.fichero());
        }
        writer.close();
        return fichero;
    }

    public static ArrayList<Cliente> read(File fichero) throws IOException {
        ArrayList<Cliente> clientes = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fichero));
        String cliente = reader.readLine();
        while (cliente != null) {
            cliente = cliente.trim();
            cliente = cliente.replaceAll(" ", "");
            String[] array = cliente.split(",");
            Cliente cliente1 = new Cliente(array[4], array[1], array[2], array[4]);
            clientes.add(cliente1);
            cliente = reader.readLine();
        }
        reader.close();
        return clientes;
    }
    public static File writeObject(ArrayList<Cliente> clientes) throws IOException {
        File fichero = new File("clientes.dat");
        ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(fichero));
        Cliente e;
        for (Cliente cliente : Cliente.clientes) {
            e = new Cliente(cliente.getEmail(), cliente.getNif(),cliente.getNombre(), cliente.getApellidos());
            writer.writeObject(e);
        }
        writer.close();
        return fichero;
    }
    public static ArrayList<Cliente> readObject(File fichero) throws IOException {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ObjectInputStream reader = new ObjectInputStream(new FileInputStream(fichero));
        Cliente e;
        try{
            while (true) {
                e = (Cliente) reader.readObject();
                clientes.add(e);
            }
        }catch(EOFException eof){
                reader.close();
        }
        reader.close();
        return clientes;
    }
}
