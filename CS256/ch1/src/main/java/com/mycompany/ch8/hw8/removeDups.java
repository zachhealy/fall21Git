package com.mycompany.ch8.hw8;

import java.util.ArrayList;

public class removeDups {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(7);
        ArrayList<Integer> nList = removeDuplicates(list);
        System.out.println(nList);

    }
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        ArrayList<E> nList = new ArrayList<E>();
        for(int i = 0; i < list.size(); i++){
            if(!nList.contains(list.get(i))){
                nList.add(list.get(i));
            }
        }
        return nList;
        
    }
}
