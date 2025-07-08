import java.util.*;

public class LinkedListExample 
{
    public static void main(String[] args) 
    {
        LinkedList <Integer> list = new LinkedList<>();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Elements of LinkedList :");

        for(int i=0; i<5; i++)
        {
            list.add(s.nextInt());
        }

        System.out.println(list);
        list.addFirst(5);
        list.addLast(60);
        list.remove(2);
        System.out.println(list);
    }
}