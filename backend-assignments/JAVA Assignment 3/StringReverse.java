import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String input = scanner.nextLine();
        String reversed1 = "";
        for (int length = input.length() - 1; length >= 0; length--) {
            reversed1 += input.charAt(length);
        }
        System.out.println("Reversed using loop : " + reversed1);
        StringBuilder stringBuilder1 = new StringBuilder(input);
        String reversed2 = stringBuilder1.reverse().toString();
        System.out.println("Reversed using StringBuilder : " + reversed2);
        StringBuffer stringBuilder2 = new StringBuffer(input);
        String reversed3 = stringBuilder2.reverse().toString();
        System.out.println("Reversed using StringBuffer : " + reversed3);
    }
}