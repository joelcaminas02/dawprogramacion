package Objetos;

public class TicketMachine2Test {
    
    public static void main(String[] args) {
        TicketMachine2 t1;

        t1 = new TicketMachine2(150);

        t1.insertMoney(100);
        t1.setPrice(150);
        t1.printTicket();
        t1.setDiscount();
        t1.emptyMachine();

    }
}
