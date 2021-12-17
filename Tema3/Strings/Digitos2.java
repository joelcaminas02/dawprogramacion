package Strings;

public class Digitos2 {
    public static void main(String[] args) {
        String cadena = "un 1 un 20 un 234";
        //        String cadena = Utilidades.leerCadena("Introduce una cadena con digitos");
        int contador = 0;
        for  (int i = 0; i < cadena.length(); i++){
            if (Character.isDigit(cadena.charAt(i))){
                contador++;
                if(Character.isDigit(cadena.charAt(i-1))){
                    contador--;
                }
            }
        }
     System.out.println("Tiene "+contador+" numeros");

    }
}