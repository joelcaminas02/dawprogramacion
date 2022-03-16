package Characater.Race;

import Characater.Stat.Constitution;
import Characater.Stat.Dexterity;
import Characater.Stat.Intelligence;
import Characater.Stat.Stat;

public class Elf extends Race{

    @Override
    public int modifier(Stat stat) {
        int resultado = 0;
        
        if(stat instanceof Dexterity){
            resultado = 3;
        }else if(stat instanceof Intelligence){
            resultado=3;
        }else if( stat instanceof Constitution){
            resultado=-1;
        }
        return resultado;
    }
    
}
