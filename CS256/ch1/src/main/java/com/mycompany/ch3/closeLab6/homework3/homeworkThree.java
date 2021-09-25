package com.mycompany.ch3.closeLab6.homework3;


import java.util.ArrayList;

public class homeworkThree {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(9);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(0);
        list.add(8);
        list.add(7);
        sort(list);
        System.out.println(list);

    }
    public static void sort(ArrayList<Number> list){

        Number temp = 0;

        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size(); j++){
                if(list.get(j).doubleValue() < list.get(i).doubleValue()){
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);            

                }
            }
        }
    }
}