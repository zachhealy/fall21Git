package com.mycompany.ch2;

public class clab3 {
    public static void main(String[] args) {
        MyInteger n1 = newMyInteger(5);
        System.out.println("n1 is even? "+ n1.isEven());
        System.out.println("n1 is prime? "+ n1.isPrime());
        System.out.println("15 is prime? "+ MyInteger.isPrime(15));

        32char[] chars = {'3', '5', '3', '9'};
        System.out.println(MyInteger.parseInt(chars));
        String s = "3539";
        System.out.println(MyInteger.parseInt(s));

        MyInteger n2 = newMyInteger(24);
        System.out.println("n2 is odd? "+ n2.isOdd());
        System.out.println("45 is odd? "+ MyInteger.isOdd(45));
        System.out.println("n1 is equal to n2? "+ n1.equals(n2));
        System.out.println("n1 is equal to 5? "+ n1.equals(5));
    }
    class MyInteger{
        

    }
}
