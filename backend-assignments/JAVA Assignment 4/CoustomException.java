import java.util.Scanner;

public class CoustomException extends Exception {
    public CoustomException(String message) {
        super(message);
    }

    public static void login(String username, String password) throws CoustomException {
        String Username = "gnani";
        String Password = "password";

        if (!username.equals(Username) || !password.equals(Password)) {
            throw new CoustomException("Invalid login details.");
        }

        System.out.println("Login successful!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username :");
        String username = scanner.nextLine();
        System.out.print("Enter password :");
        String password = scanner.nextLine();

        try {
            login(username, password);
        } 
        catch (CoustomException exception) {
            System.out.println(exception.getMessage());
        }
    }
}