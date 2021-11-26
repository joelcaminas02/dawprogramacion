public class Comunes {
    public static void main(String[] args) {
        int [] array1 = new int [10];
        int [] array2 = new int [10];
        Utilidades.rellenaArray(array1, 1, 10);
        Utilidades.rellenaArray(array2, 1, 10);
        for (int i = 0; i < array1.length;i++){
            for (int j = 0; j < array2.length; j++){
                if (array1[i] == array2[j]){
                    System.out.println(array1[i]);
                }
            }
        }
    }
}