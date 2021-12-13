package Strings;

public class Substring {
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Introduce una cadena");
        int pos1 = Utilidades.leerEntero("Introduce la primera posicion");
        int pos2 = Utilidades.leerEntero("Introduce la segunda posicion");
        System.out.println(cadena1.substring(pos1, pos2));
    }
}
