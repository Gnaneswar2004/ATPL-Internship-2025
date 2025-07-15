import java.io.*;
import java.util.*;
import java.text.MessageFormat;

public class StudentDeserializer {

    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("students.ser"))) {
            List<Student> students = (List<Student>) in.readObject();
            if (students != null) {
                System.out.println("\nStudent Details using String.format : ");
                for (Student student : students) {
                    System.out.println(student.toString());
                }

                System.out.println("\nStudent Details using MessageFormat : ");
                String pattern = "ID : {0}, Name : {1}, Age : {2}, Department : {3}, GPA : {4}.";

                for (Student student : students) {
                    String formattedMessage = MessageFormat.format(pattern, student.id, student.name, student.age, student.department, student.gpa);
                    System.out.println(formattedMessage);
                }
            }
        } catch (IOException i) {
            System.err.println("Deserialization error : " + i.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Class Not Found Exception : " + e.getMessage());
        }
    }
}