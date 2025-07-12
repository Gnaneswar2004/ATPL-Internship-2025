import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Elemets of Stack :");

        for (int length=0; length<5; length++) {
            stack.push(scanner.nextInt());
        }

        System.out.println(stack);

        stack.pop();
        stack.pop();

        System.out.println(stack);
    }
}