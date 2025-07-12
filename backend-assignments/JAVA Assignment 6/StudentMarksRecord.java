import java.util.*;

public class StudentMarksRecord {
    public static void main(String[] args) {
        Map<String, Integer> records = new HashMap<>();

        records.put("Gnani", 92);
        records.put("Sai", 88);
        records.put("Prasanth", 93);
        records.put("Hemanth", 86);
        records.put("Rajith", 90);

        String studentWithHighestMarks = "" , studentWithLowestMarks = "";
        int highestMarks = Integer.MIN_VALUE;
        int lowestMarks = Integer.MAX_VALUE;

        for (Map.Entry<String,Integer> record : records.entrySet()) {
            if (record.getValue() > highestMarks) {
                highestMarks = record.getValue();
                studentWithHighestMarks = record.getKey();
            }
            else if (record.getValue() < lowestMarks) {
                lowestMarks = record.getValue();
                studentWithLowestMarks = record.getKey();
            }
        }

        System.out.println("The Student with the highest marks is : " + studentWithHighestMarks + " and his marks is : " + highestMarks);
        System.out.println("The Student with the lowest marks is : " + studentWithLowestMarks + " and his marks is : " + lowestMarks);
    }
}