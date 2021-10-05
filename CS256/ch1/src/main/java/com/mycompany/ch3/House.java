/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ch3;

/**
 *
 * @author ziping
 */
import java.lang.Comparable;

public class House implements Cloneable, Comparable<House> {
  private int id;
  private double area;
  private java.util.Date whenBuilt;
  
  public House(int id, double area) {
    this.id = id;
    this.area = area;
    whenBuilt = new java.util.Date();
  }
  
  public int getId() {
    return id;
  }
  
  public double getArea() {
    return area;
  }

  public java.util.Date getWhenBuilt() {
    return whenBuilt;
  }

  /* Override the protected clone method defined in 
    the Object class, and strengthen its accessibility */
  /*@Override 
  public Object clone() {//shollow copy clone(date not cloned)
    try {
      return super.clone();
    }
    catch (CloneNotSupportedException ex) {
      return null;
    }
  }*/
    
  //option 1: deep copy clone, override Object's clone()
  @Override
  public Object clone() {//deep copy clone(date cloned)
    try {
      House houseClone = (House)super.clone();      
      houseClone.whenBuilt = (java.util.Date)(whenBuilt.clone()); 
      return houseClone;
    }
    catch (CloneNotSupportedException ex) {
      return null;
    }    
  }
  /* option 2 for deep copy clone: not overriding
    public Object clone() {
      House houseClone = new House(id, area);
      houseClone.whenBuilt = new java.util.Date();
      houseClone.whenBuilt.setTime(whenBuilt.getTime());
      return houseClone;
  }*/

  @Override // Implement the compareTo method defined in Comparable
  public int compareTo(House o) {
    if (area > o.area)
      return 1;
    else if (area < o.area)
      return -1;
    else
      return 0;
  }  
  
  @Override
  public boolean equals(Object o){
      House h = (House) o;
      return( id == h.id && area == h.area && whenBuilt.equals(h.whenBuilt));
  }
  
  @Override
  public String toString(){
      return "id= " + id + " area= " + area;
  }
}