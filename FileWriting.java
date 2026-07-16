import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("sample.txt");

            writer.write("Name:Divyasri\n");
            writer.write("Age:18");

            writer.close();

            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing files.");
        }
    }
}