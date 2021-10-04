import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero del 1 al 10: ");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        int numero = inputValue.nextInt();
        
        
        switch (numero) {
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("dos");
                break;
            case 3:
                System.out.println("tres");
                break;
            case 4:
                System.out.println("cuatro");
                break;
            case 5:
                System.out.println("cinco");
                break; 
            case 6:
                System.out.println("seis");
                break;
            case 7:
                System.out.println("siete");
                break;
            case 8:
                System.out.println("ocho");
                break;
            case 9:
                System.out.println("nueve");
                break;
            case 10:
                System.out.println("10");
                break;   
            default:
            System.out.println("No es un numero del 1 al 10");
                break;
        }
        inputValue.close();
        }
    
}
