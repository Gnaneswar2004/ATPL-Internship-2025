public class Circle 
{
    private double radius;

    public double getradius()
    {
        return radius;
    }

    public void setradius(double radius)
    {
        if (radius >= 0)
        {
            this.radius = radius;
        }
        else
        {
            System.out.println("Radius must be greater than zero");
        }
    }

    public double area()
    {
        return Math.PI * Math.pow(radius, 2.00);
    }

    public double circumference()
    {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) 
    {
        Circle c = new Circle();
        c.setradius(5);
        System.out.println("Tha area of the circle is : " + c.area());
        System.out.println("Tha circumference of the circle is : " + c.circumference());
    }
}
