import java.util.Scanner;
public class ejercicio13 {
    public static void main(String[] args) {
        String primera="ascendente";
        boolean b1 = Boolean.valueOf(primera);
        System.out.println("Como quieres el orden?");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        String orden = inputValue.nextLine();

        System.out.println("Introduce el primer valor: ");
        inputValue = new Scanner(System.in);
        int v1 = inputValue.nextInt();

        System.out.println("Introduce el segundo valor;¡: ");
        inputValue = new Scanner(System.in);
        int v2 = inputValue.nextInt();

        if ( orden = b1 ){
            if (v1 > v2){
            System.out.println("v1");
            System.out.println("v2");
            }else{
                System.out.println("v2");
                System.out.println("v1");
            }
        }else{
            if (v2 > v1){
            System.out.println("v2");
            System.out.println("v1");
            }else{
                System.out.println("v1");
                System.out.println("v2");
            }
        }
        inputValue.close();
    }
}
