
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TransformaImagen {
        File f = null;
        public TransformaImagen(File fEnt) {        
            if(!fEnt.getName().substring(fEnt.getName().indexOf(".")).equals(".bmp")) {
                    
            }
            else {
                f = fEnt;
            }
        }

    public void transformaNegativo() throws IOException{

        FileInputStream reader = new FileInputStream(this.f);
        //File fOut = new File("./fichero_n.bmp");
        FileOutputStream writer = new FileOutputStream(this.f);
        byte[] contenido = new byte[54];

        reader.read(contenido);
        writer.write(contenido);

        int c = 0;

        c = reader.read();

        while (c != -1 ){
            writer.write((char)(255-c));
            c = reader.read();
        }
        writer.close();
        reader.close();
    }

    public void transformaOscuro()  throws IOException{
    
    }

    public void transformaBlancoNegro() throws IOException{

    }

    //private String getNombreSinExtension(){
    //    return "a";
    //}

}
