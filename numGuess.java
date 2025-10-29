import java.util.Random;
import java.util.Scanner;

public class numGuess {
    public static void main(String[] args) {
        
       Random random = new Random();
       Scanner scanner = new Scanner(System.in);

       int guess;
       int attempts = 0;
       int randomNumber = random.nextInt(1,11);

       System.out.println("Welcome to the Number Guessing Game!");
       System.out.println("Enter a number between 1 and 10.");

       do{
        System.out.print("Enter your guess: ");
        guess = scanner.nextInt();
        attempts++;
       }while(guess != randomNumber);
       System.out.println("Congratulations! You've guessed the correct number: " + randomNumber + " in " + attempts + " attempts.");
       scanner.close();
       
    }
}
