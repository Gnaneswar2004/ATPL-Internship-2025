import java.util.List;
import java.util.function.Consumer;

class Customer {
    String name;
    boolean subscribed;

    public Customer(String name, boolean subscribed) {
        this.name = name;
        this.subscribed = subscribed;
    }

    public String getName() {
        return name;
    }

    public boolean isSubscribed() {
        return subscribed;
    }
}

public class CustomerNotificationSystem {

    public static void main(String[] args) {
        
        List<Customer> customers = List.of(
            new Customer("Gnani", true),
            new Customer("Sai", false),
            new Customer("Prasanth", true),
            new Customer("Hemanth", false)
        );

        Consumer<Customer> sendNotification = customer ->
            System.out.println("Sending notification to " + customer.getName());

        customers.stream()
            .filter(Customer::isSubscribed)
            .forEach(sendNotification);
    }
}