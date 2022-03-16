package Characater;

import Characater.Job.*;
import Characater.Race.*;
import Characater.Stat.*;

public class Character {
    
    private Job job;
    private Race race;
    private String nombre;
    private Strength strength;
    private Intelligence intelligence;
    private Constitution constitution;
    private Dexterity dexterity;

    public Character(String nombre,Job job,Race race){
        this.nombre=nombre;
        this.job=job;
        this.race=race;
        this.strength=new Strength(5);
        this.intelligence=new Intelligence(5);
        this.constitution=new Constitution(5);
        this.dexterity=new Dexterity(5);

    }

    public String getNombre(){
        return this.nombre;
    }

    public Race getRace(){
        return this.race;
    }

    public Job getJob(){
        return this.job;
    }

    public double velocity(){
        return (dexterity.getValue()+race.modifier(dexterity)+job.modifier(dexterity))*2;
    }

    public double power(){
        return (strength.getValue()+race.modifier(strength)+job.modifier(strength))*2;
    }

    public double magic(){
        return (intelligence.getValue()+race.modifier(intelligence)+job.modifier(intelligence))*2;
    }

    public String toString(){
        return "My name is "+this.nombre+". Im an "+this.race+" "+this.job+". My stats are: Strength: "+this.strength
                +"Dexterity: "+this.dexterity+"Cosntitution: "+this.constitution+"Intelligence: "+this.intelligence+"Velocity: "+this.velocity()+
                "Power: "+this.power()+"Magic: "+this.magic()+"Health: 125";
    }
}
