import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
    public static void writeObjects(ArrayList<Cliente> clientes) throws IOException {
        File fichero = new File("clientesObjetos.dat");
        ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(fichero));
        //Cliente e;
        for (Cliente cliente : clientes) {
            //e = new Cliente(cliente.getEmail(), cliente.getNif(),cliente.getNombre(), cliente.getApellidos());
            writer.writeObject(cliente);
        }
        writer.close();
    }
    public static ArrayList<Cliente> readObject(File fichero) throws IOException,ClassNotFoundException {
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
        }catch(ClassNotFoundException cs){
            reader.close();
        }
        reader.close();
        return clientes;
    }
    public static void crearXML(File fichero) throws IOException, ClassNotFoundException,ParserConfigurationException, TransformerException {
        ObjectInputStream reader = new ObjectInputStream(new FileInputStream(fichero));
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element raiz = doc.createElement("clientes");
        doc.appendChild(raiz);
        Cliente e;
        
        try{
            while (true) {
                e = (Cliente) reader.readObject();
                Element clienteId = (Element) doc.createElement("id");
                raiz.appendChild(clienteId);
                
                Attr attr = doc.createAttribute("id");

                attr.setValue(String.valueOf(e.getIdCliente()));

                Element nombre = doc.createElement("nombre");
                Element apelliidos = doc.createElement("apellidos");
                Element nif = doc.createElement("nif");
                Element mail = doc.createElement("mail");

                clienteId.appendChild(nif);
                clienteId.appendChild(nombre);
                clienteId.appendChild(apelliidos);
                clienteId.appendChild(mail);

                nombre.setTextContent(e.getNombre());
                apelliidos.setTextContent(e.getApellidos());
                nif.setTextContent(e.getNif());
                mail.setTextContent(e.getEmail());
            }
        }catch(EOFException eof){
                reader.close();
        }
        Transformer trans = TransformerFactory.newInstance().newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new FileOutputStream("clientes.xml"));

        trans.transform(source, result);
        reader.close();
    }
    public static void crearJSON(File fichero) throws IOException{
        ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(fichero));
        final Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
        for(Cliente cliente: Cliente.clientes){
            final String prettyPrinting = prettyGson.toJson(cliente);
            writer.writeUTF(prettyPrinting);
        }
        writer.close();
    }
}
