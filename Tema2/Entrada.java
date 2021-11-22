import java.util.Scanner;

public class Entrada {
    
    public static int entero (){
        Scanner lector;
        lector = new Scanner(System.in);
        
        int number = 0;
        System.out.println("Introduce un entero");
        boolean entero = false;
        
        while(!entero){
            
            if (lector.hasNextInt()){
                number=lector.nextInt();
                entero = true;    
            }else{
                System.out.println("Introduce otro valor");
                
            }
            lector.nextLine();
            
        }
        //lector.close();
        System.out.println("Es entero " + number);
        lector.close();
        return number;
    }
}
