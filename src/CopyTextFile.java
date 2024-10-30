import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyTextFile {
    public List<Character> readFile(String sourceFilePath) {
        List<Character> characters = new ArrayList<>();
        try {
            File sourceFile = new File(sourceFilePath);
            if (!sourceFile.exists()) {
                throw new FileNotFoundException();
            }

            FileReader fileReader = new FileReader(sourceFile);
            int charValue;
            while ((charValue = fileReader.read()) != -1) {
                characters.add((char) charValue);
            }

            fileReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        } catch (IOException e) {
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        }
        return characters;
    }

    public int copyFile(String targetFilePath, List<Character> characters) {
        int characterCount = 0;
        try {
            File targetFile = new File(targetFilePath);
            if (targetFile.exists()) {
                System.out.println("File already exists!");
            }

            FileWriter writer = new FileWriter(targetFile, true);
            for (char c : characters) {
                writer.write(c);
                if (c != ' ') characterCount++;
            }
            writer.close();
        } catch (IOException e) {
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        }
        return characterCount;
    }
}
