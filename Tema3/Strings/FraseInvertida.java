package Strings;

public class FraseInvertida {
    public static String[] palabras (String frase){
        frase=frase.trim();
    	frase=frase.replaceAll(" +", " ");
        String [] palabras = frase.split(" ");
       
        return palabras;
    }

    public static String invertir(String[] palabras){
        String resultado = "";
        for(int i = palabras.length - 1; i >=0; i--){
            
            resultado += palabras[i] + " ";
            
        }
        return resultado;
    }
    public static void main(String[] args) {
        String frase = "hola mundo jeje";
        String []array = palabras(frase);

        System.out.println(invertir(array));

   }

}