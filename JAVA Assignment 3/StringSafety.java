import java.util.Scanner;

public class StringSafety
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = s.nextLine();

        String encrypted = encryptPassword(password);
        
        System.out.println("Original Password: " + password);
        System.out.println("Encrypted Password: " + encrypted);
    }

    public static String encryptPassword(String pass)
    {
        return new StringBuilder(pass).reverse().toString();
    }
}