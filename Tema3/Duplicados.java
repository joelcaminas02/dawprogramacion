public class Duplicados {
    public static void main(String[] args) {
        int[] ejemplo = new int[10];
        Utilidades.rellenaArray(ejemplo, 1, 6);
        for (int i = 0; i < ejemplo.length; i++){
            for (int j = i+1; j < ejemplo.length; j++){
                if (ejemplo[i] == ejemplo[j]){
                    System.out.println(ejemplo[i]);
                }
            }
        }
    }
}

