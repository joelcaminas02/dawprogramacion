import java.util.Scanner;
public class Ejercicio39 {
    public static void main(String[] args) {
        //Declaracion de variables
        int numero;
        Scanner lector;
        lector = new Scanner(System.in);

        //Programa principal
        System.out.println("Introduce un numero para saber sus divisiores: ");
        numero = lector.nextInt();

        for (int i = 1; i<numero; i++){
            if (numero%i == 0){
                System.out.println(i);
            }
        }
        lector.close();
    }
}