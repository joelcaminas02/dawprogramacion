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
        while ((divisor < numero) && (numero % divisor != 0)){
            System.out.println(numero+"/"+divisor+"="+(numero/divisor+"Es primo"));
            divisor ++;
            if (numero % divisor == 0){
            System.out.println(numero+"/"+divisor+"="+(numero/divisor+"No es primo"));
            }
        }
    }
}
