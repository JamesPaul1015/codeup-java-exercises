import java.util.Scanner;


public class Bob {

    public static void main(String[] args) {
        String choice = "y";

        while (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
            System.out.println("Say whatever you want to Bob.\nSorry, he can be quite uncommunicative: ");
            Scanner scan = new Scanner(System.in);

            String userInput = scan.nextLine();


            boolean endsWithQuestionMark = userInput.endsWith("?");
            boolean isYelling = userInput.equals(userInput.toUpperCase()) || userInput.endsWith("!");
            boolean didNotSayAnything = userInput.trim().isEmpty();

            if (endsWithQuestionMark) {
                System.out.println("Sure.");
            } else if (didNotSayAnything) {
                System.out.println("Fine. Be that way.");
            } else if (isYelling) {
                System.out.println("Whoah, chill out.");
            } else {
                System.out.println("Whatever");
            }
            System.out.print("\nWould you like to try again?\nIt doesn't get much better (y/n): ");
            choice = scan.next();
            System.out.println();

        }
    }
}

