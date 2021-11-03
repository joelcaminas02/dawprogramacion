import java.util.*;
public class Ejercicio37 {
    public static void main(String[] args) {
        //Declaracion de variables
        double [] numeros;
        numeros = new double [10];

        Scanner lector;
        lector =  new Scanner(System.in);
        double minimo = numeros[1];
        double maximo = numeros[0];

        System.out.println("Introduce 10 numeros:");
        for (int i= 0; i<numeros.length; i++){
            numeros[i] = lector.nextDouble();
        }
        lector.close();

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i]> maximo){
                maximo = numeros[i];
            }
            if (numeros [i]< minimo){
                minimo = numeros[i];
            }
        }
        System.out.println("El numero mas grande es "+maximo+" y el mas pequeño "+minimo);
        
    }
}
