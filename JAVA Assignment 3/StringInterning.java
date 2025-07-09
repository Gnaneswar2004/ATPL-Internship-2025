public class StringInterning {
    public static void main(String[] args) {
        String string_a = new String("Hello");
        String string_b = string_a.intern();
        String string_c = "Hello";
        
        System.out.println("a == b: " + (string_a == string_b));
        System.out.println("b == c: " + (string_b == string_c));
        System.out.println("a == c: " + (string_a == string_c));
    }
}