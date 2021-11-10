package com.mycompany.ch6.cLab13;



import java.util.Scanner;

public class closeLab13 {
    public static void main(String[] args) {
        Deque q1 = new Deque();

        System.out.println("Queue created. Empty? " + q1.empty());
        
        System.out.println("How many elements to add to the queue?");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        
        for(int i = 1; i < num + 1; i++)
            q1.push_back(i*100);
        
        System.out.println("Contents of Queue:\n" + q1.toString());
        System.out.println("Queue Empty? " + q1.empty());
        
        System.out.println("Front value in q1: " + q1.front());
        System.out.println("Back value in q1: " + q1.back());

        q1.push_front(600);
        
        System.out.println("Front value in q1: " + q1.front());

        
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
            q1.pop_front(); 
        }
        catch(EmptyQueueException ex){
            System.out.println(ex);
        }     

        q1.pop_back();
        System.out.println("Remove back elemnt: ");
        System.out.println(q1.toString());

    }
    
    public static boolean search(int item, Deque q1) 
    {
        Deque qCopy;
        qCopy = (Deque)q1.clone();
       
        while(!qCopy.empty() && qCopy.front() != item)
            qCopy.pop_front();
        
        return !qCopy.empty();  
    }   
    
    public static boolean search2(int item, Deque q1) 
    {
        for(Object num: q1)
            if((Integer)num == item)
                return true;
        
        return false;  
    }  
}


