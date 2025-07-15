import java.io.*;
import java.util.*;

public class Student implements Serializable {

        @Serial
        private static final long serialVersionUID = 1L; // Recommended for serialization compatibility
        public int id;
        public String name;
        public int age;
        public String department;
        public double gpa;

        public Student(int id, String name, int age, String department, double gpa) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.department = department;
            this.gpa = gpa;
        }

        public String toString() {
            return String.format("ID : %d, Name : %s, Age : %d, Department : %s, GPA : %.2f", id, name, age, department, gpa);
        }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Gnaneswar", 21, "ECE", 9.2));
        students.add(new Student(2, "Sai Kumar", 21, "ECE", 8.5));
        students.add(new Student(3, "Prasanth", 21, "ECE", 9.3));
        students.add(new Student(4, "Hemanth", 21, "ECE", 8.5));

        // Serialize the list of students into a file
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("students.ser"))) {
            out.writeObject(students); // Serialize the entire list object
            System.out.println("Student data is serialized to students.ser.");
        } catch (IOException i) {
            System.err.println("Serialization error : " + i.getMessage());
        }
    }
}