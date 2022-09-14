package com.tw.step.bootcamp.assignment1;

public class Rectangle {
    private final double length;
    private final double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return this.length * this.breadth ;
    }
}
