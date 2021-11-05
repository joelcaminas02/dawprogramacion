package Control02;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        //Declracion de variables
        Scanner lector;
        lector = new Scanner(System.in);
        int radio;
        //Inicio Programa
        System.out.println("Introduce el radio: "+(radio = lector.nextInt()));
        System.out.println("Perimetro: "+ (2*radio)*Math.PI);
        System.out.println("Área: "+ (radio*radio)*Math.PI);
        lector.close();
    }
}
