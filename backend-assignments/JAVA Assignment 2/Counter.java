public class Counter
{
    public static int count = 0;

    public Counter()
    {
        count++;
    }

    public static int instances()
    {
        return count;
    }
    public static void main(String[] args) 
    {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        Counter c5 = new Counter();

        System.out.println("The total Instances are : " + Counter.instances());
    }
}