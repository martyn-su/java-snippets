import java.util.Scanner;
import java.util.Random;

public class RandomGuess {
    public static void main(String[] args) {
        Random random = new Random();
        // Generates random integers {{0 to 49
        int yourNum;
        int actualNum = random.nextInt(20);
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("guess the number between 0 and 20");
            yourNum = sc.nextInt();
            if (yourNum > actualNum) {
                System.out.println("too big!");
            }
            if (yourNum < actualNum)
                System.out.println("too small!");
            
        } while (yourNum != actualNum);
    
        System.out.println("Correct! The number was");
        System.out.println(actualNum);
    }
}
