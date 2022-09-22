
// import the Scanner class
import java.util.Scanner;

public class App {
    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        myOrder();
    }

    static void myOrder() {

        System.out.println("Welcome to Angels Pizza!");

        System.out.println("Please select from our menu:");
        System.out.println("Enter A if you want a Creamy Spinach Pizza that costs 400.00 pesos");
        System.out.println("Enter B if you want a Four Cheese Pizza that costs 300.00 pesos");

        System.out.print("Enter your choice here: ");
        char choice = scan.next().charAt(0);

        String pizza = "";
        double price = 0;

        switch (choice) {
            case 'A':
                pizza = "Creamy Spinach Pizza";
                price = 400.00;
                break;
            case 'B':
                pizza = "Four Cheese Pizza";
                price = 300.00;
                break;
            default:
                System.out.println("Invalid Order");
                return;
        }

        System.out.println("Do you have an angel's pizza card? (true or false))");
        boolean hasCard = scan.nextBoolean();

        if (hasCard == true) {

            System.out.println("Please enter your angels pizza card number");
            int cardNumber = scan.nextInt();

            pizza = pizza + " plus a free pizza!";
        }

        System.out.println("Your order is: " + pizza);
        System.out.println("Your total amount is: " + price);

        scan.close();
    }
}