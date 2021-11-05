package Control02;

import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner lector;
        lector = new Scanner(System.in);
        int nota1,nota2,nota3,nota4,notaTotal;
        System.out.println("Primera nota: "+(nota1 = lector.nextInt()));
        System.out.println("Segunda nota: "+(nota2 = lector.nextInt()));
        System.out.println("Tercera nota: "+(nota3 = lector.nextInt()));
        System.out.println("Cuarta nota: "+(nota4 = lector.nextInt()));
        notaTotal = nota1+nota2+nota3+nota4; 
        System.out.println("El promedio es: "+notaTotal/4);
        lector.close();
          
    }
}
