package Characater.Job;

import Characater.Stat.Strength;
import Characater.Stat.*;

public class Assasin extends Job{
    @Override
    public int modifier(Stat stat) {
        int resultado=0;
        if (stat instanceof Strength){
            resultado = 1;
        }else if ( stat instanceof Dexterity ){
            resultado = 3;
        }else if (stat instanceof Constitution){
            resultado = 1;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Assasin";
    }
}

