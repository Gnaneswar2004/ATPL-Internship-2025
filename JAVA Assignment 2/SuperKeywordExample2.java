class Parent 
{
    public void message()
    {
        System.out.println("I am Parent.");
    }
}

class Child extends Parent
{
    public void message()
    {
        super.message();
        System.out.println("I am Child.");
    }
}

public class SuperKeywordExample2 
{
    public static void main(String[] args) 
    {
        Child c = new Child();
        c.message();
    }
}