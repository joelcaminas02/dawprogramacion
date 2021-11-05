package Control02;

import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner lector;
        lector = new Scanner(System.in);
        
        System.out.println("Primera nota: ");
        int nota1 = lector.nextInt();
        System.out.println("Segunda nota: ");
        int nota2 = lector.nextInt();
        System.out.println("Tercera nota: ");
        int nota3 = lector.nextInt();
        System.out.println("Cuarta nota: ");
        int nota4 = lector.nextInt();

        int notaTotal = nota1+nota2+nota3+nota4; 
        System.out.println("El promedio es: "+notaTotal/4);
        lector.close();
          
    }
}
