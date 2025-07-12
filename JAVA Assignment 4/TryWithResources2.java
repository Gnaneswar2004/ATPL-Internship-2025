import java.io.*;
import java.util.*;

public class TryWithResources2 {
    public static void scanFile(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } 
        catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found: " + fileNotFoundException.getMessage());
        }
    }

    public static void main(String[] args) {
        scanFile("Aaslin.txt");
    }
}