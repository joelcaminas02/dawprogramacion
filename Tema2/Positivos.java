import java.util.*;
public class Positivos {
    public static void positivos (int [] x){
        int positivos = 0;
        for (int i = 0;i<x[i];i++){
        if(x[i] >= 0){
            positivos++;
            }
        }
        System.out.println(positivos);
    }
    public static void main(String[] args) {
        int[] x = new int[10];
        Scanner lector;
        lector = new Scanner(System.in);
        for (int i = 0;i<10;i++){
            x[i]= lector.nextInt();
    }lector.close();
    positivos(x);
}
}
