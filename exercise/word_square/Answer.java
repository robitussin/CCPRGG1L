
public class Exercise {
    public static void main(String[] args) throws Exception {
  
        char [][] mdArray = {{'P','R','E','Y'}, {'L','A','V', 'A'}, {'O','V','E', 'R'}, {'T', 'E', 'N', 'D'}};
    
  
        // WORD 1
        System.out.println("1. WORD 1");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (row == 0) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }
        
        // WORD 2
        System.out.println("");
        System.out.println("2. WORD 2");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (row == 1) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }
        
        // WORD 3
        System.out.println("");
        System.out.println("3. WORD 3");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (row == 2) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }
        
        // WORD 4
        System.out.println("");
        System.out.println("4. WORD 4");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (row == 3) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }
        
        // WORD 5
        System.out.println("");
        System.out.println("5. WORD 5");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (column == 0) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }
      
        // WORD 6
        System.out.println("");
        System.out.println("6. WORD 6");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (column == 1) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }
        
        // WORD 7
        System.out.println("");
        System.out.println("7. WORD 7");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (column == 2) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }

        // WORD 8
        System.out.println("");
        System.out.println("8. WORD 8");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (column == 3) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }

        // WORD 9
        System.out.println("");
        System.out.println("9. WORD 9");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (row == 1 && (column == 1 || column == 2)) {
                    System.out.print(mdArray[row][column]);
                }
                else if (row == 2 && (column == 1 || column == 2)) {
                    System.out.print(mdArray[row][column]);
                }
                else{
                    System.out.print(" ");
                }
            }
        }
        
        // WORD 8
        System.out.println("");
        System.out.println("10. WORD 10");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (row == 1 && (column == 1 || column == 2)) {
                    System.out.print(mdArray[row][column]);
                }
                else if (row == 2 && (column == 1 || column == 2)) {
                    System.out.print(mdArray[row][column]);
                }
                else if (row == 0 && (column == 0 || column == 3)) {
                    System.out.print(mdArray[row][column]);
                }
                else if (row == 3 && (column == 0 || column == 3)) {
                    System.out.print(mdArray[row][column]);
                }
                else{
                    System.out.print(" ");
                }
            }
        }
    }
  }
