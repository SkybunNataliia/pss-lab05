package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Triangle implements Polygon {

    private final static int EDGE = 3;
    private final double base;
    private final double sideA;
    private final double sideB;
    private final double height;

    public Triangle(final double b, final double sa, final double sb, final double h) {
        this.base = b;
        this.sideA = sa;
        this.sideB = sb;
        this.height = h;
    }

    public int getEdgeCount() {
        return EDGE;
    }

    public double calculateArea() {
        return 1/2 * (this.base * this.height);
    }

    public double calculatePerimeter() {
        return this.base + this.sideA + this.sideB;
    }
}
