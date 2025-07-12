import java.util.*;

public class CustomerService {
    Queue <String> queue = new LinkedList<>();

    public void add (String name) {
        queue.offer(name);
    }

    public void serve () {
        System.out.println("Served : " + queue.poll());
    }

    public void peek() {
        System.out.println("The next Customer is : " + queue.peek());
    }

    public void display() {
        System.out.println("The Remaining Customers are : " + queue);
    }

    public static void main(String[] args) {
        CustomerService customerServiceSimulation = new CustomerService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the names of Customers : ");
        
        for (int length=0; length<5; length++) {
            customerServiceSimulation.add(scanner.nextLine());
        }

        customerServiceSimulation.serve();
        customerServiceSimulation.serve();
        customerServiceSimulation.serve();
        customerServiceSimulation.peek();
        
        customerServiceSimulation.display();

        scanner.close();
    }
}