package Arrays;
public class Eliminar {
    public static void main(String[] args) {
        int [] indice = {1,2,3,4,5};
        int numero = Utilidades.leerEntero("Introduce el numero que quieras eliminar");
        if (numero > indice.length){
            do {
                numero = Utilidades.leerEntero("Introduce otro numero");
            }while(numero > indice.length - 1);
            
            eliminarIndice(indice, numero);
            
            Utilidades.mostrarArray(indice);
        }
    }

    public static void eliminarIndice(int[] indice, int numero) {
        for (int i = numero+1; i < indice.length; i++){
            indice[i-1]= indice[i];
        }
        indice[indice.length-1]= 0;
    }
}
