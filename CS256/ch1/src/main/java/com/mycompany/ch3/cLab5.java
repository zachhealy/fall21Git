package com.mycompany.ch3;

public class cLab5 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1.0, 1.5, 1.0);
        triangle.setColor("yellow");
        triangle.setFilled(true);
        System.out.println(triangle);
        System.out.println("The area is " + triangle.getArea());
        System.out.println("The perimeter is "+ triangle.getPerimeter());
        System.out.println(triangle);
    }
}
public abstract class GeometricObject {
        private String color = "White";
        private boolean filled;
        private java.util.Date dateCreated;

        protected GeometricObject(){
            dateCreated = new java.util.Date();  
        }
        protected GeometricObject(String color, boolean filled){
            dateCreated = new java.util.Date();
            this.color = color;
            this.filled = filled;
            
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public boolean isFilled() {
            return filled;
        }
        public void setFilled(boolean filled) {
            this.filled = filled;
        }
        public java.util.Date getDateCreated() {
            return dateCreated;
        }
        @Override
        public String toString() {
            return "Created on " + dateCreated + "\ncolor: " + color + 
                " and filled: " + filled;
        }
        public abstract double getArea();
        public abstract double getPerimenter();
}
class Triangle extends GeometricObject{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public void Triangle(){
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }
    public void Triangle(double nSide1, double nSide2, double nSide3){
        side1 = nSide1;
        side2 = nSide2;
        side3 = nSide3;

    }
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }
    @Override
    public double getArea() {
        double height = 2 * (side1 * side2);
        return (side1 * height)/2;  
    }
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    public String toString(){
        return "Triangle: Side 1 =" + side1 + " side 2 = " + side2 + " side 3 " + side3;
        
    }

}

