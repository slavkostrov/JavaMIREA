package com.practice_3;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        this.width = side;
        this.length = side;
    }

    public Square(double side, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.width = side;
        this.length = side;
    }

    public double getSide(){
        return this.width;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public String toString() {
       return "Shape: square, side: "+this.width+", color: "+this.color;
    }
}
