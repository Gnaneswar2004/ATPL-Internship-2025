import java.util.*;

public class UniqueWords {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Sentence : ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        
        for (String word : words) {
            hashSet.add(word);
        }

        System.out.println(hashSet);
    }
}