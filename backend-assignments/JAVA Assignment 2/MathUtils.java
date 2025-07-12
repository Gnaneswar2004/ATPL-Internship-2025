public class MathUtils 
{
    public int calculate (int a, int b)
    {
        return a+b;
    }

    public double calculate (double a, double b)
    {
        return a*b;
    }

    public static void main(String[] args) 
    {
        MathUtils math = new MathUtils();
        System.out.println(math.calculate(5,5));
        System.err.println(math.calculate(2.0,5.0));
    }
}
