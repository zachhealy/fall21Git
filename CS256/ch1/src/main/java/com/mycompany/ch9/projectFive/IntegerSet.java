package com.mycompany.ch9.projectFive;

public class IntegerSet<T extends Comparable<T>>{   
    private Node<T> first;

    // constructor: create an empty linkedlist
    public IntegerSet() {
        first = null;
    }
    
    
    // returns true if the linkedlist is empty
    public boolean isEmpty() {
        return first == null;
    }

    //adds a value into a LinkedList in ascending order
    public void add(T item){
        if((toString()).contains(item.toString()) && first != null){
            return;
        }
        //empty list
        if(first == null){
            first = new Node<T>(item, null);
            return;
        }
        
        //add at the front
        if(item.compareTo(first.data) < 0){
            Node<T> newNode = new Node<T>(item, first);
            first = newNode;
            return;
        }
        
        //add at middle or at back
        Node<T> cursor = first;
        while(cursor.next != null && cursor.next.data.compareTo(item) < 0) 
            cursor = cursor.next;

        cursor.next = new Node<T>(item, cursor.next);      
    }
 
    //removes item from list
    public void remove(T item)
    {
        if(first == null)
           throw new RuntimeException("cannot delete");

        if( first.data.equals(item) ){
           first = first.next;
           return;
        }

        Node<T> cur  = first;
        Node<T> prev = null;
        while(cur != null && !cur.data.equals(item) ){
            prev = cur;
            cur = cur.next;
        }

        if(cur == null)
            throw new RuntimeException("cannot delete");

        //delete cur node
        prev.next = cur.next;
    }
    
    //Size of set
    int size() {
        int c = 0;
        for(Node cursor = first; cursor != null; cursor = cursor.next)
              c++;
        return c;
    }
    
    boolean isMember(T item){
        Node<T> cursor;
        for(cursor = first; cursor != null; cursor = cursor.next){
            if(cursor.data.compareTo(item) == 0){
                return true;
            }
        }
        return false;
    }
    
    boolean isSubset(IntegerSet set2){
        boolean tester = false;
        Node<T> cursor;
        Node<T> cursor2;
        for(cursor = set2.first; cursor != null; cursor = cursor.next){
            for(cursor2 = first; cursor2 != null; cursor2 = cursor2.next){
                if(cursor2.data.compareTo(cursor.data) == 0){
                    tester = true;
                }
            }
            if(tester == false){
                return false;
            }
            tester = false;
        }
        return true;
    }
    
    IntegerSet intersection(IntegerSet set2){
        Node<T> cursor;
        Node<T> cursor2;
        IntegerSet set3 = new IntegerSet();
        for(cursor = set2.first; cursor != null; cursor = cursor.next){
            for(cursor2 = first; cursor2 != null; cursor2 = cursor2.next){
                if(cursor2.data.compareTo(cursor.data) == 0){
                    set3.add(cursor2.data);
                }
            }
        }
        return set3;
    }
    
    IntegerSet union(IntegerSet set2){
        Node<T> cursor;
        Node<T> cursor2;
        IntegerSet set3 = new IntegerSet();
        for(cursor = set2.first; cursor != null; cursor = cursor.next){
            set3.add(cursor.data);
        }
        for(cursor2 = first; cursor2 != null; cursor2 = cursor2.next){
                set3.add(cursor2.data);
        }
        return set3;
    }
    
    IntegerSet difference(IntegerSet set2){
        Node<T> cursor;
        Node<T> cursor2;
        boolean tester = false;
        IntegerSet set3 = new IntegerSet();
        for(cursor = set2.first; cursor != null; cursor = cursor.next){
            for(cursor2 = first; cursor2 != null; cursor2 = cursor2.next){
                if(cursor2.data.compareTo(cursor.data) == 0){
                    tester = true;
                }
            }
            if(tester == false){
                set3.add(cursor.data);
            }
            tester = false;
        }
        for(cursor = first; cursor != null; cursor = cursor.next){
            for(cursor2 = set2.first; cursor2 != null; cursor2 = cursor2.next){
                if(cursor2.data.compareTo(cursor.data) == 0){
                    tester = true;
                }
            }
            if(tester == false){
                set3.add(cursor.data);
            }
            tester = false;
        }
        return set3;
    
    }
    void display(){
        for(Node cursor = first; cursor != null; cursor = cursor.next)
          System.out.println(cursor.data);

    }
    
            
   @Override
    public String toString(){
        StringBuffer result = new StringBuffer();
        for(Node cursor = first; cursor != null; cursor = cursor.next)
          result.append(cursor.data + ", ");

        return result.toString();
    } 
            
            
   //Node class
    private static class Node<T>
    {
        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next){
            this.data = data;
            this.next = next;
        }
    }    
}
