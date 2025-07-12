import java.io.*;
import java.util.*;

public class CheckedExceptions {
    public static void loadFile(String fileName) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(fileName);
            System.out.println("File loaded successfully: " + fileName);
            fileInputStream.close();
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error: File not found: " + fileName);
            fileNotFoundException.printStackTrace(); 
        } 
        catch (IOException ioException) {
            System.err.println("Error reading file: " + fileName);
            ioException.printStackTrace(); 
        } 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the File Name : ");
        String fileName = scanner.nextLine();

        loadFile(fileName);
    }
}