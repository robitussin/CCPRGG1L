public class App {
    public static void main(String[] args) throws Exception {

        // Logical operators are used to determine the logic between variables or
        // values:

        // Logical and operator (&&)
        int x = 3;
        System.out.println(x > 1 && x < 5); // returns true because x is greater than 1 and x is less than 5

        // Logical or operator (||)
        int y = 5;
        System.out.println(y > 3 || y < 4); // returns true because one of the conditions are true (y is greater than 3
                                            // but y is not less than 4)

        // Logical not operator (!)
        int z = 2;
        System.out.println(!(z > 1 && z < 3)); // returns false because ! (not) is used to reverse the result
    }
}
