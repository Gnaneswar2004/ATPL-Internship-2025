class Parent
{
    String name;
    int age;

    public Parent (String name, int age)
    {
        this.name = name;
        this.age  =age;
    }
}

class Child extends Parent
{
    String behaviour;
    public Child (String name, int age, String behaviour)
    {
        super(name,age);
        this.behaviour = behaviour;
    }
}

public class SuperKeywordExample1 
{
    public static void main(String[] args) 
    {
        Parent p = new Parent("Snakar", 42);
        Child c = new Child("Gnani", 21, "Calm");

        System.out.println("Name of the Parent is : " + p.name + " and his age is : " + p.age);
        System.out.println("Name of the Child is : " + c.name + " and his age is : " + c.age + " and his behaviour is : " + c.behaviour);
    }
}