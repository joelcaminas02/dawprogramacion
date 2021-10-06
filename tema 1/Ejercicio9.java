import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        //
        Scanner inputValue;
        inputValue = new Scanner(System.in);

        //Inicio del programa
        System.out.println("Introduce la edad: ");
        int edad = inputValue.nextInt();

        if (edad >= 18) {
            System.out.println("You have the legal age");
        }else{
            System.out.println("You are under legal age");
        }
        inputValue.close();
    }
}