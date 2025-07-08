import java.util.Scanner;

public class CoustomException extends Exception 
{
    public CoustomException(String message) 
    {
        super(message);
    }

    public static void login(String username, String password) throws CoustomException 
    {
        String Username = "gnani";
        String Password = "password";

        if (!username.equals(Username) || !password.equals(Password)) 
        {
            throw new CoustomException("Invalid login details.");
        }

        System.out.println("Login successful!");
    }

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter username :");
        String username = s.nextLine();
        System.out.print("Enter password :");
        String password = s.nextLine();

        try 
        {
            login(username, password);
        } 
        catch (CoustomException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}