import java.util.*;

public class JobScheduler {

    Queue <String> queue = new LinkedList<>();

    public void add (String name) {
        queue.offer(name);
    }

    public void process () {
        System.out.println(queue.poll() + " is Processed.");
    }

    public void display() {
        System.out.println("The Documents that are needed to process are : " + queue);
    }

    public static void main(String[] args) {
        JobScheduler scheduler = new JobScheduler();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please Enter the Documents that are nedded to process : ");
        for (int length=0;length<5;length++) {
            scheduler.add(scanner.nextLine());
        }
        
        scheduler.display();
        scheduler.process();
        scheduler.process();
        scheduler.display();
    }
}