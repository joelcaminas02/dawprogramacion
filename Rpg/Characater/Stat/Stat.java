package Characater.Stat;

public abstract class Stat {
    
    private int value;

    public Stat(int value){
        this.value=value;
    }

    public int getValue(){
        return this.value;
    }

    public void increase(){
        this.value++;
    }

    public void decrease(){
        this.value--;
    }
    
    public String toString(){
        return ""+this.value;
    }
}
