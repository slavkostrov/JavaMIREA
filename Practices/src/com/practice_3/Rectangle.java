package com.practice_3;

public class Rectangle extends Shape{

    protected double width;
    protected double length;

    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width*this.length;
    }
    @Override
    public double getPerimetr() {
        return 2*this.length+2*this.width;
    }

    @Override
    public String toString() {
        return "Shape: rectangle, width: "+this.width+", length: "+this.length+", color: "+this.color;
    }
}
