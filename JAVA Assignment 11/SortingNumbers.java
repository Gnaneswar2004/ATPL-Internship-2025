import java.util.*;

public class SortingNumbers {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(5,2,8,1,9);

        Collections.sort (numbers, new Comparator<Integer>() {
            public int compare (Integer i1, Integer i2) {
                return i2 - i1;
            }
        });
        System.out.println("Sorted a list of integers in descending order (using an anonymous Comparator).");
        System.out.println("The List in Descending order : " + numbers);
    }
}