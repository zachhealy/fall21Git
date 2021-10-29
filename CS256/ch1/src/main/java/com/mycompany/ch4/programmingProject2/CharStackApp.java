package com.mycompany.ch4.programmingProject2;

import java.io.*;
import java.util.Scanner;
import com.mycompany.ch4.closeLab10.ListStack;

public class CharStackApp {

    public static void main(String[] args) throws IOException {
        ListStack<Character> stack = new ListStack<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a file name ");
        String fileName = input.nextLine();

        BufferedReader read = new BufferedReader(new FileReader(
                "C:/Users/zjhea/Documents/GitHub/fall21Git/CS256/ch1/src/main/java/com/mycompany/ch4/programmingProject2/"
                        + fileName));
        BufferedWriter write = new BufferedWriter(new FileWriter(
                "C:/Users/zjhea/Documents/GitHub/fall21Git/CS256/ch1/src/main/java/com/mycompany/ch4/programmingProject2/"));
        String str;
        while ((str = read.readLine()) != null) {
            str = str.toLowerCase().replaceAll("\\W", "");
            for (int i = 0; i < str.length(); i++) {
                stack.push(str.charAt(i));
            }
            String reverse = "";
            while (!stack.isEmpty()) {
                reverse += stack.pop().toString();
            }
            if (str.equals(reverse)) {
                write.write("Is a palindrome: " + reverse);
                write.newLine();
            } else {
                write.write("Not a palindrome");
                write.newLine();
            }
        }

        read.close();
        write.close();
    }
    // prompt user to enter file name for palindrome check
    // (use provided palindrome1.txt and palindrome2.txt files)

    // read file line by line and use the CharStack class to check

    // if the line is palindrome, you need to call StringToStack() function to
    // push all letters from the line to a CharStack

    // output the stack using toString() function

    // then call reverse() function to get the reverse of the above CharStack

    // call equals() function to check if the contents of two CharStacks
    // are the same and make decision about palindrome

    // output all palindrome lines to a file to save them

}
