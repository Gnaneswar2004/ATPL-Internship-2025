import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String input = scanner.nextLine();
        System.out.println("Given String is : " + "'" + input + "'");
        String trimmed = input.trim();
        System.out.println("After trim() : " + "'" + trimmed + "'");
        System.out.println("using toLowerCase() : " + trimmed.toLowerCase());
        System.out.println("using toUpperCase() : " + trimmed.toUpperCase());
        String noSpaces = trimmed.replace(" ","");
        System.out.println("After replacing spaces: " + noSpaces);
        
        if (trimmed.length() >= 11) {
            System.out.println("Substring (5 to 10): " + trimmed.substring(5, 11));
        }
        int index = trimmed.indexOf('a');
        System.out.println("First index of 'a' : " + index);
    }
}