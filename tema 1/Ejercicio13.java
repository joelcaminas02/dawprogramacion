import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        String str1 = new String("ascendente");
        String str2 = new String("descendente");
        System.out.println("Como quieres el orden?");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        String orden = inputValue.nextLine();

        System.out.println("Introduce el primer valor: ");
        int v1 = inputValue.nextInt();

        System.out.println("Introduce el segundo valor;¡: ");
        int v2 = inputValue.nextInt();

        if ( str1 == orden ){
            if (v1 > v2){
            System.out.println(v1);
            System.out.println(v2);
            }else{
            System.out.println(v2);
            System.out.println(v1);
            }
        }else if ( str2 == orden ){
            if (v2 > v1){
            System.out.println(v2);
            System.out.println(v1);
            }else{
            System.out.println(v1);
            System.out.println(v2);
            }
        }else{
            System.out.println("son iguales");
        }
        inputValue.close();
    }
}
