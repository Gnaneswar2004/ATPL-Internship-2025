interface Movable 
{
    void move();
}

class Car implements Movable
{
    public void move()
    {
        System.out.println("The Car is Moving.");
    }
}

class Robot implements Movable
{
    public void move()
    {
        System.out.println("The Robot is Moving.");
    }
}

class Drone implements Movable
{
    public void move()
    {
        System.out.println("The Drone is Moving.");
    }
}

public class Movables 
{
    public static void main(String[] args) 
    {
        Car car = new Car();
        Robot robot = new Robot();
        Drone drone = new Drone();
        car.move();
        robot.move();
        drone.move();
    }
}