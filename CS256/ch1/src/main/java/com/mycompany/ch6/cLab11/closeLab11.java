package com.mycompany.ch6.cLab11;

/*  
Author: Zach Healy
Date: 11/3/2021
Purpose: Write various recursive functions and test them.
*/

import java.util.ArrayList;

public class closeLab11 {
    public static void main(String[] args) {
        char c = '*';
        int n = 5;
        int m = 5;
        String s = "HELLO";
        ArrayList al = new ArrayList<Integer>();

        al.add(n);
        al.add(m);
        al.add(n);
        al.add(m);

        System.out.println("writeLine output: ");
        writeLine(c, n);

        System.out.println();
        System.out.println("writeBlock output: ");
        writeBlock(c, n, m);

        System.out.println();
        System.out.println("writeBackwards output: ");
        writeBackwards(s, n);

        System.out.println();
        System.out.println();
        System.out.println("displayArrayList output: ");
        displayArrayList(al, 0, 4);

        System.out.println();
        System.out.println("vowels output: ");
        System.out.println(vowels(s, n));

        System.out.println();
        System.out.println("reverseString output: ");
        reverseString(s);

        System.out.println();
    }

    public static void writeLine(char c, int n) {
        if (n != 0) {
            System.out.print(c);
            writeLine(c, n - 1);

        } else {
            System.out.println();
        }
    }

    public static void writeBlock(char c, int n, int m) {
        if (m != 0) {
            writeLine(c, n);
            writeBlock(c, n, m - 1);

        }
    }

    public static void writeBackwards(String s, int n) {
        if (n != 0) {
            System.out.print(s.charAt(n - 1));
            writeBackwards(s, n - 1);
        }
    }

    public static void displayArrayList(ArrayList a, int first, int last) {
        if(first >= last){
            return;

        }else{
            System.out.println(a.get(first));
            displayArrayList(a, first + 1, last);

        }
    }

    public static int vowels(String s, int size) {
        s.toUpperCase();
        if (size == 0) {
            return 0;
        }
        if (s.charAt(size - 1) == 'A' || s.charAt(size - 1) == 'E' 
        || s.charAt(size - 1) == 'I' || s.charAt(size - 1) == 'O' || s.charAt(size - 1) == 'U') {
            return 1 + vowels(s.substring(0, size-1), size - 1);

        }
        return vowels(s.substring(0, size-1), size - 1);

    }


    public static void reverseString(String s) {
        if (s.length() != 0) {
            System.out.print(s.charAt(s.length() - 1));
            reverseString(s.substring(0, s.length() - 1));
        }
    }
}
