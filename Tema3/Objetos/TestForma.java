package Objetos;

import java.util.ArrayList;

public class TestForma {
    public static void main(String[] args) {
        ArrayList <Forma> lista = new ArrayList<>();

        Forma f1 = new Forma("rojo", 6, 0, "forma1");
        f1.imprimir();
        f1.moverForma(7, 8);
        f1.setColor("amarillo");
        f1.imprimir();
        lista.add(f1);

        Rectangulo r1 = new Rectangulo("azul", 4, 0, "rectangulo1", 10, 7);
        r1.imprimir();
        r1.moverForma(8, 5);
        r1.setColor("verde");
        r1.imprimir();
        System.out.println("Area: "+r1.area());
        System.out.println("Perimetro: "+r1.CalcularPerimetro());
        lista.add(r1);

        Eclipse e1 = new Eclipse("morado", 6,3, "eclipse1",8, 7);

        Circulo c1 = new Circulo("rosa", 4, 2, "circulo", 5);

        Cuadrado cu1 = new Cuadrado("color", 3, 1, "cuadrado1", 4);
        
        lista.add(e1);
        lista.add(c1);
        lista.add(cu1);

        for(Forma formas:lista){
            formas.setColor("negro");
            formas.moverForma(5, 5);
            formas.imprimir();
            System.out.println("----------------");
        }

    }
}
