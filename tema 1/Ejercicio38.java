import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        String frase;
        char [] vocales = {'a','e','i','o','u'};
        Scanner lector;
        lector = new Scanner(System.in);

        System.out.println("Introduce una frase");
        frase = lector.nextLine();

        int contador = 0;
        for (int i = 1;i<frase.length();i++ ){
            char caracter= frase.charAt(i);
            if (caracter == vocales[0] || caracter == vocales [1] || caracter == vocales [2]|| caracter == vocales [3]|| caracter == vocales [4]){
                contador++;
            }
        }
        lector.close();
        System.out.println("La palabra tiene "+contador+" vocales");
    }
}
