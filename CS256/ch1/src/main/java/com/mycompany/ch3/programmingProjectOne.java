package com.mycompany.ch3;

import java.util.Scanner;

public class programmingProjectOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first complex number: ");
        double a = input.nextDouble();
        double b = input.nextDouble();

        Complex c1 = new Complex(a, b);

        System.out.print("Enter the second complex number: ");
        double c = input.nextDouble();
        double d = input.nextDouble();

        Complex c2 = new Complex(c, d);

        System.out.println("("+c1 + ")"+ " + "+ "("+ c2 + ")"+ " = "+ c1.add(c2));
        System.out.println("("+ c1 + ")"+ " -"+ "("+ c2 + ")"+ " = "+ c1.subtract(c2));
        System.out.println("("+ c1 + ")"+ " * "+ "("+ c2 + ")"+ " = "+ c1.multiply(c2));
        System.out.println("("+ c1 + ")"+ " / "+ "("+ c2 + ")"+ " = "+ c1.divide(c2));
        System.out.println("|"+ c1 + "| = "+ c1.abs());

        Complex c3 = (Complex)c1.clone();
        System.out.println(c1 == c3);
        System.out.println(c3.getRealPart());
        System.out.println(c3.getImaginaryPart()); 
    }

    class Complex{
        double realPart;
        double imagePart;

        public Complex(double a, double b){
            realPart = a;
            imagePart = b;

        }
        public Complex(double a){


        }
        public Complex(){


        }
        public double getRealPart(){
            return this.realPart;

        }
        public double getImaginaryPart(){
            return this.imagePart;
        }
        public double add(){
            int sum = 0;
            return sum;

        }
        
    }
}