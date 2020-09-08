package com.practice_3;

public class MovableRectangle implements Movable{
    MovablePoint topLeft;
    MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    private boolean checkSpeed(){
        return topLeft.getxSpeed() == bottomRight.getxSpeed() && bottomRight.getySpeed() == topLeft.getySpeed();
    }

    @Override
    public String toString() {
        return "Rectangle: (TopLeft " + topLeft.toString() + ", BottomRight " + bottomRight.toString();
    }

    @Override
    public void moveDown() {
        if (checkSpeed())
            topLeft.moveDown();
            bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        if (checkSpeed())
            topLeft.moveLeft();
            bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        if (checkSpeed())
            topLeft.moveRight();
            bottomRight.moveRight();
    }

    @Override
    public void moveUp() {
        if (checkSpeed())
            topLeft.moveUp();
            bottomRight.moveUp();
    }
}
