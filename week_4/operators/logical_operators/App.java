public class App {
    public static void main(String[] args) throws Exception {

        // Logical operators are used to determine the logic between variables or
        // values

        // Logical AND operator (&&)
        // Returns true if all comparisons are true
        
        int x = 4;
        // Comparison one: x > 1 (true)
        // Comparison two: x < 5 (false)
        System.out.println(x > 1 && x < 5); // returns true because x is greater than 1 and x is less than 5

        // Logical OR operator (||)
        // Returns true if either one comparison is true.
        
        int y = 5;
        // Comparison one: y > 3 (true)
        // Comparison two: x < 5 (false)
        System.out.println(y > 3 || y < 4); // returns true because one of the conditions are true (y is greater than 3
                                            // but y is not less than 4)

        // Logical NOT operator (!)
        // Used to reverse a result
        // Changes true to false
        // Changes false to true
        
        int z = 2;
        System.out.println(!(z > 5)); // 2 is not greater than 5 which is false. Returns true because it is the reverse of false.

        // Comparison one: z > 1 (true)
        // Comparison one: z < 3 (true)
        System.out.println(!(z > 1 && z < 3)); // Initially returns true but returns false because ! (not) is used to reverse the result
    }
}
