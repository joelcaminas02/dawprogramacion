import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;

public class Agenda{

    private static File agenda = new File("agenda.dat");
    private static File agendaObjetos = new File("agendaObjetos.dat");

 
    public static void escribirAgenda(Usuario usuario) throws IOException{
        if (agenda.exists() != true){
            agenda.createNewFile();
        }
        FileWriter fwrAgenda = new FileWriter(agenda.getAbsoluteFile(), true);
        BufferedWriter wrAgenda = new BufferedWriter(fwrAgenda); 
        wrAgenda.write("\n"+usuario.toString());

        wrAgenda.close();
    }

    public static void escribirAgendaObjeto(Usuario usuario) throws IOException{
        FileOutputStream fwrAgendaObjetos = new FileOutputStream(agendaObjetos.getAbsoluteFile(), true);
        ObjectOutputStream wrObejct = new ObjectOutputStream(fwrAgendaObjetos);

        wrObejct.writeObject(usuario);

        wrObejct.close();
    }

    public static ArrayList<Usuario> read() throws IOException {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(agenda));
        String cliente = reader.readLine();
        while (cliente != null) {
            cliente = cliente.trim();
            cliente = cliente.replaceAll(" ", "");
            String[] array = cliente.split(":");
            Usuario usuario = new Usuario();
            usuario.setNombre(array [1].substring(1));
            usuario.setApellidos(array[1]);
            usuarios.add(usuario);
            cliente = reader.readLine();
        }
        reader.close();
        return usuarios;
    }

    private static int comprobarIndice(String cadena){
        int indice = 0;
        char arrayChar[] = cadena.toCharArray();
        for (int i = 0; i<arrayChar.length-1;i++){
            arrayChar[i];
        }
        return indice;
    }
}