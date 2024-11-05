package it.unibo.shapes.impl;

import java.lang.Math;
import it.unibo.shapes.api.Shape;

public class Circle implements Shape {

    private final double radius;
    private final double diameter;

    public Circle(final double r, final double d) {
        this.radius = r;
        this.diameter = d;
    }

    public double calculateArea() {
        return Math.PI * this.radius*this.radius;
    }

    public double calculatePerimeter() {
        return Math.PI * this.diameter;
    }
}
