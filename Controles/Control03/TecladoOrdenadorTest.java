package Control03;

public class TecladoOrdenadorTest{
    public static void main(String[] args) {
        Teclado teclado = new Teclado();
        Teclado teclado2 = new Teclado(254,"US","blanco","compacto","inalambrico");
        Teclado teclado3 = new Teclado(254,"US","blanco","compacto","nambc");
        Teclado teclado4 = new Teclado(254,"ARG","blanco","compacto","nambc");

        Ordenador ordenador1 = new Ordenador();
        Ordenador ordenador2 = new Ordenador("sobremesa", "amarillo", teclado2);

        
    }
}