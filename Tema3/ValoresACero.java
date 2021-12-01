public class ValoresACero {
    public static void main(String[] args) {
        int [][] matriz = new int [10][10];
        Utilidades.rellenaMatriz(matriz, 0, 1);
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int columnas0= 0;int filas0= 0;
        for (int i = 0; i<filas;i++){
            for (int j = 0; j<columnas;j++){
                System.out.print(matriz[i][j]); 
                if (j == 9){
                    System.out.println("");
                }
                if (matriz[i][0] == 0){
                    columnas0++;
                }
                if (matriz[i][j] == 0){
                    filas0++;
                }
            }
        }
        System.out.println("Tiene "+columnas0+" a 0");
        System.out.println("Tiene "+filas0+" a 0");
    }
}
