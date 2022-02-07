package Objetos;

public class TicketMachineTest {
    public static void main(String[] args) {
        TicketMachine tm1 = new TicketMachine(100);
        tm1.insertMoney(100);
        tm1.insertMoney(200);
        tm1.printTicket();
        tm1.showPrice();
        tm1.empty();
        tm1.showPrice();

    }
}
