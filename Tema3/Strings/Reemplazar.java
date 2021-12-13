package Strings;

public class Reemplazar {
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Introduce una cadena");
        char caracter1 = Utilidades.leerCaracter("Introduce el caracter a sustituir");
        char caracter2 = Utilidades.leerCaracter("Introduce el caracter para sustituir");

        System.out.println(cadena1.replace(caracter1, caracter2));
    }
}
