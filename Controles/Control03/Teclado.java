package Control03;

public class Teclado {
    private int teclas;
    private String idioma;
    private String color;
    private String formato;
    private String conectividad;

    private static int numTeclado = 0;

    private static String comprobarIdioma(String idioma){
        if(idioma.length() != 2){
            return idioma = "ES";
        }else{
            return idioma;
        }
    }

    private static String comprobarFormato (String formato){
        if(formato == "compacto" || formato == "extendido"){
            return formato;
        }else{
            return formato = "extendido";
        }
    }

    private static String comprobarConectividad(String conectividad){
        if (conectividad == "inalambrico" || conectividad == "cable"){
            return conectividad;
        }else{
            return conectividad = "cable";
        } 
    }


    public Teclado (){
        this.teclas=254;
        this.idioma= "ES";
        this.color= "verde";
        this.formato= "compacto";
        this.conectividad= "cable";
        numTeclado++;
    }

    public Teclado (int tecla, String idioma, String color, String formato, String conectividad){
        this.teclas = tecla;
        this.idioma = Teclado.comprobarIdioma(idioma);
        this.color = color;
        this.formato = Teclado.comprobarFormato(formato);
        this.conectividad = Teclado.comprobarConectividad(conectividad);
        numTeclado++;
    }

    public int getTeclas(){
        return this.teclas;}
    public String getIdioma(){
        return this.idioma;}
    public String getColor(){
        return this.color;}
    public String getFormato(){
        return this.formato;}
    public String getConectividad(){
        return this.conectividad;}

    private void setTeclas(int teclas){
        this.teclas = teclas;}
    private void setIdioma(String idioma){
        this.idioma = Teclado.comprobarIdioma(idioma);}
    private void setColor(String color){
        this.color = color;}
    private void setFormato(String formato){
        this.formato= Teclado.comprobarFormato(formato);}
    private void setConectividad(String conectividad){
        this.conectividad = Teclado.comprobarConectividad(conectividad);}

    public void mostrarTeclados(){
        System.out.println(numTeclado);
    }
}  