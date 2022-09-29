public class App {
    public static void main(String[] args) throws Exception {

        int age = 18;

        if (!checkAge(age)) {

            System.out.println("Im going home");
            return;
        }
    }

    static boolean checkAge(int myAge) {

        if (myAge == 18) {

            return true;
        }

        return false;
    }
}
