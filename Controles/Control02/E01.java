package Control02;

import java.util.Scanner;
public class E01 {
    public static void main(String[] args) {
        //Declaracion de variables
        String nombre;
        Scanner lector;
        lector  = new Scanner(System.in);

        //Inicio del programa
        System.out.println("Ingrese su nombre: "); nombre = lector.nextLine();
        lector.close();
        System.out.println("Hola, "+nombre);
    }
}