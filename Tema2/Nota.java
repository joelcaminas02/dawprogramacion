public class Nota {
    public static void Notas (int x){
        if (x>0 && x<3) {
            System.out.println("Muy deficiente");
        }else if (x>=3 && x<5){
            System.out.println("Insuficiente");
        }else if (x >= 5 && x<6){
            System.out.println("Suficiente");
        }else if (x >= 6 && x<7){
            System.out.println("Bien");
        }else if (x >= 7 && x<9){
            System.out.println("Notable");
        }else if (x >= 9 && x<=10){
            System.out.println("Sobresaliente");
        }else{
            System.out.println("error");
        }
    }
    public static void main(String[] args) {
        Notas(10);
        Notas(5);
        Notas(-2);
        Notas(6);
    }
}
