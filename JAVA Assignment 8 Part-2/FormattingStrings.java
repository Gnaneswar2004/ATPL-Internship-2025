import java.io.*;
import java.util.*;

public class FormattingStrings {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("Students Formatting.txt")) {
            writer.format("-----------------------------------------\n");
            writer.format("| %-10s | %-3s | %-10s | %-5s |\n","Name","Age","Department","CGPA");
            writer.format("-----------------------------------------\n");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Details of the Students : ");
            for (int num=0; num<4; num++) {
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

                writer.format("| %-10s | %-3s | %-10s | %-5s |\n",name,age,department,cgpa);
            }
            writer.format("-----------------------------------------");
            System.out.println("Student Data is Successfully written in Students Formatting.txt");
        } catch (IOException e) {
            System.err.println("An Error occurred while writing the file : " + e.getMessage());
        }
    }
}