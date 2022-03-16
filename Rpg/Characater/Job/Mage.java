package Characater.Job;

import Characater.Stat.Dexterity;
import Characater.Stat.Intelligence;
import Characater.Stat.Stat;

public class Mage extends Job{
    @Override
    public int modifier(Stat stat) {
        int resultado=0;
        if (stat instanceof Intelligence){
            resultado = 4;
        }else if ( stat instanceof Dexterity ){
            resultado = 1;
        }
        return resultado;
    }
}
