import java.io.*;

public class CopyTextFile {
        public int copyFile(String sourceFilePath, String targetFilePath) {
        int characterCount = 0;
        try {
            File sourceFile = new File(sourceFilePath);
            if (!sourceFile.exists()) {
                throw new FileNotFoundException();
            }
            File targetFile = new File(targetFilePath);
            if (targetFile.exists()) {
                System.out.println("File '" + targetFile.getName() + "' already exists!");
            }

            FileReader fileReader = new FileReader(sourceFile);
            FileWriter writer = new FileWriter(targetFile);

            int charValue;
            while ((charValue = fileReader.read()) != -1) {
                writer.write((char) charValue);
                if ((char) charValue != ' ' && (char) charValue != '\r' && (char) charValue != '\n') {
                    characterCount++;
                }
            }

            fileReader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        } catch (IOException e) {
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        }
        return characterCount;
    }
}
