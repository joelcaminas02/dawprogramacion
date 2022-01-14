package Objetos;

public class alumnotest{
    public static void main(String[] args) {
        Alumno a1, a2 ,a3 ,a4;

        a1 = new Alumno("Pablo", 1);
        a2 = new Alumno("Maria", "1CFSJ", 2);
        a3 = new Alumno("Messi", 3);
        a4 = new Alumno("Jorge", 3);

        a1.preguntarDuda();
        a3.preguntarDuda();

        Alumno[] lista = {a1,a2,a3,a4};

        Alumno.imprimirInforme();
        Alumno.imprimirInformeAlumnos(lista);

    }
}