import java.util.Scanner;

public class ParameterizedConstructor {

    ParameterizedConstructor(String name) {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        ParameterizedConstructor p = new ParameterizedConstructor(name);
    }
}