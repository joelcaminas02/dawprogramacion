package Strings;

public class Alfabeticamente {
    public static boolean esAlfabetica ( String cadena){
        boolean alfabetica = true;
        for (int i = 0; i< cadena.length();i++){
            if (cadena.charAt(i) < cadena.charAt(i+1)){
                alfabetica = false;
            }
        }
        return alfabetica;
    }
    public static void main(String[] args) {
        System.out.println(esAlfabetica("amor"));
        
    }
}
