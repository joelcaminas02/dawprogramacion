package Control02;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        //Declaracion de varibales
        Scanner lector;
        lector = new Scanner(System.in);
        int longitud;
        //Inicio Programa
        System.out.println("Ingrese longitud: "+(longitud = lector.nextInt()));
        System.out.println(longitud+" cm = "+longitud/2.54+" in");
        
        lector.close();
    }
}
