public class App {
    public static void main(String[] args) throws Exception {

        char [][] array_3x3 = {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
    
        // // A TO L
        for (int rows = 0; rows < array_3x3.length; rows++) {
            
            System.out.println("");
            for (int columns = 0; columns < array_3x3.length; columns++) {
                System.out.print(array_3x3[rows][columns]);
            }
        }

        // L TO A
        for (int rows = array_3x3.length - 1; rows >= 0; rows--) {
            
            System.out.println("");

            for (int columns = 0 ; columns < array_3x3.length; columns++) {

                System.out.print(array_3x3[rows][columns]);
            }
        }

        // Pattern
        // Print column 0 and column 2 if the row is even.
        // Print column 1 if the row is odd.
        
        for (int rows = 0; rows < array_3x3.length; rows++) {
            
            System.out.println("");

            for (int columns = 0; columns < array_3x3.length; columns++) {

                // EVEN ROWS
                if (rows % 2 == 0 && (columns == 0 || columns == 2)) {
                    System.out.print(array_3x3[rows][columns]);
                }
                // ODD ROWS
                else if (rows % 2 != 0 && columns == 1) {
                    System.out.print(array_3x3[rows][columns]);
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }
    }
}
