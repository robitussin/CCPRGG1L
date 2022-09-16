
// import the Scanner class
import java.util.Scanner;

public class App {
    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        myOrder();
    }

    static void myOrder() {
        System.out.println("Welcome to Lazada!");

        System.out.print("Enter your first item:");
        String item1 = scan.nextLine();
        System.out.print("Enter price:");
        double price1 = scan.nextDouble();

        // This will prevent input skip
        scan.nextLine();

        System.out.print("Enter your second item:");
        String item2 = scan.nextLine();
        System.out.print("Enter price:");
        double price2 = scan.nextDouble();

        // This will prevent input skip
        scan.nextLine();

        System.out.print("Enter your third item:");
        String item3 = scan.nextLine();
        System.out.print("Enter price:");
        double price3 = scan.nextDouble();

        double totalAmount = price1 + price2 + price3;

        System.out.println("Your order is: " + item1 + " " + item2 + " " + item3);
        System.out.println("Your total amount is: " + totalAmount);
    }
}
