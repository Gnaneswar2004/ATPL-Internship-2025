import java.util.*;

public class StackExample
{
    public static void main(String[] args) 
    {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Elemets of Stack :");

        for (int i=0; i<5; i++)
        {
            stack.push(s.nextInt());
        }

        System.out.println(stack);

        stack.pop();
        stack.pop();

        System.out.println(stack);
    }
}