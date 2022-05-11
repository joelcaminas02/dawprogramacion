import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

import org.jsoup.*;

public class LeerHtml {
    public static void main(String[] args) throws IOException{
        Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
        Element link = doc.select("a").first();
        String relHref = link.attr("href");
        String absHref = link.attr("abs:href");
        System.out.println(absHref);
    }
}
