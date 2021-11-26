public class Eliminar {
    public static void main(String[] args) {
        int [] indice = {1,2,3,4,5};
        int numero = Utilidades.leerEntero("Introduce el numero que quieras eliminar");
        if (numero > indice.length){
            do {
                numero = Utilidades.leerEntero("Introduce otro numero");
            }while(numero > indice.length);
        }
        for (int i = numero+1; i < indice.length; i++){
            indice[i-1]= indice[i];
        }
        indice[indice.length-1]= 0;
        for(int i = 0; i < indice.length; i++){
            System.out.println(indice[i]);
        }   
    }
}
