package com.mycompany.ch6.hw7;

/* 
Author: Zach Healy
Problem: 18.3
Description: Takes two numbers and outputs the greatest common denominator
*/

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        int m, n;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a digit: ");
        m = input.nextInt();
        System.out.println("Enter another digit: ");
        n = input.nextInt();

        int gcd = gcd(m, n);

        System.out.println("GCD is " + gcd);

    }

    public static int gcd(int m, int n) {
        if (m % n == 0) {
            return n;

        } else {
            return gcd(n, m % n);

        }

    }
}
