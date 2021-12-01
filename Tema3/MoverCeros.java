public class MoverCeros {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,0,0,6,7,8,0,2,1};
        int contador = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == 0){
                contador++;
            }
        }
        for (int i = 0 ; i < array.length;i++){
            if (array[i] == 0){
                array[i] = array[i+1];
            }
        }
        for (int i = array.length-1; contador == 0; contador--){
            array[i] = 0;
            i--;
        }
        Utilidades.mostrarArray(array);
    }
}
