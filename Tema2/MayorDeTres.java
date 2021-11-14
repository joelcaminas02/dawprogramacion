public class MayorDeTres{
    public static void Mayor (int x,int y, int z ){
        if (x>y && x>z){
            System.out.println(x);
        }else if (y>x && y>z){
                System.out.println(y);
        }else {
            System.out.println(z);
        }
    }
    public static void main(String[] args) {
        Mayor(3, 5, 6);
        Mayor(2, 7, 4);
        Mayor(8, 2, 5);
    }
}