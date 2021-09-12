package com.mycompany.ch3;

import java.util.ArrayList;

public class homeworkTwo {
    public static void main(String[] args) {
        //11.11.1
        ArrayList<Double> list = new ArrayList<>();
        list.add(2.1);
        list.add(2.3);
        list.size();
        list.remove(0);
        list.remove(list.size()-1);
        list.contains(2.1);
        list.get(0);

        //11.11.2
        //The errors are that  

        //11.11.3
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Dallas");
        cities.add("Dallas");
        cities.add("Houston");
        cities.add("Dallas");
        cities.remove("Dallas");
        System.out.println(cities);
    }
}
