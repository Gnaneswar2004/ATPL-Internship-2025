import java.io.*;

public class FileConcatenator {
    public static void main(String[] args) {
        String file1 = "file1.txt";
        String file2 = "file2.txt";
        String outputFile = "concatenated.txt";

        try (
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;

            // Read and write file1 content
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            // Read and write file2 content
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Files concatenated successfully into " + outputFile);

        } catch (FileNotFoundException e) {
            System.err.println("One of the input files was not found : " + e.getMessage());
        } catch (IOException e) {
            System.err.println("An I/O error occurred : " + e.getMessage());
        }
    }
}