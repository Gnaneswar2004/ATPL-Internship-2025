import java.io.*;
import java.util.*;

public class CharacterCount {
    public static void main(String[] args) {
        String sentence = "This is a sample text. It is a simple example.";
        HashMap<Character, Integer> characterFrequency = new HashMap<>();

        String string = sentence.replaceAll(" ", "");
        char[] characters = string.toCharArray();
        
        for (char character : characters) {
            characterFrequency.put(character, characterFrequency.getOrDefault(character, 0) + 1); 
        }

        characterFrequency.forEach((character, frequency) -> System.out.println("Character : " + character + ", Frequency : " + frequency));
    }
}