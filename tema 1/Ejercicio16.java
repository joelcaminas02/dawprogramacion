import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        String op;

        System.out.println("Introduce un valor: ");
        int v1 = inputValue.nextInt();
        System.out.println("Introduce otro valor: ");
        int v2 = inputValue.nextInt();
        System.out.println("Indica la operacion que deseas realizar");
        Scanner miScanner = new Scanner(System.in);
        op = miScanner.next();

        switch (op) {
            case "+":
                System.out.println("La suma de "+v1+"+"+v2+"="+(v1+v2));
                break;
            case "-":
                System.out.println("La resta de "+v1+"-"+v2+"="+(v1-v2));
                break;
            case "*":
                System.out.println("La multiplicacion de "+v1+"*"+v2+"="+(v1*v2));
                break;
            case "/":
                System.out.println("La division de "+v1+"/"+v2+"="+(v1/v2));
                break;
            default:
            System.out.println("Error");
                break;
    }
    inputValue.close();
    miScanner.close();
    }

    
}
