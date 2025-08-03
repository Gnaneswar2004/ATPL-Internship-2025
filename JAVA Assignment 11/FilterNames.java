import java.util.*;

public class FilterNames {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Andrew", "Tom", "Angela", "Steve");

        System.out.println("Names starting with 'A' : ");
        names.forEach(name -> {if (name.startsWith("A")) System.out.print(name + "\t");});
    }
}