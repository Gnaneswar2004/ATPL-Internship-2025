class Animals
{
    public void makeSound()
    {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animals
{
    @Override
    public void makeSound()
    {
        System.out.println("Dog Barks.");
    }
}

class Cat extends Animals
{
    @Override
    public void makeSound()
    {
        System.out.println("Cat Meows.");
    }
}

class Cow extends Animals
{
    @Override
    public void makeSound()
    {
        System.out.println("Cow Moos");
    }
}

public class Animal 
{
    public static void main(String[] args) 
    {
        Animals animals = new Animals();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        animals.makeSound();
        dog.makeSound();
        cat.makeSound();
        cow.makeSound();
    }    
}