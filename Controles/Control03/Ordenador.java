package Control03;

public class Ordenador {
    
    private String formato;
    private String color;
    private Teclado teclado;
    private Ordenador pcConectado = null;

    private static String comprobarFormatoOrdenador(String formato){
        if (formato.equalsIgnoreCase("sobremesa")|| formato.equalsIgnoreCase("portatil")){
            return formato;
        }else{
            return formato = "sobremesa";
        }
    }

    public Ordenador(){
        this.formato = "sobremesa";
        this.color = "verde";
        teclado = new Teclado();
    }
    public Ordenador(String formato, String color, Teclado teclado){
        this.formato= Ordenador.comprobarFormatoOrdenador(formato);
        this.color = color;
        this.teclado = teclado;
    }

    public String getFormato(){ 
        return this.formato;}
    public String getColor(){
        return this.color;}
    public Teclado getTeclado(){ 
        return this.teclado;}

    public void setTeclado(Teclado teclado){
        this.teclado =teclado;}

    public void conectar(Ordenador pcConectado){
            this.pcConectado = pcConectado;
    }

    public void mostrarSiEstaConectado(){
        if (this.pcConectado == null){
            System.out.println("No esta conectado a ningun ordenador");
        }else{
            System.out.println("Ordenador conectado: "+ this.pcConectado
            );
        }
    }

    public String toString(){
        return "Ordenador: "+color +" - " + formato + " - "+ teclado;
    }
}
