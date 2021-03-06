package Characater.Job;

import Characater.Stat.Stat;

public abstract class Job {
    
    public abstract int modifier(Stat stat); 

    public boolean equals(Object obj){
        return getClass().getName().equals(obj.getClass().getName());
    }

    public String toString(){
        return "Job";
    }
}
