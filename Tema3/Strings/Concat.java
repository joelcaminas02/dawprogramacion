package Strings;

public class Concat {
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Introduce una cadena");
        String cadena2 = Utilidades.leerCadena("Introduce otra cadena");

        String concatenar = cadena1.concat(cadena2);

        System.out.println( concatenar);
    }
}
