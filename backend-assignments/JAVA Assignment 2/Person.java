class Persons
{
    public void eat()
    {
        System.out.print("Eat ");
    }

    public void sleep()
    {
        System.out.print("Sleep ");
    }

    public void work()
    {
        System.out.print("Work ");
    }
}

class Student extends Persons
{
    public void study()
    {
        System.out.print("Study ");
    }
}

class Teacher extends Persons
{
    public void teach()
    {
        System.out.print("Teach ");
    }
}

public class Person 
{
    public static void main(String[] args) 
    {
        Student s = new Student();
        Teacher t = new Teacher();
        System.out.print("The student will ");
        s.eat();
        s.study();
        s.sleep();
        System.out.println();
        System.out.print("The teacher will ");
        t.eat();
        t.teach();
        t.sleep();
    }
}