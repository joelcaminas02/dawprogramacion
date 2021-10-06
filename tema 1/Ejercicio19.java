import java.util.*;
public class Ejercicio19 {
    public static void main(String[] args) {
        
        Scanner lector;
        lector = new Scanner(System.in);

        System.out.println("Introduce cuanto te pagan por hora: ");
        double euros = lector.nextDouble();

        System.out.println("Introduce el numero de horas trabajado: ");
        int horas = lector.nextInt();

        lector.close(); 
        int horasExtra= horas - 35;
        double calcEuros = euros*horas;
        double calcExtra = (euros*1.5)*horasExtra;
        double EurosSueldo= calcEuros+calcExtra;
        
        if ( EurosSueldo <= 500) {
            System.out.println("Cobrara "+EurosSueldo+" este mes");
        }else if ( EurosSueldo <= 900){
            double impuestos = EurosSueldo-500;
            double impuestos1 = (impuestos*0.25);
            double sueldo = EurosSueldo-impuestos1;
            System.out.println("Cobrara bruto "+EurosSueldo+" este mes"); 
            System.out.println("Cobrara neto "+sueldo+" este mes");
            System.out.println("De los impuestos se le quitara "+impuestos1);
        }else if (EurosSueldo > 900){
            double impuestos = EurosSueldo-900;
            double impuestos25 = 400*0.25;
            double impuestos45 = (impuestos*0.45);
            double sueldo = EurosSueldo-impuestos45-impuestos25;
            System.out.println("Cobrara en bruto "+EurosSueldo+" este mes"); 
            System.out.println("Cobrara neto "+sueldo+" este mes");
            System.out.println("De los impuestos se le quitara un 25% es decir "+impuestos25+" y un 45% que son "+impuestos45);
        }else{
            System.out.println("error");
        }
    }
}
