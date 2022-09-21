
// import the Scanner class
import java.util.Scanner;

public class App {
    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter your name: ");
        String name = scan.next(); // for String data types

        System.out.print("Enter your age: ");
        int age = scan.nextInt(); // for int data types

        System.out.print("Enter your weight: ");
        double weight = scan.nextDouble(); // for double data types

        System.out.print("Are you filipino? ");
        boolean iAmFilipino = scan.nextBoolean(); // for boolean data types

        System.out.println(" ");

        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your weight is: " + weight);
        System.out.println("Filipino Citizen: " + iAmFilipino);

    }
}