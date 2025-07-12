import java.io.*;
import java.util.*;
import java.sql.SQLException;

public class ClassifyExceptions {
    public static void readFile(String filename) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        System.out.println(bufferedReader.readLine());
    }

    public static void readFiles(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }

    public static void connectToDatabase() throws SQLException {
        throw new SQLException("Database connection failed!");
    }

    public static void triggerNullPointer() {
        String text = null;
        System.out.println(text.length());
    }

    public static void divideByZero() {
        int x = 10 / 0; 
    }

    public static void main(String[] args) {
        try {
            readFile("Aaslins.txt");
        } 
        catch (IOException ioException) {
            System.err.println("IOException: " + ioException.getMessage());
        }

        try {
            readFiles("aaslins.txt");
        } 
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("FileNotFoundException: " + fileNotFoundException.getMessage());
        }

        try {
            connectToDatabase(); 
        } 
        catch (SQLException sqlException) {
            System.err.println("SQLException: " + sqlException.getMessage());
        }

        try {
            triggerNullPointer();
        } 
        catch (NullPointerException nullPointerException) {
            System.err.println("NullPointerException: " + nullPointerException.getMessage());
        }

        try {
            divideByZero();
        } 
        catch (ArithmeticException arithmeticException) {
            System.err.println("ArithmeticException: " + arithmeticException.getMessage());
        }
    }
}