package Strings;

public class Encriptar {
    public static String encriptar (String cadena){
        String encriptado = "";
        char encriptados = 'a';
        for (int i  = 0; i< cadena.length();i++){
            if(Character.isAlphabetic(cadena.charAt(i))){
                if (cadena.charAt(i) == 'z' ){
                    encriptados = cadena.charAt(i);
                    encriptados = 'b';
                    encriptado += encriptados;
                }else if (cadena.charAt(i) == 'y'){
                    encriptados = cadena.charAt(i);
                    encriptados = 'a';
                    encriptado += encriptados;
                }else{
                encriptados = cadena.charAt(i);
                encriptados++;
                encriptados++;
                encriptado += encriptados;
                }
            }else if (Character.isDigit(cadena.charAt(i))){
                encriptados = cadena.charAt(i);
                encriptados++;
                encriptados++;
                encriptado += encriptados;
            }
        }
        return encriptado;
    }
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduce una cadena");
        System.out.println(encriptar(cadena));
    }
}
