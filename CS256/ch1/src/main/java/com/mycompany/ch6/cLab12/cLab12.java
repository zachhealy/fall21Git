package com.mycompany.ch6.cLab12;

import java.io.*;
import java.util.*;
import java.util.Queue;

public class cLab12 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new FileReader("/Users/zachhealy/Desktop/Programming Files/fall21Git/fall21Git/CS256/ch1/src/main/java/com/mycompany/ch6/cLab12/palindrome.txt"));
        BufferedWriter write = new BufferedWriter(new FileWriter("/Users/zachhealy/Desktop/Programming Files/fall21Git/fall21Git/CS256/ch1/src/main/java/com/mycompany/ch6/cLab12/output.txt"));
        String str;
        Queue queue = new LinkedList();
        while((str = read.readLine()) != null){
            str = str.toLowerCase().replaceAll("\\W", "");
            for(int i = str.length() - 1; i > -1; i--){
                queue.add(str.charAt(i));
            }
            
            String reverse="";
            while (!queue.isEmpty()){
                reverse += queue.remove();
            }
            if(str.equals(reverse)){
                write.write("Is a palindrome: " + reverse);
                write.newLine();
            }
            else{
                write.write("Not a palindrome: " + reverse);
                write.newLine();
            }
        }

        read.close();
        write.close();
    }
}
