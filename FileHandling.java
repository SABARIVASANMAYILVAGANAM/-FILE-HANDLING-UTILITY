import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "example.txt";

        writeToFile(fileName, "Hello, this is a sample text.\nWelcome to Java File Handling!");
        readFromFile(fileName);
        modifyFile(fileName, "\nThis is an additional line.");
        readFromFile(fileName);
    }

    public static void writeToFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
            System.out.println("\nFile written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void readFromFile(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("\nReading File Content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void modifyFile(String fileName, String newText) {
        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(newText);
            writer.close();
            System.out.println("\nFile modified successfully!");
        } catch (IOException e) {
            System.out.println("Error modifying file: " + e.getMessage());
        }
    }
}
