class Parent 
{
    public final void message()
    {
        System.out.println("This is Final Method Example 1.");
    }
}

class Child extends Parent
{
    public void display()
    {
        System.out.println("Attempt to override the final method.");
    }
}
public class FinalKeywordExample1 
{
    public static void main(String[] args) 
    {
        Child c = new Child();
        c.message();
    }
}