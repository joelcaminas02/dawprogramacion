package Characater;

import Characater.Job.Mendigo;
import Characater.Race.Dorayaki;

public class Test {
    public static void main(String[] args) {
        Mendigo m1 = new Mendigo();
        Dorayaki d1 = new Dorayaki();
        Character ch1 = new Character("Joel", m1, d1);

        System.out.println(ch1.toString());

        System.out.println(ch1.maxHealth());

        ch1.recivesDamage(50);

        ch1.heals(50);

        ch1.recivesDamage(10);

        System.out.println(ch1.health());
    }
}
