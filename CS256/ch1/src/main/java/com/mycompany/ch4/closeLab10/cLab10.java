package com.mycompany.ch4.closeLab10;

/*  
Author: Zach Healy
Date: 10/18/2021
Purpose: This program will read a file line by line and then print out a new file
        that will tell if each line is a palindrome or not.
*/

import java.io.*;

public class cLab10 {
    public static void main(String[] args) throws IOException {
        ListStack<Character> stack = new ListStack<>();
        BufferedReader read = new BufferedReader(new FileReader("/Users/zachhealy/Desktop/Programming Files/fall21Git/fall21Git/CS256/ch1/src/main/java/com/mycompany/ch4/closeLab10/palindrome.txt"));
        BufferedWriter write = new BufferedWriter(new FileWriter("/Users/zachhealy/Desktop/Programming Files/fall21Git/fall21Git/CS256/ch1/src/main/java/com/mycompany/ch4/closeLab10/output.txt"));
        String str;
        while((str = read.readLine()) != null){
            str = str.toLowerCase().replaceAll("\\W", "");
            for(int i=0; i<str.length(); i++){
                stack.push(str.charAt(i));
            }
            String reverse="";
            while (!stack.isEmpty()){
                reverse += stack.pop().toString();
            }
            if(str.equals(reverse)){
                write.write("Is a palindrome: " + reverse);
                write.newLine();
            }
            else{
                write.write("Not a palindrome");
                write.newLine();
            }
        }

        read.close();
        write.close();
    }
        

}
    
