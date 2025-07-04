public class Book 
{
    String title;
    String author;
    float price;

    public Book (String title, String author, float price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public float discount (float discount_percentage)
    {
        return this.price*(1 - discount_percentage/100);
    } 
    public static void main (String[] args) 
    {
        Book b1 = new Book("Harry Potter", "J. K. Rowling", 2000);
        Book b2 = new Book("Transformers", "Alan Dean Foster", 2500);
        Book b3 = new Book("How to Train your Dragon", "Cressida Cowel", 1500);
        
        System.out.println("Title : " + b1.title + " Author : " + b1.author + " Price : " + b1.price);
        System.out.println("The price of the book after 10% discount is: " + b1.discount(10));
        System.out.println("Title : " + b2.title + " Author : " + b2.author + " Price : " + b2.price);
        System.out.println("The price of the book after 15% discount is: " + b2.discount(15));
        System.out.println("Title : " + b3.title + " Author : " + b3.author + " Price : " + b3.price);
        System.out.println("The price of the book after 20% discount is: " + b3.discount(20));
    }
}