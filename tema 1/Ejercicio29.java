public class Ejercicio29 {
    public static void main(String[] args) {
        
        //Declaración de variables
        int divisor;
        divisor = 2;
        boolean esPrimo = true;

        //Programa principal
        System.out.println("Estos son los numeros primos del 3 al 100 ");
        
        for(int i=3;i<=100;i++){
            while ((divisor < i) && esPrimo ){
                if (i % divisor == 0){
                esPrimo = false;
                }
                System.out.println(i);
                i++;
        }
    }
    }    
}