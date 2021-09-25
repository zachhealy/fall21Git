package com.mycompany.ch3.closeLab6;
/*  
Author: Zach Healy
Date: 9/24/2021
Purpose: Create circles and rectangles, then compare them in size
*/

public class cLab6 {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1(5);
        Circle1 circle2 = new Circle1(4);
        Rectangle1 rectangle1 = new Rectangle1(3, 4);
        Rectangle1 rectangle2 = new Rectangle1(1, 2);

        Circle1 circle = (Circle1)GeometricObject1.max(circle1, circle2);
        Rectangle1 rectangle = (Rectangle1)GeometricObject1.max(rectangle1, rectangle2);

        System.out.println("The max circle's radius is " + circle.getRadius());
        System.out.println(circle);
        System.out.println("The max rectangle's area is " + rectangle.getArea());
        System.out.println(rectangle);
    }
}
abstract class GeometricObject1 implements Comparable<GeometricObject1>{
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
	public int compareTo(GeometricObject1 o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	public static GeometricObject1 max(GeometricObject1 o1, GeometricObject1 o2) {
		return o1.compareTo(o2) == 1 ? o1 : o2;
	}

}
class Circle1 extends GeometricObject1 { 
    private int radius;
    
    public Circle1(int rad){
        radius = rad;

    }
    public int getRadius() {
        return radius;
    }
    @Override
    public double getArea() {
        return 3.14 * (radius * radius);
    }
    @Override
    public double getPerimeter() {
        return 3.14 * radius * 2;
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
    public double getArea() {
        return height * width;
    }
    @Override
    public double getPerimeter() {
        return height + height + width + width;
    }
    
}