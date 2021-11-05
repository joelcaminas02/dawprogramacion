package Control02;

import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        Scanner lector;
        lector = new Scanner(System.in);
        
        System.out.println("Ingrese numero: ");
        int numero1 = lector.nextInt();
        String numero1invertir = String.valueOf(numero1); 
        String numeroInverso = numero1invertir.replace (numero1invertir.charAt(0), numero1invertir.charAt(2))+numero1invertir.replace(numero1invertir.charAt(2), numero1invertir.charAt(0));
        int numeroInverso12 = Integer.valueOf(numeroInverso);
        System.out.println(numeroInverso12);
        
        System.out.println("Ingrese numero: ");
        int numero2 = lector.nextInt();
        String numero2invertir = String.valueOf(numero2); 
        String numeroInverso2 = numero1invertir.replace (numero2invertir.charAt(0), numero2invertir.charAt(2))+numero2invertir.replace(numero2invertir.charAt(2), numero2invertir.charAt(0));
        int numeroInverso22 = Integer.valueOf(numeroInverso2);
        System.out.println(numeroInverso22);
        
        lector.close();
    }
}
