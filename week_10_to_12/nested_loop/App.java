public class App {
    public static void main(String[] args) throws Exception {

        // Outer loop
        for (int hours = 0; hours < 12; hours++) {

            // inner loop
            for (int minutes = 0; minutes < 60; minutes++) {
                    System.out.println(hours + " : " + minutes );
            }   
        }
    }
}
