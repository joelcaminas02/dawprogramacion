import java.util.*;
public class Ejercicio20 {
    public static void main(String[] args) {
        //Declaracion de variables
        double precio, precioFinal, descuento;
        Scanner lector;
        lector = new Scanner(System.in);

        //Inicio programa
        System.out.println("Introduce el precio del producto: ");
        precio = lector.nextDouble();

        if ( precio < 6){
            System.out.println("No hay descuento te costara "+precio);
        }else if ( precio < 60){
            descuento = (precio*0.05);
            precioFinal = precio-descuento;
            System.out.println("Tienes un desuento del 5%, te costara "+precioFinal);
        }else if ( precio >= 60){
            descuento = (precio*0.10);
            precioFinal = precio-descuento;
            System.out.println("Tienes un descuento del 10%, te costara "+precioFinal);
        }else{
            System.out.println("error");
        }
        lector.close();
    }
}
