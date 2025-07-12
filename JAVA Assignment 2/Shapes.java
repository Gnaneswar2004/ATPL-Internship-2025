abstract class Shape
{
    public abstract double area();
}

class Square extends Shape
{
    private double side;

    public Square(double side) 
    {
        this.side = side;
    }

    @Override
    public double area()
    {
        return side*side;
    }
}

class Triangle extends Shape
{
    private double base;
    private double height;

    public Triangle(double base, double height) 
    {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area()
    {
        return (base*height)/2;
    }
}

public class Shapes 
{
    public static void main(String[] args) {
        Shape square = new Square(5.0);
        Shape triangle = new Triangle(5.0,5.0);

        System.out.println("Area of the Square is : " + square.area());
        System.out.println("Area of the Triangle is : " + triangle.area());
    }
}