import java.util.*;
public class Ejercicio10 {
    public static void main(String[] args) {
        
        System.out.println("Introduzca un número para saber si es positivo o negativo: ");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        int valor = inputValue.nextInt();

        if (valor < 0){
            System.out.println("El valor "+valor+" es negativo");
    }else{
        System.out.println("El valor "+valor+" es postivo");
        }
        inputValue.close();
    }
}
