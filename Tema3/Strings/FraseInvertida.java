package Strings;

public class FraseInvertida {
//    public static String[] palabras (String frase){
//        for (int i = )
//    }

    public static String invertir(String[] palabras){
        String invertir = "";
        for (int i = palabras.length; i>=0;i--){
            invertir = palabras[i];
        }
        return invertir;
    }

}
