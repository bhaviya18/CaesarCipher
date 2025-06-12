import java.io.*;
import java.util.Scanner;

public class Main {

    // Caesar Cipher encryption
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                char shifted = (char) ((character - base + shift) % 26 + base);
                result.append(shifted);
            } else {
                result.append(character);
            }
        }

        return result.toString();
    }

    // Caesar Cipher decryption
    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - (shift % 26));
    }

    // Write text to file
    public static void writeToFile(String filename, String data) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(data);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Read text from file
    public static String readFromFile(String filename) {
        StringBuilder result = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String filename = "ciphertext.txt";

        while (true) {
            System.out.println("\n--- Caesar Cipher Menu ---");
            System.out.println("1. Encrypt and Save to File");
            System.out.println("2. Decrypt from File");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter text to encrypt: ");
                    String inputText = scanner.nextLine();

                    System.out.print("Enter shift key (0-25): ");
                    int shiftKeyEncrypt = Integer.parseInt(scanner.nextLine());
                    shiftKeyEncrypt = shiftKeyEncrypt % 26;

                    String encrypted = encrypt(inputText, shiftKeyEncrypt);
                    writeToFile(filename, encrypted);
                    System.out.println("Encrypted text saved to file: " + encrypted);
                    break;

                case "2":
                    System.out.print("Enter shift key used for encryption (0-25): ");
                    int shiftKeyDecrypt = Integer.parseInt(scanner.nextLine());
                    shiftKeyDecrypt = shiftKeyDecrypt % 26;

                    String cipherText = readFromFile(filename);
                    if (cipherText.isEmpty()) {
                        System.out.println("File is empty or not found.");
                    } else {
                        String decrypted = decrypt(cipherText, shiftKeyDecrypt);
                        System.out.println("Decrypted text: " + decrypted);
                    }
                    break;

                case "3":
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please choose 1, 2, or 3.");
            }
        }
    }
}
