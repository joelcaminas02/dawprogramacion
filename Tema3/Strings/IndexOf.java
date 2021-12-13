package Strings;

public class IndexOf {
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Introduce una cadena");
        String cadena2 = Utilidades.leerCadena("Introduce otra cadena");

        System.out.println(cadena1.indexOf(cadena2));
    }
}
