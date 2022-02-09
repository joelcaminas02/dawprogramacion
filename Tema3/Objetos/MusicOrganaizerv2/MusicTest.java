package Objetos.MusicOrganaizerv2;

public class MusicTest {
    public static void main(String[] args) {
        MusicOrganizer mo1 = new MusicOrganizer();
        MusicPlayer mp1 = new MusicPlayer();

        mo1.addFile("Versos Perversos");
        mo1.addFile("Illo");
        mo1.addFile("X100 PRE A TU LADO ESTARE");
        mo1.addFile("La dificil");
        mo1.addFile("rehab boys 2020");

        mo1.listAllFiles();
        mo1.getMatching("Illo");
        mo1.getMatching("X100 PRE A TU LADO ESTARE");
        mo1.listMatching("PRE");
        mo1.playMatching("La dificil");
        mo1.playMatching("PRE");
        mo1.findFirst("searchString");
    }
}
