import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Random random = new Random ();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Syötä summa, jolla haluat pelata:");
        int euros = in.nextInt();

        while(euros > 0) {
            int randomNumber1 = random.nextInt(11);
            int randomNumber2 = random.nextInt(11);
            int randomNumber3 = random.nextInt(11);
            
            euros--;
            System.out.println("Arvotut numerot: ");
            System.out.println(randomNumber1);
            System.out.println(randomNumber2);
            System.out.println(randomNumber3);
            int sevens = 0;
            if (randomNumber1 == 7) sevens++;
            if (randomNumber2 == 7) sevens++;
            if (randomNumber3 == 7) sevens++;
                
            if (sevens == 1) {
                euros += 3;
                System.out.println("Voitit 3 euroa.");
            } else if (sevens == 2) {
                euros += 5;
                System.out.println("Voitit 5 euroa.");
            } else if (sevens == 3) {
                euros += 10;
                System.out.println("Voitit 10 euroa.");
            }
            System.out.println("Jos haluat pelata uuden kierroksen, paina Enter. Jos haluat lopettaa pelin, kirjoita e ja paina Enter.");
            String input = in.nextLine();
            if (input.equals("e")) {
                break;
        }
     }
    System.out.println("Peli on päättynyt.");
    }
}

