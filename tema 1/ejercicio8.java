import java.util.Scanner;

import javax.print.*;
public class ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Introduce la edad: ");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        int edad = inputValue.nextInt();

        if (edad >= 18) {
            System.out.println("El usuario es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
}
