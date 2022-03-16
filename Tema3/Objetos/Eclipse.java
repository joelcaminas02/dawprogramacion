package Objetos;

public class Eclipse extends Forma{

    private int radioMayor;
    private int radioMenor;

    public Eclipse(String color, int x , int y, String nombre, int radioMayor,int radioMenor){
        super(color, x, y, nombre);
        this.radioMayor=radioMayor;
        this.radioMenor=radioMenor;
    }

    public double calcularArea(){
        return Math.PI*(this.radioMayor*this.radioMenor);
    }
}
