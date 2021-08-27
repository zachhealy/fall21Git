/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ch2;

/**
 *
 * @author ziping
 */
public class JavaClassEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Time objects created = " + Time.getNumTime());
        Time t1 = new Time();
        System.out.printf("Default Constructor: time = %s\n", t1.toString());
        
        Time t2 = new Time(8, 30, 'A');
        System.out.printf("After calling explicit value constructor: Hour = %d\n", t2.getHour());
        t2.setTime(8, 59, 'A');
        System.out.printf("After calling setTime: Hour = %d\n", t2.getHour());
        System.out.println("Before calling swapTimeCopyVer method:");
        System.out.printf("t1= " + t1.toString() + "\n");
        System.out.printf("t2= "+ t2.toString() + "\n");
        
        swapTimeCopyVer(t1, t2);
        System.out.println("After calling swapTimeCopyVer method:");        
        System.out.printf("t1= " + t1.toString() + "\n");
        System.out.printf("t2= "+ t2.toString() + "\n");
        
        int x = 100;
        checkPassPrimaryVal(x);
        System.out.println("pass primary data to function check: " + x);     
        
        // Java is strictly pass-by-value
        checkPassObj(t1); //t1's reference copy will be plugged in, not t1 will be plugged
                          //and t1 won't be changed
        System.out.printf("After calling checkPassObj: t1 = %s\n", t1.toString());
 
        Time[] tArray1 = new Time[1];
        Time[] tArray2 = new Time[1];
        tArray1[0] = t1;
        tArray2[0] = t2;
        swapTime(tArray1, tArray2);
        System.out.printf("tArray1= " + tArray1[0].toString() + "\n");
        System.out.printf("tArray2= "+ tArray2[0].toString() + "\n");        
        
        t1 = t2;
        System.out.println("t1 reassigned to t2 object reference:");
        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        t1.setHour(11);
        System.out.println("t1's hour reassigned:");
        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);        
        System.out.println("number of time objects = " + Time.getNumTime());        
    }   
    
    public static void checkPassObj(Time t){
        t.setTime(10, 30, 'P');  //setTime() call occurs at the heap memory of the original object
        //Time temp = new Time(23, 59, 'P');  //a new heap memory created
        //t = temp; //temp's scope is only inside the function, if it is not returned, it will be disposed
        //return temp;
    }
    
    public static void checkPassPrimaryVal(int i){
        i = -100;
    }
    
    public static void swapTime(Time[] pt1, Time[] pt2){      
        Time temp = pt1[0];
        pt1[0] = pt2[0];
        pt2[0]= temp;
    }    

    public static void swapTimeCopyVer(Time cpt1, Time cpt2){      
        Time temp = cpt1;
        cpt1 = cpt2;
        cpt2 = temp;
    }    
    
}
