import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        // Dating App Game

        char swipe;
        String match = "";

        System.out.println("Welcome to NUmble");
        System.out.println("Swipe Left to ignore or Swipe Right to match!");
        System.out.println(" ");

        System.out.println("1. Cristian Ogena");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'L') {
            match = match + "Cristian Ogena";
        }

        System.out.println("2. Brix Manzanero");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'L') {
            match = match + " Brix Manzanero";
        }
   
        System.out.println("3. John Divina");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'L') {
            match = match + " John Divina";
        }
 
        System.out.println("4. John Basilio");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'L') {
            match = match + " John Basilio";
        }

        System.out.println("5. Dhan Tamparong");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'L') {
            match = match + " Dhan Tamparong";
        }

        System.out.println("6. Mico Salandanan");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'L') {
            match = match + " Mico Salandanan";
        }

        System.out.println("7. Juan Andaya");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'L') {
            match = match + " Juan Andaya";
        }

        System.out.println("8. Gian Colinares");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'L') {
            match = match + " Gian Colinares";
        }

        System.out.println("9. Miko Cruz");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'L') {
            match = match + " Miko Cruz";
        }

        System.out.println("10. Joseph Bonilla");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'L') {
            match = match + " Joseph Bonilla";
        }
       
        System.out.println("11. Jerico Lim");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'L') {
            match = match + " Jerico Lim";
        }

        System.out.println("You will be matched with: " + match + " if they also swipe you right :)");

        System.out.println("Thank you for playing :)");
    }
}
