import java.util.*;

public class Control01 {
    public static void main(String[] args) {
        //Declaracion de variables
        int lados;
        double longitud;
        Scanner lector;
        lector = new Scanner (System.in);

        //Programa principal
        System.out.println("Dime el numero de lados del poligono: ");
        lados = lector.nextInt();
        
        if ((lados == 3 ) || (lados == 4)){
            System.out.println("Dime la longitud del lado del poligono");
            longitud = lector.nextDouble();
            if (lados == 3){
            System.out.println("El perimetro del triangulo es: "+longitud*lados);
            }else{
            System.out.println("El perimetro del caudrado es: "+longitud*lados); 
            }
        }        
        lector.close();
    }    
}
