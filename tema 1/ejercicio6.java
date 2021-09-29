import java.util.*;
public class ejercicio6 {
    public static void main(String[] args) {
    System.out.println("Introduce el radio: ");
    Scanner sc = new Scanner(System.in);
    double radio = sc.nextDouble();
    double PI = 3.14159;
    System.out.println("La longitud del circulo es: "+ (2*radio)*PI);
    System.out.println("El area del circulo es: "+ (radio*radio)*PI);
    sc.close();
    }
}
