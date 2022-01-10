package Strings;

public class Pasatiempos {
    public static String transformaApuntos (String cadena){
        String pasatiempo = cadena.replace('a','.');
        pasatiempo = pasatiempo.replace('e', '.');
        pasatiempo = pasatiempo.replace('i', '.');
        pasatiempo = pasatiempo.replace('o', '.');
        pasatiempo = pasatiempo.replace('u', '.');
        return pasatiempo;
    }
    
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduce una cadena");
        System.out.println(transformaApuntos(cadena));
    }
}
