public class SumarIgual {
    public static void main(String[] args) {
        int [] array = new int [10];
        int valor = Utilidades.leerEntero("Introuce el numero de la suma");
        Utilidades.rellenaArray(array, 1, 5 );
        for (int i= 0; i< array.length; i++){
            for (int j = i+1; j <array.length;j++){
                if (array[i]+array[j] == valor){
                    System.out.println(array[i]+"+"+array[j]+"= "+valor);
                } 
            }
        }
    }
}
