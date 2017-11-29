package shapes;

import java.util.Scanner;

public class Square extends Rectangle
{

        // Contructor with the argument
    public Square(int w,int h)
    {
        super(w,h); //explicit call to superclass Rectangle cnstructor.
    }
    // a method for computing the area of the square
    public int getArea() {
        return width * height;
    }
    // a method for computing the area of the square
    public int getPerimeter() {
        return (2*height) + (2*width);

        }
        }

























//public class Square {
//    public static void main(String args[])
//    {
//        int side, peri, area;
//        Scanner scan = new Scanner(System.in);
//        System.out.print("\nPlease Enter the Length of One Side of A Square : ");
//        side = scan.nextInt();
//        area = side*side;
//        peri = 4*side;
//        System.out.print("The Area of the Square = " + area +"\nThe Perimeter of the Square = " + peri +"\n");
//
//    }
//}













//    public static void main(String[] args) {
//	try (Scanner scanner = new Scanner(System.in)) {
//            System.out.printf("1. Enter side of square : ");
//            double side = scanner.nextDouble();
//
//            //Area of square is side * side
//            double area = side * side;
//            //Print area up to two precision
//            System.out.printf("2. Area of square is : %4.2f",area);
//
//            //Area of square is side * side
//            double Perimeter = 4 * side;
//            //Print area up to two precision
//            System.out.printf("\n3. Perimeter of square is : %4.2f",Perimeter);
//            }
//            }
//            }
