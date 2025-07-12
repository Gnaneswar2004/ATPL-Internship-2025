abstract class Shape 
{
    abstract void draw();
}

public class Anonymous2 {
    public static void main(String[] args) 
    {
        Shape circle = new Shape() 
        {
            @Override
            void draw() 
            {
                System.out.println("Drawing a circle");
            }
        };
        circle.draw();
    }
}