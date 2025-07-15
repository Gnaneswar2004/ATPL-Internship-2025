import java.io.*;
import java.util.*;

public class StudentPrintWriter {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("students.txt")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Details of the Students : ");
            for (int num=0; num<5; num++) {
                System.out.print("Name : ");
                String name = scanner.nextLine();
                System.out.print("Age : ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Department : ");
                String department = scanner.nextLine();
                System.out.print("CGPA : ");
                float cgpa = (float) scanner.nextDouble();
                scanner.nextLine();

                writer.format("Student [ Name = %s , Age = %d , Department = %s , CGPA = %.2f ] \n",name,age,department,cgpa);
            }
            System.out.println("Student Data is Successfully written in student.txt");
        } catch (IOException e) {
            System.err.println("An Error occurred while writing the file : " + e.getMessage());
        }
    }
}