import java.io.*;
import java.util.*;

public class TryWithResources2 
{
    public static void scanFile(String fileName) 
    {
        try (Scanner s = new Scanner(new File(fileName))) 
        {
            while (s.hasNextLine()) 
            {
                System.out.println(s.nextLine());
            }
        } catch (FileNotFoundException e) 
        {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        scanFile("Aaslin.txt");
    }
}