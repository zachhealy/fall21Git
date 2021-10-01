package com.mycompany.ch3.closeLab7.homework4;

import java.util.*;

public class hw4pt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();

        bin2Dec(binary);

    }

    private static int bin2Dec(String binaryString) throws BinaryFormatException {
        if (!isBinary(binaryString)) {
            throw new BinaryFormatException(binaryString);
        }

        int dec = Integer.parseInt(binaryString, 2);
        System.out.println(binaryString + " in decimal is " + dec);
        return 0;

    }

    public static boolean isBinary(String binary) {
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) != '1' && binary.charAt(i) != '0')
                return false;
        }
        return true;

    }

    public static class BinaryFormatException extends IllegalArgumentException {
        public BinaryFormatException(String error) {
            super("Invalid input");

        }

    }
}
