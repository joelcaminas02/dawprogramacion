package Objetos;

public class MailTest {
    public static void main(String[] args) {
        MailServer server = new MailServer();

        MailClient joel =  new MailClient(server, "Joel");
        MailClient juan =  new MailClient(server, "Juan");
        MailClient pepe = new MailClient(server, "Pepe");

        System.out.println("Tienes "+server.howManyMailItems("Joel")+" mensajes nuevos "+joel.getUser());

        joel.sendMailItem("Juan;Pepe", "illou", "que paza pisha, como esta la mari xoxo??");

        juan.printNextMailItem();
        System.out.println(server.howManyMailItems("Pepe"));
        pepe.printNextMailItem();
    }
}
