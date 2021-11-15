import java.util.Scanner;
public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner lector;
        lector = new Scanner(System.in);
        int i = 0, numero, multiplicador, resultado = 0;
        System.out.println("Introduce el numero que quieres multiplicar");
        numero = lector.nextInt();
        System.out.println("Introduce por cuanto quieres multiplicarlo");
        multiplicador = lector.nextInt();
        lector.close();
        while (i != multiplicador) {
        resultado = numero+multiplicador;
        i++;
        }
        System.out.println(numero+"*"+multiplicador +"= "+resultado);
    }
}
