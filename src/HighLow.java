import java.util.Random;
import java.util.Scanner;


class HighLow {
    public static void main(String[] args) {


        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {

            int number = random.nextInt(100);
            int guess = -1;

            while (guess != number) {

                System.out.print("Guess A Number Between 1 and 100: ");

                guess = scanner.nextInt();

                if (guess < number) {

                    System.out.println("HIGHER!");

                } else if (guess > number) {

                    System.out.println("LOWER");

                } else {

                    System.out.println("\nGOOD GUESS!\nThe Number was: " + number + "\n");
                    System.out.print("Would you like to play again? (y/n): ");
                    choice = scanner.next();
                    System.out.println();
                }
            }
        }
    }
}
