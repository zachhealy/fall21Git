/*
 * Author: Zach Healy, Noah Little, Trinity Smallwood, Jace Lowe, Cole Huntley
 * Date: Nov 15, 2021
 * Function: 
 */
package project4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 *
 * @author ziping
 */
public class Queue{
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
        if(mArray.isEmpty()){
            throw new EmptyQueueException("Queue empty");
        }
        mArray.remove(0);

    }
    
    public inventory getNext(){
            return mArray.get(0);
    }
    
    public boolean empty() {
        return mArray.isEmpty();
    }
    @Override
    public String toString(){
        String result = "";
        for(int i = 0; i < mArray.size(); i++){
                result += "Item " + (i+1) + ":\n" + mArray.get(i);
        }

        return result;
    }

          
}