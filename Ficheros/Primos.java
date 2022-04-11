import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Primos {
    
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
        int contador = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
        for(int i = 0;i<500;i++){
            if(esPrimo(i)){
                bw.write(i+", ");
                contador++;
                if(contador>10){
                    bw.write("\n");
                    contador=0;
                } 
            }
        }
        bw.close();
    }
}
