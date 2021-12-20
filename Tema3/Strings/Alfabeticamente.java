package Strings;

public class Alfabeticamente {
    public static boolean esAlfabetica ( String cadena){

        for (int i = 1; i< cadena.length();i++){
            if (cadena.charAt(i-1) < cadena.charAt(i)){
                
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(esAlfabetica("amor"));
        
    }
}
