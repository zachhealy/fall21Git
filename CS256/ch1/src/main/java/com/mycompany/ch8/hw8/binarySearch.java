package com.mycompany.ch8.hw8;

public class binarySearch {
    public static void main(String[] args) {
        Integer[] list = new Integer[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }
        int pos = binarySearch(list, 3);
        System.out.println("The number 3 is at position: " + pos);

    }

    public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) {
                return i + 1;

            }
        }
        return -1;
    }
}
