public class App {
    public static void main(String[] args) throws Exception {

        // Primitive data types

        // Integer types stores whole numbers, positive or negative (such as 123 or
        // -456), without decimals. Valid types are byte, short, int and long. Which
        // type you should use, depends on the numeric value.

        // Byte
        // The byte data type can store whole numbers from -128 to 127
        byte byteNum = 100;
        System.out.println(byteNum);

        // Short
        // The short data type can store whole numbers from -32768 to 32767:
        short shortNum = 5000;
        System.out.println(shortNum);

        // Int
        // The int data type can store whole numbers from -2147483648 to 2147483647.
        int intNum = 100000;
        System.out.println(intNum);

        // Long
        // The long data type can store whole numbers from -9223372036854775808 to
        // 9223372036854775807.
        // Note that you should end the value with an "L
        long longNum = 15000000000L;
        System.out.println(longNum);

        // Floating point types represents numbers with a fractional part, containing
        // one or more decimals. There are two types: float and double.

        // Float
        // Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        float floatNum = 5.75f;
        System.out.println(floatNum);

        // Double
        // Stores fractional numbers. Sufficient for storing 15 decimal digits
        double doubleNum = 19.99d;
        System.out.println(doubleNum);

        // Char
        // The char data type is used to store a single character. The character must be
        // surrounded by single quotes, like 'A' or 'c':
        char myGrade = 'A';
        System.out.println(myGrade);

        // String
        // The String data type is used to store a sequence of characters (text). String
        // values must be surrounded by double quotes:
        String greeting = "Hello World";
        System.out.println(greeting);

        // Boolean
        // A boolean data type is declared with the boolean keyword and can only take
        // the values true or false:
        boolean iLoveJava = true;
        boolean iHateJava = false;

        System.out.println(iLoveJava); // Outputs true
        System.out.println(iHateJava); // Outputs false
    }
}
