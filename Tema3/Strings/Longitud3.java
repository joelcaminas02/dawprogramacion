package Strings;

public class Longitud3 {
    private static boolean cortas ( String [] palabras, int longitud){
    
        for ( int i = 0; i< palabras.length; i++){
            if (palabras[i].length() < longitud){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduce una cadena");
        int longitud = Utilidades.leerEntero("Introduce la longitud");
        String palabras[] = Utilidades.dividirEnPalabras(cadena);

        if ( cortas(palabras, longitud)){
            System.out.println("Todas las cadenas son cortas");
        }else{
            System.out.println("Hay alguna palabra larga");
        }
    }
}
