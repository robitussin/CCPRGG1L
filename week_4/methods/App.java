public class App {
    public static void main(String[] args) throws Exception {

        // A method is a block of code which only runs when it is called.

        // Methods are used to perform certain actions, and they are also known as
        // functions.

        // Why use methods? To reuse code: define the code once, and use it many times.

        // Method call
        myMethod();

        // A method can be called multiple times
        myMethod();
        myMethod();

        // Method call with arguments
        // Elizer is an argument
        // Elizer is passed as an argument. the displayName method can take a parameter
        displayName("Elizer");

        // Passing two arguments. Each argument are separated with a comma
        displayNameAndAge("Elizer", 10);

        int sum = add(1, 1);
        System.out.println(sum);

        System.out.println(add(1, 1));
    }

    // "MyMethod" is the name of the method
    // the keyword "static" means that the method belongs to the Main class and not
    // an object of
    // the Main class
    // the keyword "void" means that this method does not have a return value.
    static void myMethod() {
        System.out.println("This method has been called");
    }

    // A method with a parameter
    // name is the parameter in the method inside the parentheses.
    static void displayName(String name) {
        System.out.println("Hello: " + name);
    }

    // A method with two parameters. Each parameter are separated with a comma
    static void displayNameAndAge(String name, int age) {
        System.out.println("Hello: " + name);
        System.out.println("You are : " + age + " years old!");
    }

    // A method that returns a value
    // This method accepts two parameters and returns an int value
    static int add(int x, int y) {
        int z = x + y;
        return z; // The return keyword returns a value after the function is called
    }
}
