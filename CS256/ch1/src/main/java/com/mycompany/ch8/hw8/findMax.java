package com.mycompany.ch8.hw8;

public class findMax{
    public static <E> void main(String[] args) {
        Integer[] list = new Integer[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }
        Integer nList = max(list);
        System.out.println("Max element in the array is: " + nList);
        
    }
    public static <E extends Comparable<E>> E max(E[] list){
        E max = list[0];
        for(int i = 1; i < list.length; i++){
            E temp = list[i];
            if(temp.compareTo(max)>0){
                max = temp;
            }
        }
        return max;
    }
}
