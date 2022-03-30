import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
    private static void imprimirFichero(File e) throws IOException{
        if(!e.isHidden()){
            if(e.isFile()){
                if(e.canRead()==true && e.canWrite()==true && e.canExecute()==true )
                System.out.println("-rwx.\t"+e.length()+".\t"+e.lastModified()+".\t"+e.getName()+".\t"+ e.length());
                }else if(e.canRead()==false && e.canWrite()==true && e.canExecute()==true ){
                    System.out.println("--wx.\t"+e.length()+".\t"+e.lastModified()+".\t"+e.getName());
                }else if(e.canRead()==false && e.canWrite()==false && e.canExecute()==true){
                    System.out.println("---x.\t"+e.length()+".\t"+e.lastModified()+".\t"+e.getName());
                }else if(e.canRead()==false && e.canWrite()==false && e.canExecute()==false){
                    System.out.println("----.\t"+e.length()+".\t"+e.lastModified()+".\t"+e.getName());
                }else if(e.canRead()==true && e.canWrite()==false && e.canExecute()==false){
                    System.out.println("-r--.\t"+e.length()+".\t"+e.lastModified()+".\t"+e.getName());
                }else if(e.canRead()==true && e.canWrite()==true && e.canExecute()==false){
                    System.out.println("-rw-.\t"+e.length()+".\t"+e.lastModified()+".\t"+e.getName());
                }else if(e.canRead()==true && e.canWrite()==false && e.canExecute()==true){
                    System.out.println("-r-x.\t"+e.length()+".\t"+e.lastModified()+".\t"+e.getName());
                }else if(e.canRead()==false && e.canWrite()==true && e.canExecute()==false){
                    System.out.println("-w-.\t"+e.length()+".\t"+e.lastModified()+".\t"+e.getName());
                }    
            if(e.isDirectory()){
                if(e.canRead()==true && e.canWrite()==true && e.canExecute()==true )
                System.out.println("drwx.\t"+e.length()+".\t"+e.lastModified()+".\t"+e.getName()+"<Directorio>");
                }else if(e.canRead()==false && e.canWrite()==true && e.canExecute()==true ){
                    System.out.println("d-wx.\t"+e.length()+".\t"+e.lastModified()+".\t"+e.getName()+"<Directorio>");
                }else if(e.canRead()==false && e.canWrite()==false && e.canExecute()==true){
                    System.out.println("d--x.\t"+e.length()+".\t"+e.lastModified()+".\t"+e.getName()+"<Directorio>");
                }else if(e.canRead()==false && e.canWrite()==false && e.canExecute()==false){
                    System.out.println("d---.\t"+e.length()+".\t"+e.lastModified()+".\t"+e.getName()+"<Directorio>");
                }else if(e.canRead()==true && e.canWrite()==false && e.canExecute()==false){
                    System.out.println("dr--.\t"+e.length()+".\t"+e.lastModified()+".\t"+e.getName()+"<Directorio>");
                }else if(e.canRead()==true && e.canWrite()==true && e.canExecute()==false){
                    System.out.println("drw-.\t"+e.length()+".\t"+e.lastModified()+".\t"+e.getName()+"<Directorio>");
                }else if(e.canRead()==true && e.canWrite()==false && e.canExecute()==true){
                    System.out.println("dr-x.\t"+e.length()+".\t"+e.lastModified()+".\t"+e.getName()+"<Directorio>");
                }else if(e.canRead()==false && e.canWrite()==true && e.canExecute()==false){
                    System.out.println("d-w-.\t"+e.length()+".\t"+e.lastModified()+".\t"+e.getName()+"<Directorio>");
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
    private static String[] arrayFile(File e){
        String [] arrayFiles = new String[e.list().length];
        int i =0;
        for (String f:e.list()){
            arrayFiles[i]=f;
            i++;
        }
        return arrayFiles;
    }
    public static void main(String[] args) throws IOException{
        
        int i = 0;
        File f = File.listRoots()[0];
        String [] array = arrayFile(f);
        imprimirDirectorio(f);
        System.out.println("Introduce una opción (-1 para salir)");
        Scanner lector = new Scanner(System.in);
        i = lector.nextInt();
        if(i==-1){

        }else{
            File x = new File("/"+array[i-1]);
            imprimirDirectorio(x);
        }

        lector.close();
    }
}
