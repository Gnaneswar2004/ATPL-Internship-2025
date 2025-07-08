import java.io.*;
import java.util.*;

public class CheckedExceptions 
{
    public static void loadFile(String filename)
    {
        FileInputStream file = null;
        try 
        {
            file = new FileInputStream(filename);
            System.out.println("File loaded successfully: " + filename);
            file.close();
        }
        catch (FileNotFoundException e) 
        {
            System.err.println("Error: File not found: " + filename);
            e.printStackTrace(); 
        } 
        catch (IOException e) 
        {
            System.err.println("Error reading file: " + filename);
            e.printStackTrace(); 
        } 
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the File Name : ");
        String name = s.nextLine();

        loadFile(name);
    }
}
