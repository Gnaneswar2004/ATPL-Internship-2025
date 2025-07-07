import java.util.*;
import java.io.*;

public class ThrowingException2 
{
    public static void readFile (String filename) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;

        while ((line = reader.readLine()) != null) 
        {
            System.out.println(line);
        }
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the file name : ");
        String name = s.nextLine();
        try 
        {
            readFile(name);
        }
        catch (IOException e) 
        {
            System.out.println("IOException." + e.getMessage());
        }
    }
}