package com.mycompany.ch8.cLab14;

import java.util.ArrayList;

public class GenericStack<E> {
    private ArrayList<E> list = new ArrayList<E>();

    public boolean isEmpty(){
        return list.isEmpty();
        
    }
    public E peek(){
        return list.get(list.size() - 1);

    }
    public void push(E e){
        list.add(e);
    }
    public E pop(){
        E obj = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return obj;

    }
    @Override
    public String toString(){
        return "Stack: " + list.toString();
    }
}
