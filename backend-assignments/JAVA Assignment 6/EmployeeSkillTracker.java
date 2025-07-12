import java.util.*;

public class EmployeeSkillTracker {

    public static void main(String[] args) {
        Map<String, Set<String>> employees = new HashMap<>();

        employees.put("Gnani", new HashSet<>(Arrays.asList("Java","Sql")));
        employees.put("Prasanth", new HashSet<>(Arrays.asList("Java","Sql","C#")));
        employees.put("Sai", new HashSet<>(Arrays.asList("Java","Sql")));
        employees.put("Hemanth", new HashSet<>(Arrays.asList("Pyhton","Sql")));

        Set<String> javaDevelopers = findEmployeesWithSkill("Java", employees);
        System.out.println("Java Developers: " + javaDevelopers);
        Set<String> commonSkills = findCommonSkills("Sai", "Gnani", employees);
        System.out.println("Common Skills between Sai and Gnani : " + commonSkills); 
    }

    public static Set<String> findEmployeesWithSkill(String skill, Map<String, Set<String>> employeeSkills) {
        Set<String> employee = new HashSet<>();
        for (Map.Entry<String, Set<String>> entry : employeeSkills.entrySet()) {
            if (entry.getValue().contains(skill)) {
                employee.add(entry.getKey());
            }
        }
        return employee;
    }

    public static Set<String> findCommonSkills(String employee1, String employee2, Map<String, Set<String>> employeeSkills) {
        Set<String> skills1 = new HashSet<>(employeeSkills.get(employee1)); 
        Set<String> skills2 = new HashSet<>(employeeSkills.get(employee2));
        skills1.retainAll(skills2);
        return skills1;
    }
}