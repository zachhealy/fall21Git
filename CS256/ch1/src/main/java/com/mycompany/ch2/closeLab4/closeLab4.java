package com.mycompany.ch2.closeLab4;

import java.lang.Math;

/*  
Author: Zach Healy
Date: 9/9/2021
Purpose: Create a class that will define if a circle is contained or overlaps another
         as well as being able to print out area, permieter, and other information.
*/

public class closeLab4 {
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
    /*  
    Brief statement of Purpose: Declares a basic circle with no constuctors
    Preconditions: none
    Postconditions: defined x, y, radius
    */
    Circle2D(){
        x = 0;
        y = 0;
        radius = 1;
    }
    /*  
    Brief statement of Purpose: define circle when given x, y, radius
    Preconditions: given x, y, radius
    Postconditions: newly defined x, y, and radius for use throughout class
    */
    Circle2D(double newX, double newY, double newRad){
        x = newX;
        y = newY;
        radius = newRad;

    }
    /*  
    Brief statement of Purpose: returns X variable
    Preconditions: have an object
    Postconditions: return x
    */
    public double getX() {
        return x;
    }
    /*  
    Brief statement of Purpose: returns y variable
    Preconditions: have an object
    Postconditions: return y
    */
    public double getY() {
        return y;
    }
    /*  
    Brief statement of Purpose: returns radius
    Preconditions: have an object
    Postconditions: return radius
    */
    public double getRadius() {
        return radius;
    }
    /*  
    Brief statement of Purpose: calculate and return area
    Preconditions: have an object
    Postconditions: returns circle's area
    */
    public double getArea(){
        return 3.14 * (radius*radius);

    }
    /*  
    Brief statement of Purpose: calculate and return perimeter
    Preconditions: have an object
    Postconditions: return circle's perimeter
    */
    public double getPerimeter(){
        return 2 * 3.14 * radius;

    }
    /*  
    Brief statement of Purpose: calculate and return distance
    Preconditions: x and y of point on graph
    Postconditions: returns distance
    */
    private double getDistance(double x2, double y2){
        double dist = Math.sqrt(Math.pow((y2 - y), 2) + Math.pow((x2 - x), 2));
        return dist;
        
    }
    /*  
    Brief statement of Purpose: checks to see if point is contained inside of circle
    Preconditions: x and y variables
    Postconditions: returns if point is in circle or not
    */
    public boolean contains(double testX, double testY){
        if(getDistance(testX, testY) <= radius){
            return true;

        }
        return false;

    }
    /*  
    Brief statement of Purpose: checks to see if circle is inside another
    Preconditions: circle object
    Postconditions: returns if circle is inside another circle
    */
    public boolean contains(Circle2D circle){
        if(getDistance(circle.getX(), circle.getY()) + circle.getRadius() <= radius){
            return true;

        }
        return false;
    }
    /*  
    Brief statement of Purpose: checks to see if 2 circles intersect
    Preconditions: circle objects
    Postconditions: returns if the circles intersect
    */
    public boolean overlaps(Circle2D circle){
        if(getDistance(circle.getX(), circle.getY()) <= circle.getRadius() + radius){
            return true;

        }
        return false;

    }

}

