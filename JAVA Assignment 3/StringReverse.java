import java.util.Scanner;

public class StringReverse
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String input = s.nextLine();
        String reversed1 = "";
        for (int i = input.length() - 1; i >= 0; i--)
        {
            reversed1 += input.charAt(i);
        }
        System.out.println("Reversed using loop : " + reversed1);
        StringBuilder sb1 = new StringBuilder(input);
        String reversed2 = sb1.reverse().toString();
        System.out.println("Reversed using StringBuilder : " + reversed2);
        StringBuffer sb2 = new StringBuffer(input);
        String reversed3 = sb2.reverse().toString();
        System.out.println("Reversed using StringBuffer : " + reversed3);
    }
}