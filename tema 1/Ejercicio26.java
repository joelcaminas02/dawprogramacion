import java.util.*;

public class Ejercicio26 {
    public static void main(String[] args) {
        //Declaracion de variables
        int multiplo, numero;
        multiplo= 0;
        Scanner lector;
        lector = new Scanner(System.in);

        //Programa principal
        System.out.println("Introduce el numero que quieras saber la tabla de multiplicar: ");
        numero = lector.nextInt();
        
        lector.close();

        while ((multiplo >=0) && (multiplo <= 10)){
            int tabla = multiplo * numero;
            System.out.println(numero+"*"+multiplo+"="+tabla);
            multiplo ++;
        }
}
}