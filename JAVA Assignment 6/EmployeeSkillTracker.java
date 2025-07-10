import java.util.HashSet; // Use HashSet for efficient storage of unique skills
import java.util.Set; // Interface for Set operations
import java.util.Arrays; // Utility for converting arrays to lists
import java.util.stream.Collectors; // For collecting elements into a Set using streams

/**
 * Represents an Employee with an ID, name, and a set of skills.
 */
class Employee {
    private String employeeId;
    private String name;
    private Set<String> skills; // Using a Set to store unique skills for each employee

    public Employee(String employeeId, String name, Set<String> skills) {
        this.employeeId = employeeId;
        this.name = name;
        this.skills = skills;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public Set<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId='" + employeeId + '\'' + ", name='" + name + '\'' + ", skills=" + skills + '}';
    }
}

/**
 * Manages employee skill data and provides functionalities to search for employees with specific skills
 * and find common skills between employees.
 */
public class EmployeeSkillTracker {

    private Set<Employee> employees; // Using a Set to store unique employees

    public EmployeeSkillTracker() {
        this.employees = new HashSet<>(); // Initialize the Set of employees
    }

    /**
     * Adds an employee to the system.
     * @param employee The Employee object to add.
     * @return True if the employee was added successfully (not a duplicate), false otherwise.
     */
    public boolean addEmployee(Employee employee) {
        return employees.add(employee); // HashSet ensures uniqueness of employees
    }

    /**
     * Finds employees who possess a given skill.
     * @param skill The skill to search for.
     * @return A Set of employees having the specified skill.
     */
    public Set<Employee> findEmployeesWithSkill(String skill) {
        Set<Employee> skilledEmployees = new HashSet<>();
        for (Employee employee : employees) {
            if (employee.getSkills().contains(skill)) { // Check if the employee's skill set contains the skill
                skilledEmployees.add(employee);
            }
        }
        return skilledEmployees;
    }

    /**
     * Finds the common skills between two employees.
     * @param employee1 The first employee.
     * @param employee2 The second employee.
     * @return A Set of skills common to both employees.
     */
    public Set<String> findCommonSkills(Employee employee1, Employee employee2) {
        Set<String> skills1 = new HashSet<>(employee1.getSkills()); // Create a copy to avoid modifying original
        skills1.retainAll(employee2.getSkills()); // Retains only the elements that are common in both sets
        return skills1;
    }

    public static void main(String[] args) {
        EmployeeSkillTracker tracker = new EmployeeSkillTracker();

        // Create some sample employees
        Employee emp1 = new Employee("E001", "Alice", new HashSet<>(Arrays.asList("Java", "Spring Boot", "SQL", "Cloud Computing")));
        Employee emp2 = new Employee("E002", "Bob", new HashSet<>(Arrays.asList("Java", "Python", "Data Science", "SQL")));
        Employee emp3 = new Employee("E003", "Charlie", new HashSet<>(Arrays.asList("Python", "Machine Learning", "Cloud Computing")));
        Employee emp4 = new Employee("E004", "David", new HashSet<>(Arrays.asList("Java", "Angular", "HTML", "CSS")));

        // Add employees to the tracker
        tracker.addEmployee(emp1);
        tracker.addEmployee(emp2);
        tracker.addEmployee(emp3);
        tracker.addEmployee(emp4);

        // Find employees with a specific skill (e.g., "Java")
        System.out.println("Employees with Java skills:");
        Set<Employee> javaDevelopers = tracker.findEmployeesWithSkill("Java");
        javaDevelopers.forEach(System.out::println);

        System.out.println("\n---");

        // Find common skills between two employees (e.g., Alice and Bob)
        System.out.println("Common skills between Alice and Bob:");
        Set<String> commonSkillsAliceBob = tracker.findCommonSkills(emp1, emp2);
        commonSkillsAliceBob.forEach(System.out::println);

        System.out.println("\n---");

        // Find common skills between two employees (e.g., Bob and Charlie)
        System.out.println("Common skills between Bob and Charlie:");
        Set<String> commonSkillsBobCharlie = tracker.findCommonSkills(emp2, emp3);
        commonSkillsBobCharlie.forEach(System.out::println);
    }
}
