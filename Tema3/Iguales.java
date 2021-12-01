public class Iguales {
    public static void main(String[] args) {
        int [] array1 = {1,4,5,6,2,4};
        int [] array2 = array1.clone();
        boolean iguales = true;
        if (array1.length != array2.length) {
            System.out.println("No son iguales");
        }else{
            for (int i = 0; i<array1.length;i++){
                if (array1[i] != array2[i]){
                iguales = false;
                break;
                }
            }
        }
        if (iguales){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
    }
}