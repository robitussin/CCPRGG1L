public class App {
    public static void main(String[] args) throws Exception {

        // Comparison/Relational operators are used to compare two values:
        int x = 1;
        int y = 2;

        // Equal to (==)
        // Returns true if the left variable is equal to the right variable. 
        System.out.println(x + " == " + y);
        System.out.println(x == y); // returns false because x is not equal to y

        // Not Equal to (!=)
        // Returns true if the left variable is not equal to the right variable.  
        System.out.println(x + " != " + y);
        System.out.println(x != y); // returns true because x is not equal to y

        // Greater than (>)
        // Returns true if the left variable is greater than the right variable. 
        System.out.println(x + " > " + y);
        System.out.println(x > y); // returns false because x is not greater than y

        // Less than (<)
        // Returns true if the left variable is less than the right variable. 
        System.out.println(x + " < " + y);
         System.out.println(x < y); // returns true because x is less than y

        // Greater than or equal to (>=)
        // Returns true if the left variable is greater than or equal to the the right variable. 
        System.out.println(x + " >= " + y);
        System.out.println(x >= y); // returns false because x is not greater than or equal to y

        // Less than or equal to (<=)
        // Returns true if the left variable is less than or equal to the the right variable. 
        System.out.println(x + " <= " + y);
        System.out.println(x <= y); // returns true because x is less than or equal to y

    }
}
