package com.mycompany.finalProgram;

import java.util.*;
public class main {
    public static void main(String[] args) {
        LinkedList<Integer> L = new LinkedList<Integer>();

        L.add(11);
        L.add(12);
        L.add(13);
        L.add(14);
        L.add(55);
        L.add(16);
        L.add(37);
        L.add(18);
        L.add(19);
        L.add(20);

        LinkedList<Integer>[] arrList = new LinkedList[11];

        for(int i = 0; i < 10; i++){
            arrList[i] = new LinkedList<Integer>();
        }

        BuildLinkLists(arrList, L);

        for(int i = 0; i < 10; i++){
            System.out.println(arrList[i]);
        }
    }

        static void BuildLinkLists(LinkedList<Integer> []arrList, LinkedList<Integer> L){
            for(int i = 0; i < L.size(); i++){
                int x = L.get(i);
                int r = x % 10;
                arrList[r].add(x);
            }
        }
}
