import java.util.Scanner;

public class Insert_Element_in_Array {
    public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int len = s.nextInt();
		int array[] = new int[len];
		for (int i=0;i<len;i++)
		{
			array [i] = s.nextInt();
		}
		int num = s.nextInt();
		int index = s.nextInt();
		int arr [] = new int[len+1];
		for (int i=0;i<len+1;i++)
		{
			if (i<index)
			{
				arr [i] = array [i];
			}
			else if (i==index)
			{
				arr [i] = num;
			}
			else
			{
				arr [i] = array [i-1];
			}
			System.out.print(arr[i]+" ");
		}
	}
}