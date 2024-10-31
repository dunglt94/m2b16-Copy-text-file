public class Main {
    public static void main(String[] args) {
        CopyTextFile textFile = new CopyTextFile();
        int characterCount = textFile.copyFile("files/source.txt", "files/target.txt");
        System.out.println("Copied: " + characterCount + " characters");
    }
}
