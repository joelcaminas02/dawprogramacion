package Characater.Job;

import Characater.Stat.Constitution;
import Characater.Stat.Stat;
import Characater.Stat.Strength;

public class Warrior extends Job{

    @Override
    public int modifier(Stat stat) {
        int resultado=0;
        if (stat instanceof Strength){
            resultado = 3;
        }else if ( stat instanceof Constitution ){
            resultado = 2;
        }
        return resultado;
    }
}
