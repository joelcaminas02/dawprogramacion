import java.util.*;
public class Ejercicio21 {
    public static void main(String[] args) {
        
        //Declaracion de variables
        int año;

        Scanner lector;
        lector = new Scanner(System.in);

        //Programa principal
        System.out.println("Introduce el año: ");
        año = lector.nextInt();

        lector.close();

        if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0){
            System.out.println("El año "+año+" es bisiesto");
        }else{
            System.out.println("El año "+año+" no es bisiesto");
        }
    }
}
