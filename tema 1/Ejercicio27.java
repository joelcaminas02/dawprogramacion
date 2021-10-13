import java.util.*;
public class Ejercicio27 {
    public static void main(String[] args) {
        //Declaracion de varibles
        int numero,numeroPrimo;
        Scanner lector;
        lector = new Scanner(System.in);

        //Programa principal
        System.out.println("Introduce un numero primo: ");
        numeroPrimo = lector.nextInt();
        numero = 1;
        lector.close();
        while ((numeroPrimo >= 0) && (numero <= numeroPrimo)) {
            System.out.println(numero);
            numero++;
        }

    }
    
}
