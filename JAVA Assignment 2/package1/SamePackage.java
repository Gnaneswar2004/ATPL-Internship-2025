package package1;

public class SamePackage 
{
    public static void main(String[] args) 
    {
        AccessModifiers obj = new AccessModifiers();
        obj.testAccessInSameClass();

        System.out.println("Same package:");
        System.out.println("public: " + obj.s1);
        System.out.println("protected: " + obj.s2);
        System.out.println("default: " + obj.s3);
        // System.out.println("private: " + obj.s4);
    }
}