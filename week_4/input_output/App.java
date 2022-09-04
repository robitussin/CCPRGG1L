import java.util.Scanner; // import the Scanner class

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name;
        // Enter username and press Enter
        System.out.println("Enter your Name: ");
        name = scan.nextLine();

        System.out.println("Hello " + name);

        int age;
        System.out.println("Enter your Age: ");
        age = scan.nextInt();

        System.out.println("You are " + age + " years old");

        double weight;
        System.out.println("Enter your weight in pounds: ");
        weight = scan.nextDouble();

        System.out.println("Your weight is " + weight + " lbs");

        // close scanner
        scan.close();
    }
}