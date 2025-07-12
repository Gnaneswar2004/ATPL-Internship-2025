import java.util.Scanner;

public class Count_Even_and_Odd_Numbers_in_Array {
    public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int len = s.nextInt();
		int array[] = new int[len];
		for (int i=0;i<len;i++)
		{
			array[i] = s.nextInt();
		}
		int even_count = 0,odd_count = 0;
		for (int i=0;i<len;i++)
		{
			if (array[i]%2 == 0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
		}
		System.out.println("The Even Count is: " + even_count);
		System.out.println("The Odd Count is: " + odd_count);
	}
}