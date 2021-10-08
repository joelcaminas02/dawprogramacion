import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Si quires el orden ascendente ponga 1 si lo quieres descendente 2: ");
        int orden = inputValue.nextInt();

        System.out.println("Introduce el primer valor: ");
        int v1 = inputValue.nextInt();

        System.out.println("Introduce el segundo valor: ");
        int v2 = inputValue.nextInt();

        if ( orden == 1 ){
            if (v1 > v2){
            System.out.println(v1);
            System.out.println(v2);
            }else{
            System.out.println(v2);
            System.out.println(v1);
            }
        }else if ( orden == 2 ){
            if (v2 > v1){
            System.out.println(v2);
            System.out.println(v1);
            }else{
            System.out.println(v1);
            System.out.println(v2);
            }
        }
        inputValue.close();
    }
}
