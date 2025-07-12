import java.util.Scanner;

public class StringComparisons {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first string: ");
    String string1 = scanner.nextLine();

    System.out.print("Enter second string: ");
    String string2 = scanner.nextLine();
    
    System.out.println();
    System.out.println("equals(): " + string1.equals(string2));
    System.out.println("equalsIgnoreCase(): " + string1.equalsIgnoreCase(string2));
    System.out.println("compareTo(): " + string1.compareTo(string2));
    }
}