package task1.numbergame;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        String playAgain;

        System.out.println("=================================");
        System.out.println("       CODSOFT - NUMBER GAME");
        System.out.println("=================================");

        do {
            int number = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 7;
            boolean guessed = false;

            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {

                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("Correct! 🎉");
                    System.out.println("You guessed it in " + attempts + " attempts.");

                    score++;
                    guessed = true;
                    break;

                } else if (guess < number) {
                    System.out.println("Too Low! Try again.");

                } else {
                    System.out.println("Too High! Try again.");
                }
            }

            if (!guessed) {
                System.out.println("You are out of attempts!");
                System.out.println("The correct number was: " + number);
            }

            System.out.print("\nDo you want to play another round? (yes/no): ");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("\n=================================");
        System.out.println("          GAME OVER");
        System.out.println("Your Score: " + score);
        System.out.println("Thank you for playing!");
        System.out.println("=================================");

        sc.close();
    }
}