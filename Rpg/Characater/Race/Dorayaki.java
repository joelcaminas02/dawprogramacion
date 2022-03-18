package Characater.Race;

import Characater.Stat.Dexterity;
import Characater.Stat.Intelligence;
import Characater.Stat.Stat;
import Characater.Stat.Strength;

public class Dorayaki extends Race{

    @Override
    public int modifier(Stat stat) {
        int resultado=0;

        if(stat instanceof Strength){
            resultado=6;
        }else if(stat instanceof Dexterity){
            resultado=3;
        }else if(stat instanceof Intelligence){
            resultado=-4;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Dorayaki";
    }
    
}
