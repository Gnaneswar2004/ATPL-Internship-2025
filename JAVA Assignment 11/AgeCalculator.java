import java.time.*;

public class AgeCalculator {
    public static void main(String[] args) {

        LocalDate dob = LocalDate.of(1995, 5, 15);
        LocalDate today = LocalDate.now();

        Period age = Period.between(dob, today);
        System.out.println("Age is: " + age.getYears() + "years " + age.getMonths() + "months " + age.getDays() + "days.");
    }
}