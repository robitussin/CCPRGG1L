public class App {
    public static void main(String[] args) throws Exception {

        // Sequential Structure
        // Methods are called in order.
        firstmethod();

        secondMethod();

        thirdMethod();

        fourthMethod();

        fifthMethod();
    }

    static void firstmethod() {
        System.out.println("This is the first method!");
    }

    static void secondMethod() {
        System.out.println("This is the second method!");
    }

    static void thirdMethod() {
        System.out.println("This is the third method!");
    }

    static void fourthMethod() {
        System.out.println("This is the fourth method!");
    }

    static void fifthMethod() {
        System.out.println("This is the fifth method!");
    }
}
