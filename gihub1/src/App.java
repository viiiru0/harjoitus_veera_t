import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random ();
        int euros = 5;

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
                euros += 6;
                System.out.println("Voitit 6 euroa.");
            }
        }
        System.out.println("Peli on päättynyt.");
        }
    }

