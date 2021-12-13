package Strings;

public class Contains {
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Introduce una cadena");
        String cadena2 = Utilidades.leerCadena("Introduce otra cadena");

        boolean contains = cadena1.contains(cadena2);

        System.out.println(contains);
    }
}
