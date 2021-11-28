package com.mycompany.ch9.cLab15;

public class HashTable {
    LinkedList<String>[] arr;

    public HashTable() {
        arr = new LinkedList[11];

    }
    public void add(String s){
        int total = 0;
        if(s.length() > 3){
            for(int i = 0; i < 3; i++){
                total += s.charAt(i);
            }
        }else{
            for(int i = 0; i < s.length(); i++){
                total += s.charAt(i);

            }

        }

        if(arr[total%arr.length] == null){
            arr[total%arr.length] = new LinkedList<>();

        }
        if(arr[total%arr.length].toString().contains(s)){
            return;

        }
        arr[total%arr.length].insert(s);

    }
    public void displayTable(){
        for(int i = 0; i < arr.length; i++){
            System.out.println("Linked List " + (i+1) + ":");
            System.out.println(arr[i]);
        }
        
    }
    

}
