public class ArgumentosSuma{
    public static void main(String [] args) {
        int suma = 0;
        
        System.out.println("==============================");
        System.out.println("Argumentos: "+args.length);
        System.out.println("==============================");
        for (int i = 0; i < args.length; i++){
            int calculo = Integer.parseInt(args[i]);
            suma += calculo;
        }
        System.out.println(suma);
        System.out.println("==============================");
    }
}