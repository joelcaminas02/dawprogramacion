import java.util.*;
public class Ejercicio23 {
    public static void main(String[] args) {
      
        //Declaracion de variables
        int positives, num;
        Scanner lector;
        lector = new Scanner(System.in);

        //Programa principal
        System.out.println("Introduce un numero: ");
        num = lector.nextInt();

        
        positives = 0;
        while (num != 0){
            
  
            
            if (num >= 0){
                positives = positives + 1;
            }
            num = lector.nextInt();
        }    
        lector.close();
        System.out.println("Hay "+positives+" numeros positivos");
  }  
}
