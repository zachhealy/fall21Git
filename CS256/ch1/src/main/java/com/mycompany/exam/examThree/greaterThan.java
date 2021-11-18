package com.mycompany.exam.examThree;

import java.util.Stack;

class greaterThan{
    public static void main(String[] args) {
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        s1.add(10);
        s1.add(20);
        s2.add(3);
        s2.add(5);

        Stack s3 = (Stack<Integer>) s1.clone();
        Stack s4 = (Stack<Integer>) s2.clone();

        boolean greater = isGreaterThan(s3, s4);

        System.out.println("Is S1 greater? " + greater);
    }
    public static boolean isGreaterThan(Stack s1, Stack s2){
        int sum1 = 0;
        int sum2 = 0;

        while(!s1.isEmpty()){
            sum1 += (int) s1.pop();
        }
        while(!s2.isEmpty()){
            sum2 += (int) s2.pop();
        }
        return sum1 > sum2;
    }


}