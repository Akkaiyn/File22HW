import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Song {

    private String author;

    public Song(String author) {
        this.author = author;
    }

    public Song() {

    }


    public static void extracted1() {
        try{
            FileReader fileReader = new FileReader("Song.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()){
                System.out.println(scanner.next());
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


    public static void extracted() throws IOException {
        FileWriter fileWriter = new FileWriter("Song.txt");
        fileWriter.write(" *********** Akkan suu*******" +
                "Jer juzuno jaiylyp " +
                "Tolup chykkan akkan suu" +
                "Jeti kabat jer astyn " +
                "Jaryp chykkan akkan suu" +
                "Jer, Aalamdyn babrysyn" +
                "Bagyp chykkan akkan suu" +
                "Alty kabat jer astyn" +
                "Jaryp chykkan akkan suu");
        fileWriter.close();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
