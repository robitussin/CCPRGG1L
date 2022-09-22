
// import the Scanner class
import java.util.Scanner;

public class App {

	// Scanner Object
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		orderPizza();
	}

	static void orderPizza() {

		System.out.println("Welcome to Angels Pizza!");

		System.out.println("Enter letter A if you want a Creamy Spinach Dip pizza!");
		System.out.println("Enter letter B if you want a Garlic Shrimp pizza!");

		System.out.print("Enter your choice: ");
		char choice = scan.next().charAt(0);

		// Initial value
		String pizza = "";
		double price = 0;

		switch (choice) {
			case 'A':
				pizza = "Creamy Spinach Dip Pizza";
				price = 515.00;
				break;
			case 'B':
				pizza = "Garlic Shrimp Pizza";
				price = 505.00;
				break;
			default:
				System.out.println("Please enter A or B!");
				return; // EXIT PROGRAM
		}

		System.out.println("Your order is: " + pizza);
		System.out.println("Your total order amount is: " + price);

		System.out.println("Enter COD if you want cash on delivery!");
		System.out.println("Enter CREDIT if you want to use credit card!");

		System.out.print("Enter your choice: ");
		String paymentMethod = scan.next();

		switch (paymentMethod) {
			case "COD":
				System.out.println("Please prepare exact amount upon delivery");
				break;
			case "CREDIT":
				System.out.print("Enter CREDIT card number:");
				int cardNumber = scan.nextInt();
				break;
			default:
				System.out.println("Please dont make fun of me!");
				return;
		}

		System.out.println("Do you have an angels pizza card? (true or false)");
		System.out.print("Please enter true or false: ");
		boolean hasAngelsPizzaCard = scan.nextBoolean();

		if (hasAngelsPizzaCard == true) {
			System.out.println("You get a free pizza!");
		} else {
			System.out.println("Awwww thats sad!");
		}

		System.out.println("Choose delivery method!");
		System.out.println("Enter PICKUP kung masipag ka!");
		System.out.println("Enter DELIVER kung tamad ka!");
		System.out.print("Enter delivery method: ");
		String deliveryMethod = scan.next();

		switch (deliveryMethod) {
			case "PICKUP":
				System.out.println("ang sipag mo naman brad!");
				break;
			case "DELIVER":
				System.out.print("Tamad mo brad! umayos ka parating na ang pizza mo!");
				break;
			default:
				System.out.println("Ano gusto mo teleport?");
				return;
		}

		scan.close();
	}
}