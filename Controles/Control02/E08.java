package Control02;

import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {
		double numero;
        Scanner lector;
        lector = new Scanner(System.in);
		System.out.println("Ingrese un numero "+(numero= lector.nextDouble())); 
        lector.close();
		double parteDecimal = numero % 1;
		System.out.println(parteDecimal);
	}
}
