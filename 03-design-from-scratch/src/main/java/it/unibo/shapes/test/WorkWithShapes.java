package it.unibo.shapes.test;

import it.unibo.shapes.impl.*;
import it.unibo.shapes.api.*;

public class WorkWithShapes {

    public static void main(String [] args) {

        Shape circle = new Circle(5, 10);
        Shape rectangle = new Rectangle(10, 5);
        Shape square = new Square(5);
        Shape triangle = new Triangle(10, 7, 7, 7);

        Shape[] shapes = {circle, rectangle, square, triangle};

        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName().toUpperCase());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println();
        }
    }
}
