package Strings;

public class Digitos2 {
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduce una cadena con digitos");
        int contador = 0;
        String cadena2 []= Utilidades.dividirEnPalabras(cadena);
        String palabra = "";
        for  (int i = 0; i < cadena2.length; i++){
            
            if (palabra.matches(cadena2[i])){
            contador++;
            }
        }
     System.out.println("Tiene "+contador+" digitos");
    }
}