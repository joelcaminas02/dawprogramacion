package Control03;

public class Teclado {
    private int numTeclas;
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
        if(formato.equalsIgnoreCase("compacto")|| formato.equalsIgnoreCase("extendido")){
            return formato;
        }else{
            return formato = "extendido";
        }
    }

    private static String comprobarConectividad(String conectividad){
        if (conectividad.equalsIgnoreCase("inalambrico")|| conectividad.equalsIgnoreCase("cable")){
            return conectividad;
        }else{
            return conectividad = "cable";
        } 
    }

    public Teclado (){
        this.numTeclas=254;
        this.idioma= "ES";
        this.color= "verde";
        this.formato= "compacto";
        this.conectividad= "cable";
        numTeclado++;
    }

    public Teclado (int tecla, String idioma, String color, String formato, String conectividad){
        this.numTeclas = tecla;
        this.idioma = Teclado.comprobarIdioma(idioma);
        this.color = color;
        this.formato = Teclado.comprobarFormato(formato);
        this.conectividad = Teclado.comprobarConectividad(conectividad);
        numTeclado++;
    }

    public int getTeclas(){
        return this.numTeclas;}
    public String getIdioma(){
        return this.idioma;}
    public String getColor(){
        return this.color;}
    public String getFormato(){
        return this.formato;}
    public String getConectividad(){
        return this.conectividad;}

    public static void mostrarTeclados(){
        System.out.println(numTeclado);
    }

    /**Devuelve tu objeto en forma de String para poder mostrarlo como texto plano como tu desees representarlo */
    public String toString(){
        return "Teclado: "+color + " - " + numTeclas + " - " + formato;
    }
}  