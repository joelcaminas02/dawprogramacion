import java.util.*;
public class Ejercicio36 {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner lector;
        lector = new Scanner(System.in);

        double [] numeros;
        numeros = new double [10];
        double maximo = numeros[0];

        //Inicio programa
        System.out.println("Introduce 10 numeros");

        for (int i = 0;i<numeros.length;i++){
            numeros[i]=lector.nextInt();
        }
        
        for (int i = 1; i < numeros.length;i++){
            if (numeros[i] > maximo){
                maximo = numeros[i];
            }
        }
        lector.close();
        System.out.println(maximo);
    }
}
