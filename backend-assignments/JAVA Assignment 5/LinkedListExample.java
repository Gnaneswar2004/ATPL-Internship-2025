import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList <Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Elements of LinkedList :");

        for(int length=0; length<5; length++) {
            linkedList.add(scanner.nextInt());
        }

        System.out.println(linkedList);
        linkedList.addFirst(5);
        linkedList.addLast(60);
        linkedList.remove(2);
        System.out.println(linkedList);
    }
}