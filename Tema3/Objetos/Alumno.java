package Objetos;
/*crear clase alumno, cuyos objetos tendran como caracterisiticas un id, un nombre, y un grupo . Se pueden crear 
alumnos solo con el nombre y el identificador o tambn con todo. Tiene que tener un metodo propio de los objetos
que se llama preguntar duda que simplemente tiene que imprimir el "nombre del alumno "levanta la mano". Nuestra 
clase tiene que llevar un contador del total de alumnos creados. tambn hay un metodo de clase llamado imprimir informe
que muestra el total de alumnos. Otro metodo de clase que se llama "imprimir informe alumnos" al que se le pasa como parametro
un array de alumnos eh imprime el nombre y grupo de cada alumno.*/
public class Alumno {
    //Atributos de clase
    
    private static int numAlumnos = 0;
    
    //Atributos de objetos
    
    private int idAlumno;
    private String nombre;
    private String grupo;

    public static void imprimirInforme() {
        System.out.println(numAlumnos);
    };
    public Alumno (String a, int id) {
        nombre = a;
        idAlumno = id;
        numAlumnos++;
    }
    public Alumno (String n, String g, int id) {
        nombre = n;
        grupo = g;
        idAlumno = id;
        numAlumnos++;
    }
    public void preguntarDuda () {
        System.out.println(nombre + " levanta la mano");
    };

    public void informe (String [] alumno){
        System.out.println(nombre);
        System.out.println(grupo);
    }

    public static void imprimirInformeAlumnos ( Alumno[] alumnos){
        for (Alumno alumno : alumnos){
            System.out.println(alumno.nombre + "\t" + alumno.grupo );
        }
    }

    public int getIdAlumno(){return idAlumno;}
}
