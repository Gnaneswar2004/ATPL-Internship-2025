import java.util.*;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int len = str.length();
        char[] str1 = str.toCharArray();
        for (int i=0; i<len; i++) {
            System.out.print(str1[len-1-i]);
        }
    }
}