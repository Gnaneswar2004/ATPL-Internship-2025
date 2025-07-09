import java.util.*;

public class ThrowingException1 {
    static void checkPositive (int number) throws IllegalArgumentException {
        if (number < 0)
        {
            throw new IllegalArgumentException("Age must be a Positive Integer.");
        }
        else 
        {
            System.out.println("Your are eligible for Aadhaar Services.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();
        checkPositive(age);
    }
}