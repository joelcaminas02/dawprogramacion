import java.io.File;
import java.io.IOException;
import java.util.Scanner;



public class Ejercicio1{

    private static void imprimirFichero(File e) throws IOException{
        if(!e.isHidden()){
            if(e.isFile()){
                System.out.println(e.getName()+" "+ e.length());
            }
            if(e.isDirectory()){
                System.out.println(e.getName()+"<Directorio>");
            }
        }
    }

    private static void imprimirDirectorio(File e) throws IOException{
        int i = 0;
        if(e.exists()){
            if(e.isDirectory()){
                System.out.println("Lista de ficheros y directorios del directorio: "+ e.getCanonicalPath());
            
                System.out.println("--------------------------------------------------------------------------------------------------");

                System.out.println(i+". Directorio Padre");
                i++;
                for (File f:e.listFiles()){
                    System.out.print(i+". ");
                    imprimirFichero(f);
                    i++;
                }
            }else{
                System.out.println("No es un directorio");
            }
        }else{
            System.out.println("No existe el directorio");
        }
    }

    public static void main(String[] args) throws IOException {
        
        int i = 0;
        File f = File.listRoots()[0];
        Scanner lector = new Scanner(System.in);

        do{
            imprimirDirectorio(f);
            System.out.println("Introduce el directorio al que quieres entrar o -1 para salir");
            i=lector.nextInt();
            if(i>= 1 && i <= f.listFiles().length){
                f = f.listFiles()[i-1];
            }else if(f.getParent()!=null && i == 0){
                f = f.getParentFile();
            }
        }while(i !=-1);
        

        lector.close();
    }
}