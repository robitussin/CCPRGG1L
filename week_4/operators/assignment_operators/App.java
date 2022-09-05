public class App {
    public static void main(String[] args) throws Exception {

        // Assignment operators are used to assign values to variables.

        // the assignment operator (=) assigns the value to a variable:
        int x = 5;

        // The addition assignment operator (+=)
        // Adds value and assigns to a variable

        // Same as x = x + 5;
        // x = 5 + 5;
        x += 5;
        System.out.println(x);

        // The subtraction assignment operator (-=)
        // Subtracts value and assigns to a variable

        // Same as a = a - 3;
        // a = 5 - 3
        // a = 2
        int a = 5;
        a -= 3;
        System.out.println(a);

        // The multiplication assignment operator (*=)
        // multiply value and assigns to a variable
        
        // b = b * 3;
        // b = 5 * 3;
        // b = 15
        int b = 5;
        b *= 3;
        System.out.println(b);

        // The division assignment operator (/=)
        // Divides value and assigns to a variable

        // Same as c = c / 3;
        // c = 5 / 3;
        double c = 5;
        c /= 3;
        System.out.println(c);

        // The modulo assignment operator (%=)
        // Gets remainder value and assigns to a variable
        // Same as d = d % 3;
        // d = 5 % 3
        // d 
        int d = 5;
        d %= 3;
        System.out.println(d);
    }
}
