package com.mycompany.ch6.hw7;

import java.util.Scanner;

/* 
Author: Zach Healy
Problem: 18.10
Description: Counts the number of times a character is in a string
*/

public class count {
    public static void main(String[] args) {
        String str;
        char a;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        str = input.nextLine();
        System.out.print("Enter a Character: ");
        a = input.next().charAt(0);

        System.out.println(count(str, a));
    }

    public static int count(String str, char a) {
        int count = 0;

        if (str.length() == 0) {
            return 0;

        }

        if (str.charAt(0) == a) {
            count = count + 1;

        }
        return count + count(str.substring(1), a);
    }
}
