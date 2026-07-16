import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("test.txt");
            System.out.println("File Opened Successfully");
            file.close();
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}