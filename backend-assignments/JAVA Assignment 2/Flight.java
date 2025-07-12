public class Flight 
{
    String flight_number;
    String destination;
    String duration;

    public Flight()
    {
        flight_number = "";
        destination = "";
        duration = "";
    }

    public Flight(String flight_number, String destination, String duration)
    {
        this.flight_number = flight_number;
        this.destination = destination;
        this.duration = duration;
    }

    public static void main(String[] args) 
    {
        Flight f1 = new Flight();
        Flight f2 = new Flight("AA123", "New York", "2 hours");
        System.out.println("The Flight Number is : " + f1.flight_number + " Destination is : " + f1.destination + " Duration is : " + f1.duration);
        System.out.println("The Flight Number is : " + f2.flight_number + " Destination is : " + f2.destination + " Duration is : " + f2.duration);
    }
}
