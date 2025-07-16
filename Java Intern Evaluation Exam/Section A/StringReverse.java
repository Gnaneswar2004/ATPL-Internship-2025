import java.util.*;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int len = string.length();
        char[] str = string.toCharArray();
        for (int i=0; i<len; i++) {
            System.out.print(str[len-1-i]);
        }
    }
}
