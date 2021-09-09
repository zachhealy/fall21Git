package com.mycompany.ch2;

public class cLab4 {
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
    public boolean contains(double testX, double testY){
        if(testX < x && testY < y){
            return false;

        }
        return true;

    }
    public boolean contains(Circle2D circle){
        if(circle.getX() < x && circle.getY() < y && circle.getRadius() < radius){
            return true;

        }
        return false;
    }
    
    public boolean overlaps(Circle2D circle){
        if(circle.getX() > x || circle.getY() > y){
            return false;

        }
        return true;

    }

}

