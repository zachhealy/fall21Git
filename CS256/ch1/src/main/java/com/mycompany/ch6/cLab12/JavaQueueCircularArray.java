package com.mycompany.ch6.cLab12;

import java.util.Scanner;

/*  
Author:  Prof Ziping & Zach Healy
Date: 11/10/2021
Purpose: Test program using queues to help learn how they work.
*/
public class JavaQueueCircularArray {

    public static void main(String[] args) {
        Queue q1 = new Queue();
        System.out.println("Queue created. Empty? " + q1.empty());
        
        System.out.println("How many elements to add to the queue?");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        
        for(int i = 1; i < num + 1; i++)
            q1.enqueue(i*100);
        
        System.out.println("Contents of Queue:\n" + q1.toString());
        System.out.println("Queue Empty? " + q1.empty());
        
        System.out.println("Front value in q1: " + q1.front());
        System.out.println("Back value in q1: " + q1.back()); //Code to test back();

        if(search(300, q1))
            System.out.println("found the item 300");
        else
            System.out.println("item 300 not found");
        
        if(search2(500, q1))
            System.out.println("found the item 500");
        else
            System.out.println("item 500 not found");        
        
        while (!q1.empty())
        {
            System.out.println("Remove front -- Queue contents: ");
            q1.dequeue();
            System.out.println(q1.toString());
        }
        
        System.out.println("Queue Empty? " + q1.empty());
        System.out.println("Now try to retrieve front value in q1: ");
        try{
            System.out.println("Front value in q1: " + q1.front());
        }
        catch(EmptyQueueException ex){
            System.out.println(ex);
        }
        
        System.out.println("Now Try to remove front of q1: ");
        try{
            q1.dequeue(); 
        }
        catch(EmptyQueueException ex){
            System.out.println(ex);
        }        
    }
    
    public static boolean search(int item, Queue Q) 
    {
        Queue qCopy;
        qCopy = (Queue)Q.clone();
       
        while(!qCopy.empty() && qCopy.front() != item)
            qCopy.dequeue();
        
        return !qCopy.empty();  
    }   
    
    public static boolean search2(int item, Queue Q) 
    {
        for(Object num: Q)
            if((Integer)num == item)
                return true;
        
        return false;  
    }  
    
}
