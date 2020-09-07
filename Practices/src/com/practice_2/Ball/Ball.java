package com.practice_2.Ball;

public class Ball {
    private double x;
    private double y;

    public double getSpeed() {
        return speed;
    }

    private double speed;
    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Ball(){
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(double xdisp, double ydisp){
        this.x += xdisp;
        this.y += ydisp;
    }

    public void SetXYSpeed(double speed){
        this.speed = speed;
    }

    @Override
    public String toString(){
        return "Ball: (" + this.x + ", " + this.y + ")";
    }
}
