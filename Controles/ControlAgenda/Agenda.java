package ControlAgenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;


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

    public static void imprimirListadoTexto() throws IOException{

        BufferedReader lectorTexto = new BufferedReader(new FileReader(agenda));
        
        String linea = lectorTexto.readLine();
        
        while (linea != null){
            String[] elementos = linea.split("\t");
            System.out.println(elementos[0] + "," +
                                elementos[1] + "," + 
                                elementos[2] + "," +
                                elementos[3]);
            linea = lectorTexto.readLine();
        }

        lectorTexto.close();
    }
}