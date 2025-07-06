package package1;

public class AccessModifiers 
{
    public String s1 = "Public";
    protected String s2 = "Protected";
    String s3 = "Default";
    private String s4 = "Private";

    public void testAccessInSameClass() {
        System.out.println("Same class:");
        System.out.println("public: " + s1);
        System.out.println("protected: " + s2);
        System.out.println("default: " + s3);
        System.out.println("private: " + s4);
    }
}