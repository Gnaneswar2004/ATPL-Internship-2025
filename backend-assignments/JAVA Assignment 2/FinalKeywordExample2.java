public class FinalKeywordExample2 
{
    public final int value = 100;
    public final String Name;
    // public final String Name = "Gnani";

    public FinalKeywordExample2 (String name)
    {
        this.Name = name;
    }

    public static void main(String[] args) 
    {
        FinalKeywordExample2 f = new FinalKeywordExample2("Gnaneswar");
        System.out.println("THe name is : " + f.Name + " and the value is : " + f.value);
    }
}