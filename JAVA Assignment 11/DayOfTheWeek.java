import java.time.LocalDate;

public class DayOfTheWeek {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2025, 12, 25);
        System.out.println("Day of the week : " + date.getDayOfWeek());
    }
}