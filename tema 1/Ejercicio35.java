import java.util.Scanner;

public class Ejercicio35 {
    
    public static void main(String[] args) {
    
        //Declaracion variables
        int [] operadores;
        operadores = new int [10];
        boolean wasTen = false;
        int sum = 0;
        int i = 0;
        Scanner lector;
        lector = new Scanner(System.in);

        //Programas principales
        System.out.println("Introduce tu nota");

        for ( i = 0; i<10;i++) {
            operadores[i] = lector.nextInt();
            
            if (operadores[i]!=-1){
                sum = sum + operadores[i];
            }
            if (operadores[i]==10){
                wasTen = true;
            }
        }lector.close();
        System.out.println("La nota media es: "+(sum/i));
        if (wasTen ) {
            System.out.println("There was a ten");
            
        }else{
            System.out.println("There was not a 10");
        }
    }
}
