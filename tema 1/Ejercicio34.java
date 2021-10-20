import java.util.*;
public class Ejercicio34 {
    public static void main(String[] args) {
        char[] letras = {'x','Y','Z'};
        int nie;
        Scanner lector;
        lector =  new Scanner(System.in);

        //Inicio Programa
        System.out.println("Introduce el nie: ");
        nie = lector.nextInt();

        System.out.println("Tu nie es "+nie+letras[nie%7]);
        lector.close();
    }
}
