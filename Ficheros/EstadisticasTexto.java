import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Estadisticas Texto
 * crea un programa que analize un sistema de texto plano, y que muestre lsa siguientes estadiscticas:
 * Num de letras, palabras,linias, porcentaje de vocales ,consonantes, espacios y tabuladores.
 */

public class EstadisticasTexto {


    public static float contarLineas (File archivo) throws IOException{
        int numLineas = 0;
        int contador = 0;
        BufferedReader lector = new BufferedReader(new FileReader(archivo));
        String linea = lector.readLine();
        if(archivo.exists()){
            while (linea != null){
                contador++;
                linea = lector.readLine();
            }
        }
        lector.close();
        numLineas = contador;
        return numLineas;
    }
    public static float contarTodo (File archivo) throws IOException{
        int numLineas = 0;
        int contador = 0;
        BufferedReader lector = new BufferedReader(new FileReader(archivo));
        String linea = lector.readLine();
        if(archivo.exists()){
            while (linea != null){
                contador += linea.length();
                linea = lector.readLine();
            }
        }
        lector.close();
        numLineas = contador;
        return numLineas;
    }
    public static float contarPalbras (File archivo) throws IOException{
        int numPalabras = 0;
        int contador = 0;
        BufferedReader lector = new BufferedReader(new FileReader(archivo));
        String linea = lector.readLine();
        if(archivo.exists()){
            while (linea != null){
                StringTokenizer st = new StringTokenizer(linea);
                contador += st.countTokens();
                linea = lector.readLine();
            }
        }
        lector.close();
        numPalabras = contador;
        return numPalabras;
    }
    public static float contarLetras (File archivo) throws IOException{
        int numLetras = 0;
        int contador = 0;
        BufferedReader lector = new BufferedReader(new FileReader(archivo));
        String linea = lector.readLine();
        if(archivo.exists()){
            while (linea != null){
                linea = linea.trim();
                linea = linea.replaceAll(" +"," ");
                String [] array = linea.split(" ");
                for(int i = 0;i<array.length;i++){
                    if(array[i].contains(".") || array[i].contains(",")){
                        contador += array[i].length()-1;
                    }else{
                        contador += array[i].length();
                    }
                }
                linea = lector.readLine();
            }
        }
        lector.close();
        numLetras = contador;
        return numLetras;
    }
    public static float conatarVocales (File archivo) throws IOException{
        int contarVocales = 0;
        BufferedReader lector = new BufferedReader(new FileReader(archivo));
        String linea = lector.readLine();
        if(archivo.exists()){
            while (linea != null){
                linea = linea.trim();
                linea = linea.replaceAll(" +"," ");
                String [] array = linea.split(" ");
                for(int i = 0;i<array.length;i++){
                    for (int j = 0;j<array[i].length();j++){
                        if((array[i].charAt(j)=='a') || (array[i].charAt(j)=='e') || (array[i].charAt(j)=='i') || (array[i].charAt(j)=='o') || (array[i].charAt(j)=='u')){ 
                            contarVocales++;
                          }
                    }
                }
                linea = lector.readLine();
            }
        }
        lector.close();
        return contarVocales;
    }

    public static float contarEspacios(File archivo) throws IOException{
        int numEspacios = 0;
        BufferedReader lector = new BufferedReader(new FileReader(archivo));
        String linea = lector.readLine();
        if(archivo.exists()){
            while (linea != null){
                for (int i = 0; i < linea.length(); i++) {
                    // Si el carácter en [i] es un espacio (' ') aumentamos el contador 
                    if (linea.charAt(i) == ' ') numEspacios++;
                }
                linea = lector.readLine();
            }
        }
        lector.close();
        return numEspacios;
    }
    public static float contarTabuladores(File archivo) throws IOException{
        int numTabuladores = 0;
        BufferedReader lector = new BufferedReader(new FileReader(archivo));
        String linea = lector.readLine();
        if(archivo.exists()){
            while (linea != null){
                for (int i = 0; i < linea.length(); i++) {
                    if (linea.charAt(i) == '\t') numTabuladores++;
                }
                linea = lector.readLine();
            }
        }
        lector.close();
        return numTabuladores;
    }

    public static float porcentajeVocales(File archivo) throws IOException{
        return ((conatarVocales(archivo)*100)/contarTodo(archivo));
    }
    public static float porcentajeConsonantes(File archivo) throws IOException{
        return (((contarLetras(archivo)-conatarVocales(archivo))*100)/contarTodo(archivo));
    }
    public static float porcentajeEspacios(File archivo) throws IOException{
        return ((contarEspacios(archivo)*100)/contarTodo(archivo));
    }
    public static float porcentajeTabs(File archivo) throws IOException{
        return ((contarTabuladores(archivo)*100)/contarTodo(archivo));
    }
    public static void main(String[] args) throws IOException{
        File fichero = new File("ficheroEstadisticas.txt");
        
        System.out.println("El fichero tiene: "+contarLineas(fichero)+" lineas");
        System.out.println("El fichero tiene: "+contarPalbras(fichero)+" palabras");
        System.out.println("El fichero tiene: "+contarLetras(fichero)+" letras");
        System.out.println("El fichero tiene: "+porcentajeVocales(fichero)+"% vocales");
        System.out.println("El fichero tiene: "+porcentajeConsonantes(fichero)+"% consonantes");
        System.out.println("El fichero tiene: "+porcentajeEspacios(fichero)+"% espacios");
        System.out.println("El fichero tiene: "+porcentajeTabs(fichero)+"% tabuladores");
    }
}
