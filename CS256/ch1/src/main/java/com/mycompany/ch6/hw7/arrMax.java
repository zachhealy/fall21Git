package com.mycompany.ch6.hw7;

import java.util.Scanner;
import java.lang.Math;

public class arrMax {
    public static void main(String[] args) {
        int a[] = new int[8];
        int size = a.length;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 8 digits: ");
        for (int i = 0; i < 8; i++) {
            a[i] = input.nextInt();

        }
        System.out.println(arrMax(a, size));

    }

    public static int arrMax(int a[], int size) {
        if (size == 1) {
            return a[0];
        }
        return Math.max(a[size - 1], arrMax(a, size - 1));
    }
}
