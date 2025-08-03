import java.time.LocalDate;

public class DateManipulation {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Original Date : " + currentDate);
        System.out.println("After adding 10 days : " + currentDate.plusDays(10));
        System.out.println("After subtracting 2 months : " + currentDate.minusMonths(2));
    }
}