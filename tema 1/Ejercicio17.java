import java.util.*;
public class Ejercicio17 {
public static void main(String[] args) {
    Scanner inputValue;
    inputValue = new Scanner(System.in);

    System.out.println("Introduce un mes: ");
    String mes = inputValue.nextLine();
    inputValue.close();

    switch (mes) {
        case "enero":
        System.out.println("Enero tiene 31 días");   
            break;
        case "febrero":
        System.out.println("Febrero tiene 28 días");  
            break;
        case "marzo":
        System.out.println("Marzo tiene 31 días");   
            break;
    
        case "abril":
        System.out.println("Abril tiene 30 días");    
            break;
    
        case "mayo":
        System.out.println("Mayo tiene 31 días");   
            break;
    
        case "junio":
        System.out.println("Junio tiene 30 días");   
            break;
    
        case "julio":
        System.out.println("Julio tiene 31 días");  
            break;
    
        case "agosto":
        System.out.println("Agosto tiene 31 días");  
            break;
    
        case "septiembre":
        System.out.println("Septiembre tiene 30 días");   
            break;
    
        case "octubre":
        System.out.println("Octubre tiene 31 días"); 
            break;
    
        case "noviembre":
        System.out.println("Noviembre tiene 30 días");
            break;
    
        case "diciembre":
            System.out.println("Diciembre tiene 31 días");
            break;
    
        default:
        System.out.println("No has introducido un mes");
            break;
    }
    }
}