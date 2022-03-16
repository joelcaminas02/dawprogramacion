package Objetos;
import java.awt.*;
public class Forma {
    
    private String color;
    private Point centro;
    private String nombre;

    public Forma (String color, int x, int y, String nombre){
        this.color=color;
        this.centro=new Point(x,y);
        this.nombre=nombre;
    }

    public void imprimir(){
        System.out.println("Color: "+this.color);
        System.out.printf("Centro: (%d, %d)\n", this.centro.x,this.centro.y);
        System.out.println("Nombre: "+nombre);
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public void moverForma(int x, int y){
        this.centro.setLocation(x, y);
    }
}
