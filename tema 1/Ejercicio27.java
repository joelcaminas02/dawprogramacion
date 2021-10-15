import java.util.*;
public class Ejercicio27 {
    public static void main(String[] args) {
        //Declaracion de varibles
        int numeroUsuario;
        Scanner lector;
        lector = new Scanner(System.in);

        //Programa principal
        System.out.println("Introduce un numero : ");
        numeroUsuario = lector.nextInt();
        
        lector.close();
        for(int i=1;i <=numeroUsuario; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    
}
