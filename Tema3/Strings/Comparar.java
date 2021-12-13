package Strings;

public class Comparar {
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Introduce una cadena");
        String cadena2 = Utilidades.leerCadena("Introduce otra cadena");

        int comparar = cadena2.compareTo(cadena1);

        if ( comparar < 0){
            System.out.println("La cadena 2 es mayor");
        }else if ( comparar == 0){
            System.out.println("Son iguales");
        }else if (comparar > 0){
            System.out.println("La cadena 1 es mayor");
        }
    }
}
