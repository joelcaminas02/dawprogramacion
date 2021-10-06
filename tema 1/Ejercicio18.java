import java.util.*;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Introduce la hora: ");
        int hora = inputValue.nextInt();

        System.out.println("Introduce los minutos: ");
        int minutos = inputValue.nextInt();

        System.out.println("Introduce los segundos: ");
        int segundos = inputValue.nextInt();

        inputValue.close();

        if ( hora < 24 ) {
            if ( minutos < 60){
                if ( segundos < 60 ){
                    int calcHora = (hora*3600);
                    int calcMin= (minutos*60);
                    int calcSeg= (segundos+1);
                    int suma = (calcHora+calcMin+calcSeg);
                    int HoraFin = (suma/3600);
                    int SegRest = (HoraFin*3600);
                    int MinFin= (suma-SegRest)/60;
                    int SegFin = (suma-SegRest)- MinFin*60;
                    System.out.println(HoraFin+":"+MinFin+":"+SegFin); 
                }else{
                    System.out.println("Dame unos valores correctos");
                }
            }else{
                System.out.println("Dame unos calores correctos");
            }
            }else{
            System.out.println("Dame unos valores correctos");
        }
    }
}
