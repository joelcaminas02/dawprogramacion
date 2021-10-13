import java.util.*;

public class Ejercicio24 {

    public static void main(String[] args) {
        
        //Declaracion de variables
        boolean wasTen = false;
        int sum, i, grade;
        sum = 0;
        i = 0;
        grade = 0;

        Scanner lector;
        lector = new Scanner(System.in);

        //Programa principal
        System.out.println("Introduce tu nota: ");

        while ( grade != -1){
            grade = lector.nextInt();

            if (grade != -1) {
               sum = sum + grade;
                i = i +1;
                if ( grade == 10){
                    wasTen = true;
                }

            }

        }
        System.out.println("La nota media es: "+(sum/i));
        if (wasTen ) {
            System.out.println("There was a ten");
            
        }else{
            System.out.println("There was not a 10");
        }lector.close();
    }
}
