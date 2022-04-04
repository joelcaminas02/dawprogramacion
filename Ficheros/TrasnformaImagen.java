import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class TrasnformaImagen {
    private File f = null;

    public TrasnformaImagen (File fEnt){
        try {
            if(fEnt.exists()){
                if(fEnt.getName().endsWith(".bmp")){
                    f=fEnt;
                }
            }
        } catch (Exception e) {
            System.out.println("No existe la imagen");
        }
    }

    public void transformaNegativo() throws IOException{

        BufferedReader f_ent = new BufferedReader(new FileReader(this.f));
        BufferedWriter f_sal = new BufferedWriter(new FileWriter(this.f));
        int c = f_ent.read();

        while (c != 1 ){
            c=f_ent.read();
        }
        f_ent.close();
        f_sal.close();
    }

    public void transformaOscuro()  throws IOException{
    
    }

    public void transformaBlancoNegro() throws IOException{

    }

    private String getNombreSinExtension(){
        return "a";
    }

}
