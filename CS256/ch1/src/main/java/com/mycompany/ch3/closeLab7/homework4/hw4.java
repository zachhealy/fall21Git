package com.mycompany.ch3.closeLab7.homework4;

import java.util.*;

public class hw4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();

        int decimal = bin2Dec(binary);

    }

    private static int bin2Dec(String binaryString) {
        int dec;
        try {
            dec = Integer.parseInt(binaryString, 2);
            System.out.println(binaryString + " in decimal is " + dec);
            return dec;

        } catch (NumberFormatException e) {
            System.out.println("Not a binary number.");

        }
        return 0;
    }

}