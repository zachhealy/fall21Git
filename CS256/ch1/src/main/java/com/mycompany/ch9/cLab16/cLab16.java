package com.mycompany.ch9.cLab16;

/*  
Author: Zach Healy
Date: 12/4/2021
Purpose: This program uses stacks and queues to do a palindrome check.
*/
import java.io.*;
import java.util.*;
import java.util.Queue;

public class cLab16 {
        public static void main(String[] args) throws IOException {
                BufferedReader read = new BufferedReader(new FileReader(
                                "/C:/Users/zjhea/Documents/GitHub/fall21Git/CS256/ch1/src/main/java/com/mycompany/ch9/cLab16/palindrome.txt"));
                BufferedWriter write = new BufferedWriter(new FileWriter(
                                "/C:/Users/zjhea/Documents/GitHub/fall21Git/CS256/ch1/src/main/java/com/mycompany/ch9/cLab16/output.txt"));
                String str;
                Stack stack = new Stack();
                Queue queue = new LinkedList();
                while ((str = read.readLine()) != null) {
                        str = str.toLowerCase().replaceAll("\\W", "");
                        for (int i = 0; i < str.length(); i++) {
                                stack.push(str.charAt(i));
                                queue.add(str.charAt(i));
                        }

                        String reverse = "";
                        String reverse2 = "";
                        while (!stack.isEmpty()) {
                                reverse += stack.peek();
                                stack.pop();
                        }
                        while (!queue.isEmpty()) {
                                reverse2 += queue.peek();
                                queue.remove();

                        }
                        if (reverse2.equalsIgnoreCase(reverse)) {
                                write.write("Is a palindrome: " + reverse);
                                write.newLine();
                        } else {
                                write.write("Not a palindrome: " + reverse);
                                write.newLine();
                        }
                }

                read.close();
                write.close();
        }
}
