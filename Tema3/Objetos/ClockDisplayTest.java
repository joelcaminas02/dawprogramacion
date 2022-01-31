package Objetos;

public class ClockDisplayTest {
    public static void main(String[] args) {
        ClockDisplay reloj =  new ClockDisplay();

        System.out.println(reloj.getTime());

        for (int i =0; i<3600; i++){
            reloj.timeTick();
        }

        System.out.println(reloj.getTime());
    }
}
