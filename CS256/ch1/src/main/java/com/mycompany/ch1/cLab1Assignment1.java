package com.mycompany.ch1;
/*  
Author: Zach Healy
Date: 8/24/2021
Purpose: Calculate the Diameter, Circumference, and Area of a circle when given radius.
*/
import java.util.Scanner;
public class cLab1Assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of your circle");
        int rad = input.nextInt(); //stores user input as radius

        System.out.println("The Diameter = " + rad * 2);
        System.out.println("The Circumference = " + 2 * 3.14 * rad);
        System.out.println("The Area = " + 2.14 * (rad * rad));
    }
}

