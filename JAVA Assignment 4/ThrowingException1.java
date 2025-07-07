import java.util.*;

public class ThrowingException1 
{
    static void checkPositive (int num) throws IllegalArgumentException
    {
        if (num < 0)
        {
            throw new IllegalArgumentException("Age must be a Positive Integer.");
        }
        else 
        {
            System.out.println("Your are eligible for Aadhar Services.");
        }
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = s.nextInt();
        checkPositive(age);
    }
}