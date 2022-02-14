package Objetos.MusicOrganizer3;
/**
 * Store the details of a music track,
 * such as the artist, title, and file name.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class Track
{
    // The artist.
    private String artist;
    // The track's title.
    private String title;
    // Where the track is stored.
    private String filename;
    //The name of album.
    private String album;
    //Count the number is played a song.
    private int playCount;
    /**
     * Constructor for objects of class Track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    public Track(String artist, String title,String album, String filename)
    {
        setDetails(artist, title,album,filename);
    }
    
    /**
     * Constructor for objects of class Track.
     * It is assumed that the file name cannot be
     * decoded to extract artist and title details.
     * @param filename The track file. 
     */
    public Track(String filename)
    {
        setDetails("unknown", "unknown","unkown", filename);
    }
    
    /**
     * Return the artist.
     * @return The artist.
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * Return the title.
     * @return The title.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Return the album.
     * @return The album.
     */
    public String getAlbum()
    {
        return album;
    }
    /**
     * Return the file name.
     * @return The file name.
     */
    public String getFilename()
    {
        return filename;
    }
    
    /**
     * Set details of the track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    private void setDetails(String artist, String title,String album, String filename)
    {
        this.artist = artist;
        this.title = title;
        this.album = album;
        this.filename = filename;
        
    }

    public String toString(){
        return artist + ": " + title + ": "+album+": "+"  (file: " + filename + ")";
    }
    
    public int reiniciarPlayCount (){
        return playCount = 0;
    }
    public int incrementarPlayCount(){
        return playCount++;
    }
}