import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int num1;
                int num2;

                System.out.print("Enter the first number:");
                num1 = input.nextInt ();
                System.out.print("Enter the second number:");
                num2 = input.nextInt ();
                System.out.println("Your Math Table is : ");

                System.out.println("========================");
                System.out.println("Addition: " + num1 + " + " + num2 + " = " + (num1 + num2));
                System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + (num1 - num2));
                System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + (num1 * num2));
                System.out.println("Division: " + num1 + " % " + num2 + " = " + (num1 % num2));


            }
        }





