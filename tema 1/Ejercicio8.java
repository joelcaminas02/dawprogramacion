import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Introduce la edad: ");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        int edad = inputValue.nextInt();

        if (edad >= 18) {
            System.out.println("You have the legal age");
    }
    inputValue.close();
 }
}