package Characater.Race;

import Characater.Stat.Constitution;
import Characater.Stat.Dexterity;
import Characater.Stat.Stat;
import Characater.Stat.Strength;

public class Draconico extends Race {

    @Override
    public int modifier(Stat stat) {
        int resultado = 0;

        if(stat instanceof Dexterity){
            resultado = 4;
        }else if(stat instanceof Constitution){
            resultado = 2;
        }else if(stat instanceof Strength){
            resultado = -1;
        }
        return resultado;
    }
    
}
