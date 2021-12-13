package Strings;

public class Longitud {
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Intrduce una cadena");
        String palabras [] = Utilidades.dividirEnPalabras(cadena);
        int cuantas = 0;
        int longitud = Utilidades.leerEntero("Introduce la longitud");
        for ( int i = 0; i < palabras.length; i++){
            if ( palabras[i].length() == longitud){
                cuantas++;
            }
        }
        System.out.println(cuantas);
    }
}
