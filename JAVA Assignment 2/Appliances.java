abstract class Appliance
{
    public abstract void turnOn();
    public abstract void turnOff();
}

class Fan extends Appliance
{
    public void turnOn()
    {
        System.out.println("The fan is turned ON");
    }
    public void turnOff()
    {
        System.out.println("The fan is turned OFF");
    }
}

class TV extends Appliance
{
    public void turnOn()
    {
        System.out.println("The TV is turned ON");
    }
    public void turnOff()
    {
        System.out.println("The TV is turned OFF");
    }
}

public class Appliances 
{
    public static void main(String[] args) {
        Appliance fan = new Fan();
        Appliance tv = new TV();

        fan.turnOn();
        fan.turnOff();
        tv.turnOn();
        tv.turnOff();
    }
}