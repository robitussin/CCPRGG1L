public class App {
    public static void main(String[] args) throws Exception {

        // 3x3
        String[][] seatingArrangement = { { "Elizer", "Darrel", "Paulo" },
                { "Joan", "Bianca", "Leanna" },
                { "Emlan", "Bea", "Celine" } };

        // outer loop
        for (int row = 0; row < seatingArrangement.length; row++) {

            System.out.println(" ");
            System.out.print("row " + row + ": ");
            // inner loop
            for (int column = 0; column < seatingArrangement.length; column++) {

                System.out.print(seatingArrangement[row][column] + " ");
            }
        }
    }
}
