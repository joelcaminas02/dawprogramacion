package Characater.Job;

import Characater.Stat.*;

public class Mendigo extends Job {
    @Override
    public int modifier(Stat stat) {
        int resultado=0;
        if (stat instanceof Strength){
            resultado = -1;
        }else if ( stat instanceof Dexterity ){
            resultado = 10;
        }else if ( stat instanceof Constitution){
            resultado = -4;
        }
        return resultado;
    }
}
