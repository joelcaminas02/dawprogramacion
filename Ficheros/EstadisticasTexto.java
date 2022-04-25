import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Estadisticas Texto
 * crea un programa que analize un sistema de texto plano, y que muestre lsa siguientes estadiscticas:
 * Num de letras, palabras,linias, porcentaje de vocales ,consonantes, espacios y tabuladores.
 */

public class EstadisticasTexto {
    public static void main(String[] args) throws IOException{
        int numLetras = 0;
        int numPalabras = 0;
        int numLineas = 0;
        int porcentajeVocales = 0;
        int porcentajeConsonates = 0;
        int porcentajeEspacios = 0;
        int porcentajeTabuladores = 0;

        File fichero = new File("./ficheroEstadisticas.txt");
        BufferedReader lector = new BufferedReader(new FileReader(fichero));
        String linea = lector.readLine();
        if(fichero.exists()){
            while (linea != null){
                
            }
        }
    }
}
