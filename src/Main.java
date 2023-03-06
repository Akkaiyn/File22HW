import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Song.extracted1();
        Song song = new Song();
        song.setAuthor(" Bul yrdyn avtory - Jenijok");
        System.err.println(song.getAuthor());

    }
}