package shapes;

import util.Input;


public class CircleApp {
    public static void main(String[] args) {
        System.out.println("Let's Make a Circle Together!");
        Input input = new Input();

        do {
            double radius = input.getInt("Please Provide a Radius for Your Circle: ");

            Circle myCircle = new Circle(radius);

            System.out.println("The Area of the Circle is: " + myCircle.getArea());

            System.out.println("The Circumference of the Circle is: " + myCircle.getCircumference());

        } while(input.yesNo("Would You Like to Make Another Circle? y/n"));

        int circleCount = Circle.getCircleCount();
        System.out.println("Thanks for Making Circles With Me!\nYou Created " + circleCount + " Circles.");
    }
}