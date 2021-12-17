package Strings;

public class Siglas {
    public static String[] palabras (String frase){
        frase=frase.trim();
    	frase=frase.replaceAll(" +", " ");
        String [] palabras = frase.split(" ");
       
        return palabras;
    }

    public static String siglas (String[] palabras){
        String resultado = "";
        for(int i = 0; i<palabras.length; i++){
            
            resultado += palabras[i].charAt(0);
            
        }
        return resultado;
    }
    public static void main(String[] args) {
        String frase = "hola mundo jeje";
        String []array = palabras(frase);

        System.out.println(siglas(array));

   }

}
