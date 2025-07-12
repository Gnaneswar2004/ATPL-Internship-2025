import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Elements of ArrayList :");

        for (int length=0; length<5; length++) {
            arraylist.add(scanner.nextLine());
        }

        System.out.println("The Elements in ArrayList are :(Using For Loop)");

        for (int length=0; length<5; length++) {
            System.out.print(arraylist.get(length) + " ");
        }

        System.out.println();
        System.out.println("The Elements in ArrayList are :(Using Enhanced For Loop)");
        
        for (String element : arraylist) {
            System.out.print(element + " ");
        }

        System.out.println();
        arraylist.remove(2);
        System.out.print("The ArrayList after removing 3rd element" + arraylist);
    }
}