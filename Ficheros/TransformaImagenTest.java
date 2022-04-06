import java.io.File;
import java.io.IOException;

public class TransformaImagenTest {
    public static void main(String[] args) {
        File image = new File("/home/INFORMATICA/alu10471923/Escriptori/dawprogramacion/Ficheros/penyagolosa.bmp");
        TransformaImagen ti = new TransformaImagen(image);
        try {
            ti.transformaNegativo();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}