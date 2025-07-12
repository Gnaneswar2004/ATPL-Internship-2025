public class Display 
{
    public void show (int data)
    {
        System.out.println(data);
    }

    public void show (String data)
    {
        System.out.println(data);
    }

    public void show (int[] data)
    {
        int len = data.length;
        for (int i=0; i<len; i++)
        {
            System.out.print(data[i]);
        }
        
    }
    public static void main(String[] args) 
    {
        Display d = new Display();
        d.show(100);
        d.show("AASLIN");
        d.show(new int[] {1,2,3,4,5});
    }
}
