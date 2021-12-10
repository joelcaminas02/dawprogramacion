public class HundirLaFlota {
    public static void crearBarco(int numBarcos, int[][] barcoPosicion) {
        int r1, r2;
        int cont = 0;

        while (cont < numBarcos) {
            r1 = (int) (Math.random() * 8);
            r2 = (int) (Math.random() * 8);
            if (barcoPosicion[r1][r2] != 1) {
                barcoPosicion[r1][r2] = 1;
                cont++;
            }
        }
    }

    public static void main(String[] args) {
        int [][] barcoPosicion=new int [8][8];
        crearBarco(10, barcoPosicion);
        int barcohundido = 0; int disparos = 0;
        //Mostrar la matriz Inicio
        do{
        System.out.println("Disparos: "+ disparos);
        System.out.println("Barcos Hundidos: " +barcohundido);
        mostrarTablero(barcoPosicion);
        char letrita = Utilidades.leerCaracter("Dame la letra: ");
        int numerito = Utilidades.leerEntero("Dame el numero: ");

        int letraFinal = letrita - 'A';
        numerito--;
        disparos++;

        barcoPosicion[letraFinal][numerito] += 2;
        if (barcoPosicion[letraFinal][numerito] == 3){
            barcohundido++;
        }
        }while (barcohundido != 10);
        //Mostrar matriz Fin

        //Pedimos celda y le damos valor a la letra
        
    }

    public static void mostrarTablero(int[][] barcoPosicion) {
        
        int filas1 = barcoPosicion.length;
        int columnas1 = barcoPosicion[0].length;
        int L = 0; //L = al elemento del array letras
        char [] letras = {'A','B','C','D','E','F','G','H'};

        System.out.println("  1 2 3 4 5 6 7 8");

        for (int i = 0; i<filas1;i++){
            System.out.print(letras[L]);
            for (int j = 0; j<columnas1;j++){
                if (barcoPosicion[i][j] <= 1) {
                    System.out.print(" " + "·"); 
                }
                if (barcoPosicion[i][j] == 2) {
                    System.out.print(" " + "O"); 
                }
                if (barcoPosicion[i][j] == 3) {
                    System.out.print(" " + "X");
                }
                if (j == 7){
                    System.out.println("");
                }
            }
            L++;
        }
    }
}