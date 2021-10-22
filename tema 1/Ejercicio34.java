import java.util.*;
public class Ejercicio34 {
    public static void main(String[] args) {
        char [] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        String nie, nie2;
        int operacion;
        int calculo = 0;
        char x;
        Scanner lector;
        lector =  new Scanner(System.in);

        //Inicio Programa
        System.out.println("Introduce el nie: ");
        nie = lector.next();
        lector.close();
        x = nie.charAt(0);

        if ( x == 'X'){
            nie2 = nie.replace("X", "0");
            calculo = Integer.valueOf(nie2);
        }else if ( x == 'Y'){
            nie2 = nie.replace("Y", "1");
            calculo = Integer.valueOf(nie2);
        }else if ( x == 'Z'){
            nie2 = nie.replace("Z", "2");
            calculo = Integer.valueOf(nie2);
        }
        operacion = calculo%23;
        
        System.out.println("Tu nie es "+nie+""+letra[operacion]);
        
    }
}
