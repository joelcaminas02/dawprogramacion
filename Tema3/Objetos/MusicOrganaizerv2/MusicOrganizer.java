package Objetos.MusicOrganaizerv2;
import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * This version can play the files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // A player for the music files.
    private MusicPlayer player;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
        player = new MusicPlayer();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        String filename = files.get(index);
        player.startPlaying(filename);
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }

    public void listAllFiles(){
        for (String filename:files){
            System.out.println(filename);
        }
    }

    public void listMatching (String match){
        int contador = 0;
        for(String filename:getMatching(match)){
                System.out.println(filename);
                contador++;
            }

        if (contador==0){
            System.out.println("No habia ninguna cancion");
        }
    }
    public void playMatching (String match){
        int contador = 0;
        for(String filename:getMatching(match)){
                player.playSample(filename);
                contador++;
            }
        if (contador==0){
            System.out.println("No habia ninguna cancion");
        }
    }
    public ArrayList <String> getMatching (String match){
        int contador = 0;
        ArrayList <String> filesMatch = new ArrayList<>();
        for(String filename:files){
            if (filename.contains(match)){
                filesMatch.add(filename);
            }else{
                contador++;
            }
        }
        if (contador>files.size()-1){
            System.out.println("No habia ninguna cancion");
        }
        return filesMatch;
    }

    public void findFirst(String searchString){
        ArrayList <String> filesmatch = getMatching(searchString);
        if(filesmatch.size()>0){
            System.out.println(filesmatch.get(0));
        }else{
            System.out.println(-1);
        }
    }
    public int findFirst2(String searchString){
        int indice = 0;
        int resultado = -1;

        while (indice < files.size()){
            if(files.get(indice).contains(searchString)){
                resultado = indice;
                break;
            }else{
                indice++;
            }
        }
        return resultado;
    }

    public void listAllFilesMatching(String match){
        for (String filename:getMatching(match)){
            System.out.println(filename);
        }
    }
}