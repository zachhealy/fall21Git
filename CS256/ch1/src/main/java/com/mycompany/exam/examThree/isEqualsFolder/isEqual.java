package com.mycompany.exam.examThree.isEqualsFolder;

/**
 * Write a Java public static general method which doesn't belong to 
 * Queue class(assuming the Queue type is Book):
 * boolean isEqual(Queue Q1, Queue Q2) that compares Q1 and Q2 to check 
 * if both have the same books in the same order. After the method is called, 
 * both Q1 and Q2 should stay the same as what they are before the method is called 
 * -- Q1 and Q2 shouldn't be changed.  (You are only allowed to use the 
 * Queue class which has constructors, enqueue, dequeue, front, isEmpty, size, 
 * toString, and clone methods)
**/


public class isEqual {
    public static void main(String[] args) {
        Queue Q1 = new Queue();
        Queue Q2 = new Queue(); 

        Q1.enqueue("Ready Player One");
        Q1.enqueue("The Giver");
        Q2.enqueue("Ready Player One");
        Q2.enqueue("The Giver");
        Queue Q3 = (Queue) Q1.clone();
        Queue Q4 = (Queue) Q2.clone();

        boolean equal = isEqual(Q3, Q4);
        System.out.println("Are these queue's equal? " + equal);


    }
    static boolean isEqual(Queue Q1, Queue Q2){
        while(!Q1.empty() || !Q2.empty()){
            if(Q1.front().equals(Q2.front())){
                Q1.dequeue();
                Q2.dequeue();
            }else{
                return false;
            }

        }
        return true;
    }
   
}

