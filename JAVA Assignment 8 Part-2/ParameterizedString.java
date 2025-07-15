import java.text.MessageFormat;

public class ParameterizedString {
    public static void main(String[] args) {
        String studentName1 = "Gnaneswar";
        String department1 = "ECE";
        double gpa1 = 9.20;

        String studentName2 = "Siddu";
        String department2 = "ECE";
        double gpa2 = 9.00;

        String pattern = "Student {0} from {1} department has secured a GPA of {2}.";

        MessageFormat messageFormat = new MessageFormat(pattern);

        System.out.println(messageFormat.format(new Object[]{studentName1, department1, gpa1}));
        System.out.println(messageFormat.format(new Object[]{studentName2, department2, gpa2}));
    }
}