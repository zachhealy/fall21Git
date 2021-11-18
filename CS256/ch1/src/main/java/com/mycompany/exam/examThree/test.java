package com.mycompany.exam.examThree;

import java.util.Stack;

class test{
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack();
        Stack<Integer> s2 = new Stack();
        s1.add(10);
        s1.add(20);
        s2.add(3);
        s2.add(5);

        Stack<Integer> s3 = (Stack<Integer>) s1.clone();
        Stack<Integer> s4 = (Stack<Integer>) s2.clone();

        boolean greater = isGreaterThan(s3, s4);

        System.out.println(greater);
    }
    public static boolean isGreaterThan(Stack s1, Stack s2){
        int sum1 = 0;
        int sum2 = 0;

        while(s1.size() > 0){
            sum1 = sum1 + (int) s1.pop();
        }
        while(s2.size() > 0){
            sum2 = sum2 + (int) s1.pop();
        }
        if(sum1 < sum2){
            return true;
        }else if(sum1 > sum2){
            return false;
        }else{
            return false;
        }
    }


}