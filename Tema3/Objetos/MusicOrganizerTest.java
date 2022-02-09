package Objetos;

public class MusicOrganizerTest {
    public static void main(String[] args) {
        MusicOrganizer mo1 = new MusicOrganizer();

        mo1.addFile("Versos Perversos");
        mo1.addFile("Camela");
        mo1.addFile("X100 PRE A TU LADO ESTARE");

        mo1.checkIndex(4);
        mo1.checkIndex(3);
        mo1.checkIndex(2);
        mo1.removeFile(3);
        mo1.removeFile(2);
    }
}
