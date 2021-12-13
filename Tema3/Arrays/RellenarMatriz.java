package Arrays;
public class RellenarMatriz {
    public static void main(String[] args) {
    int [][] matriz = new int [10][10];
    Utilidades.rellenaMatriz(matriz, 0, 1);
    int filas = matriz.length;
    int columnas = matriz[0].length;
    for (int i = 0; i<filas;i++){
        for (int j = 0; j<columnas;j++){
            System.out.print(matriz[i][j]); 
            if (j == 9){
                System.out.println("");
            }
        }
    }
    }    
}
