/*
Number Guessing Game
Problem Statement: Create a Java program where the user thinks of a number between 1 and 100, and
the computer tries to guess the number by generating random guesses. The user provides feedback by
indicating whether the guess is high, low, or correct. The program should be modular, with different
functions for generating guesses, receiving user feedback, and determining the next guess.
*/

// Importing necessary classes for user input and random number generation
import java.util.Random;
import java.util.Scanner;

// This class NumberGuessingGame for the number guessing game
public class NumberGuessingGame 
{

    // Method to generate a random guess between the given range
    public static int generateGuess(int low, int high) 
	{
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }

    // Method to receive user feedback on the computer's guess
    public static String getUserFeedback(Scanner scanner) 
	{
        System.out.print("Is the guess too high, too low, or correct? (h/l/c): ");
        return scanner.nextLine();
    }

    // Method to determine the next guess range based on user feedback
    public static void updateRange(String feedback, int guess, int[] range) {
        if (feedback.equals("h")) 
		{
            range[1] = guess - 1; // Update the high end of the range
        } 
		else if 
		(feedback.equals("l")) 
		{
            range[0] = guess + 1; // Update the low end of the range
        }
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("The computer will try to guess it.");

        int[] range = {1, 100};
        boolean correctGuess = false;

        while (!correctGuess) 
		{
            int guess = generateGuess(range[0], range[1]);
            System.out.println("Computer's guess: " + guess);

            String feedback = getUserFeedback(scanner);

            if 
			(feedback.equals("c")) 
			{
                correctGuess = true;
                System.out.println("The computer guessed your number correctly!");
            } 
			else 
			{
                updateRange(feedback, guess, range);
            }
        }

        scanner.close();
    }
}