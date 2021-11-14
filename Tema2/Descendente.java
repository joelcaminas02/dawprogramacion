public class Descendente {
    public static void OrdenDescendente (double x, double y){
        if (x>y) {
            System.out.println(x);
            System.out.println(y);
        }else{
            System.out.println(y);
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        OrdenDescendente(5, 3);
        OrdenDescendente(1, 9);
    }
}
