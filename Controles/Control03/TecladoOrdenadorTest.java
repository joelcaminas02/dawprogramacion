package Control03;

public class TecladoOrdenadorTest{
    public static void main(String[] args) {
        Teclado teclado = new Teclado();
        Teclado teclado2 = new Teclado(254,"US","blanco","compacto","inalambrico");
        Teclado teclado3 = new Teclado(254,"US","blanco","compacto","nambc");
        Teclado teclado4 = new Teclado(254,"ARG","blanco","compacto","nambc");

        Ordenador ordenador1 = new Ordenador();
        Ordenador ordenador2 = new Ordenador("sobremesa", "amarillo", teclado2);
        Teclado.mostrarTeclados();
        System.out.println(teclado);
        System.out.println(teclado3);
        System.out.println(teclado4);
        System.out.println(ordenador1);
        System.out.println(ordenador2);
    }
}