public class ThisKeywordExample2 {
    private int value;
    private String name;

    public ThisKeywordExample2(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public ThisKeywordExample2()
    {
        this(10,"Gnani");
    }

    public void display() {
        System.out.println("Value is : " + value + " and name is : " + name);
        System.out.println("Used this() to call one constructor from another within the same class.");
    }

    public static void main(String[] args) {
        ThisKeywordExample2 obj = new ThisKeywordExample2();
        obj.display();
    }
}