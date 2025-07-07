import java.util.Scanner;

public class StringComparisons 
{
    public static void main(String[] args) 
    {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter first string: ");
    String s1 = s.nextLine();

    System.out.print("Enter second string: ");
    String s2 = s.nextLine();
    
    System.out.println();
    System.out.println("equals(): " + s1.equals(s2));
    System.out.println("equalsIgnoreCase(): " + s1.equalsIgnoreCase(s2));
    System.out.println("compareTo(): " + s1.compareTo(s2));
    }
}