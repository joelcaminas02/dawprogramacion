import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Primos2 {
    public static boolean esPrimo(int numero){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
          if (numero % contador == 0)
            primo = false;
          contador++;
        }
        return primo;
      }
    public static void main(String[] args) throws IOException{
        File f1 = new File("./primos.dat");
        BufferedReader lector = new BufferedReader(new FileReader(f1));
        String c = lector.readLine();
        while (c != null){
            c = c.trim();
            c = c.replaceAll(" ","");
            String [] array = c.split(",");
            for(int i = 0;i<array.length;i++){
                int primo = Integer.parseInt(array[i]);
                if(esPrimo(primo)){
                    System.out.println(primo);
                }
            }
            c=lector.readLine();
        }
        lector.close();
    }
}
