/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ch6.programmingProject4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ArrayList;
/**
 *
 * @author ziping
 */
public class Queue implements Cloneable,Iterable{
    private int mFront, mBack;
    private ArrayList<inventory> mArray;
    
    public Queue() {
        mFront = 0;
        mBack = 0;
        mArray = new ArrayList<inventory>();
    }

    /*
    add item at the back of queue, throw full queue exception if queue is full
    */
    public void enqueue(inventory item) {
        mArray.add(item);
    }
    
    /*
    remove item at the front of queue, throw empty queue exception if queue is empty
    */    
    public void dequeue() throws EmptyQueueException {
        if (mFront == mBack)
            throw new EmptyQueueException("Queue");
        
        mFront = (mFront + 1) % mArray.length;
    }
    
    /*
    return item at the front of queue, throw empty queue exception if queue is empty
    */     
    public int front() throws EmptyQueueException {
        if (mFront == mBack)
            throw new EmptyQueueException("Queue");

        return mArray[mFront];
    }
    
    public boolean empty() {
        return (mFront == mBack);
    }
    
    @Override
    public String toString()
    {
        String result;
        StringBuilder sb = new StringBuilder();

        for(int i = mFront; i != mBack; i = (i+1)%mArray.length)
          sb.append(String.valueOf(mArray[i])+"\n");
        result =sb.toString();

        return result;
    }
    
    @Override
    public Object clone(){ 
        Queue queueClone = new Queue(mArray.length);
        queueClone.mFront = mFront;
        queueClone.mBack = mBack;
        for(int i = mFront; i != mBack; i = (i+1)%mArray.length)
        {
            queueClone.mArray[i] = mArray[i];
        }
        return queueClone;
    } 
    
    //Implementing Iterable interface allows an object to be the target 
    //of the "for-each loop" statement.
    @Override
    public Iterator iterator(){
        return new queueIterator();
    }
    
    //Iterator interface 3 main methods: hasNext(), next(), remove()
    private class queueIterator implements Iterator{
        private int index;
        // constructor: initialize index to mFront
        queueIterator() { 
            index = mFront;
        } 

        // Checks if the next element exists 
        public boolean hasNext() { 
            return (index + 1)% mArray.length != mBack;
        } 

        // Returns the next element in the queue and advances iterator by one slot 
        public Integer next() { 
            if (!hasNext()) {
		throw new NoSuchElementException();
            }
            Integer result = mArray[index];
            index = (index + 1) % mArray.length;
            return result;            
        } 

        // Used to remove an element. Implement only if needed 
        public void remove() { 
            // Default throws UnsupportedOperationException. 
            throw new UnsupportedOperationException();
        } 
    }       
}
