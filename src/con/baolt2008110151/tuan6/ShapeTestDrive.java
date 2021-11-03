package com.baolt2008110151.tuan6;

public class ShapeTestDrive {
    public static void main(String[] args){
        Circle circle = new Circle("gonna never get you up");
        circle.rotate();
        circle.playSound();

        Square square = new Square("gonna never let you down");
        square.rotate();
        square.playSound();

        Triangle triangle = new Triangle("Never gonna run around and desert you");
        triangle.rotate();
        triangle.playSound();
    }
}
