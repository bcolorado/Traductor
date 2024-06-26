import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {

    public static void clearFileContent(String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            // Opening the file in write mode without appending clears the file
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void writeToFile(String content, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
