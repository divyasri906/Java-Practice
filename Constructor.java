
import java.util.Scanner;

class Student1 {
    String name;

    Student1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class Constructor {
    public static void main(String[] args) {

        Student1 s = new Student1();
        s.display();
    }
}