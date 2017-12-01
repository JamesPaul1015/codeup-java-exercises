package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(5, 10);
        System.out.println("My rectangle's area is " + myShape.getArea());
        System.out.println("My rectangle's perimeter is " + myShape.getPerimeter());

        myShape = new Rectangle(8, 3);
        System.out.println("The second rectangle's area is " + myShape.getArea());
        System.out.println("The second rectangle's perimeter is " + myShape.getPerimeter());

        myShape = new Square(5);
        System.out.println("The square's area is " + myShape.getArea());
        System.out.println("The square's perimeter is " + myShape.getPerimeter());
    }
}





































//
//package shapes;
//
//import java.util.Scanner;
//
//public class ShapesTest {
//    public static void main (String [] args)
//
//    {
//        System.out.println("\nThis Application calculates the area & perimeter of a Rectangle or a Square.");
//        int answer;             //Declares the variables for the different inputs from the user
//        int answer1;
//        int answer2;
//        int answer3;
//        Scanner input = new Scanner(System.in);  // Scans or reads the inputs from the keyboard of user
//        // Do while loop for prompting the user until selecting to quit the application
//        do {
//            //Prompts user for calculating the Rectangle or Square
//            System.out.print("\nFor A Square Enter 1: ");          //prints out the choices on the screen for user
//            System.out.print("\nFor A Rectangle Enter 2: ");
//            System.out.print("\nOr To Quit The Application Enter 0: ");
//            answer = input.nextInt();                               // Read in values and place them to the variable "answer".
//            // Loop IF for different choice for either Rectangle or Square.
//
//            if (answer == 2)
//
//            {
//                System.out.println("\nYou have chosen a Rectangle!\n"); //prints out the rectangle choice
//                System.out.print("Enter the width of the rectangle: "); //prompts user to enter the width of rectangle
//                answer1 = input.nextInt();                              //reads in the input width of user and place it to variable answer1
//                System.out.print("Enter the length of the rectangle: ");//prompts user to enter the length of rectangle
//                answer2 = input.nextInt();                              // reads in the input length of user and place it to variable answer2
//
//                //Create Rectangle object rectangle1 and pass input values of width and length to contructor
//                Rectangle rectangle1 = new Rectangle(answer1, answer2);
//                int area   = rectangle1.getArea();                       //get methods for rectangle
//                int Perimeter = rectangle1.getPerimeter();
//                System.out.printf("\nIf the width is: %d\nAnd the length is: %d\n", answer1, answer2); //prints out the original input values
//                //These print out the return values for area and perimeter after calculations.
//                System.out.println("Then the Area of the Rectangle =   " +area);
//                System.out.println("And the Perimeter of the Rectangle =   "  +Perimeter);
//
//
//            }// Loop If for the user choosing the Square calculation
//            else if (answer == 1)
//
//            {
//                System.out.println("\nYou have chosen a Square!\n"); //prints out the rectangle choice
//                System.out.print("Enter the length of one side of the square: "); //prompts user for only one side of the square
//                answer3 = input.nextInt(); //read in input value
//                //Create Rectangle object rectangle1 and pass input values of width and length to contructor
//                Rectangle rectangle1 = new Rectangle(answer3, answer3);
//                //get methods for square.
//                int area   = rectangle1.getArea();
//                int Perimeter = rectangle1.getPerimeter();
//                //prints out the original width and length input by the user
//                System.out.printf("\nIf the width is: %d\nAnd the length is: %d\n", answer3, answer3);
//                //These print out the return values for area and perimeter after calculations of square.
//                System.out.println("Then the Area of the Square =   " +area);
//                System.out.println("Then the Perimeter of the Square =   "  +Perimeter);
//            } else
//                System.out.println("Please select either 1, 2, or 0\n"); //Ask the user again if wrongfully input different numbers
//
//        }while (answer != 0); //ends the loop if zero is selected by the user to quit.
//        //Prints out on the exit of the application.
//        System.out.println("You have exited the application. Thank You");
//
//
//
//    }
//
//}
























    //    public static void main (String [] args)
//
//    { System.out.println("\nThis Application calculates the area & perimeter of a Rectangle or a Square");
//        int answer;             //Declares the variables for the different inputs from the user
//        int answer1;
//        int answer2;
//        int answer3;
//
//        Scanner input = new Scanner(System.in);  // Scans or reads the inputs from the keyboard of user
//
//        // Do while loop for prompting the user until selecting to quit the application
//
//        do {
//            //Prompts user for calculating the Rectangle or Square
//            System.out.print("\nFor Square Enter '1'; ");          //prints out the choices on the screen for user
//            System.out.print("\nFor Rectangle Enter 2; ");
//            System.out.print("\nOr To Quit Application Enter '0': ");
//            answer = input.nextInt();                               // Read in values and place them to the variable "answer".
//            // Loop IF for different choice for either Rectangle or Square.
//            if (answer == 2) {
//                System.out.println("\nYou have chosen a Rectangle\nEnter the width: "); //prints out the rectangle choice
//                System.out.print("");                  //prompts user to enter the width of rectangle
//                answer1 = input.nextInt();                              //reads in the input width of user and place it to variable answer1
//                System.out.print("Enter the length: ");                 //prompts user to enter the length of rectangle
//                answer2 = input.nextInt();                              // reads in the input length of user and place it to variable answer2
//                //Create Rectangle object rectangle1 and pass input values of width and length to contructor
//                Rectangle rectangle1 = new Rectangle(answer1, answer2);
//                int area   = rectangle1.getArea();                       //get methods for rectangle
//                int Perimeter = rectangle1.getPerimeter();
//
//                System.out.println("\nYou have chosen a Rectangle");                        //prints out the chosen rectangle
//                System.out.printf("\nwidth is: %d, length is: %d\n", answer1, answer2); //prints out the original input values
//                //These prints out the return values for area and perimeter after calculations.
//
//                System.out.println("The Area =   " +area);
//                System.out.println("The Perimeter =   "  +Perimeter);
//            }
//
//
//
//            // Loop If for the user choosing the Square calculation
//            else if (answer == 1) {
//                System.out.println("\nYou have chosen a Square\nEnter one side of the square:");
//                System.out.print(" "); //prompts user for only one side of the square
//                answer3 = input.nextInt(); //read in input value
//
//
//
//                //Create Rectangle object rectangle1 and pass input values of width and length to contructor
//                Rectangle rectangle1 = new Rectangle(answer3, answer3);
//
//                //get methods for square.
//                int area   = rectangle1.getArea();
//                int Perimeter = rectangle1.getPerimeter();
//                //prints out the original width and length input by the user
//                System.out.printf("\nwidth is: %d, length is: %d\n", answer3, answer3);
//
//
//
//                //These prints out the return values for area and perimeter after calculations of square.
//                System.out.println("Equivalent Area is =   " +area);
//                System.out.println("Equivalent Perimeter is =   "  +Perimeter);
//
//            } else
//                System.out.println("Please select either 1, 2, or 0\n"); //Ask the user again if wrongfully input different numbers
//
//        }while (answer != 0); //ends the loop if zero is selected by the user to quit.
//
//        //Prints out on the exit of the application.
//        System.out.println("You have exited the application. Thank You");
//
//
//
//    }
//
//}

