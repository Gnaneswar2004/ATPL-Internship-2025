import java.util.*;
import java.util.function.Predicate;

class Employee {
    String name;
    double salary;
    String email;

    public Employee (String name, double salary, String email) {
        this.name = name;
        this.salary = salary;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }
}

public class EmployeeBonus {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
            new Employee("Gnani", 60000, null),
            new Employee("Sai", 45000, null),
            new Employee("Prasanth", 70000, "prasanth@gmail.com"),
            new Employee("Hemanth", 55000, "hemanth@gmail.com")
        );

        Predicate<Employee> isEligible = employee -> employee.getSalary() > 50000;

        employees.stream()
            .filter(isEligible)
            .forEach(employee -> {
                Optional<String> email = Optional.ofNullable(employee.getEmail());
                email.ifPresentOrElse(
                    e -> System.out.println(employee.getName() + " email is : " + e),
                    () -> System.out.println(employee.getName() + " : Email not available")
                );
            });
    }
}