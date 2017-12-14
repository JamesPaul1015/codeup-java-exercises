package util;

//public class InputTest {
//    public static void main(String[] args) {
//        Input input = new Input();
//
//        System.out.println("Please input an integer");
//        int someInt = input.getInt();
//        System.out.println(someInt);
//
//        int someIntBetween = input.getInt(1, 100);
//        System.out.println(someIntBetween);
//
//
//        System.out.println("Please input a double");
//        double someDouble = input.getDouble();
//        System.out.println(someDouble);
//
//        double anotherDouble = input.getDouble(1.0, 20.0);
//        System.out.println(anotherDouble);
//
//        System.out.println("Please input yes or no");
//        String someString = input.getString();
//        if (input.yesNo()) {
//            System.out.println("You input yes or 'y'");
//        } else {
//            System.out.println("You said anything other than yes.");
//
//            System.out.println("You provided: " + someString);
//        }
//    }
//}

//        import java.util.Scanner;
//
//class InputTest
//{
//    public static void main(String args[])
//    {
//        Scanner s=new Scanner(System.in);
//
//        System.out.println("Enter a binary number:");
//        int n=s.nextInt();
//
//        int decimal=0,p=0;
//
//        while(n!=0)
//        {
//            decimal+=((n%10)*Math.pow(2,p));
//            n=n/10;
//            p++;
//        }
//
//        System.out.println(decimal);
//    }
//}

//import java.util.Scanner;
///*
// * Sample java source code convert hexadecimal to decimal
// */
//
//public class InputTest {
//
//    public static void main(String[] args) {
//        System.out.print("Hexadecimal Input:");
//        // read the hexadecimal input from the console
//        Scanner s = new Scanner(System.in);
//        String inputHex = s.nextLine();
//        try{
//            // actual conversion of hex to decimal
//            Integer outputDecimal = Integer.parseInt(inputHex, 16);
//            System.out.println("Decimal Equivalent : "+outputDecimal);
//        }
//        catch(NumberFormatException ne){
//            // Printing a warning message if the input is not a valid hex number
//            System.out.println("Invalid Input");
//        }
//        finally{
//            s.close();
//        }
//
//    }
//
//}