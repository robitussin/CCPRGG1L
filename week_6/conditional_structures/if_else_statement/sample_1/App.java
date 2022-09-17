public class App {
    public static void main(String[] args) throws Exception {

        // Sequential Structure
        // Methods are called in order.

        boolean ihaveNoMoney = true;

        if (ihaveNoMoney) {
            System.out.println("Ask your parents to drive you to NU");
        } else {
            // Step 1
            rideJeep();

            // Step 2
            rideBus();

            // Step 3
            rideLRT();

            // Step 4
            rideTricycle();

            // Step 5
            walk();
        }

    }

    static void rideJeep() {
        System.out.println("Ride jeep along katipunan Street");
        System.out.println("Exit jeep along Sumulong Highway");
    }

    static void rideBus() {
        System.out.println("Ride bus along Sumulong Highway");
        System.out.println("Exit bus at SM Masinag");
    }

    static void rideLRT() {
        System.out.println("Ride at Antipolo station");
        System.out.println("Exit at Legarda station");
    }

    static void rideTricycle() {
        System.out.println("Ride tricycle at Figueras Street");
        System.out.println("Exit tricycle at Jhocson Street");
    }

    static void walk() {
        System.out.println("Walk for 3 mins");
    }
}
