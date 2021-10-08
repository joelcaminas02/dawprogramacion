import java.util.*;

public class Ejercicio22 {
  public static void main(String[] args) {
      
        //Declaracion de variables
        int numero, i, positives;
        Scanner lector;
        lector = new Scanner(System.in);

        //Programa principal
        System.out.println("Introduce un numero: ");
        
        i = 0;
        positives = 0;
        while (i < 10){
            
            numero = lector.nextInt();
            
            if (numero >= 0){
                positives = positives + 1;
            }
        i = i + 1;
        }    
        lector.close();
        System.out.println("Hay "+positives+" nuemeros positivos");
  }  
}
