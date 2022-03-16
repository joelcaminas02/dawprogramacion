package Objetos;

public class Rectangulo extends Forma{
    
    private int ladoMayor;
    private int ladoMenor;

    public Rectangulo(String color,int x,int y,String nombre, int ladoMayor, int ladoMenor){
        super(color, x, y, nombre);
        this.ladoMayor=ladoMayor;
        this.ladoMenor=ladoMenor;
    }

    public void Imprimir(){
        super.imprimir();
        System.out.println("Lado Mayor: "+this.ladoMayor);
        System.out.println("Lado Menor: "+this.ladoMenor);
    }

    public int area(){
        return this.ladoMayor*this.ladoMenor;
    }

    public int CalcularPerimetro(){
        return ((2 *this.ladoMenor) + (2 *this.ladoMayor));
    }

    public void CambiarTamaño(int escala){
        this.ladoMayor=this.ladoMayor*escala;
        this.ladoMenor=this.ladoMenor*escala;
    }
}
