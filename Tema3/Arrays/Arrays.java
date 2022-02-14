package Arrays;
//**Crea un programa en el que crees una array de 1000 enteros, en las posiciones pares los multiplos de 3
//**y las impares los de 7 , imprimir multiplos de 13 */
public class Arrays {

    public static int multiploDe3(){
        return 3*(int)(Math.random()*1000+1);
    }
    public static int multiploDe7(){
        return 7*(int)(Math.random()*1000+1);
    }
    public static void main(String[] args) {
        int [] array =  new int [1000];
        for (int i = 0;i <array.length;i = i+2){
            array[i]= multiploDe3();
        }
        for (int i = 1; i< array.length; i = i+2){
            array[i]= multiploDe7();
        }
        for(int entero:array){
            if(entero%13== 0){
                System.out.println(entero);
            } 
        }
    }
}
