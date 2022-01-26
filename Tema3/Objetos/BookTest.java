package Objetos;

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("Pepe", "Las aventuras de Pepe", 123,"",true);
        b1.getRefNumber();
        b1.setRefNumber("1001");
        b1.getRefNumber();
    }
    
    
}
