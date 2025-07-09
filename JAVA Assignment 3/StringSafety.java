import java.util.Scanner;

public class StringSafety {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        String encrypted = encryptPassword(password);
        
        System.out.println("Original Password: " + password);
        System.out.println("Encrypted Password: " + encrypted);
    }

    public static String encryptPassword(String passwordString)
    {
        return new StringBuilder(passwordString).reverse().toString();
    }
}