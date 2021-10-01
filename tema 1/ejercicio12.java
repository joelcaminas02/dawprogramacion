import java.util.*;
public class ejercicio12 {
    public static void main(String[] args) {
        System.out.println("Introduce un valor ");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        int v1 = inputValue.nextInt();
        
        System.out.println("Introduce el segundo valor");
        int v2 = inputValue.nextInt();

        if ( v1 > v2 ){
            System.out.println(v1);
        }else{
            System.out.println(v2);
           }
        inputValue.close();
    }
}