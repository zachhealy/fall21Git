package com.mycompany.exam.examThree;

public class tenFolds {
    public static void main(String[] args) {
        
    }
    public static boolean checkArraySym(int [ ] A, int first, int last){
        if(first == last){
            return true;

        }
        if(A[last]/A[first] == 10) {
            checkArraySym(A, first + 1, last - 1);
        }else{
            return false;

        }
        return true;
        
    }
}
