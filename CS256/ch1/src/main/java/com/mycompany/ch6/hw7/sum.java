package com.mycompany.ch6.hw7;

/* 
Author: Zach Healy
Problem: 18.6
Description: Writes the 1/2 + 2/3 ... + i/i+1 function
*/

public class sum {
    public static void main(String[] args) {
        System.out.println(m(1));
    }

    public static double m(double i) {
        if (i > 11) {
            return 0;

        } else {
            return (i / (i + 1) + m(i + 1));

        }

    }

}
