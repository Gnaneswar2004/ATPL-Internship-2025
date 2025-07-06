package packageb;

import packagea.A;

public class B extends A 
{
    public static void main(String[] args) 
    {
        B obj = new B();
        System.out.println(obj.protectedStr);
        // System.out.println(obj.defaultStr);

        A obj2 = new A();
        // System.out.println(obj2.protectedStr);
    }
}
