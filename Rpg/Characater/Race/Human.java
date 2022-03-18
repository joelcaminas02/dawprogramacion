package Characater.Race;

import Characater.Stat.Constitution;
import Characater.Stat.Dexterity;
import Characater.Stat.Stat;
import Characater.Stat.Strength;

public class Human extends Race{

    @Override
    public int modifier(Stat stat) {
        int resultado = 0;

        if (stat instanceof Strength){
            resultado = 2;
        }else if(stat instanceof Constitution){
            resultado = 2;
        }else if (stat instanceof Dexterity){
            resultado = 1;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Human";
    }
    
}
