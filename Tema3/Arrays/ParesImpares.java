package Arrays;
public class ParesImpares {
    public static void main(String[] args) {
        int [] array = new int [10];
        Utilidades.rellenaArray(array, 1, 10);
        for (int i = 0; i < array.length; i++){
            if (array[i]%2== 0 ){
                System.out.println(array[i]+" es par");
            }else{
                System.out.println(array[i]+" no es par");
            }
        }
    }
}
