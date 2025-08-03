import java.util.*;

public class ReverseOrder {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana", "Apple", "Mango", "Cherry");

        fruits.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("Alphabetical Order: " + fruits);

        fruits.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Reverse Order: " + fruits);
    }
}