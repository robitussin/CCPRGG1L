public class App {
    public static void main(String[] args) throws Exception {

        String[] myfavefastfood = { "Jollibee", "Mcdonalds", "KFC", "MangInasal", "Chowking" };

        // Loop through an array of strings
        for (int i = 0; i < myfavefastfood.length; i++) {
            System.out.println(myfavefastfood[i]);
        }

        int[] primeNumbers = { 2, 3, 5, 7 };

        // Loop through an array of integers
        for (int i = 0; i < primeNumbers.length; i++) {
            System.out.println(primeNumbers[i]);
        }

        char[] myName = { 'E', 'L', 'I', 'Z', 'E', 'R' };

        // Loop through an array of characters
        for (int i = 0; i < myName.length; i++) {
            System.out.println(myName[i]);
        }
        
        System.out.println("");
        // Print name in reverse
        for (int i = myName.length - 1; i >= 0; i--) {
            System.out.print(myName[i]);
        }
        
        // Using foreach
        for (char i : myName) {
            System.out.print(i);
        }
    }
}
