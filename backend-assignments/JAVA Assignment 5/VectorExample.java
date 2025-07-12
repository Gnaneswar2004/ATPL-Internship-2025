import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        Vector <Double> vector = new Vector<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Elements of Vetor :");

        for(int length=0; length<4; length++) {
            vector.add(scanner.nextDouble());
        }
        System.out.println(vector);

        Enumeration<Double> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement());    
        }
    }
}