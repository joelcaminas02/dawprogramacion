package Control02;

import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        Scanner lector;
        lector = new Scanner(System.in);
        int horaActual,horaFutura;

        System.out.println("Hora actual: "+(horaActual = lector.nextInt()));
        System.out.println("Cantidad de horas: "+(horaFutura= lector.nextInt()));
        lector.close();
        System.out.println("En "+horaFutura+" horas, el reloj marcara las "+horaActual+horaFutura);
    }
}
