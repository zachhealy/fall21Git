package com.mycompany.ch2.cLab3;

/*  
Author: Zach Healy
Date: 9/3/2021
Purpose: Create the MyInteger class and use it to test various aspects of an assigned number..
*/

public class clab3 {
    public static void main(String[] args) {
        MyInteger n1 = new MyInteger(5);
        System.out.println("n1 is even? "+ n1.isEven());
        System.out.println("n1 is prime? "+ n1.isPrime());
        System.out.println("15 is prime? "+ MyInteger.isPrime(15));

        char[] chars = {'3', '5', '3', '9'};
        System.out.println(MyInteger.parseInt(chars));
        String s = "3539";
        System.out.println(MyInteger.parseInt(s));

        MyInteger n2 = new MyInteger(24);
        System.out.println("n2 is odd? "+ n2.isOdd());
        System.out.println("45 is odd? "+ MyInteger.isOdd(45));
        System.out.println("n1 is equal to n2? "+ n1.equals(n2));
        System.out.println("n1 is equal to 5? "+ n1.equals(5));
    }
    static class MyInteger{
        private int value;

        public MyInteger(int num){
            value = num;

        }
        
        public int getValue() {
            return value;

        }
        public boolean isEven() {
            if (value%2 != 0 ){
                return false;

            }else{
                return true;
            }

        }
        public boolean isOdd() {
            if (value%2 == 0 ){
                return true;

            }else{
                return false;
            }

        }
        public boolean isPrime() {
            for (int i = 2; i <= value; i++){
                if (value % i == 0){
                    return false;
                    
                }
            }
            return true;
        }
        public static boolean isEven(int x) {
            if (x % 2 != 0 ){
                return false;

            }else{
                return true;
            }

        }
        public static boolean isOdd(int x) {
            if (x % 2 == 0 ){
                return false;

            }else{
                return true;
            }

        }
        public static boolean isPrime(int x) {
            for (int i = 2; i <= x; i++){
                if (x % i == 0){
                    return false;
                    
                }
            }
            return true;
        }
        public boolean equals(int x){
            if(x == value){
                return true;

            }else{
                return false;
            }

        }
        public static int parseInt(char[] list){
            return parseInt(new String(list));

        }
        public static int parseInt(String string){
            return Integer.parseInt(string);
        }


    }
}
