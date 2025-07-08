public class LoginFailedException extends Exception
{
    public LoginFailedException(String message) 
    {
        super(message);
    }

    public static void main(String[] args) 
    {
        try 
        {
            throw new LoginFailedException("Invalid login details");
        } 
        catch (LoginFailedException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}