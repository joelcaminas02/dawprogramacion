public class Value {
    public static boolean esDivisible(int n, int m){
        boolean divisible = false;
        if (n%m == 0){
            divisible = true;
        }
        return divisible;
    }
    public static boolean esTriangulo (int long1, int long2, int long3){
        boolean esTriangulo = false;
        if ((long2+long3)>long1 && (long1+long3)>long2 && (long2+long1)>long3){
            esTriangulo = true;
        }
        return esTriangulo;
    }
    public static boolean esTriangulo2 (int long1, int long2, int long3){
        return (long2+long3)>long1 && (long1+long3)>long2 && (long2+long1)>long3;
    }
    public static double potencia (double x, int n){
        if (n == 0){
            return 1;
        }else{
            return x * potencia(x, n-1);
        }
    }

    public static int positivos (){
        int [] anArray = {1,2,3,4,5,-2,-5,-3,7,-10};
        int positivos = 0;
        for (int i = 0;i<anArray.length;i++){
            if (anArray[i] > 0){
                positivos++;
            }
        }
        return positivos;
    }
    public static char letradni (int x){
        char [] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        return letra[(x%23)];
    }
    public static boolean esPrimo (int x){
        int contador = 2;
        boolean esPrimo=true;

    while ((esPrimo) && (contador!=x)){
        if (x % contador == 0)
            esPrimo = false;
            contador++;
        }
        return esPrimo;
    }
}

