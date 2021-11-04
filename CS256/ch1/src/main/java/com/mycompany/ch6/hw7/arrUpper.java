package com.mycompany.ch6.hw7;

import java.util.Scanner;

public class arrUpper {
    public static void main(String[] args) {
        char a[] = new char [10];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a series of characters for an array: ");
        for(int i = 0; i < a.length; i++) {
            a[i] = input.next().charAt(0);
            
        }
        System.out.println(count(a));
    
    }
    public static int count(char[] chars) {
        return count(chars, chars.length);

    }
    public static int count(char[] chars, int high){
        if(high == 0){
            return 0;

        }else if(Character.isUpperCase(chars[high - 1])){
            return 1 + count(chars, high - 1);

        }else{
            return count(chars, high - 1);

        }

    }
}

