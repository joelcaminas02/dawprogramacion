package ControlAgenda;

import java.io.IOException;
import java.util.Scanner;

public class AgendaTest {

    private static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int numero = 1;
        /**while (numero != 0){
            
            Agenda.escribirAgenda(Usuario.introducirUsuario());

            System.out.println("Si ya has finalizado introduce 0 sino 1");
            numero = lector.nextInt();
        }*/
        Agenda.imprimirListadoTexto();
    }
}
