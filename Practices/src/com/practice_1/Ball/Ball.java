package com.practice_1.Ball;

import java.lang.*;
public class Ball {
    private String color;
    private double radius;
    public Ball(String n, double a){
        color = n;
        radius = a;
    }
    public Ball(){
        color = "Black";
        radius = 1;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor() {
        return this.color;
    }

    @Override
    public String toString(){
        return this.color+", radius "+this.radius;
    }

}