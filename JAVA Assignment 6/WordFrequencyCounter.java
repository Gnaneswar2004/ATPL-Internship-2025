import java.io.*;
import java.util.*;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        String text = "This is a sample text. It is a simple example.";
        Map<String, Integer> wordFrequency = new HashMap<>();

        String[] words = text.split(" ");

        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        wordFrequency.forEach((word, frequency) -> System.out.println("Word: " + word + ", Frequency: " + frequency));
    }
}