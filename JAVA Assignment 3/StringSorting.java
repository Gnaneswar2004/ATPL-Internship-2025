import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class StringSorting
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String[] names = new String[5];

        System.out.println("Enter 5 names :");
        for (int i = 0; i < 5; i++)
        {
            names[i] = s.nextLine();
        }

        Arrays.sort(names);
        System.out.println("\nSorted in Ascending Order :");
        for (String name : names)
        {
            System.out.println(name);
        }
        
        Arrays.sort(names, Collections.reverseOrder());
        System.out.println("\nSorted in Descending Order :");
        for (String name : names)
        {
            System.out.println(name);
        }
    }
}