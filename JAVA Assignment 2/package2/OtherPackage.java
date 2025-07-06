package package2;

import package1.AccessModifiers;

public class OtherPackage {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println("Other package:");
        System.out.println("public: " + obj.s1);
        // System.out.println("protected: " + obj.s2); // ❌ error
        // System.out.println("default: " + obj.s3);   // ❌ error
    }
}
