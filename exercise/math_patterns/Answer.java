public class Exercise {
    public static void main(String[] args) throws Exception {
  
        int[][] mdArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15 ,16}};


        int sum = 0;
        // outer loop - row
        for (int row = 0; row < 4; row++) {

            System.out.println("");
            // inner loop - column
            for (int column = 0; column < 4; column++) {
    
                sum += mdArray[row][column];
            }
        }
    
        System.out.println("The sum of this array is: " + sum);
  
        // PATTERN 1
        System.out.println(" ");
        System.out.println("1. SUM OF PATTERN 1");

        sum = 0;
        // outer loop - row
        for (int row = 0; row < 4; row++) {

            System.out.println("");
            // inner loop - column
            for (int column = 0; column < 4; column++) {
    
                if (row == 0) {
                    sum += mdArray[row][column];
                }
            }
        }

        System.out.println("The sum of pattern 1 is: " + sum);
        
        // PATTERN 2
        System.out.println("");
        System.out.println("2. SUM OF PATTERN 2");

        sum = 0;
        // outer loop - row
        for (int row = 0; row < 4; row++) {

            System.out.println("");
            // inner loop - column
            for (int column = 0; column < 4; column++) {
    
                if (column == 0) {
                    sum += mdArray[row][column];
                }
            }
        }

        System.out.println("The sum of pattern 2 is: " + sum);

        // PATTERN 3
        System.out.println("");
        System.out.println("3. SUM OF PATTERN 3");

        sum = 0;
        // outer loop - row
        for (int row = 0; row < 4; row++) {

            System.out.println("");
            // inner loop - column
            for (int column = 0; column < 4; column++) {
    
                if (row == 0 || column == 0) {
                    sum += mdArray[row][column];
                }
            }
        }

        System.out.println("The sum of pattern 3 is: " + sum);
        
        // PATTERN 4
        System.out.println("");
        System.out.println("4. SUM OF PATTERN 4");

        sum = 0;
        // outer loop - row
        for (int row = 0; row < 4; row++) {

            System.out.println("");
            // inner loop - column
            for (int column = 0; column < 4; column++) {
    
                if (row == 0 && (column == 0 || column == 3))  {
                    sum += mdArray[row][column];
                } else if (row == 3 && (column == 0 || column == 3)){
                    sum += mdArray[row][column];
                }
            }
        }

        System.out.println("The sum of pattern 4 is: " + sum);
        
        // PATTERN 5
        System.out.println("");
        System.out.println("5. SUM OF PATTERN 5");

        sum = 0;
        // outer loop - row
        for (int row = 0; row < 4; row++) {

            System.out.println("");
            // inner loop - column
            for (int column = 0; column < 4; column++) {
    
                if (row == 1 && (column == 1 || column == 2))  {
                    sum += mdArray[row][column];
                } else if (row == 2 && (column == 1 || column == 2)){
                    sum += mdArray[row][column];
                }
            }
        }

        System.out.println("The sum of pattern 5 is: " + sum);
      
        // PATTERN 6
        System.out.println("");
        System.out.println("6. SUM OF PATTERN 6");

        sum = 0;
        // outer loop - row
        for (int row = 0; row < 4; row++) {

            System.out.println("");
            // inner loop - column
            for (int column = 0; column < 4; column++) {
    
                if (row == 1 && (column == 1 || column == 2))  {
                    sum += mdArray[row][column];
                } else if (row == 2 && (column == 1 || column == 2)){
                    sum += mdArray[row][column];
                }
                else if(row == 0 && (column == 0 || column == 3)){
                    sum += mdArray[row][column];
                }
                else if(row == 3 && (column == 0 || column == 3)){
                    sum += mdArray[row][column];
                }
            }
        }

        System.out.println("The sum of pattern 6 is: " + sum);
    }
  }
