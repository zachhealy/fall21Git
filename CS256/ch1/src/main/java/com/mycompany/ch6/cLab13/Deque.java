package com.mycompany.ch6.cLab13;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque implements Cloneable, Iterable{
    private int mFront, mBack;
    private int[] mArray;
    private final int DEFAULT_CAPACITY = 10;
    
    public Deque(){
        mFront = 0;
        mBack = 0;
        mArray = new int[DEFAULT_CAPACITY];

    }
    public Deque(int initCapacity){
        mFront = 0;
        mBack = 0;
        mArray = new int[initCapacity];

    }
    public boolean empty(){
        return(mFront == mBack);

    }
    public void push_front(int item){
        if((mBack + 1) % mArray.length == mFront)
            throw new FullQueueException("Queue");

        if(mFront == 0){
            mFront = mArray.length - 1;
        }else{
            mFront = mFront - 1;
        }
        mArray[mFront] = item;

    }
    public void push_back(int item){
        if((mBack + 1) % mArray.length == mFront)
            throw new FullQueueException("Queue");
        
        mArray[mBack] = item;
        mBack = (mBack + 1) % mArray.length;

    }
    public int front() throws EmptyQueueException{
        if(mFront == mBack)
            throw new EmptyQueueException("Queue");
        return mArray[mFront];

    }
    public int back() throws EmptyQueueException{
        return mArray[mBack - 1];


    } 
    public void pop_front() throws EmptyQueueException{
        if(mFront == mBack)
            throw new EmptyQueueException("Queue");

        mFront = (mFront + 1) % mArray.length;
    }
    public void pop_back() throws EmptyQueueException{
        if(mFront == mBack)
            throw new EmptyQueueException("Queue");
        
        mBack = (mBack - 1) % mArray.length;
    }
    
    @Override
    public Object clone(){ 
        Deque queueClone = new Deque(mArray.length);
        queueClone.mFront = mFront;
        queueClone.mBack = mBack;
        for(int i = mFront; i != mBack; i = (i+1)%mArray.length)
        {
            queueClone.mArray[i] = mArray[i];
        }
        return queueClone;
    } 
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
}
