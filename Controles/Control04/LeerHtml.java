package Control04;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.jsoup.*;

public class LeerHtml {
    public static void main(String[] args) throws IOException{
        Document doc = Jsoup.connect("https://www.sprkcrtv.com/").get();
        Elements elsUrl = doc.select("a");
        Elements elsImg = doc.select("img");
        InputStream writer;
        URL url;
        int contador = 0;
        //for (Element e:elsUrl){
        //    System.out.println(e.attr("abs:href"));
        //}
        for (Element e:elsImg){
            String imagen1 = e.toString();
            String[] array = imagen1.split("src") ;
            String[] array2 = array[1].split("\"");
            String imagen2 = array2[1];
            url = new URL(imagen2);
            writer =  new BufferedInputStream(url.openStream());
            ByteArrayOutputStream imagen = new ByteArrayOutputStream();
            byte [] buf =  new byte[1024];
            int n = 0;
            while (-1!=(n=writer.read(buf))){
                imagen.write(buf, 0, n);
            }
            imagen.close();
            writer.close();
            byte[] response = imagen.toByteArray();
            FileOutputStream fos = new FileOutputStream("imagenes"+contador+".jpg");
            contador++;
            fos.write(response);
            fos.close();
        }
    }
}
