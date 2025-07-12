public class ThisKeywordExample1 
{
    String name;

    public ThisKeywordExample1 (String name)
    {
        this.name = name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getName ()
    {
        return this.name;
    }
    public static void main(String[] args) 
    {
        System.out.println("Used this keyword to resolve naming conflicts between instance variables and parameters.");
    }
}
