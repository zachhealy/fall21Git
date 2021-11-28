package com.mycompany.ch9.cLab15;

import java.util.Iterator;
/**
 *
 * @author ziping
 */
public class JavaLinkedList {
    public static void main(String[] args) {
        LinkedList<String> slist = new LinkedList <String>();
        if(slist.isEmpty())
            System.out.println("Created an empty string list");
        
        slist.insert("z");
        slist.insert("a");
        slist.insert("e");
        slist.insert("h");
        slist.insert("y");
        System.out.println("created a string list: " + slist);
        slist.insert("ee");
        System.out.println("after insert another new item: " + slist);
        slist.remove("e");
        System.out.println("after remove an item: " + slist);

        LinkedList<Integer> ilist = new LinkedList <Integer>();
        if(ilist.isEmpty())
            System.out.println("Created an empty integer list");
        
        ilist.insert(50);
        ilist.insert(30);
        ilist.insert(90);
        ilist.insert(150);
        ilist.insert(29);
        System.out.println("created a string list: " + ilist);
        ilist.insert(55);
        System.out.println("after insert another new item: " + ilist);
        ilist.remove(30);
        System.out.println("after remove an item: " + ilist);        
    }
    
}
