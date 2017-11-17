import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i++);
//        }


//        long x = 2;
//        do {
//            System.out.println(x);
//            x *= x;
//        } while (x < 1000000);





//        boolean flag = true;
//
//        for(int i=0;i<=100;i++){
//            if(i%3==0){
//                System.out.println("Fizz");
//                flag=false;
//            }
//
//            if(i%5==0){
//                System.out.println("Buzz");
//                flag=false;
//            }
//
//            if (i % 15 == 0)
//            {
//                System.out.println("FizzBuzz");
//            }
//
//            if (flag)
//                System.out.println(i);
//
//            flag = true; }





        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while(choice.equalsIgnoreCase("y"))
        {

            System.out.println("Enter an Integer: ");
            int integerNext = sc.nextInt();

            System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");
            System.out.println("======" + "  " + "======" + "  " + "======");

            for(int i = 1; i <= integerNext; i++)
            {
                i = integerNext;
                int numberSquared = (int) Math.pow(i, 2);
                int numberCubed = (int) Math.pow (i, 3);

                String message = "\n" + i + "       " + numberSquared + "       " + numberCubed;

                System.out.println(message);
                System.out.println();

                // see if the user wants to continue
                System.out.print("Continue? (y/n): ");
                choice = sc.next();
                System.out.println();
            }
        }








    }
}
















