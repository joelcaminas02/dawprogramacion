import java.util.*;
public class Ejercicio25 {
    public static void main(String[] args) {
        //Declaracion de variables
        int numero, factorial;
        factorial = 1;
        Scanner lector;
        lector = new Scanner(System.in);

        //Programa principal
        System.out.println("Introduce un numero para saber el factorial: ");
        numero = lector.nextInt();
        
        while ( numero!=0) {
            factorial=factorial*numero;
            numero--;
          }
          System.out.println(factorial);
          lector.close();
    }
    
}
