import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            int generatedNumber = random.nextInt(100) + 1;  
            int attempts = 0;
            int maxAttempts = 5;
            boolean correctGuess = false;

            System.out.println("\nA number between 1 and 100 has been generated. You have " + maxAttempts + " attempts to guess it.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == generatedNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    score += maxAttempts - attempts + 1; 
                    correctGuess = true;
                    break;
                } else if (userGuess > generatedNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }

                System.out.println("Attempts remaining: " + (maxAttempts - attempts));
            }

            if (!correctGuess) {
                System.out.println("You've used all your attempts. The correct number was: " + generatedNumber);
            }

            System.out.println("Your current score: " + score);

           
            System.out.print("Do you want to play another round? (yes/no): ");
            String response = scanner.next().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("Game over! Your final score is: " + score);
        scanner.close();
    }
}

