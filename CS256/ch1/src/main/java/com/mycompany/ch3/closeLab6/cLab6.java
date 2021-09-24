package com.mycompany.ch3.closeLab6;
/*  
Author: Zach Healy
Date: 9/24/2021
Purpose: 
*/

public class cLab6 {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1(5);
        Circle1 circle2 = new Circle1(4);
        Circle1 circle = (Circle1)GeometricObject1.max(circle1, circle2);
        System.out.println("The max circle's radius is " + circle.getRadius());
        System.out.println(circle);
    }
}
abstract class GeometricObject1 implements Comparable {
    public static Circle1 max(Circle1 c1, Circle1 c2){
        return c1.compareTo(c2);

    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
class Circle1 extends GeometricObject1 { 
    private double radius;

    Circle1(double rad){
        radius = rad;

    }
    public double getRadius() {
        return radius;
    }

    @Override
    public Circle1 compareTo(Circle1 o) {
        if radius > o.getRadius();
    }
    @Override
    public double getArea() {
        return 3.14 * (radius * radius);
    }
    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }
}
class Rectangle1 extends GeometricObject1 {
    private double width;
    private double height;

    public Rectangle1(double w, double h){
        width = w;
        height = h;

    }
    public Rectangle1(){
        width = 0;
        height = 0;

    }

    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public void setWidth(double w) {
        width = w;
    }
    public void setHeight(double h) {
        height = h;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return width + width + height + height;
    }

}