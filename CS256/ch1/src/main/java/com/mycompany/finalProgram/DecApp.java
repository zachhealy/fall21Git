
package com.mycompany.finalProgram;

public class DecApp {
    public static void main(String[] args) {
        DecG<Book> ar = new DecG<>();
        ar.insert_second_last(new Book(111, "abbb")); 
        ar.insert_second_last(new Book(131, "aaaa"));
        ar.insert_second_last(new Book(121, "cccc")); 
        ar.insert_second_last(new Book(151, "abc1"));
        ar.insert_second_last(new Book(111, "abbb"));
        
        System.out.println("Making Copy... " + ar.copy().toString());

        System.out.println("Duplicate Items in the list = " + ar.duplicateItems());

        DecG<Book> ar2 = new DecG<>();
        ar2.insert_second_last(new Book(101, "semo1")); 
        ar2.insert_second_last(new Book(201, "semo2")); 
        ar2.insert_second_last(new Book(301, "semo3"));  
        ar2.insert_second_last(new Book(151, "abc1"));
        ar2.insert_second_last(new Book(111, "abbb"));   

        System.out.println(ar.isGreaterThan(ar2));
         
     
    }
    
}
