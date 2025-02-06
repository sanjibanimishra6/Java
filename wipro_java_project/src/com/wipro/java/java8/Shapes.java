package com.wipro.java.java8;

interface TestInterface {
    // Abstract method
    public void Rectangle(int l, int w);

    // Default methods
    default double Triangle(int base, int height) {
        double area = 0.5 * base * height;
        return area;
    }

    default double Circle(int rad) {
        double ar = Math.PI * rad * rad; // Corrected formula for area of a circle
        return ar;
    }
//Static methods
    static String Display() {
        return "The shapes are Rectangle, Triangle, and Circle";
    }

    static String information() {
        return "Here we calculated the area of the above shapes";
    }
}

public class Shapes implements TestInterface {

    @Override
    public void Rectangle(int l, int w) {
        double area = l * w;
        System.out.println("Area of the rectangle is: " + area);
    }

    public static void main(String[] args) {
        Shapes s = new Shapes();
        s.Rectangle(4, 5);
        
        // Print the results of default methods
        System.out.println("Area of the traiangle is: " + s.Triangle(6, 8));
        System.out.println("Area of the circle is: " + s.Circle(10));

        // Print static methods
        System.out.println(TestInterface.Display());
        System.out.println(TestInterface.information());
    }
}

	


