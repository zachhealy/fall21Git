package com.mycompany.ch6.cLab12;

import java.io.*;
import java.util.*;

public class cLab12 {
    public static void main(String[] args) throws IOException {
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
