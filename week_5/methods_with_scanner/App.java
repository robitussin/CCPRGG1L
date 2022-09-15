
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

        // Method call
        int age = computeAge();
        System.out.println("Your age is: " + age);

        // Method call
        String crushName = revealMyCrush();
        System.out.println(crushName);

        // Method call
        double myGrade = getAverage();
        System.out.println("My final grade is: " + myGrade + "%");
    }

    static int add() {
        System.out.println("Please enter two numbers to add");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x + y;
    }

    static int subtract() {
        System.out.println("Please enter two numbers to subtract");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x - y;
    }

    static int computeAge() {
        System.out.println("Please enter current year and year of birth");
        System.out.print("Enter current year: ");
        int x = scan.nextInt();

        System.out.print("Enter the year of your birthday: ");
        int y = scan.nextInt();
        return x - y;
    }

    static String revealMyCrush() {
        System.out.println("This will reveal the name of your crush");
        System.out.print("Enter the your name: ");

        String myName = scan.nextLine();

        System.out.print("Enter the name of your crush: ");

        String nameOfMyCrush = scan.nextLine();

        return myName + " loves " + nameOfMyCrush;
    }

    static double getAverage() {
        System.out.println("This will compute your final grade");
        System.out.print("Enter score in exam 1: ");
        double x = scan.nextDouble();

        System.out.print("Enter score in exam 2: ");
        double y = scan.nextDouble();

        System.out.print("Enter score in exam 3: ");
        double z = scan.nextDouble();

        return (x + y + z) / 3;
    }
}