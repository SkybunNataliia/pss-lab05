package it.unibo.shapes.test;

import it.unibo.shapes.impl.*;
import it.unibo.shapes.api.*;

public class WorkWithShapes {

    public static void main(String [] args) {

        Shape circle = new Circle(5, 10);
        Shape rectangle = new Rectangle(10, 5);
        Shape square = new Square(5);
        Shape triangle = new Triangle(10, 7, 7, 7);

        System.out.println("CIRCLE.");
        System.out.println("Area:");
        System.out.print(circle.calculateArea());
        System.out.println("Perimeter:");
        System.out.print(circle.calculatePerimeter());

        System.out.println("RECTANGLE.");
        System.out.println("Area:");
        System.out.print(rectangle.calculateArea());
        System.out.println("Perimeter:");
        System.out.print(rectangle.calculatePerimeter());

        System.out.println("SQUARE.");
        System.out.println("Area:");
        System.out.print(square.calculateArea());
        System.out.println("Perimeter:");
        System.out.print(square.calculatePerimeter());

        System.out.println("TRIANGLE.");
        System.out.println("Area:");
        System.out.print(triangle.calculateArea());
        System.out.println("Perimeter:");
        System.out.print(triangle.calculatePerimeter());
    }
}
