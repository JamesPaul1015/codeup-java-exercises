import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.getInteger;

//public class MethodsExercises {

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String choice = "y";
//
//        while (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
//            float num1;
//            float num2;
//
//            System.out.print("We are going to calculate a math table.\n" +
//                    "You will enter 2 numbers and I will give you the table.\n" +
//                    "Please enter the first number:");
//            num1 = input.nextFloat();
//            System.out.print("Enter the second number:");
//            num2 = input.nextFloat();
//            System.out.println("Your Math Table is : ");
//            System.out.println("========================");
//            System.out.printf("Addition: %.2f + %.2f = %.2f \n", num1, num2, num1 + num2);
//            System.out.printf("Subtraction: %.2f - %.2f = %.2f \n", num1, num2, num1 - num2);
//            System.out.printf("Multiplication: %.4f * %.4f = %.4f \n", num1, num2, num1 * num2);
//            System.out.printf("Division: %.4f / %.4f = %.4f \n", num1, num2, num1 / num2);
//            System.out.print("Would you like to see another? (y/n): ");
//            choice = input.next();
//            System.out.println();
//
//
//        }
//    }
//}


//
//public class MethodsExercises {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String choice = "y";
//
//        while (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
//
//            System.out.print("Enter a number between 1 and 31,\nand then I will calculate the factorial: ");
//            int n = scanner.nextInt();
//            int result = factorial(n);
//            System.out.println("The factorial of " + n + " is " + result);
//            System.out.print("Would you like to see another? (y/n): ");
//            choice = scanner.next();
//            System.out.println();
//        }
//    }
//    public static int factorial(int n) {
//        int result = 1;
//        for (int i = 1; i <= n; i++) {
//            result = result * i;
//        }
//        return result;
//
//    }
//}


//

//public class MethodsExercises {
//    public static void main(String[] args) {
//
//        Random dice = new Random();
//        Scanner input = new Scanner(System.in);
//        String choice = "y";
//
//        while (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
//            int die1;
//            int die2;
//            int roll;
//            int faces;
//            int result;
//            System.out.println("Hey Dice Roller! How many faces would you like each die to have?");
//            System.out.print("Enter the number of faces you would like \nAnd then press enter to roll the dice!");
//            faces = input.nextInt();
//            result = dice.nextInt(faces) + 1;
//
//            die1 = (int) (Math.random() * result) + 1;
//            die2 = (int) (Math.random() * result) + 1;
//            roll = die1 + die2;
//
//            System.out.println("The first die comes up: " + die1);
//            System.out.println("The second die comes up: " + die2);
//            System.out.println("Which makes your total: " + roll);
//            System.out.print("Would you like to roll again? (y/n): ");
//            choice = input.next();
//            System.out.println();
//
//        }
//
//    }
//}


//import java.util.Scanner;
//
//        public class MethodsExercises {
//            public static void main(String[] args) {
//                Scanner input = new Scanner(System.in);
//                int num1;
//                int num2;
//
//                System.out.print("Enter the first number:");
//                num1 = input.nextInt();
//                System.out.print("Enter the second number:");
//                num2 = input.nextInt();
//                System.out.println("Your Math Table is : ");
//
//                System.out.println("========================");
//                System.out.println("Addition: " + num1 + " + " + num2 + " = " + (num1 + num2));
//                System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + (num1 - num2));
//                System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + (num1 * num2));
//                System.out.println("Division: " + num1 + " % " + num2 + " = " + (num1 % num2));
//
//
//            }
//        }


//                    Validates User Inputs

//        public static void main (String[]args){
//            System.out.print("Enter a number between 1 and 10: ");
//            int userInput = getInteger(1, 10);
//        }
//
//        public static int getInteger ( int min, int max){
//            Scanner sc = new Scanner(System.in);
//                if (!sc.hasNextInt()) {
//                    System.out.println("Not a number!");
//                    return getInteger(min, max);
//                }
//                int userInput = sc.nextInt();
//                if (userInput >= min && userInput <= max) {
//                    return userInput;
//                } else {
//                    System.out.println("Number not in range!");
//                    return getInteger(min, max);
//                }
//            }
//        }








