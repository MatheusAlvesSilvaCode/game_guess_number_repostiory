
import java.util.Random;
import java.util.Scanner;

public class GameGuess {
    public void iniciar() {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("You have 5 chances to guess the correct number.\n");
    }

    public void difficult() {
        System.out.println("Please select the difficulty level:");
        System.out.println("1. Easy (10 chances)");
        System.out.println("2. Medium (5 chances)");
        System.out.println("3. Hard (3 chances)");
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        boolean difficultySelected = false;
        Random random = new Random();


        int numTry = 0;

        while (!difficultySelected) {
            if (!sc.hasNextInt()) {
                System.out.println("Only int numbers\n");
                sc.next();
                continue;
            }

            int option = sc.nextInt();

            switch (option) {
                    case 1:
                        numTry = 10;
                        System.out.printf("I'm thinking of a number between 1 and 100...You can guess the correct number?? You have %d chances to guess.%n ", numTry );
                        difficultySelected = true;
                        break;
                    case 2:
                        numTry = 5;
                        System.out.printf("I'm thinking of a number between 1 and 100...You can guess the correct number?? You have %d chances to guess.%n ", numTry );
                        difficultySelected = true;
                        break;
                    case 3:
                        numTry = 3;
                        difficultySelected = true;
                        System.out.printf("I'm thinking of a number between 1 and 100...You can guess the correct number?? You have %d chances to guess.%n ", numTry );
                        break;
            }
        }
        int magicNumb = random.nextInt(100) + 1;
        boolean win = false;
        int guess =sc.nextInt();

        while (numTry > 0) {
            if (guess == magicNumb) {
                System.out.println("Congratulations! You guessed the correct number!");
                win = true;
                break;
            }
            if (guess < magicNumb) {
                System.out.println("Incorrect! The number is GREATER!");
            } else {
                System.out.println("Incorrect! The number is SMALLER!");
            }
            numTry--;

            if(numTry>0) {
                System.out.printf("You have %d chances left.\n", numTry);
                System.out.print("Enter your next guess: ");
                guess = sc.nextInt();
            }
        }
        if (!win) {
            System.out.printf("Game Over! You ran out of chances. The number was %d.%n", magicNumb);
            System.out.println("Try again?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int again = sc.nextInt();
            boolean againSelected = false;
                switch (again) {
                    case 1:
                    againSelected = true;
                    if(againSelected == true) {
                        difficult();
                    }
                    case 2:
                        System.out.println("thaks for play! :)");
                        break;
            }
        }
    }
}
