import java.util.*;

public class Ejercicio28 {
    public static void main(String[] args) {
        //Declaracion de variables
        int numero, divisor;
        Scanner lector;
        lector = new Scanner(System.in);
        divisor = 2;
        boolean esPrimo = true ;

        //Programa principal
        System.out.println("Introduce el numero que desees averiguar si es primo: ");
        numero = lector.nextInt();

        lector.close();
        while ((divisor < numero) && esPrimo ){
            if (numero % divisor == 0){
            esPrimo = false;
            }
            divisor++;
        }
        if (esPrimo){
        System.out.println(numero+" es primo");
        }else{
            System.out.println(numero+" no es primo");
        }
    }   
}
