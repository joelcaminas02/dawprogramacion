package Control03;

public class Ordenador {
    
    private String formato;
    private String color;
    private Teclado teclado;

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

    private void setFormato(String formato){
        this.formato = Ordenador.comprobarFormatoOrdenador(formato);}
    private void setColor(String color){
        this.color = color;}
    public void setTeclado(Teclado teclado){
        this.teclado =teclado;}

    public void conectar(Ordenador ordenador2){

    }
}
