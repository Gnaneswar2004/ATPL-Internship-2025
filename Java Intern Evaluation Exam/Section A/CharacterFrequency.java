import java.util.*;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int len = str.length();
        char[] characters = str.toCharArray();
        Count_Frequency(characters,len);
    }
    public static void Count_Frequency(char arr[], int n)
    {
        boolean visited[] = new boolean [n];
        for (int i=0; i<n; i++)
        {
            if (visited[i])
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
            System.out.println(arr[i] + " : " + count);
        }
    }
}
