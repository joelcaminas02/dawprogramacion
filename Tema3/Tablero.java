public class Tablero {
    public static void main(String[] args) {
        char [][] matriz = new char [8][8];
        char [] letras = {'A','B','C','D','E','F','G','H'};
        
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        Utilidades.rellenaMatrizchar(matriz, 0, 3);
        for (int i = 0; i<filas;i++){
            for (int j = 0; j<columnas;j++){
                if (matriz[i][j]== 0){
                    matriz[i][j] = '·';
                }else if (matriz[i][j]== 1){
                    matriz[i][j] = '+';
                }else if(matriz[i][j]== 2){
                    matriz[i][j] = '0';
                }else if(matriz[i][j]>= 3){
                    matriz[i][j] = 'x';
                }
            }
        }
    
        System.out.println("  1 2 3 4 5 6 7 8");
    
            int filas1 = matriz.length;
            int columnas1 = matriz[0].length;
            int L = 0; //L = al elemento del array letras
    
            for (int i = 0; i<filas1;i++){
                System.out.print(letras[L]);
                for (int j = 0; j<columnas1;j++){
                    System.out.print(" " + matriz[i][j]); 
                    if (j == 7){
                        System.out.println("");
                }
            }
            L++;
        }
    }
}
