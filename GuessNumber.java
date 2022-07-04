import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args){

        // 1. Generate a random number between 0-100:
        Random r = new Random();
        int random = r.nextInt(101);

        Scanner s = new Scanner(System.in);
        int guess = -1;

        System.out.println("Guess a number between 0 and 100");

        while(guess != random) {

            // 2. Get the guess from the user:
            System.out.println("Enter your guess");
            guess = s.nextInt();

            // 3. Check if the guess is too low or too high
            if (guess < random) {
                System.out.println("Too low!");
            }
            else if (guess > random) {
                System.out.println("Too high!");
            }
        }

        System.out.println("Correct guess, number is:" + random);

    }
}