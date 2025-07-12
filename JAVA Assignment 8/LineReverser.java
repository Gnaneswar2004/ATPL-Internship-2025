import java.io.*;

public class LineReverser {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "reversed.txt";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;

            while ((line = reader.readLine()) != null) {
                // Reverse characters in the line
                String reversedLine = new StringBuilder(line).reverse().toString();
                writer.write(reversedLine);
                writer.newLine();  // Preserve line breaks
            }

            System.out.println("Reversed lines written to " + outputFile);

        } catch (FileNotFoundException e) {
            System.err.println("The input file was not found : " + e.getMessage());
        } catch (IOException e) {
            System.err.println("An I/O error occurred : " + e.getMessage());
        }
    }
}
