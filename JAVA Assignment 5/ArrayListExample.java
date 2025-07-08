import java.util.*;

public class ArrayListExample 
{
    public static void main(String[] args) 
    {
        ArrayList<String> arr = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Elements of ArrayList :");

        for (int i=0; i<5; i++)
        {
            arr.add(s.nextLine());
        }

        System.out.println("The Elements in ArrayList are :(Using For Loop)");
        for (int j=0; j<5; j++)
        {
            System.out.print(arr.get(j) + " ");
        }
        System.out.println();
        System.out.println("The Elements in ArrayList are :(Using Enhanced For Loop)");
        for (String element : arr)
        {
            System.out.print(element + " ");
        }
        System.out.println();
        arr.remove(2);
        System.out.print("The ArrayList after removing 3rd element" + arr);
    }
}