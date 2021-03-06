package com.mycompany.ch9.cLab15;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.*;

/**
 *
 * @author ziping
 */
public class LinkedList<T extends Comparable<T>>{   
    private Node<T> first;

    // constructor: create an empty linkedlist
    public LinkedList() {
        first = null;
    }

    // returns true if the linkedlist is empty
    public boolean isEmpty() {
        return first == null;
    }

    // returns the contents of the linkedlist
    public String toString()
    {
        StringBuffer result = new StringBuffer();
        for(Node cursor = first; cursor != null; cursor = cursor.next)
          result.append(cursor.data + ", ");

        return result.toString();
    }

    //inserts a value into a LinkedList in ascending order
    public void insert(T item){
        //empty list
        if(first == null){
            first = new Node<T>(item, null);
            return;
        }
        
        //insert at the front
        if(item.compareTo(first.data) < 0){
            Node<T> newNode = new Node<T>(item, first);
            first = newNode;
            return;
        }
        
        //insert at middle or at back
        Node<T> cursor = first;
        while(cursor.next != null && cursor.next.data.compareTo(item) < 0) 
            cursor = cursor.next;

        cursor.next = new Node<T>(item, cursor.next);      
    }
 
    //removes a value from the LinkedList
    public void remove(T item)
    {
        if(first == null)
           throw new RuntimeException("cannot delete");

        if( first.data.equals(item) ){
           first = first.next;
           return;
        }

        Node<T> cur  = first;
        Node<T> prev = null;
        while(cur != null && !cur.data.equals(item) ){
            prev = cur;
            cur = cur.next;
        }

        if(cur == null)
            throw new RuntimeException("cannot delete");

        //delete cur node
        prev.next = cur.next;
    }
   
    /*
      A static nested class may be instantiated without instantiating its outer class.
      Inner classes can access both static and non-static members of the outer class. 
      A static class can access only the static members of the outer class.
    */    
    // Node class
    private static class Node<T>
    {
        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next){
            this.data = data;
            this.next = next;
        }
    }    
}