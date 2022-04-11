import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ContarPalabra {
    public static void main(String[] args) throws IOException{
        
        int contador = 0;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Introduce el fichero");
        String fichero = scaner.next();
        System.out.println("Introduce la palabra");
        String palabra = scaner.next();
        
        File f1 = new File(fichero);
        BufferedReader lector = new BufferedReader(new FileReader(f1));
        String c = lector.readLine();
        if(f1.exists()){
            while (c != null){
                c = c.trim();
                c = c.replaceAll(" +"," ");
                String [] array = c.split(" ");
                for(int i = 0;i<array.length;i++){
                    if(array[i].equals(palabra)){
                        contador++;
                    }
                }
                c=lector.readLine();
            }
        }
        System.out.println(contador);
        scaner.close();
        lector.close();
    }
}
