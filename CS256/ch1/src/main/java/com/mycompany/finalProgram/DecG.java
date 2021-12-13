
package com.mycompany.finalProgram;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author zach healy
 */
public class DecG<E extends Comparable<E> & Cloneable> {
    public LinkedList<E> mlist = new LinkedList<E>();
    
    ArrayList duplicateItems(){
        ArrayList temp = new ArrayList();
        for(int i = 0; i < mlist.size(); i++){
            for(int j = 0; j < mlist.size(); j++){
                if(i == j){
                    continue;
                }
                if((mlist.get(i)).compareTo(mlist.get(j)) == 0){
                    temp.add(mlist.get(i));
                    
                }
            }
        }
        for(int i = 0; i < temp.size(); i++){
            for(int j = 0; j < temp.size(); j++){
                E temp2 = (E) temp.get(i);
                E temp3 = (E) temp.get(j);
                if(temp2 == temp3){
                    temp.remove(i);

                }
            }
        }
        return temp;
    }
    public boolean isGreaterThan(DecG dec2){
        LinkedList mlist2 = dec2.copy();
        E greatest1 = mlist.get(0);
        E greatest2 = (E) mlist2.get(0);
        E sma1 = mlist.get(0);
        E sma2 = (E) mlist2.get(0);
        for(int i = 1; i < mlist.size(); i++){
            if(mlist.get(i).compareTo(greatest1) == 1){
                greatest1 = mlist.get(i);

            }

        }
        for(int i = 1; i < mlist2.size(); i++){
            if(((Comparable<E>) mlist2.get(i)).compareTo(greatest1) == 1){
                greatest2 = (E) mlist2.get(i);

            }

        }
        for(int i = 1; i < mlist.size(); i++){
            if(mlist.get(i).compareTo(sma1) == -1){
                sma1 = mlist.get(i);

            }

        }
        for(int i = 1; i < mlist2.size(); i++){
            if(((Comparable<E>) mlist2.get(i)).compareTo(sma1) == -1){
                sma2 = (E) mlist2.get(i);

            }
            

        }
        System.out.println(sma1);
        System.out.println(greatest1);
        System.out.println(sma2);
        System.out.println(greatest2);
        if(sma1.compareTo(sma2) == 1 && greatest1.compareTo(greatest2) == 1){
            return true;
            
        }

        return false;
    }

    public void insert_second_last(E temp){
        if(mlist.size() == 0){
                mlist.add(temp);
        }else{
            int size = mlist.size() - 1;
            mlist.add(size, temp);

        }
    }
    public LinkedList<E> copy(){
        LinkedList<E> temp2 = new LinkedList<E>();
        for(int i = 0; i < mlist.size(); i++){
            temp2.add((mlist.get(i)));
        }
        return temp2;
    }
     
 
}
