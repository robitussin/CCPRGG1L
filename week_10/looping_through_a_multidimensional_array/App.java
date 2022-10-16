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

        for (int i = 0; i < movieReservation.length; i++) {
            for (int j = 0; j < movieReservation.length; j++) {
                System.out.println("movieReservation[" + i + "][" + j + "] = " + movieReservation[i][j]);
            }
        }
    }
}
