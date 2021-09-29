
import java.util.*;
public class ejercicio5 {
    public static void main(String args[]) {

    System.out.println ("Introduce el valor del numero 1: ");
    Scanner sc = new Scanner(System.in);
    int numero1 = sc.nextInt();

    System.out.println ("Introduce el valor del numero 2. ");
    int numero2 = sc.nextInt();
    
    System.out.println("la suma de " + numero1 + "+" + numero2 + "="+(numero1+numero2));
    System.out.println("la resta de " + numero1 + "-" + numero2 + "="+(numero1-numero2));
    System.out.println("la division de " + numero1 + ":" + numero2 + "="+(numero1/numero2));
    System.out.println("la multiplicacion de " + numero1 + "x" + numero2 + "="+(numero1*numero2));
	sc.close();
    }
}
