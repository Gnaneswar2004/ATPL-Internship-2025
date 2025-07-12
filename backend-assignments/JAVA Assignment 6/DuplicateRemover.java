import java.util.*;

public class DuplicateRemover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();

        System.out.println("Enter the list of Integers : ");
        for (int length=0; length<10; length++) {
            list.add(scanner.nextInt());
        }
        Set<Integer> set = new HashSet<>(list);
        System.out.print("The list after removed all the duplicates is :" + set);
    }
}