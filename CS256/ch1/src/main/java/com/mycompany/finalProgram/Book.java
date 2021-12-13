
package com.mycompany.finalProgram;
import java.util.*; 
/**
 *
 * @author zliu
 */
public class Book implements Cloneable, Comparable<Book>{
    public int id;
    public String name;

    public Book(int id, String name){
        this.id = id;
        this.name = name;    
    }
    
    public int getID(){return id;}
    
    public String getName(){return name;}
    
    public void set(int id, String name)
    {
        this.id = id;
        this.name = name;           
    }
    
    @Override
    public Object clone()throws CloneNotSupportedException{
        return (Book)super.clone();
    }
    
    @Override
    public String toString(){
        return id + "-" + name;
    } 
    
    @Override
    public int compareTo(Book b){
        if(id > b.id)
            return 1;
        else if(id < b.id)
            return -1;
        else
        {
            return name.compareTo(b.name);
        }
    }    
}

class Sortbyroll implements Comparator<Book> 
{ 
    // Used for sorting in ascending order of id 
    public int compare(Book a, Book b) 
    { 
        return a.id - b.id; 
    } 
} 
  
class Sortbyname implements Comparator<Book> 
{ 
    // Used for sorting in ascending order of name 
    public int compare(Book a, Book b) 
    { 
        return a.name.compareTo(b.name); 
    } 
}

class CustomerSortingComparator implements Comparator<Book> { 
  
        @Override
        public int compare(Book customer1, Book customer2) { 
  
            // for comparison 
            int NameCompare = customer1.getName().compareTo(customer2.getName()); 
            int idCompare = new Integer(customer1.getID()).compareTo(customer2.getID()); 
  
            // 2-level comparison using if-else block 
            if (NameCompare == 0) { 
                return ((idCompare == 0) ? NameCompare : idCompare); 
            } else { 
                return NameCompare; 
            } 
        } 
    } 

