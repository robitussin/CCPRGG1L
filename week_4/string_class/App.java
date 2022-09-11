public class App {
    public static void main(String[] args) throws Exception {

        // Basic way of declaring String variables
        String mySurName = "Ponio";
        
        // Declaring String variables as Objects
        String myName = new String("Elizer");
        
        // Because String is a class. It has methods that can be accessed.
        System.out.println(myName); // prints Elizer
        System.out.println(myName.length()); // prints 6
        System.out.println(myName.toLowerCase()); // prints elizer
        System.out.println(myName.toUpperCase()); // prints ELIZER

    }
}
