import java.io.*;
import java.util.*;

public class Encryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter message to encrypt : ");
        String message = scanner.nextLine();
        scanner.close();

        StringBuilder encryptedMessage = new StringBuilder(), decryptedMessage = new StringBuilder();

        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                encryptedMessage.append((char) ((c - base + 5) % 26 + base));
            } else encryptedMessage.append(c);
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("encrypted.txt"));
            writer.write(encryptedMessage.toString()); writer.close();
            System.out.println("Encrypted : " + encryptedMessage);

            BufferedReader reader = new BufferedReader(new FileReader("encrypted.txt"));
            for (char c : reader.readLine().toCharArray()) {
                if (Character.isLetter(c)) {
                    char base = Character.isLowerCase(c) ? 'a' : 'A';
                    decryptedMessage.append((char) ((c - base - 5 + 26) % 26 + base));
                } else decryptedMessage.append(c);
            }
            reader.close();
            System.out.println("Decrypted : " + decryptedMessage);
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}