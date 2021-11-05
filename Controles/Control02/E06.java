package Control02;

import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {

    //Declaracion de variables
    int catetoa, catetob;
    double hipotenusa;
    Scanner lector;
    lector = new Scanner (System.in);

    //Inicio Programa
    System.out.println("Ingrese cateto a: ");
    catetoa = lector.nextInt();

    System.out.println("Ingrese cateti b: ");
    catetob= lector.nextInt();

    hipotenusa = Math.sqrt(Math.pow(catetoa, 2) + Math.pow(catetob, 2));
    System.out.println("La hipotenusa es "+hipotenusa);

    lector.close();
    }
}