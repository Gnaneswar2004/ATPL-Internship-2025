import java.io.*;

public class TryWithResources1 {
    public static void readFileSafely(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); 
            }
        }
        catch (IOException ioException) {
            System.out.println("Error reading the file: " + ioException.getMessage());
        }
    }

    public static void main(String[] args) {
        readFileSafely("Aaslin.txt");
    }
}