import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        char choice;
        int roundsWon = 0;

        do {
            int number = random.nextInt(100) + 1;
            int attempts = 5;
            boolean win = false;

            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("Correct!");
                    System.out.println("Score: " + attempts);
                    roundsWon++;
                    win = true;
                    break;
                } else if (guess > number) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }

                attempts--;
            }

            if (!win) {
                System.out.println("You lost! Number was " + number);
            }

            System.out.print("Play again? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("Rounds won: " + roundsWon);


    }
}