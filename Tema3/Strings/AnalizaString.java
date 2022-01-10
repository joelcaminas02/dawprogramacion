package Strings;

public class AnalizaString {

    public static int numeroDigitos (String cadena){
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++){
            if (Character.isDigit(cadena.charAt(i))){
                contador++;
            }
        }
        return contador;
    }
    public static int numLetras (String cadena){
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++){
            if (Character.isAlphabetic(cadena.charAt(i))){
                contador++;
            }
        }
        return contador;
    }
    public static int numOtros (String cadena){
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++){
            if (Character.isAlphabetic(cadena.charAt(i)) == false && Character.isDigit(cadena.charAt(i)) == false){
                contador++;
            } 
        }
        return contador;
    }
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduce una cadena");
        System.out.println("Hay "+numeroDigitos(cadena) + " numeros");
        System.out.println("Hay "+numLetras(cadena) + " letras");
        System.out.println("Hay "+numOtros(cadena)+" otros caracteres");
    }
}
