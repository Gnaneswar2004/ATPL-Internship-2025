import java.io.*;
import java.util.*;
import java.sql.SQLException;

public class ClassifyExceptions
{
    public static void readFile(String filename) throws IOException 
    {
        BufferedReader reader1 = new BufferedReader(new FileReader(filename));
        System.out.println(reader1.readLine());
    }

    public static void readFiles(String filename) throws FileNotFoundException 
    {
        File reader2 = new File(filename);
        Scanner s = new Scanner(reader2);
        while (s.hasNextLine())
        {
            String line = s.nextLine();
            System.out.println(line);
        }
    }

    public static void connectToDatabase() throws SQLException 
    {
        throw new SQLException("Database connection failed!");
    }

    public static void triggerNullPointer() 
    {
        String text = null;
        System.out.println(text.length());
    }

    public static void divideByZero() 
    {
        int x = 10 / 0; 
    }

    public static void main(String[] args) 
    {
        try
        {
            readFile("Aaslins.txt");
        } 
        catch (IOException e) 
        {
            System.out.println("IOException: " + e.getMessage());
        }

        try
        {
            readFiles("aaslins.txt");
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("FileNotFoundException: " + e.getMessage());
        }

        try 
        {
            connectToDatabase(); 
        } 
        catch (SQLException e) 
        {
            System.out.println("SQLException: " + e.getMessage());
        }

        try 
        {
            triggerNullPointer();
        } catch (NullPointerException e) 
        {
            System.out.println("NullPointerException: " + e.getMessage());
        }

        try 
        {
            divideByZero();
        } catch (ArithmeticException e) 
        {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}