class Vehicles 
{
    public void start()
    {
        System.out.println("The vehicle is started.");
    }
}

class Bike extends Vehicles
{
    // @Override
    public void start()
    {
        System.out.println("The bike is started.");
    }
}

class Car extends Vehicles
{
    // @Override
    public void start()
    {
        System.out.println("The car is started.");
    }
}

public class Vehicle
{
    public static void main(String[] args) 
    {
        Vehicles v = new Vehicles();
        v.start();
        Bike b = new Bike();
        b.start();
        Car c = new Car();
        c.start();
    }
}