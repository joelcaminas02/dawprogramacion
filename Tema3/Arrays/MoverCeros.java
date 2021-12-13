package Arrays;
public class MoverCeros {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,0,0,6,7,8,0,2,1};
        for (int i = array.length-1; i >= 0; i--){
            if ( array[i] == 0){
                moverCeroDerecha(array, i);
            }
        }
        Utilidades.mostrarArray(array);
    }

    public static void moverCeroDerecha(int[] array, int pos) {
        for (int i = pos; i < array.length; i++){
            array[i] = array[i+1];
            array[i+1] = 0;
        }
    }
}
