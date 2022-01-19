package Objetos;
import java.awt.*;
public class Silla {
    //Atributos de objetos
    private String color;
    private int patas;
    private boolean respaldo;
    private int comodidad;
    private String material;
    private Point ubicacion;

    public Silla (){
    }
    public Silla (String color, boolean respaldo, String material, int patas, int comodidad, Point ubicacion){
        this.color = color;
        this.respaldo = respaldo;
        this.material = material;
        this.patas = patas;
        this.comodidad = comodidad;
        this.ubicacion = ubicacion;
    }

    public int getComodidad(){
        return comodidad;
    }

    public Point getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Point ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setComodiad(int nuevacomodidad){
        if (nuevacomodidad < 0){
            nuevacomodidad = 0;
        }else if ( nuevacomodidad > 100){
            nuevacomodidad = 100;
        }else{
            comodidad = nuevacomodidad;
        }
    }
    public String getColor(){
        return color;
    }
    public void setColor (String newcolor){
        color = newcolor;
    }

    public int getPatas (){
        return patas;
    }
    public void  setPatas (int nuevaPatas){
        if (nuevaPatas < 0){
            nuevaPatas = 0;
        }else if ( nuevaPatas > 100){
            nuevaPatas = 100;
        }else{
            patas = nuevaPatas;
        }
    }
    public void setRespaldo (boolean value){
        respaldo = value;
    }
    public String getRespaldo (){
        if (respaldo){
            return "Si";
        }else{
            return "No";
        }
    }
}
