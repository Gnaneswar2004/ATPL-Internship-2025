public class StringPool {
    public static void main(String[] args) {
    String string1 = "Java";
    String string2 = "Java";
    String string3 = new String("Java");
    
    System.out.println("s1 == s2: " + (string1 == string2));
    System.out.println("s1 == s3: " + (string1 == string3));
    System.out.println("s1.equals(s3): " + string1.equals(string3));
    }
}