public class Mayor {
    public static void mayoriaEdad (int x){
        if (x >= 18) {
            System.out.println("Mayor de edad");
        }else{
            System.out.println("No es mayor de edad");
        }
    }
    public static void main(String[] args) {
        mayoriaEdad(18);
        mayoriaEdad(7);
    }
}
