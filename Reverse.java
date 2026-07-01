import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 digit number: ");
        int num = sc.nextInt();

        int a = num / 100;
        int b = (num / 10) % 10;
        int c = num % 10;

        int rev = (c * 100) + (b * 10) + a;

        System.out.println("Reverse: " + rev);
    }
}
    
    

