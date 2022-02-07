import java.util.*;

public class Ejercicio32 {
    public static void main(String[] args) {
        //declaracion de variables
        int i;
        int [] anArray;
        anArray = new int[10];
        Scanner lector;
        lector = new Scanner(System.in);

        //Inicio programa
        System.out.println("Introduce un numero: ");

        for (i = 0; i<10; i++){
            anArray[i] = lector.nextInt();
            lector.close();
        }

        //numeros en orden inverso
        for (int x = 9; x>=0 ;x--){
            System.out.println(anArray[x]);
        }
        lector.close();
    }    
}
