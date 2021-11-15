import java.util.*;
public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner lector;
        lector = new Scanner(System.in);
        System.out.println("Enter dividend: ");
        int dividend = lector.nextInt();
        System.out.println("Enter divisor: ");
        int divisor =  lector.nextInt();
        lector.close();
        while (dividend >= divisor) {
            dividend = dividend-divisor;
        }
        System.out.println(dividend);
    }
}
