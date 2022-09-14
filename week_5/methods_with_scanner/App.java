
// import the Scanner class
import java.util.Scanner;

public class App {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // Method call
        int sum = add();
        System.out.println("The sum is: " + sum);

        // Method call
        int difference = subtract();
        System.out.println("The difference is: " + difference);

        // close scanner
        scan.close();
    }

    // This method will request for two numbers and will add them.
    static int add() {
        System.out.println("This method will add two numbers from user input");
        System.out.print("Enter the first number: ");
        int x = scan.nextInt();

        System.out.print("Enter the second number: ");
        int y = scan.nextInt();

        return x + y;
    }

    // This method will request for two numbers and will subtract them.
    static int subtract() {
        System.out.println("This method will subtract two numbers from user input");
        System.out.print("Enter the first number: ");
        int x = scan.nextInt();

        System.out.print("Enter the second number: ");
        int y = scan.nextInt();

        return x - y;
    }
}