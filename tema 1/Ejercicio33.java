import java.util.*;

public class Ejercicio33 {
    public static void main(String[] args) {
        char [] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int DNI;
        Scanner lector;
        lector = new Scanner(System.in);

        //Programa principal
        System.out.println("Introduce tu dni: ");
        DNI = lector.nextInt();

        System.out.println("tu dni es "+DNI+letra[(DNI%23)]);
        lector.close();

    }
}    
