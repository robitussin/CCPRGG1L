public class App {
    public static void main(String[] args) {

        // Array of Characters
        char[] myName = { 'E', 'L', 'I', 'Z', 'E', 'R' };

        // Loop through all characters
        for (int i = 0; i < myName.length; i++) {
            System.out.println(myName[i]);
        }

        // Loop through all characters in reverse order
        for (int i = myName.length - 1 ; i >= 0; i--) {
            System.out.println(myName[i]);
        }


        // // Only display vowels
        for (int i = 0; i < myName.length; i++) {
           
            if (myName[i] == 'A' || myName[i] == 'E' || myName[i] == 'I' || myName[i] == 'O' || myName[i] == 'U') {
             System.out.println(myName[i]);
            } 
         }

        // Only display consonants
        for (int i = 0; i < myName.length; i++) {
           
           if (!(myName[i] == 'A' || myName[i] == 'E' || myName[i] == 'I' || myName[i] == 'O' || myName[i] == 'U')) {
            System.out.println(myName[i]);
           } 
        }
    }
}
