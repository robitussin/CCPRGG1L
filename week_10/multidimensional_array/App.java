public class App {
    public static void main(String[] args) throws Exception {

        String[][] movieReservation = {
                { "Available", "Available", "Available", "Available", "Available", "Available", "Available" },
                { "Booked", "Booked", "Booked", "Booked", "Booked", "Booked", "Booked" },
                { "Booked", "Booked", "Booked", "Booked", "Booked", "Booked", "Booked" },
                { "Booked", "Booked", "Booked", "Booked", "Booked", "Booked", "Booked" },
                { "Booked", "Booked", "Booked", "Booked", "Booked", "Booked", "Booked" },
                { "Booked", "Booked", "Booked", "Booked", "Booked", "Booked", "Booked" },
                { "Available", "Available", "Available", "Available", "Available", "Selected", "Selected" }
        };

        // Access element that is selected
        System.out.println(movieReservation[6][5]);

        // Access element that is selected
        System.out.println(movieReservation[6][6]);
    }
}
