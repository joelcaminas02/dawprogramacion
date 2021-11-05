package Control02;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        //Declaracion de varibales
        Scanner lector;
        lector = new Scanner(System.in);

        //Inicio Programa
        System.out.println("Ingrese longitud: ");
        int longitud1 = lector.nextInt();
        System.out.println(longitud1+" cm = "+longitud1/2.54);
        
        System.out.println("Ingrese longitud: ");
        int longitud2 = lector.nextInt();
        System.out.println(longitud2+" cm = "+longitud2/2.54);

        lector.close();
    }
}
