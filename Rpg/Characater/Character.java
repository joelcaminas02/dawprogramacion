package Characater;

import Characater.Job.*;
import Characater.Race.*;
import Characater.Stat.*;
//import Item.Food.IConsumable;


public class Character implements IDamegable {
    
    private Job job;
    private Race race;
    private String nombre;
    private Strength strength;
    private Intelligence intelligence;
    private Constitution constitution;
    private Dexterity dexterity;
    private double health;

    public Character(String nombre,Job job,Race race){
        this.nombre=nombre;
        this.job=job;
        this.race=race;
        this.strength=new Strength(5);
        this.intelligence=new Intelligence(5);
        this.constitution=new Constitution(5);
        this.dexterity=new Dexterity(5);
        this.health=maxHealth();


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

    public double maxHealth(){
        return (constitution.getValue()+race.modifier(constitution)+job.modifier(constitution))*25;
    }

    public String toString(){
        return "My name is "+this.nombre+". Im a "+this.race+" "+this.job+". My stats are:\n---------------------------\nStrength: "+this.strength
                +"\nDexterity: "+this.dexterity+"\nCosntitution: "+this.constitution+"\nIntelligence: "+this.intelligence+"\nVelocity: "+this.velocity()+
                "\nPower: "+this.power()+"\nMagic: "+this.magic()+"\nHealth: "+this.maxHealth()+"\n----------------------------";
    }

    @Override
    public double health() {
        return this.health;
    }

    @Override
    public void recivesDamage(double amount) {
        this.health=health-amount;
        System.out.println(this.getNombre()+" recived "+amount+" damage. Health: "+health()+"/"+maxHealth());
        if(isDead()){
            System.out.println(this.getNombre()+" is dead");
        }
        
    }

    @Override
    public void heals(double amount) {
       this.health=health+amount;
       System.out.println(this.getNombre()+" healed "+amount+" life. Health: "+health()+"/"+maxHealth());
    }

    @Override
    public boolean isDead() {
        if(this.health<=0)
            return true;
        else
        return false;
    }

/**    public void consumes(IConsumable consumable){
        consumable.consumedBy(this);

        System.out.println(this.nombre+" consumed: "+consumable);
    }*/
}
