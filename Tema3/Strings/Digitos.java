package Strings;

public class Digitos {
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduce una cadena con digitos");
        int contador = 0;
        for  (int i = 0; i < cadena.length(); i++){
            if (Character.isDigit(cadena.charAt(i))){
            contador++;
            }
        }
        System.out.println("Tiene "+contador+" digitos");
    }
}