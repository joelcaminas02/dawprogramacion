package Strings;

public class Longitud2 {

    private static boolean algunaPalabra ( String [] palabra, int longitud){
        boolean algunaPalabra = false;

        for ( int i = 0; i < palabra.length; i++){
            if (palabra[i].length() == longitud){
                algunaPalabra = true;
            }
        }
        return algunaPalabra;
    }
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduce una cadena");
        String palabra [] = Utilidades.dividirEnPalabras(cadena);
        int longitud = Utilidades.leerEntero("Introduce la longitud");
        boolean esIgual = algunaPalabra(palabra, longitud);
        if (esIgual == true){
            System.out.println("Si hay alguna palabra con esa longitud");
        }else{
            System.out.println("No hay ninguna palabra con esa longitud");
        }
    }
}
