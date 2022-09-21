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

        System.out.println("1. Abigail");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'R') {
            match = match + "Abigail";
        }

        System.out.println("2. Dianne");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'R') {
            match = match + " Dianne";
        }
   
        System.out.println("3. Fiona");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'R') {
            match = match + " Fiona";
        }
 
        System.out.println("4. Zophia");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'R') {
            match = match + " Zophia";
        }

        System.out.println("5. Kyla");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'R') {
            match = match + " Kyla";
        }

        System.out.println("6. Marga");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'R') {
            match = match + " Marga";
        }

        System.out.println("7. Cherish");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'R') {
            match = match + " Cherish";
        }

        System.out.println("8. Elane");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'R') {
            match = match + " Elane";
        }

        System.out.println("9. Kimberly");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'R') {
            match = match + " Kimberly";
        }

        System.out.println("10. Ashley");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'R') {
            match = match + " Ashley";
        }
       
        System.out.println("11. Luisa");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'R') {
            match = match + " Luisa";
        }

        System.out.println("12. Thea");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'R') {
            match = match + " Thea";
        }

        System.out.println("13. Fitz");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'R') {
            match = match + " Fitz";
        }
        

        System.out.println("14. Peri");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'R') {
            match = match + " Peri";
        }

        System.out.println("14. Richard");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'R') {
            match = match + " Richard";
        }

        System.out.println("15. Marc");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'R') {
            match = match + " Marc";
        }

        System.out.println("You will be matched with: " + match + " if they also swipe you right :)");

        System.out.println("Thank you for playing :)");
    }
}
