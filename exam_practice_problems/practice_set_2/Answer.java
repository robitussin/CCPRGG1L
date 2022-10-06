import java.util.Scanner;

public class Answer {

    static Scanner scan = new Scanner(System.in);

    // Answers
    public static void main(String[] args) throws Exception {
        System.out.println("Exam 2 practice problems");

        // Part 1: Conversions
        // Print the converted values

        // 1. Create a method to convert celsius to fahrenheit.
        System.out.print("Enter temperature in celsius: ");
        double tempInCelsius = scan.nextDouble();
        double tempInFahrenheit = toFahrenheit(tempInCelsius);
        System.out.println(tempInCelsius + "°C is equal to " + tempInFahrenheit +
                "°F");

        // 2. Create a method to convert fahrenheit to celsius.
        System.out.print("Enter temperature in fahrenheit: ");
        tempInFahrenheit = scan.nextDouble();
        tempInCelsius = toCelsius(tempInFahrenheit);
        System.out.println(tempInFahrenheit + "°F is equal to " + tempInCelsius +
                "°C");

        // 3. Create a method to convert seconds to minutes.
        System.out.print("Enter time in seconds: ");
        double seconds = scan.nextDouble();
        double minutes = secondstoMinutes(seconds);
        System.out.println(seconds + " seconds is equal to " + minutes + " minutes");

        // 4. Create a method to convert hours to minutes.
        System.out.print("Enter time in hours: ");
        double hours = scan.nextDouble();
        minutes = hoursToMinutes(hours);
        System.out.println(hours + " hours is equal to " + minutes + " minutes");

        // 5. Create a method to convert megabytes to gigabytes.
        System.out.print("Enter storage value in megabytes: ");
        double megabytes = scan.nextDouble();
        double gigabytes = megabyteToGigabyte(megabytes);
        System.out.println(megabytes + " megabytes is equal to " + gigabytes + "gigabytes");

        // Part 2: Conditions
        // Display "valid" if it is true.
        // Display "invalid" if it is false.

        // 6. Create a condition to check if the length given mobile number is valid
        System.out.print("Enter your 11 digit mobile number: ");
        String mobileNumber = scan.next();

        if (mobileNumber.length() == 11) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

        // 7. Create a condition to check if your bestfriend's first name is in
        // UPPERCASE letters
        System.out.print("Enter name of your bestfriend in UPPERCASE: ");
        String bestfriend = scan.next();

        if (bestfriend == bestfriend.toUpperCase()) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

        // 8. Create a condition to check if the answer is correct
        // answer should be manila or MANILA
        System.out.print("Enter the capital of the philippines: ");
        String capital = scan.next();

        if (capital.toLowerCase().equals("manila") || capital.toUpperCase().equals("MANILA")) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

        // 9. Create a condition to check if the answer belongs to one of the five human
        // senses
        // sight
        // touch
        // hearing
        // smell
        // taste
        System.out.print("Enter one of the five human senses: ");
        String sense = scan.next();

        switch (sense) {
            case "sight":
                System.out.print("Valid ");
                break;
            case "smell":
                System.out.print("Valid ");
                break;
            case "hearing":
                System.out.print("Valid ");
                break;
            case "touch":
                System.out.print("Valid ");
                break;
            case "taste":
                System.out.print("Valid ");
                break;
            default:
                System.out.print("invalid ");
                break;
        }
    }

    static double toFahrenheit(double temperature) {
        temperature = (temperature * 9 / 5) + 32;
        return temperature;
    }

    static double toCelsius(double temperature) {
        temperature = (temperature - 32) * 5 / 9;
        return temperature;
    }

    static double secondstoMinutes(double seconds) {
        double minutes = seconds / 60;
        return minutes;
    }

    static double hoursToMinutes(double hours) {
        double minutes = hours * 60;
        return minutes;
    }

    static double megabyteToGigabyte(double megabytes) {
        double gigabytes = megabytes / 1000;
        return gigabytes;
    }
}
