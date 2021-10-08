import java.util.*;
public class Ejercicio19 {
    public static void main(String[] args) {
        //Declaracion variables
        int horas, horasExtra;
        double euros, bruto;
        Scanner lector;
        lector = new Scanner(System.in);

        //Inicio programa
        System.out.println("Introduce cuanto te pagan por hora: ");
        euros = lector.nextDouble();

        System.out.println("Introduce el numero de horas trabajado: ");
        horas = lector.nextInt();

        lector.close(); 
        
        if ( horas <= 35 ){
            bruto = euros*horas;
        }else{
            horasExtra = horas-35;
            bruto = ((euros*1.5)*horasExtra+euros*horas);
        }
            if ( bruto <= 500) {
            System.out.println("Cobrara "+bruto+" este mes");
            }else if ( bruto <= 900){
            double impuestos = bruto-500;
            double impuestos1 = (impuestos*0.25);
            double sueldo = bruto-impuestos1;
            System.out.println("Cobrara bruto "+bruto+" este mes"); 
            System.out.println("Cobrara neto "+sueldo+" este mes");
            System.out.println("De los impuestos se le quitara "+impuestos1);
            }else if (bruto > 900){
            double impuestos = bruto-900;
            double impuestos25 = 400*0.25;
            double impuestos45 = (impuestos*0.45);
            double sueldo = bruto-impuestos45-impuestos25;
            System.out.println("Cobrara en bruto "+bruto+" este mes"); 
            System.out.println("Cobrara neto "+sueldo+" este mes");
            System.out.println("De los impuestos se le quitara un 25% es decir "+impuestos25+" y un 45% que son "+impuestos45);
            }else{
            System.out.println("error");
            }
    }
}
