public class App {
    public static void main(String[] args) throws Exception {

        String today = "wednesday";

        switch (today) {
            case "monday":
                System.out.println("I love mondays!");
                break;
            case "tuesday":
                System.out.println("My favorite day is tuesday!");
                break;
            case "wednesday":
                System.out.println("I clean my room every wednesday!");
                break;
            case "thursday":
                System.out.println("My birthday is on thursday!");
                break;
            case "friday":
                System.out.println("I go on a date during fridays!");
                break;
            case "Saturday":
                System.out.println("I go to the gym every saturday!");
                break;
            case "Sunday":
                System.out.println("I do my assignments every sunday!");
                break;
            default:
                break;
        }

    }
}
