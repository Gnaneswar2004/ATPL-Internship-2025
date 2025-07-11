import java.util.*;

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "\nEmployee { Name : " + name + ", salary : " + salary + "}";
    }
    public static void main(String[] args) {
        // Creating a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Gnani", 35000));
        employees.add(new Employee("Sai", 25000));
        employees.add(new Employee("Prasanth", 40000));
        employees.add(new Employee("Hemanth", 30000));
        employees.add(new Employee("Rajith", 28000));

        // Print the original list
        System.out.println("Original List:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Use Iterator to remove employees with salary < 30,000
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.salary < 30000) {
                iterator.remove();  // Remove employee if salary is < 30,000
            }
        }

        // Print the modified list
        System.out.println("\nModified List of Employees with salary greater than 30,000 is : ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}