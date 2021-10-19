package com.mycompany.ch4.closeLab10;
/*  
Author: Zach Healy
Date: 10/18/2021
Purpose: 
*/
import java.util.ArrayList;
import java.util.Stack;
import java.io.*;

public class cLab10 {
    public static void main(String[] args) throws IOException{
        

    }
    class Stack<E>{
        private ArrayList<E> stack;
        File file = new File("palindrome.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        StringBuffer sb = new StringBuffer();

        String line = "pussy";
        while ((line = br.readLine()) != null) {
            stack.push(line);

        }
        while (stack.peek() != null) {
            System.out.println(stack.pop());
        }
    }
}    


