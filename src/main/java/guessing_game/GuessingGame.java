package guessing_game;

import java.util.Random;
import java.util.Scanner;


public class GuessingGame {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int guessedNumber = randomGenerator.nextInt(100) + 1;
        int userGuess = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess a number between 1 and 100");

        while (true) {
            System.out.println("Enter your guess: ");

            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();

                if (userGuess == guessedNumber) {
                    System.out.println("You guessed right!");
                    break;
                } else if (userGuess > guessedNumber) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Your guess is too low.");
                }
            } else {
                System.out.println("That's not a number. Try again.");
                scanner.next();
            }
        }

        scanner.close();
    }
}
