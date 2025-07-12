interface Printable 
{
    void print();
}

class Document implements Printable
{
    public void print()
    {
        System.out.println("The Document is Printing.");
    }
}

class Image implements Printable
{
    public void print()
    {
        System.out.println("The Image is Printing.");
    }
}

class Invoice implements Printable
{
    public void print()
    {
        System.out.println("The Invoice is printing.");
    }
}
public class Printables 
{
    public static void main(String[] args) 
    {
        Document d = new Document();
        Image img = new Image();
        Invoice invoice = new Invoice();
        d.print();
        img.print();
        invoice.print();
    }
}
