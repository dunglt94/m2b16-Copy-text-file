import java.util.List;

public class Main {
    public static void main(String[] args) {
        CopyTextFile textFile = new CopyTextFile();
        List<Character> characters = textFile.readFile("files/source.txt");
        int characterCount = textFile.copyFile("files/target.txt", characters);
        System.out.println("Copied: " + characterCount + " characters");
    }
}
