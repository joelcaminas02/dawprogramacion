package Strings;

public class Parentesis {
    
    public static boolean esParentesis ( String frase){
        int par = 0;
        for (char letra : frase.toCharArray()){
            if (letra == '('){
                par++;
            }else if (letra == ')'){
                par--;
            }
            if (par == -1){
                return false;
            }
        }
        return (par == 0);
    }
    public static void main(String[] args) {
        String cadena = "Esto (es (un ejemplo) (de) una (cadena bien) parentizada)";
        String cadena2 = "una )cadena (mal (parentizada)";
        
        if (esParentesis(cadena)){
            System.out.println("Esta bien parentizada");
        }else{
            System.out.println("Esta mal parentizada");
        }
        if (esParentesis(cadena2)){
            System.out.println("Esta bien parentizada");
        }else{
            System.out.println("Esta mal parentizada");
        }
    }
}