/*
 create a game which allows a user to play "guess the number" game once
 Game should have the following methods:
 1.)Constructor to generate the random number
 2.)takeUserInput() to take a user input of number
 3.)isCorrectNumber() to detect wether the number entered by the user is true
 4.) getter and setter for noOfGuesses
 Use properties such as noOfGuesses(int), etc to get this task done!
 */
import java.util.Scanner;
import java.util.Random;

class GuessTheNumber {
    private int number;
    private int noOfGuesses;

    // Constructor to generate a random number between 1 and 100
    public GuessTheNumber() {
        Random rand = new Random();
        number = rand.nextInt(100) + 1;
        noOfGuesses = 0;
    }

    // Getter for noOfGuesses
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    // Setter for noOfGuesses
    public void setNoOfGuesses(int guesses) {
        this.noOfGuesses = guesses;
    }

    // Method to take user input
    public int takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the number (1-100): ");
        int guess = sc.nextInt();
        return guess;
    }

    // Method to check if the guess is correct
    public boolean isCorrectNumber(int guess) {
        noOfGuesses++;
        if (guess == number) {
            System.out.println("Congratulations! You guessed the correct number.");
            System.out.println("You took " + noOfGuesses + " guesses.");
            return true;
        } else if (guess < number) {
            System.out.println("Too low!");
        } else {
            System.out.println("Too high!");
        }
        return false;
    }
}

public class video43 {
    public static void main(String[] args) {
        GuessTheNumber game = new GuessTheNumber();

        // Only one round of guessing
        int guess = game.takeUserInput();
        game.isCorrectNumber(guess);
    }
}

