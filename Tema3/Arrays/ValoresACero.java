package Arrays;
public class ValoresACero {
    public static void main(String[] args) {
        int [][] matriz = new int [10][10];
        Utilidades.rellenaMatriz(matriz, 0, 1);
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int Filas0= 0;
        for (int i = 0; i<filas;i++){
            boolean esFilacero = true;
            for (int j = 0; j<columnas;j++){
                if ( matriz[i][j] == 1){
                    esFilacero = false;
                    break;
                }
            }
            if (esFilacero){
                Filas0++;
            }
        }
        System.out.println(Filas0);
        
        int Columna0 = 0;
        for (int i = 0; i<filas;i++){
            boolean esColumnacero = true;
            for (int j = 0; j<columnas;j++){
                if ( matriz[j][i] == 1){
                    esColumnacero = false;
                    break;
                }
            }
            if (esColumnacero){
                Columna0++;
            }
        }
        System.out.println(Columna0);
    }
}
