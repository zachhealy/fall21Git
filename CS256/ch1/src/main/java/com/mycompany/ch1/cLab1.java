package com.mycompany.ch1;
/*  
Author: Zach Healy
Date: 8/24/2021
Purpose: Solve the bored mailman problem.
*/

public class cLab1 {

    public static void main(String[] args){
        boolean array[];
        array = new boolean[150];
        mailClosed(array);
        everyOther(array);
        checkClosed(array);
        
    }
    
    /*Purpose: Start with all mailboxes closed
    Precondition: An array of any length
    Postcondition: Every position in the array will be set to true*/

    static void mailClosed(boolean[] array){
        int size = array.length;
        for(int i = 0; i < size; i++){
            array[i] = true;
        }

    }

    /*Purpose: To simulate what the mailman does to the mailboxes
    Precondition: Mailboxes all in the same state
    Postcondition: Mailboxes in the state after the mailman's game*/
    
    static void everyOther(boolean[] array){
        int size = array.length;

        for(int i = 2; i < size; i++){
            for(int j = i; j < size; j+=i){
                if(array[j]){
                    array[j] = false;
                }
                else{
                    array[j] = true;

                }
            }
        
        }

    }
    /* Purpose: print the closed mailboxes
    Precondition: Mailboxes' state all in an array
    Postcondition: System outputting all mailbox numbers that are closed*/
    static void checkClosed(boolean[] array){
        int size = array.length;

        for(int i = 1; i < size; i++){
            if(array[i]){
                System.out.println("Door " + i + " is closed");

            }
        
        }
    }    
}


