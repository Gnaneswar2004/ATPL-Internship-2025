import java.util.*;

public class PhoneDirectory {
    public static void main(String[] args) {
        Map<String,String> phoneBook = new HashMap<>();

        phoneBook.put("Gnani","123456789");
        phoneBook.put("Sai","147258369");
        phoneBook.put("Prasanth","123789456");
        phoneBook.put("Hemanth","159267348");

        phoneBook.containsKey("Sai");
        phoneBook.containsValue("123456789");

        phoneBook.remove("Gnani", "123456789");

        System.out.println("The Phone Book contains : " + phoneBook);
    }
}