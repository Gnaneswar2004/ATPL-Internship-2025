import java.util.*;
import java.io.*;

public class ThrowingException2 {
    public static void readFile (String filename) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name : ");
        String name = scanner.nextLine();
        try {
            readFile(name);
        }
        catch (IOException ioException) {
            System.err.println("IOException.");
        }
    }
}