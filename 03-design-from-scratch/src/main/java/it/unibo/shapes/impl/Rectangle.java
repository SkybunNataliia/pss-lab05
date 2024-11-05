package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Rectangle implements Polygon {

    private final static int EDGE = 4;
    private final double length;
    private final double width;

    public Rectangle(final double l, final double w) {
        this.length = l;
        this.width = w;
    }

    public int getEdgeCount() {
        return EDGE;
    }

    public double calculateArea() {
        return this.length*this.width;
    }

    public double calculatePerimeter() {
        return 2*this.length + 2*this.width;
    }
}
