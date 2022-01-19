package Objetos;

import java.util.ArrayList;
import java.util.*;
public class SillaTest {

        public static void main(String[] args) {
        String [] color = {"verde","azul","rojo","amarillo","morado","negra","gris"};
        String [] material = {"madrea","plastico","metal","aluminio"};
        int [] comodidad = {1,2,3,4,5,6,7,8,9,10};
        int [] patas = {1,2,3,4,5};
        Random random = new Random();

        for (int i = 0; i<100;i++){
        Silla a1;    
            a1 = new Silla(color[(int)Math.random() * 7], random.nextBoolean(), material[(int)Math.random()*4], patas[(int)Math.random()*5], comodidad[(int)Math.random()*10]);

        }
    }
}
