package Strings;

public class CompararIgnoreCase {
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Introduce una cadena");
        String cadena2 = Utilidades.leerCadena("Introduce otra cadena");

        int comparar = cadena2.compareToIgnoreCase(cadena1);

        System.out.println(comparar);
    }
}
