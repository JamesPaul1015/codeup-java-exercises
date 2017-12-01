package shapes;

public class Rectangle extends Quadralateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return length * 2  + width * 2;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }
}





































//package shapes;
//
//import java.util.Scanner;
//
//public class Rectangle {
//    // Declarations for the width and length that are public and will be available globally
//    public int width = 0;
//    public int height = 0;
//
//    // Constructor for objects of class Rectangle
//    public Rectangle(int w, int h) {
//        width = w;  // Set the the length and width.
//        height = h;
//
//    }
//    // a method for computing the area of the rectangle or square and return the value to print
//    public int getArea() {
//        return width * height;
//    }
//    // a method for computing the area of the rectangle or square and return the value to print
//    public int getPerimeter() {
//        return (2 * height) + (2 * width);
//
//    }
//}





























//public class Rectangle {
//
//
//    public Rectangle(int answer1, int answer2) {
//    }
//
//    public static void main(String args[]) {
//            int length, width, area, perimeter;
//
//            Scanner in = new Scanner(System.in);
//            System.out.print("\nEnter length of Rectangle: ");
//            length = in.nextInt();
//            System.out.print("Enter width of Rectangle: ");
//            width = in.nextInt();
//            // area = length x width
//            area = length*width;
//            // perimeter = 2 x length + 2 x width
//            perimeter = 2*(length + width);
//            System.out.println("The Area of the Rectangle : "+ area);
//            System.out.println("The Perimeter of the Rectangle : "+ perimeter);
//        }
//
//    public int getArea() {
//        int area = 0;
//        return area;
//    }
//
//    public int getPerimeter() {
//        int perimeter = 0;
//        return perimeter;
//    }
//}

