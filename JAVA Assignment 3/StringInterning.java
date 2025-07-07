public class StringInterning
{
    public static void main(String[] args)
    {
        String a = new String("Hello");
        String b = a.intern();
        String c = "Hello";
        
        System.out.println("a == b: " + (a == b));
        System.out.println("b == c: " + (b == c));
        System.out.println("a == c: " + (a == c));
    }
}