import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class mezcla {
    
    public static File crearFichero(File f1, File f2,File f3) throws IOException{
        if(f1.exists()&&f2.exists()){
            BufferedReader f_ent = new BufferedReader(new FileReader(f1));
            BufferedReader f_ent2 = new BufferedReader(new FileReader(f2));
            PrintWriter f_out = new PrintWriter(new OutputStreamWriter(new FileOutputStream(f3)));
                String c = f_ent.readLine();
                String d = f_ent2.readLine();
                while( c != null || d != null){
                    f_out.println(c);
                    f_out.println(d);
                    c = f_ent.readLine();
                    d = f_ent2.readLine();
                }
                f_ent.close();
                f_ent2.close();
                f_out.close();
            }
            return f3;
        }
        

    public static void main(String[] args) throws IOException{
        File f1 = new File("f1.txt");
        File f2 = new File("f2.txt");
        File f3 = new File("f3.txt");

        crearFichero(f1, f2, f3);
    }
}
