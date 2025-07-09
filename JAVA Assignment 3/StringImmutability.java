public class StringImmutability {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = string1;
        string1 = string1.concat(" World");
        
        System.out.println("string1 : " + string1);
        System.out.println("string2: " + string2);
    }
}