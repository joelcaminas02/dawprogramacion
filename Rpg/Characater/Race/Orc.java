package Characater.Race;

import Characater.Stat.*;

public class Orc extends Race {

    @Override
    public int modifier(Stat stat) {
        int resultado=0;

        if (stat instanceof Strength){
            resultado = 5;
        }else if ( stat instanceof Constitution ){
            resultado = 3;
        }else if (stat instanceof Intelligence){
            resultado=-3;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Orc";
    }
    
    
}
