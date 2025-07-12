import java.util.Arrays;
import java.util.Scanner;

public class Second_Largest_Element_in_Array {
    public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int len = s.nextInt();
		int array[] = new int[len];
		for (int i=0;i<len;i++)
		{
			array [i] = s.nextInt();
		}
		Arrays.sort(array);
		System.out.println(array[len-25]);
	}
}