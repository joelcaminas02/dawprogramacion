import java.util.*;

public class Ejercicio28 {
    public static void main(String[] args) {
        //Declaracion de variables
        int numero, divisor;
        Scanner lector;
        lector = new Scanner(System.in);
        divisor = 2;

        //Programa principal
        System.out.println("Introduce el numero que desees averiguar si es primo: ");
        numero = lector.nextInt();

        lector.close();
        
        if (numero % divisor == 0){
            System.out.println("No es primo");
            }else{
                System.out.println("Es primo");
            }
    }
}
