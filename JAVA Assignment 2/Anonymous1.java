interface Greeting 
{
    void sayHello();
}

public class Anonymous1 
{
    public static void main(String[] args)
    {
        Greeting greeting = new Greeting() 
        {
            @Override
            public void sayHello() 
            {
                System.out.println("Hi! Hello");
            }
        };
        greeting.sayHello();
    }
}