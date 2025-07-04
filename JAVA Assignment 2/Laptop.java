public class Laptop 
{
    String brand;
    String RAM;
    String processor;
    float price;

    public Laptop(String brand, String RAM, String processor)
    {
        this.brand = brand;
        this.RAM = RAM;
        this.processor = processor;
    }

    public Laptop(String brand, String RAM, String processor, float price)
    {
        this.brand = brand;
        this.RAM = RAM;
        this.processor = processor;
        this.price = price;
    }
    public static void main(String[] args) 
    {
        Laptop laptop1 = new Laptop("Dell", "8GB", "Intel Core i5");
        Laptop laptop2 = new Laptop("HP", "12GB", "Intel Core i7", 75000);
        System.out.println("The laptop brand is : " + laptop1.brand + " and the RAM capacity of : " + laptop1.RAM + " and the processor is : " + laptop1.processor);
        System.out.println("The laptop brand is : " + laptop2.brand + " and the RAM capacity of : " + laptop2.RAM + " and the processor is : " + laptop2.processor + " and the price is : " + laptop2.price);
    }
}