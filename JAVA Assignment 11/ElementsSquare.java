import java.util.*;

public class ElementsSquare {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        numbers.forEach(n -> System.out.print(n*n + " "));
    }
}