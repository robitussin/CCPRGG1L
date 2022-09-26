public class App {
    public static void main(String[] args) throws Exception {

        int myAge = 18;

        if (myAge == 18) {
            System.out.println("I am allowed to enter the night club!");
        }

        if (myAge != 18) {
            System.out.println("I am allowed to enter the night club!");
        }

        if (myAge < 18) {
            System.out.println("I am allowed to enter the night club!");
        }

        if (myAge > 18) {
            System.out.println("I am allowed to enter the night club!");
        }

        if (myAge <= 18) {
            System.out.println("I am allowed to enter the night club!");
        }

        if (myAge >= 18) {
            System.out.println("I am allowed to enter the night club!");
        }

        boolean iHaveMoney = true;

        if (myAge == 18 && iHaveMoney) {
            System.out.println("I am allowed to enter the night club!");
        }

        if (myAge == 18 || iHaveMoney) {
            System.out.println("I am allowed to enter the night club!");
        }

        if (!(myAge == 18)) {
            System.out.println("I am allowed to enter the night club!");
        }

        if (!(myAge == 18 || iHaveMoney)) {
            System.out.println("I am allowed to enter the night club!");
        }
    }
}
