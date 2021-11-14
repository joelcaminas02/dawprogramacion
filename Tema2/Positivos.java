import java.util.*;
public class Positivos {
    public static void Postives (){
        int x;
        Scanner lector;
        int positivos = 0;
        lector = new Scanner(System.in);
        for (int i = 0;i<10;i++){
            x = lector.nextInt();
            if(x >= 0){
                positivos++;
            }
        }lector.close();
        System.out.println(positivos);
    }
    public static void main(String[] args) {
        Postives();
    }
}
