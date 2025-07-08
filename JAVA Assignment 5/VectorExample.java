import java.util.*;

public class VectorExample 
{
    public static void main(String[] args) 
    {
        Vector <Double> v = new Vector<>();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Elements of Vetor :");

        for(int i=0; i<4; i++)
        {
            v.add(s.nextDouble());
        }
        System.out.println(v);

        Enumeration<Double> e = v.elements();
        while (e.hasMoreElements()) 
        {
            System.out.print(e.nextElement());    
        }
    }
}