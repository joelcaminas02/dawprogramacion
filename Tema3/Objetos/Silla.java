package Objetos;
import java.awt.*;
/*Creamos una clase silla,  atributos color, nº patas, respaldon comodidad y material. Tiene un punto 
que la localiza en una habitacion con x e y . Los atributos son privados pero desde la clase de test se pueden modificar
y acceder a su valor. En la clase de prueba creamos de manera aleatoria 100 sillas */

public class Silla {
    private String color;
    private int patas;
    private String respaldo;
    private int comodidad;
    private String material;

    public Silla (String color, String repaldo, String material, int patas, int comodidad){
        color = "verde";
        respaldo = "Si";
        material = "madera";
        patas = 4;
        comodidad = 0;
    }
}
