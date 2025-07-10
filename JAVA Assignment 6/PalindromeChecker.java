import java.util.*;

public class PalindromeChecker {

    public static void main(String[] args) {
        Deque<Character> deque = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word to check the Palindrome : ");
        String word = scanner.nextLine();

        for (char c : word.toCharArray()) {
            deque.add(Character.toLowerCase(c));
        }

        boolean isPalindrome = true;
        while (deque.size() > 1 && isPalindrome) {
            if (deque.removeFirst() == deque.removeLast()) {
                isPalindrome = true; 
            }
            else {
                isPalindrome = false;
            }
        }

        if (isPalindrome){
            System.out.println("The given Word is Palindrome.");
        }
        else {
            System.out.println("The given Word is not a Palindrome.");
        }
    }
}