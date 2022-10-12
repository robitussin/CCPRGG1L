public class App {
    public static void main(String[] args) throws Exception {

        for (int i = 5; i != 0; i--) {

            if (i == 5) {
                System.out.print("Elizer ");
            } else if (i == 4) {
                System.out.print("Allen! ");
            } else if (i == 3) {
                System.out.print("Darrel ");
            } else if (i == 2) {
                System.out.print("Jhay Anne ");
                break;
            } else if (i == 1) {
                System.out.print("Thea ");
            }

            System.out.println("Shot!");
        }
    }
}