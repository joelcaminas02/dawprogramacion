import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
    Scanner inputValue;
    inputValue = new Scanner(System.in);
    
    System.out.println("Introduce un valor: ");
    int v1 = inputValue.nextInt();
    System.out.println("Introduce otro valor: ");
    int v2 = inputValue.nextInt();
    System.out.println("Indica la operacion que deseas realizar");
    String operacion = inputValue.next(operacion);

    switch (operacion) {
        case suma:
            System.out.println("La suma de "+v1+"+"+v2+"=");
            break;
        case resta:
            
            break;
        case multiplicacion:
            
            break;
        case division:

            break;
        default:
            break;
    }

    }

    
}
