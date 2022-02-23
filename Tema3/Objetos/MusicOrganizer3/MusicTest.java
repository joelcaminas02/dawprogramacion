package Objetos.MusicOrganizer3;

public class MusicTest {
    public static void main(String[] args) {
        MusicOrganizer mo1 = new MusicOrganizer();
        mo1.addFile("X100 PRE A TU LADO ESTARE");
        mo1.addFile("La dificil");
        mo1.addFile("Farmacia de guardia");
        mo1.addFile("NANA");

        mo1.playTrack(1);
        mo1.playTrack(2);
        mo1.playTrack(2);
    }   
}
