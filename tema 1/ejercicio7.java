import java.util.*;
public class ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Introduce el precio real: ");
        Scanner sc = new Scanner(System.in);
        double pr = sc.nextDouble();

        System.out.println("Introduce el precio rebajado");
        double po = sc.nextDouble();

        System.out.println("El descuente es de un: "+(pr-po)*100/pr
        +"%");
    }
    
}
