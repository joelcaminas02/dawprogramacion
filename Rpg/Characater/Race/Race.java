package Characater.Race;

import Characater.Stat.Stat;

public abstract class Race {
    
    public abstract int modifier(Stat stat);

    public boolean equals(Object object){
        return getClass().getName().equals(object.getClass().getName());
    }

    public String toString(){
        return "Race";
    }
}
