package Control02;

import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        Scanner lector;
        lector = new Scanner(System.in);
        int numero1;
        System.out.println("Ingrese numero: "+(numero1 = lector.nextInt()));
        String numero1invertir = String.valueOf(numero1); 
        String numeroInverso = numero1invertir.replace (numero1invertir.charAt(0), numero1invertir.charAt(2))+numero1invertir.replace(numero1invertir.charAt(2), numero1invertir.charAt(0));
        int numeroInverso12 = Integer.valueOf(numeroInverso);
        System.out.println(numeroInverso12);
        
        lector.close();
    }
}
