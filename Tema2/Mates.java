public class Mates {
    public static double suma (double x,double y){
        return x+y;
    }
    public static double resta (double x,double y){
        return x-y;
    }
    public static double multiplicacion (double x,double y){
        return x*y;
    }
    public static double division (double x,double y){
        return x/y;
    }
    public static void main(String[] args) {
    System.out.println("2 + 3 = "+suma(2,3));
    System.out.println("5,5-2,1 = "+resta(5.5,2.1));
    System.out.println("4,2 * 2,3 = "+multiplicacion(4.7,2.3));
    System.out.println("20,2 / 2,1 = "+division(20.2,2.1));    
    }
}
