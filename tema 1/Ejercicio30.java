import java.util.*;

public class Ejercicio30 {
    public static void main(String[] args) {
        //Declaracion de variables
        String frase;
        Scanner lector;
        int tamaño, mitad, i;
        boolean palindromo = true;
        lector = new Scanner(System.in);
        
        //Principio del programa
        System.out.println("Introduce la cadena que quieras saber si es palindroma: ");
        frase = lector.nextLine();

        lector.close();

        tamaño = frase.length();
        mitad = tamaño/2;

        for (i = 0; i < mitad; i++){
            char caracter1= frase.charAt(1);
            char caracter2= frase.charAt(frase.length());
            if ( caracter1 != caracter2){
                palindromo = false;
            }if (palindromo){
            System.out.println(frase+" No es palindromo");
        }else{
            System.out.println(frase+" es palindromo");
        }
    }
    }
}
