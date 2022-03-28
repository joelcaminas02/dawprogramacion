package Item.Food;

import Characater.Character;

public abstract class Food implements IConsumable{
    private double power;

    public Food(double power){
        this.power=power;
    }

    public void consumedBy(Character character){
        character.heals(power);
    }
}
