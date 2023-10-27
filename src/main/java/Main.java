import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    public static void main(String[] args) {
        //random num generator
        Random rand = new Random();
        int randomNum = rand.nextInt(1, 10);

        /* ignore this comment and print
        just for me to see and test the loop and conditionals*/
        System.out.println(randomNum);

        //user input of number 1-10
        Scanner user = new Scanner(System.in);
        System.out.println("Guess a number between 1-10");
        int userNum = user.nextInt();
        int guessCount = 1;

        //number comparison loop
        while (true) {
            if (userNum > randomNum) {
                System.out.println("Too large");
                System.out.println("Guess again");
                userNum = user.nextInt();
                guessCount++;
            } else if (userNum < randomNum) {
                System.out.println("Too small");
                System.out.println("Guess again");
                userNum = user.nextInt();
                guessCount++;
            } else {
                System.out.println("Correct Guess");
                break;
            }
        }
        System.out.println("Number of guesses: " + guessCount);
    }
}
