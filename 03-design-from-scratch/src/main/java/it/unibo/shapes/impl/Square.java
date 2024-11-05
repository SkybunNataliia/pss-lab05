package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Square implements Polygon {

    private final static int EDGE = 4;
    private final double side;

    public Square(final double s) {
        this.side = s;
    }

    public int getEdgeCount() {
        return EDGE;
    }

    public double calculateArea() {
        return this.side*this.side;
    }

    public double calculatePerimeter() {
        return 4*this.side;
    }
}
