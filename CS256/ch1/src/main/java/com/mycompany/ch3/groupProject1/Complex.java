package com.mycompany.ch3.groupProject1;

import java.lang.Math;

public class Complex implements Cloneable{
    Double realPart;
    Double imagePart;

    public Complex(double a, double b){
        realPart = a;
        imagePart = b;

    }
    public Complex(double a){
        realPart = a;

    }
    public Complex(){
        realPart = 0.0;
        imagePart = 0.0;

    }
    public double getRealPart(){
        return this.realPart;

    }
    public double getImaginaryPart(){
        return this.imagePart;
    }
    public String add(Complex c){
        return (realPart + c.realPart) + " + " +  (imagePart + c.imagePart) + "i";

    }
    public String subtract(Complex c){
        return (realPart - c.realPart) + " + " + (imagePart - c.imagePart) + "i";

    }
    public String multiply(Complex c){
        return (realPart * c.realPart - imagePart * c.imagePart) + " + " + 
        (imagePart * c.realPart + realPart * c.imagePart) + "i";

    }
    public String divide(Complex x){
        double a = realPart;
        double b = imagePart;
        double c = x.realPart;
        double d = x.imagePart;
        double first = (a*c + d*b)/(Math.pow(c, 2) + Math.pow(d, 2));
        double second = (b*c - a*d) /(Math.pow(c, 2) + Math.pow(d, 2));
        return ((double)Math.round(first * 10000)/10000)  + " + " 
        + ((double)Math.round(second * 10000)/10000) + "i";

    }
    public double abs(){
        return Math.sqrt(Math.pow(realPart, 2) + Math.pow(imagePart, 2));

    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    @Override
    public String toString(){
        return "(" + realPart.toString() + " + " + imagePart.toString() + ")";
    }
}