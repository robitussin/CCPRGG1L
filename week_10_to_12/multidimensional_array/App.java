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
        
         // 2x1
        String[][] Array_2x1 = { { "X", }, { "O" } };

        // 2x2
        String[][] Array_2x2 = { { "X", "O" }, { "O", "X" } };

        // 2x3
        String[][] Array_2x3 = { { "X", "O", "X" }, { "O", "X", "O" } };

        // 3x3
        String[][] Array_3x3 = { { "X", "O", "X" }, { "O", "X", "O" }, { "X", "O","X" } };
    }
}
