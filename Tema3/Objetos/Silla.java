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
    
    private static String [] colores = {"verde","azul","rojo","amarillo","morado","negra","gris"};
    private static String [] materiales = {"madera","plastico","metal","aluminio"};
    private static final int CoordenadaMin = 0;
    private static final int CoordenadaMax = 100;
    private static final int PatasMin = 0;
    private static final int PatasMax = 4;
    private static final int ComodidadMin = 0;
    private static final int ComodidadMax = 10;


    public static String colorAleatorio(){
        int min = 0;
        int max = colores.length-1;

        int aleatorio = (int) (Math.random()* (max -min +1)+min);

        return colores[aleatorio];
    }

    public static int comodidadAleatorio(){
        int min = Silla.ComodidadMin;
        int max = Silla.ComodidadMax;

        int aleatorio = (int) (Math.random()* (max -min +1)+min);

        return aleatorio;
    }

    public static boolean respaldoAleatorio(){
        int min = 0;
        int max = 1;

        int aleatorio = (int) (Math.random()* (max -min +1)+min);

        if (aleatorio == 0){
            return false;
        }else{
            return true;
        }
    }

    public static int patasAleatorio(){
        int min = Silla.PatasMin;
        int max = Silla.PatasMax;

        int aleatorio = (int) (Math.random()* (max -min +1)+min);

        return aleatorio;
    }

    public static String materialAleatorio(){
        int min = 0;
        int max = materiales.length-1;

        int aleatorio = (int) (Math.random()* (max -min +1)+min);

        return materiales[aleatorio];
    }

    public static Point ubicacionAleatorio (){
        Point punto = new Point();

        int min = Silla.CoordenadaMin;
        int max = Silla.CoordenadaMax;

        int x = (int) (Math.random()* (max -min +1)+min);
        int y = (int) (Math.random()* (max -min +1)+min);

        punto.setLocation(x, y);

        return punto;
    }

    public Silla (){
        this.color = Silla.colorAleatorio();
        this.material = Silla.materialAleatorio();
        this.patas = Silla.patasAleatorio();
        this.comodidad = Silla.comodidadAleatorio();
        this.respaldo = Silla.respaldoAleatorio();
        this.ubicacion = Silla.ubicacionAleatorio();
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
