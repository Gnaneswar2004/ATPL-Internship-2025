import java.util.Scanner;

public class Frequency_of_Elements_in_Array {
    public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int len = s.nextInt();
		int array[] = new int[len];
		for (int k=0; k < len; k++)
		{
			array[k] = s.nextInt();
		}
		Count_Frequency(array,len);
	}
    public static void Count_Frequency(int arr[], int n)
	{
		boolean visited[] = new boolean [n];
		for (int i=0; i<n; i++) 
		{
        		if (visited[i] == true)
            		continue;
			int count = 1;
        		for (int j=i+1; j<n; j++) 
			{
           			if (arr[i] == arr[j]) 
				{
                		visited[j] = true;
                		count++;
            			}
        		}
        	System.out.println(arr[i] + " " + count);
		}
	}
}
