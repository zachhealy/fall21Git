package com.mycompany.ch2.cLab4;

import java.lang.Math;

/*  
Author: Zach Healy
Date: 9/9/2021
Purpose: Create a class that will define if a circle is contained or overlaps another
         as well as being able to print out area, permieter, and other information.
*/

public class cLab4{
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("Area is "+ c1.getArea());
        System.out.println("Perimeter is "+ c1.getPerimeter());
        System.out.println(c1.contains(3, 3));
        System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}
class Circle2D {
    private double radius;
    private double x;
    private double y;

    Circle2D(){
        x = 0;
        y = 0;
        radius = 1;

    }
    Circle2D(double newX, double newY, double newRad){
        x = newX;
        y = newY;
        radius = newRad;

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return 3.14 * (radius*radius);

    }
    public double getPerimeter(){
        return 2 * 3.14 * radius;

    }
    private double getDistance(double x2, double y2){
        double dist = Math.sqrt(Math.pow((y2 - y), 2) + Math.pow((x2 - x), 2));
        return dist;
        
    }
    public boolean contains(double testX, double testY){
        if(getDistance(testX, testY) <= radius){
            return true;

        }
        return false;

    }
    public boolean contains(Circle2D circle){
        if(getDistance(circle.getX(), circle.getY()) + circle.getRadius() <= radius){
            return true;

        }
        return false;
    }
    
    public boolean overlaps(Circle2D circle){
        if(getDistance(circle.getX(), circle.getY()) <= circle.getRadius() + radius){
            return true;

        }
        return false;

    }

}

